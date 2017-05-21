Feature: Google Seaech
Scenario: Display search count
Given "Naveen" enter "Careem" in "Google"
And Browser is "Firefox"
When click on google search
Then Google status bar should display search count more than 10000
