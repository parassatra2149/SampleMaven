$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("window.feature");
formatter.feature({
  "line": 1,
  "name": "Window Handling on Chrome",
  "description": "",
  "id": "window-handling-on-chrome",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Handle window on chrome",
  "description": "",
  "id": "window-handling-on-chrome;handle-window-on-chrome",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am navigated to toolsQA website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I handle windows on chrome",
  "keyword": "Then "
});
formatter.match({
  "location": "UIStepdefinition.I_am_navigated_to_toolsQA_website()"
});
formatter.result({
  "duration": 9932034629,
  "status": "passed"
});
formatter.match({
  "location": "UIStepdefinition.I_handle_windows_on_chrome()"
});
formatter.result({
  "duration": 7823648434,
  "status": "passed"
});
});