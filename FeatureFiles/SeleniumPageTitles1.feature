Feature: Selenium pages

Scenario Outline: Selenium website two page comparision with set of data
Given User launches selenium website with URL "<url>"
When Selenium page title should be "<page1Title>"
And User clicks on download button
And Selenium page title should be "<pageTitle2>"
Then Close the browser

Examples:
|url											|page1Title|pageTitle2|
|https://www.selenium.dev/|Selenium  |Downloads \| Selenium|