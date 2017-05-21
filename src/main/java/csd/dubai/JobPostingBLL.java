package csd.dubai;

public class JobPostingBLL {
	
	public String ValidateData(JobPost jobPost)
	{
		if(jobPost.jobTitle.equals(" "))
		{
			return "Posting Failed";
		}
		else if(jobPost.postedBy.equals(" "))
		{
			return "Posting failed";
		}
		else
		{
			//jobPostingDAO.SAVE(jobPost);
			return "Success";
		}
	}

}
