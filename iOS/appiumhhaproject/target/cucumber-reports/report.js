$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/RC4.feature");
formatter.feature({
  "name": "Basic Test scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Set and Allow all permission",
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
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.veirfy_permission_is_allow()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "keyword": "Then "
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});