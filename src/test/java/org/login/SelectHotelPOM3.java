package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOM3 extends BaseClass {
	public SelectHotelPOM3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement submit;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
