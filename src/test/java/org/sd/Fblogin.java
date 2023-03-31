package org.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClass {
	@When("To launch url of the mynthra application")
	public void to_launch_url_of_the_mynthra_application() {
	   launchBrowser();
	   windowMaximize();
	   launchUrl("https://www.myntra.com/\"");
	}

	
}
