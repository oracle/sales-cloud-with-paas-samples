 <!-- Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved -->
 
 <form class="simple-form">
   <table border="0" width="90%" class="table-noborder"
          style="border-color:transparent;">
    <tr>
        <td><p style="font-family:Arial;"><b >View Feedback</b></p></td>
        <td align="right"><input type="button" ng-click="saveFeedback()" value="Save" /> </td>
    </tr>
   </table>
   <table width="90%"
          style="font-family:Arial; border-width:thin;" class="list">
        <tr style="background-color:Silver;">
            <td>Dealer Name</td>
            <td width="25%">Feedback</td>
            <td>Impact</td>
            <td>Feedback Date</td>
            <td>Follow-up with</td>
            <td>Phone #</td>
            <td>Follow-up?</td>
            <td>Follow-up by</td>
        </tr>
        <tr ng-repeat="d in dealers.items">
            <td>{{d.dealer_name}}</td>
            <td>{{d.feedback}}</td>
            <td>{{d.impact}}</td>
            <td>{{d.date_given | date:'M-dd-yyyy'}}</td>
            <td>{{d.follow_up_with}}</td>
            <td>{{d.phone_number}}</td>
            <td><input type="checkbox" ng-model="d.followed_up" ng-true-value="T" ng-false-value="F"></td>
            <td><input type="text" ng-model="d.followed_up_by" />
        </tr>
      </table>
    </form>

 <script>
   angular.module("myapp", []).controller("DealerController", function($scope, $http, $q) {
     var dbcs_url = "<%=application.getInitParameter("dbcs-url")%>";
     var access_token = <%=application.getInitParameter("access-token")%>;
     var config = {headers:  {
        'Authorization': 'Bearer ' + access_token
        }
     };
     $scope.dealers = {};
     $http.get(dbcs_url +'/apex/dealerfeedback/dealerfeedbacks/',config)
        .success(function(data) {
            $scope.dealers = data; 
            $scope.dealers_orig = angular.copy($scope.dealers);
        })
        .error(function(data,status) {
             alert("invoke DbCS failed with the error code: " + status);
        });

    var submitToBackend = function(dealer) {
        var dataObject = {
             "followed_up_by": dealer.followed_up_by,
             "followed_up":    dealer.followed_up
        }

        var deferred = $q.defer();
        $http.put(dbcs_url +'/apex/dealerfeedback/dealerfeedback/'+dealer.dealer_name,dataObject,config)
        .success(function() {
            deferred.resolve({
                dealer: dealer.dealer_name,
                result: "succeeded"});
        })
        .error(function(data,status) {
            alert("invoke DbCS failed with the error code: " + status);
            deferred.resolve({
                dealer: dealer.dealer_name,
                result: "failed"});
        });
        return deferred.promise;
    };
    
     $scope.saveFeedback = function() {
        var promiseList = [];
        var changedDealerList = [];
        
        // update only modified dealers
        for (var i=0; i < $scope.dealers.items.length; i++) {
            if (angular.equals($scope.dealers.items[i], $scope.dealers_orig.items[i])) continue;
            
            changedDealerList.push($scope.dealers.items[i]);
        }

        for (var i = 0; i < changedDealerList.length; i++) {
            promiseList[i] = submitToBackend(changedDealerList[i]);
        }
        
        $q.all(promiseList).then(
            function(results) {
                var theResult = "Updating ";
                for (var ind = 0; ind < results.length; ind++) {
                    theResult = theResult + "\n" + results[ind].dealer + " : " + results[ind].result
                }
                alert(theResult);
            }
        );
        $scope.dealers_orig = angular.copy($scope.dealers);
     };
    });
 </script>