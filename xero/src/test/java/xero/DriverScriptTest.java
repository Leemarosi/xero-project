package xero;

import java.lang.reflect.Method;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;


public class DriverScriptTest extends AutomationScript  {
@Test
public static void mainMethod() throws Exception{
	String cur_dir=System.getProperty("user.dir");
	String dt_Path=cur_dir+"/src/test/resources/Utility/TestSuite.xls";
	String testCase=null;
	String flag=null;
	System.out.println("Excution started from driver file");
	
	initializeExtentReport("xeroTestCaseReport");
	
	String[][] TestSuitedata = readxlData(dt_Path,"Sheet1");
	for(int i = 1; i< TestSuitedata.length; i++) {
		flag = TestSuitedata[i][1];
		if(flag.equalsIgnoreCase("Y")) {
				testCase = TestSuitedata[i][0];
				Method testScript = AutomationScript.class.getMethod(testCase);
				testScript.invoke(testScript);
				
			}else {
				System.out.println("**********Row  number "+ i+" test case Name "+ TestSuitedata[i][0]+" is not Executed*********");
			}
			
		
		
		
	}
	
	endExtentReport();
}
	

}
