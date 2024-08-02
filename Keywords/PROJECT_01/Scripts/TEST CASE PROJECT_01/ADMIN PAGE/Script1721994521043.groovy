import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.waitForElementPresent(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Username'), 0)

WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Username'), Username)

WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Password'), Password)

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Button_Login'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Admin'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Admin'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/PIM'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/PIM'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Leave'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Leave'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Time'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Time'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Recruitment'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Recruitment'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Performance'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Performance'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Dashboard'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Dashboard'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Claim'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Claim'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGOUT/Button Profile'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/About'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/About'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Close Button'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGOUT/Button Profile'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Support'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Support'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGOUT/Button Profile'))

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/PAGE/Change Password'))

WebUI.verifyElementVisible(findTestObject('OBJECT REPOSITORY PROJECT_01/ADMIN PAGE/VERIFY ELEMENT PAGE/Change Password'))

WebUI.closeBrowser()

