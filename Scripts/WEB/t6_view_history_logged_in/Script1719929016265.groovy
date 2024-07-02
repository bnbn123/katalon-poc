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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '10/7/2024')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/appointment.php#summary')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_History'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_History'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_History'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/div_10072024'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_10072024'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Facility'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_No'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Healthcare Program'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Healthcare Program'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicaid'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicaid'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Comment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()

