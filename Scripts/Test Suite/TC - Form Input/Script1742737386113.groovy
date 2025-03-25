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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.baseUrl)
//
//WebUI.click(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/a_Make Appointment'))
//
//String username = 'John Doe'
//String password = 'ThisIsNotAPassword'
//WebUI.setText(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/input_username'), username)
//
//WebUI.setText(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/input_Password_password'), password)
//
//WebUI.click(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/button_Login'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'),
	Healthcare, true)

if (Checklist == 'yes') {
	WebUI.check(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/label_Apply for hospital readmission'))
} else if (Checklist == 'no') {
	WebUI.uncheck(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/label_Apply for hospital readmission'))
}

if (Program == 'Medicaid') {
	WebUI.click(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/input_Medicaid_programs'))
} else if (Program == 'Medicare') {
	WebUI.click(findTestObject('Cura/Page_CURA Healthcare Service/input_Medicare_programs'))
} else if (Program == 'None') {
	WebUI.click(findTestObject('Cura/Page_CURA Healthcare Service/input_None_programs'))
}

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_visit_date'), VisitDate)

WebUI.click(findTestObject('Page_CURA Healthcare Service/div_Comment'))

WebUI.setText(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/textarea_comment'), Comment)

WebUI.click(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Cura/Page_CURA Healthcare Service/a_Go to Homepage'))