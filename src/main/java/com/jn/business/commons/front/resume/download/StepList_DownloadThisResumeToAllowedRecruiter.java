package com.jn.business.commons.front.resume.download;

interface StepList_DownloadThisResumeToAllowedRecruiter {
	int IF_THERE_IS_NOT_RESTRINCTION_TO_THIS_RECRUITER_TO_VIEW_THIS_RESUME_THEN = 200;
	int IF_IS_NOT_THE_OWNER_WHO_IS_DOWNLOADING_THIS_RESUME_THEN = 202;
	int IF_THE_OWNER_IS_WHO_IS_DOWNLOADING_THIS_RESUME_THEN = 200;
	int IT_IS_A_TEXT_MODE_TO_VIEW_THIS_RESUME = 202;
	int IF_THIS_RESUME_HAS_A_VALID_ALIAS_THEN = 200;
	int IF_IS_A_FREELANCER_RECRUITER_THEN = 200;
	int IF_IS_A_CONSULTING_RECRUITER_THEN = 202;
	int IF_GET_THIS_RESUME_FROM_BUCKET_THEN = 200;
	int THIS_PROCESS_HAS_FINISHED = 200;

}
