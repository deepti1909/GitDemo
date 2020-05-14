Feature: Application Login

Scenario: Home page default login
Given User is on the Facebook landing page
When User logs into the application with "ayaan" and "1234"
Then Home page is populated
And Cards are displayed

Scenario: Home page default login
Given User is on the Facebook landing page
When User logs into the application with "eshaan" and "4321"
Then Home page is populated
And Cards are displayed