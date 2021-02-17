Feature: Application login

Scenario: Home page default login
Given User is on net banking landing page
When User login into application with Username "nav" and Password "123"
Then Home page is displayed
And Cards are displayed "true"

Scenario: Home page default login
Given User is on net banking landing page
When User login into application with Username "pav" and Password "456"
Then Home page is displayed
And Cards are displayed "false"