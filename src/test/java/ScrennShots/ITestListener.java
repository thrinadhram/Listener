package ScrennShots;

import org.testng.ITestResult;

public class ITestListener extends BaseTest implements org.testng.ITestListener{

	public void onTestFailure(ITestResult result)
	{
		CaptureScreenShot(result.getTestName()+".jpg");
	}

}
