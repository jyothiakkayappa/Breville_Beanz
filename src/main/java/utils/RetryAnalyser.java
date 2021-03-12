package main.java.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int count = 0;
    int retryCount = 1; //If Testcases fails we will try it once , if its 2 , it will retry twice.

    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count<retryCount)
        {
            count++;
            return true;  //This method implements in SuiteListen class by using annotation transformer
        }
        return false;
    }
}
