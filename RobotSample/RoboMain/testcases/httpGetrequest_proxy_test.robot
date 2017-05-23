*** Settings ***
Library    RequestsLibrary    

*** Test Cases ***
Proxy Requests
    ${proxies}=	Create Dictionary	http://165.225.104.32:10223	
    #${proxies}=	Create Dictionary	http=http://acme.com:912	https=http://acme.com:913
    Create Session	github	http://api.github.com	proxies=${proxies}
    ${resp}=	Get Request	google	/
    Should Be Equal As Strings	${resp.status_code}	200
    
    