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

WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Username'), Username)

WebUI.sendKeys(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Password'), password)

WebUI.click(findTestObject('OBJECT REPOSITORY PROJECT_01/LOGIN/Button_Login'))

WebUI.click(findTestObject('CRUD/ADD EMPLOYEE/Menu PIM'))

WebUI.click(findTestObject('CRUD/ADD EMPLOYEE/Button Add'))

WebUI.setText(findTestObject('CRUD/ADD EMPLOYEE/Input First Name'), 'Cristiano')

WebUI.setText(findTestObject('CRUD/ADD EMPLOYEE/Input Middle Name'), 'Ronaldo')

WebUI.setText(findTestObject('CRUD/ADD EMPLOYEE/Input Last Name'), 'J')

WebUI.setText(findTestObject('CRUD/ADD EMPLOYEE/Input Empoyee ID'), '12345')

WebUI.click(findTestObject('CRUD/ADD EMPLOYEE/Button Save'))

WebUI.verifyElementVisible(findTestObject('CRUD/ADD EMPLOYEE/Verify Element Success'))

