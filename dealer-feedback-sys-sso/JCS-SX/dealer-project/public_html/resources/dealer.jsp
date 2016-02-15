<!-- Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved -->
 
  <p style="font-family:Arial;"><b style="margin:30.0px;">Create Feedback</b></p>
  <form name="myFeedbackForm" novalidate>
  <table width="100%"
         style="font-family:Arial; border-width:thin;"
         cellpadding="10px" class="table-noborder">
    <tr>
        <td align="right" style="width:15%;">Dealer Name</td>
        <td><input type="text" name="dealer_name" ng-model="feedbackform.dealer_name" ng-required="true" /> 
        <span class="error" ng-show="submitted && myFeedbackForm.dealer_name.$error.required">Required!</span>
        </td>
    </tr>
    <tr>
        <td align="right">Feedback</td>
        <td><textarea rows="4" cols="50" name="feedback" ng-model="feedbackform.feedback" ng-required="true"></textarea>
        <span class="error" ng-show="submitted && myFeedbackForm.feedback.$error.required">Required!</span>
        </td>
    </tr>
    <tr>
        <td align="right">Impact</td>
        <td><select ng-model="feedbackform.impact">
            <option value="High" >High</option>
            <option value="Medium">Medium</option>
            <option value="Low">Low</option>
            </select> 
            <span class="error" ng-show="submitted && myFeedbackForm.impact.$error.required">Required!</span>
        </td>
    </tr>    
    <tr>
        <td align="right">Feedback Date</td>
        <td>{{feedbackform.feedback_date | date:'M-dd-yyyy'}}
        </td>
    </tr>
    <tr>
        <td align="right">Follow up with</td>
        <td><input type="text" ng-model="feedbackform.follow_up_with" /> 
    </tr>
    <tr>
        <td align="right">Phone #</td>
        <td>
            <input type="text" name="phone_number" ng-model="feedbackform.phone_number" 
                               ng-maxlength="12" ng-minlength="12" placeholder="111-222-3333"
                               ng-pattern="/^\(?(\d{3})\)?[-]?(\d{3})[-]?(\d{4})$/" ng-required="true"/>
            <span class="error" ng-show="submitted && myFeedbackForm.phone_number.$invalid">The phone # should be 10 digits as 111-222-3333</span>
        </td> 
    </tr>
    <tr>
        <td align="right"><input type="button" ng-click="feedbackform.cancelEdit()" value="Cancel" /></td>
        <td><input type="button" ng-click="feedbackform.submitFeedback()" value="Submit" /> </td>
    </tr>
  </table>  
  </form>
</p>
 <script>
 angular.module("myapp", []).controller("DealerController", function($filter, $scope, $http) {
    var dbcs_url = "<%=application.getInitParameter("dbcs-url")%>";
    var access_token = <%=application.getInitParameter("access-token")%>;
     var config = {headers:  {
        'Authorization': 'Bearer ' + access_token
        }
     };
    $scope.feedbackform = {};
    $scope.feedbackform.feedback_date = new Date();
    $scope.feedbackform.impact = "Low";
    $scope.submitted = false;
    
    $scope.feedbackform.submitFeedback = function() {
        $scope.submitted = true;
        if (!$scope.myFeedbackForm.$valid) return;
        var dataObject = {
            "dealer_name": $scope.feedbackform.dealer_name,
            "feedback": $scope.feedbackform.feedback,
            "date_given": $scope.feedbackform.feedback_date.toISOString().slice(0,19),
            "impact": $scope.feedbackform.impact,
            "follow_up_with": $scope.feedbackform.follow_up_with,
            "phone_number": $scope.feedbackform.phone_number,
            "followed_up":"F"
        };
        var responsePromise = $http.post(dbcs_url+'/apex/dealerfeedback/dealerfeedbacks/',dataObject,config);
        responsePromise.success(function() {
            alert("Submitting " + $scope.feedbackform.dealer_name + "'s feedback succeeded!");
            $scope.feedbackform.cancelEdit();
        });
        responsePromise.error(function(data, status) {
            alert("Invoke DbCS failed with the error code: "+ status);
        });
    };
    
    $scope.feedbackform.cancelEdit = function() {
        $scope.myFeedbackForm.$setPristine();
        $scope.feedbackform.feedback_date = new Date();
        $scope.feedbackform.dealer_name = "";
        $scope.feedbackform.feedback = "";
        $scope.feedbackform.impact = "Low";
        $scope.feedbackform.follow_up_with = "";
        $scope.feedbackform.phone_number = "';"
        $scope.submitted = false;
    };
 });    
  </script>