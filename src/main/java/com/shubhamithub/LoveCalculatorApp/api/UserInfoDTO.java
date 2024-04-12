package com.shubhamithub.LoveCalculatorApp.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " * Your name cant be blank")
	/* @Min(value = 3, message = "* Your name shuould have atleast 3 char") */
	@Size(min = 3, max = 15, message = "* Your name shuould have char between 3 to 15")
	private String yourName;
	
	@NotBlank(message = " * Crush name cant be blank")
	@Size(min = 3, max = 15, message = "* Crush name shuould have char between 3 to 15")
	private String crushName;
	
	@AssertTrue(message = "agree to use our app")
	private boolean termAndCondition;

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

}
