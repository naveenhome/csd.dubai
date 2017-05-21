package csd.dubai;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	JobPost jobPost = new JobPost();
	String buttonName;
	@Given("^recruiter has entered all correct date$")
	public void recruiter_has_entered_all_correct_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		jobPost.setJobTitle("Scrum Master");
		jobPost.setDescription("CSM Certified");
		jobPost.setPostedBy("Naveen Kumar Singh");
		jobPost.setPostedOn("31st March");
	}

	@When("^click on button Submit after data entry$")
	public void click_on_button_Submit_after_data_entry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		buttonName="Submit";
	}

	@Then("^systen display success message$")
	public void systen_display_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		JobPostingBLL obj = new JobPostingBLL();
		assertEquals("Success", obj.ValidateData(jobPost));
		
	}

	@Given("^recruiter \"([^\"]*)\" has entered title \"([^\"]*)\" and summary as \"([^\"]*)\"$")
	public void recruiter_has_entered_title_and_summary_as(String name, String title, String desc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		jobPost.setPostedBy(name);
		jobPost.setJobTitle(title);
		jobPost.setDescription(desc);
		jobPost.setPostedOn("4th April");
	
	}

	@When("^click on button \"([^\"]*)\"after data entry$")
	public void click_on_button_after_data_entry(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		buttonName=arg1;
	}

	@Then("^systen display \"([^\"]*)\"$")
	public void systen_display(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(buttonName.equals("Submit"))
		{
		JobPostingBLL obj = new JobPostingBLL();
		//JobPostingDAO obj = new JobPostingDAO();
		
		assertEquals(arg1, obj.ValidateData(jobPost));
		}
		else
		{
			JobPostingBLL obj = new JobPostingBLL();
			//assertEquals(arg1, obj.ClearAll(jobPost));
		}
	}

	@When("^click on button \"([^\"]*)\"$")
	public void click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		buttonName=arg1;
	}
}
