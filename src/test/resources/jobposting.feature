Feature: Job Posting as a recruiter 
As a recruiter I want to post job so jobseeker can see and apply

Scenario: Data should be valid
Given recruiter has entered all correct date
When click on button Submit after data entry 
Then systen display success message

Scenario: Success message on valid post
Given recruiter "Naveen" has entered title "Scrum Master" and summary as "Should PSM"
When click on button "Submit"after data entry 
Then systen display "Posting was successful"

Scenario: Faliure message in case of invalid post
Given recruiter "Naveen" has entered title " " and summary as "Should PSM"
When click on button "Submit"
Then systen display "Posting was failed"

Scenario: Faliure message in case of invalid post
Given recruiter "Naveen" has entered title " " and summary as "Should PSM"
When click on button "Submit"
Then systen display "Posting was failed"

Scenario: Faliure message in case of invalid post
Given recruiter "Naveen" has entered title " " and summary as "Should PSM"
When click on button "Cancel"
Then systen display "Do you want to cancel posting?" 


