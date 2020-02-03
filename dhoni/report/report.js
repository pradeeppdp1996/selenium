$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipse dir/dhoni/feature file/Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "To login into adactin hotel app and book room",
  "description": "",
  "id": "to-login-into-adactin-hotel-app-and-book-room",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify the user login funtionality with invalid crendentails",
  "description": "",
  "id": "to-login-into-adactin-hotel-app-and-book-room;verify-the-user-login-funtionality-with-invalid-crendentails",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the username in the login module",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter the password in the login module",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verify the alert message displays for invalid crendentails",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefenetion.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 1089623695,
  "error_message": "java.lang.Exception: Not a Valid Url\r\n\tat cucum.FunctionalLibrary.website(FunctionalLibrary.java:59)\r\n\tat cucum.stepdefenetion.user_launch_the_adactin_application(stepdefenetion.java:13)\r\n\tat ✽.Given User launch the adactin application(D:/eclipse dir/dhoni/feature file/Adactin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepdefenetion.user_enter_the_username_in_the_login_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefenetion.user_enter_the_password_in_the_login_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefenetion.user_click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefenetion.user_verify_the_alert_message_displays_for_invalid_crendentails()"
});
formatter.result({
  "status": "skipped"
});
});