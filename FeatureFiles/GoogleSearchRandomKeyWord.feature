Feature: Google Search

Scenario: Search Random key word in google search engine
Given User launch chrome browser
When user opens URL "https://www.google.com/"
And User enters key word as "selenium"
Then Page title should be "selenium - Google Search"
And User enters key word as "java"
Then Page title should be "java - Google Search"
And Close browser



