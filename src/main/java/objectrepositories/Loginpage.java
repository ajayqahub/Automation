package objectrepositories;

public class Loginpage {
	[7:25 PM, 6/20/2024] Ankush NARESH IT: 
		@FindBy(name = "user_name")
		private WebElement userNameEdt;

		@FindBy(name = "user_password")
		private WebElement passwordEdt;
	 
		@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;

		// Rule 3: Create a constructor to initiliaze
		public LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		// Rule 4: Provide getters to access
		public WebElement getUserNameEdt() {
			return userNameEdt;
		}

		public WebElement getPasswordEdt() {
			return passwordEdt;
		}

		public WebElement getLoginBtn() {
			ret…
	[7:25 PM, 6/20/2024] Ankush NARESH IT: package objectRepositories;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import genericUtilities.WebdriverUtility;

	public class HomePage extends WebdriverUtility {
		// declaration
			@FindBy(linkText = "Organizations")
			private WebElement OrganizationsLnk;

			@FindBy(linkText = "Contacts")
			private WebElement ContactsLnk;

			@FindBy(linkText = "Opportunities")
			private WebElement opportunitiesLnk;

			@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
			private WebElement AdministratorImg;

			@FindBy(linkText = "Sign Out")
			private WebElement SignOutLnk;

			// initialization
			public HomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			// Utilization
			public WebElement getOrganizationsLnk() {
				return OrganizationsLnk;
			}

			public WebElement getContactsLnk() {
				return ContactsLnk;
			}

			public WebElement getOpportunitiesLnk() {
				return opportunitiesLnk;
			}

			public WebElement getAdministratorImg() {
				return AdministratorImg;
			}

			public WebElement getSignOutLnk() {
				return SignOutLnk;
			}
			
			//Business Library
			/**
			 * This method will click on Organizations link
			 */
			public void clickOnOrganizationLink()
			{
				OrganizationsLnk.click();
			}
			
			/**
			 * This method will click on Contacts link
			 */
			public void clickOnContactsLink()
			{
				ContactsLnk.click();
			}
			
			/**
			 * This method will logout of the application
			 * @param driver
			 */
			public void logOutOfApp(WebDriver driver )
			{
				mouseHoverAction(driver, AdministratorImg);
				SignOutLnk.click();
			}

			

	}
	
}
