*** Settings ***
Library     Telnet
#Library    SSHlibrary
Library     Selenium2Library

Resource    ${CURDIR}${/}..${/}resources${/}resourcefile.robot


Suite Setup         #task   : Keyword 
#Suite Teardown     Clean everything
Test Setup          Login To Machine   x.com    username  password
#Test Teardown      Clean up afte test


*** Variable ***

${var1}     shyam
${var2}     123123
@{list1}    shyam   mahesh 



*** Keywords ***

Login To Machine
     [Documentation]    asdasd
     [Arguments]    ${url}    ${user}   ${pass}
     Open Connection      hostname
     Login    username    password  
      



*** Test Cases ***

Test0 
    Log To Console    Test0 execution successful    

Test
    [Tags]    Sanity     BACC
    Log To Console   suit execution successful   !

Test2
    [Tags]     Regression     BACC
    Log To Console   suit execution successful   !
Test3
    [Tags]     Regression     BILLER
    Log To Console   suit execution successful   !
    