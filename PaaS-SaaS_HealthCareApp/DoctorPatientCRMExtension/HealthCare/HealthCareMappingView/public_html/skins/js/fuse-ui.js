        function setObjectNavigatorMode_Springboard(actionEvent)
        {
          actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var object_navigator = eventSource.findComponent("object-navigator");
              object_navigator.setProperty('displayMode', 'grid');
         
        }
        
         function setObjectNavigatorMode_Iconstrip(actionEvent)
        {
          actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var object_navigator = eventSource.findComponent("object-navigator");
              object_navigator.setProperty('displayMode', 'strip');
        }
        
        function objectNavigatorPropertyChangeListener(event)
        {
            var nav = event.getSource();
                      event.cancel();
                      objectNavigatorPropertyChangeListener_Helper()
        }
            
        function objectNavigatorPropertyChangeListener_Helper()
        { 
            var nav=AdfPage.PAGE.findComponentByAbsoluteId("pt1:object-navigator");
            var announcements=AdfPage.PAGE.findComponentByAbsoluteId("pt1:announcements-container");
            var navigation=AdfPage.PAGE.findComponentByAbsoluteId("pt1:navigation-container");
            var logo=AdfPage.PAGE.findComponentByAbsoluteId('pt1:logo');
            var strip_mode=nav.getDisplayMode();

            if(strip_mode=="strip")
            {
                announcements.setStyleClass("announcements-strip-mode-size");
                navigation.setStyleClass("springboard-strip-mode-size");
                logo.setStyleClass("logo-strip-mode-size");
            }
            else    
            {   announcements.setStyleClass("announcements-grid-mode-size");
                navigation.setStyleClass("springboard-grid-mode-size");
                logo.setStyleClass("logo-grid-mode-size");
                
            }
        }        
        
        
        
        function handleObjectNavigatorSelection(actionEvent)
        {
          //actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var actionName = eventSource.getProperty("actionName");
          
          console.log(actionEvent);
          console.log(eventSource);
          console.log(actionName);
          
          return actionName;
          
        
        }
        
