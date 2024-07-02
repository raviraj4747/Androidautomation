$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/RC4.feature");
formatter.feature({
  "name": "Basic Test scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Set and allow all permission",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "veirfy permission is allow",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.veirfy_permission_is_allow()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.findElement(org.openqa.selenium.By)\" because \"StepDefinitions.StepDefinitions.driver\" is null\n\tat StepDefinitions.StepDefinitions.veirfy_permission_is_allow(StepDefinitions.java:57)\n\tat ✽.veirfy permission is allow(classpath:Features/RC4.feature:5)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.failedScreenshot(Applicationhooks.java:53)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.quit()\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.teardown(Applicationhooks.java:44)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verify NUX and Get started button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify NUX flow and Get started button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_NUX_flow_and_Get_started_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Get Started button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Get_Started_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.findElement(org.openqa.selenium.By)\" because \"StepDefinitions.StepDefinitions.driver\" is null\n\tat StepDefinitions.StepDefinitions.Click_on_Get_Started_button(StepDefinitions.java:90)\n\tat ✽.Click on Get Started button(classpath:Features/RC4.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.failedScreenshot(Applicationhooks.java:53)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.quit()\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.teardown(Applicationhooks.java:44)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verify Guest Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Guest Login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Guest_Login()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.findElement(org.openqa.selenium.By)\" because \"StepDefinitions.StepDefinitions.driver\" is null\n\tat StepDefinitions.StepDefinitions.Click_on_Guest_Login(StepDefinitions.java:100)\n\tat ✽.Click on Guest Login(classpath:Features/RC4.feature:14)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.failedScreenshot(Applicationhooks.java:53)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.quit()\" because \"Apphooks.Applicationhooks.driver\" is null\n\tat Apphooks.Applicationhooks.teardown(Applicationhooks.java:44)\n",
  "status": "failed"
});
});