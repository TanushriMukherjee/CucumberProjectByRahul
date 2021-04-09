$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# Keywords are all highlighted here because of the plugin natural"
    }
  ],
  "line": 3,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on netbanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User login into application with \"Jin\" and \"45611\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.User_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 251081500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jin",
      "offset": 34
    },
    {
      "val": "45611",
      "offset": 44
    }
  ],
  "location": "StepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 3158900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 93000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 21
    }
  ],
  "location": "StepDefination.cards_displayed_are_something(String)"
});
formatter.result({
  "duration": 371899,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on netbanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User login into application with \"John\" and \"34343\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.User_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 107101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 34
    },
    {
      "val": "34343",
      "offset": 45
    }
  ],
  "location": "StepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "duration": 201300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.home_page_is_populated()"
});
formatter.result({
  "duration": 89200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "StepDefination.cards_displayed_are_something(String)"
});
formatter.result({
  "duration": 214101,
  "status": "passed"
});
});