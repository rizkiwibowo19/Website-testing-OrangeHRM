import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.seleniumhq.jetty9.util.security.Password as Password
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')



if (Username != 'none') {
    WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Username'), Username)
} else {
    WebUI.verifyElementText(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Required'), ExpectedMessage)
}

WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Password'), password)

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Button_Login'))

if (TestType == 'P') {
    WebUI.waitForElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Verify Element Login'), 0)
} else {
    WebUI.verifyElementText(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Invalid credentials'), ExpectedMessage)
}

if (TestType == 'P') {
    WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGOUT/Button Profile'))

    WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGOUT/Button Logout'))
}

