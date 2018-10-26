package xero;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class AutomationScript extends ReUseableMethod{
	public static void Login_Error_Message_1() throws Exception {
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Login_Error_Message_1");
	//	String expData="Please enter your password.";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
		enterText(username, "username field","leemarosid@gmail.com");
		WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
		enterText(password1, "password field","Leema6*l");
		
		WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(loginButton, "Login Button");
		logger.log(Status.INFO,"login button clicked");
		closeDriver();
//		WebElement actuaError=driver.findElement(getLocator("salesforce.login.errorMsg",objPro));
//		verifyText(actuaError, "error message",expData);
		
	}
	public static void Login_Error_Message_2() throws Exception {
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Login_Error_Message_2");
	//	String expData="Please enter your password.";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
		enterText(username, "username field","leemarosid@gmail.com");
		WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
		enterText(password1, "password field","Leema");
		
		WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(loginButton, "Login Button");
		logger.log(Status.INFO,"login button clicked");
		closeDriver();
//		WebElement actuaError=driver.findElement(getLocator("salesforce.login.errorMsg",objPro));
//		verifyText(actuaError, "error message",expData);
		
	}
	public static void Login_Error_Message_3() throws Exception {
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Login_Error_Message_3");
	//	String expData="Please enter your password.";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement forgotpass=driver.findElement(getLocator("xero.forgot.password",objPro));
		clickElement(forgotpass, "Forgot Password");
		logger.log(Status.INFO,"login button clicked");
		WebElement email=driver.findElement(getLocator("xero.login.email",objPro));
		enterText(email, "Email","leemarosid@gmail.com");
		WebElement sendlink=driver.findElement(getLocator("xero.login.send",objPro));
		clickElement(sendlink, "Send Link");
		logger.log(Status.INFO,"Send Link button clicked");
}
	public static void Login_Error_Message_4() throws Exception {
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Login_Error_Message_4");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroUrl"));
			logger.log(Status.INFO,"xero page opened");
			WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
			enterText(username, "username field","leemad@gmail.com");
			WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
			password.clear();
			logger.log(Status.INFO,"password field cleared");
			WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
			enterText(password1, "password field","Leema6*l");
			
			WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
			clickElement(loginButton, "Login Button");
			logger.log(Status.INFO,"login button clicked");
			closeDriver();
}
	public static void SignUp_FreeTrail() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("SignUp_FreeTrail");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroTrail"));
			logger.log(Status.INFO,"xero Trail page opened");
			WebElement freeTrail=driver.findElement(getLocator("xero.free.trail",objPro));
			freeTrail.click();
			WebElement firstname=driver.findElement(getLocator("xero.first.name",objPro));
			enterText(firstname, "Firstname field","Leema");
			WebElement lastname=driver.findElement(getLocator("xero.last.name",objPro));
			enterText(lastname, "Lastname field","Tamil");
			WebElement email=driver.findElement(getLocator("xero.email",objPro));
			enterText(email, "email field","leemarosid@gmail.com");
			WebElement phone=driver.findElement(getLocator("xero.phone.number",objPro));
			enterText(phone, "phone field","123-456-7890");
			WebElement agree=driver.findElement(getLocator("xero.read.agree",objPro));
			agree.click();
			WebElement getstarted=driver.findElement(getLocator("xero.get.started",objPro));
			clickElement(getstarted, "Get Started");
			logger.log(Status.INFO,"Get Started button clicked");
			closeDriver();
	}
	public static void SignUp_FreeTrail_1() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("SignUp_FreeTrail_1");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroTrail"));
			logger.log(Status.INFO,"xero Trail page opened");
			WebElement freeTrail=driver.findElement(getLocator("xero.free.trail",objPro));
			freeTrail.click();
			WebElement getstarted=driver.findElement(getLocator("xero.get.started",objPro));
			clickElement(getstarted, "Get Started");
			logger.log(Status.INFO,"Get Started button clicked");
			WebElement email=driver.findElement(getLocator("xero.email",objPro));
			enterText(email, "email field","leema@gmail.com");
			WebElement getstarted1=driver.findElement(getLocator("xero.get.started",objPro));
			clickElement(getstarted1, "Get Started");
			logger.log(Status.INFO,"Get Started button clicked");
			closeDriver();
	}
	public static void SignUp_FreeTrail_2() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("SignUp_FreeTrail_2");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroTrail"));
			logger.log(Status.INFO,"xero Trail page opened");
			WebElement freeTrail=driver.findElement(getLocator("xero.free.trail",objPro));
			freeTrail.click();
			WebElement terms=driver.findElement(getLocator("xero.terms.use",objPro));
			clickElement(terms, "TermsAndUse");
			logger.log(Status.INFO,"Terms And Use Link clicked");
			WebElement policy=driver.findElement(getLocator("xero.privacy.policy",objPro));
			clickElement(policy, "Privacy Policy");
			logger.log(Status.INFO,"Privacy Policy Link clicked");
			closeDriver();
	}
	public static void SignUp_FreeTrail_3() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("SignUp_FreeTrail_3");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroTrail"));
			logger.log(Status.INFO,"xero Trail page opened");
			WebElement freeTrail=driver.findElement(getLocator("xero.free.trail",objPro));
			freeTrail.click();
			WebElement offer=driver.findElement(getLocator("xero.offer.link",objPro));
			clickElement(offer, "Offer Link");
			logger.log(Status.INFO,"Offer Link clicked");
			closeDriver();
	}
	public static void SignUp_FreeTrail_4() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("SignUp_FreeTrail_4");
		//	String expData="Please enter your password.";
			IntializeDriver("firefox");
			driver.get(pro.getProperty("xeroTrail"));
			logger.log(Status.INFO,"xero Trail page opened");
			WebElement freeTrail=driver.findElement(getLocator("xero.free.trail",objPro));
			freeTrail.click();
			WebElement bookkeeper=driver.findElement(getLocator("xero.accountant.bookkeeper",objPro));
			clickElement(bookkeeper, " Accountant and Bookkeeper");
			logger.log(Status.INFO,"Accountant and Bookkeeper Link clicked");
			closeDriver();
	}
	public static void Test_Tab() throws Exception {
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Test_Tab");
	//	String expData="Please enter your password.";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
		enterText(username, "username field","leemarosid@gmail.com");
		WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
		enterText(password1, "password field","Leema6*l");
		
		WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(loginButton, "Login Button");
		logger.log(Status.INFO,"login button clicked");
		WebElement dashboard=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(dashboard, "DashBoard Button");
		logger.log(Status.INFO,"DashBoard button clicked");
		WebElement accounts=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(accounts, "Accounts Button");
		logger.log(Status.INFO,"Accounts Dropdown Showed");
		WebElement payroll=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(payroll, "Payroll Button");
		logger.log(Status.INFO,"Payroll Dropdown Showed");
		WebElement projects=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(projects, "Projects Button");
		logger.log(Status.INFO,"Projects Dropdown Showed");
		WebElement reports=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(reports, "Reports Button");
		logger.log(Status.INFO,"Reports Dropdown Showed");
		WebElement contact=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(contact, "Contact Button");
		logger.log(Status.INFO,"Contact Dropdown Showed");
		WebElement setting=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(setting, "Setting Button");
		logger.log(Status.INFO,"Setting Dropdown Showed");
		WebElement new1=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(new1, "New Button");
		logger.log(Status.INFO,"New Dropdown Showed");
		WebElement file=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(file, "File Button");
		logger.log(Status.INFO,"File button clicked");
		WebElement notification=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(notification, "Notification Button");
		logger.log(Status.INFO,"Notification Dropdown Showed");
		WebElement search=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(search, "Search Button");
		logger.log(Status.INFO,"Search button clicked");
		WebElement help=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(help, "Help Button");
		logger.log(Status.INFO,"Help Dropdown Showed");
		
		closeDriver();
}
	public static void Test_Logout() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Test_Logout");
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
		enterText(username, "username field","leemarosid@gmail.com");
		WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
		enterText(password1, "password field","Leema6*l");
		
		WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(loginButton, "Login Button");
		logger.log(Status.INFO,"login button clicked");

		WebElement user=driver.findElement(getLocator("xero.username",objPro));
		clickElement(user, "UserName Button");
		logger.log(Status.INFO,"UserName dropdown menu showed");

		WebElement logout=driver.findElement(getLocator("xero.logout",objPro));
		clickElement(logout, "Logout Button");
		logger.log(Status.INFO,"logout button clicked,Username not displaced");
			closeDriver();
	}
	public static void Upload_Image() throws Exception{
		String propertyPath="./src/test/resources/DataFiles/Configuration.properties";
		Properties pro=loadPropertyFile(propertyPath);
		
		String ObjectsRepo="./src/test/resources/ObjectRepository/ObjectsRepo.properties";
		Properties objPro=loadPropertyFile(ObjectsRepo);
		
		createTestScriptReport("Upload_Image");
		//	String expData="Please enter your password.";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("xeroUrl"));
		logger.log(Status.INFO,"xero page opened");
		WebElement username=driver.findElement(getLocator("xero.login.username",objPro));
		enterText(username, "username field","leemarosid@gmail.com");
		WebElement password=driver.findElement(getLocator("xero.login.password",objPro));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement password1=driver.findElement(getLocator("xero.login.password",objPro));
		enterText(password1, "password field","Leema6*l");
		
		WebElement loginButton=driver.findElement(getLocator("xero.login.loginButton",objPro));
		clickElement(loginButton, "Login Button");
		logger.log(Status.INFO,"login button clicked");

		WebElement user=driver.findElement(getLocator("xero.username",objPro));
		clickElement(user, "UserName Button");
		logger.log(Status.INFO,"UserName dropdown menu showed");

		WebElement profile=driver.findElement(getLocator("xero.profile",objPro));
		clickElement(profile, "Profile Button");
		logger.log(Status.INFO,"Profile page opened");
		WebElement profilepic=driver.findElement(getLocator("xero.profile.pic",objPro));
		clickElement(profilepic, "Profilepic Button");
		
		WebElement browser=driver.findElement(getLocator("xero.browser.pic",objPro));
		clickElement(browser, "Profile Button");
		logger.log(Status.INFO,"Browser the pic");
		driver.findElement(By.name("Browser")).sendKeys("C:\\Users\\Owner\\Desktop\\pic.jpg");
		WebElement upload=driver.findElement(getLocator("xero.button",objPro));
		clickElement(upload, "Upload Button");
		logger.log(Status.INFO,"Uploaded the pic");
			closeDriver();
	}
}

