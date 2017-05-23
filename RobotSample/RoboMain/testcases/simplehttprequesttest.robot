*** Settings ***
Library    Collections    
Library    RequestsLibrary

*** Test Cases ***
Test1
     #Create session     localhost   http://api.github.com
     #Create Session	    google	 http://www.google.com
     #${resp}=	        Get Request	google	/
     #Should Be Equal As Strings	${resp.status_code}	200
     #${resp}=	Get Request	github	/users/bulkan
     #Should Be Equal As Strings	${resp.status_code}	200
     #Dictionary Should Contain Value	${resp.json()}	Bulkan Savun Evcimen
     
     
     Create session     localhost   http://localhost:8082/SampleRestAPI
     # &{params}=   
     ${resp}=	Get Request	localhost	/wsprovider/BaccRTService/baccRTInfo   
     :FOR  ${item}  IN  @{resp}
      \   log to console  : ${item}
    # whith this you get your only element
     Log To Console    test success !!!  !
     
     
     