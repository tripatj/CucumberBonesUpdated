$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("org.tripatj.E2EAutomation.featureFiles/orangeHRMPage1Validation.feature");
formatter.feature({
  "line": 1,
  "name": "Feature: Verify Page 1 OrageHRM Application",
  "description": "",
  "id": "feature:-verify-page-1-oragehrm-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9771200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Page 1 for Admin Login and Logout Scenario",
  "description": "",
  "id": "feature:-verify-page-1-oragehrm-application;verify-page-1-for-admin-login-and-logout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter User Name as \"Admin\" and Password as \"admin123\" and click on login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User  should able to see \"Welcome\" screen.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseTags.userNavigateToApplication()"
});
formatter.result({
  "duration": 22158973100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "admin123",
      "offset": 44
    }
  ],
  "location": "LoginSteps.enterUserNameAsAndPasswordAsAndClickOnLogin(String,String)"
});
formatter.result({
  "duration": 9148041500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 26
    }
  ],
  "location": "LoginSteps.userShouldAbleToSeeScreen(String)"
});
formatter.result({
  "duration": 2888499400,
  "status": "passed"
});
formatter.match({
  "location": "BaseTags.userCloseTheBrowser()"
});
formatter.result({
  "duration": 123400,
  "status": "passed"
});
formatter.write("\u003cbr\u003e");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 85496211500,
  "status": "passed"
});
formatter.before({
  "duration": 905000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Page 1 for Admin1 Login and Logout Scenario",
  "description": "",
  "id": "feature:-verify-page-1-oragehrm-application;verify-page-1-for-admin1-login-and-logout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User navigate to Application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter User Name as \"Admin1\" and Password as \"admin123\" and click on login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User  should able to see \"Welcome\" screen.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseTags.userNavigateToApplication()"
});
formatter.result({
  "duration": 10527744300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin1",
      "offset": 20
    },
    {
      "val": "admin123",
      "offset": 45
    }
  ],
  "location": "LoginSteps.enterUserNameAsAndPasswordAsAndClickOnLogin(String,String)"
});
formatter.result({
  "duration": 7819141500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 26
    }
  ],
  "location": "LoginSteps.userShouldAbleToSeeScreen(String)"
});
formatter.result({
  "duration": 53435375700,
  "error_message": "java.lang.AssertionError: Welcome screen is not verified. \r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.tripatj.E2EAutomation.pageClass.CommonElementPage.verifyHeader(CommonElementPage.java:42)\r\n\tat org.tripatj.E2EAutomation.steps.LoginSteps.userShouldAbleToSeeScreen(LoginSteps.java:42)\r\n\tat ✽.Then User  should able to see \"Welcome\" screen.(org.tripatj.E2EAutomation.featureFiles/orangeHRMPage1Validation.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BaseTags.userCloseTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("\u003cbr\u003e");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 51030129999,
  "status": "passed"
});
formatter.uri("org.tripatj.E2EAutomation.featureFiles/orangeHRMPage2Validation.feature");
formatter.feature({
  "line": 1,
  "name": "Feature: Verify Page 2 OrageHRM Application",
  "description": "",
  "id": "feature:-verify-page-2-oragehrm-application",
  "keyword": "Feature"
});
});