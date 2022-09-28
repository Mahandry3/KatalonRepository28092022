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
import com.thoughtworks.selenium.webdriven.commands.GetValue as GetValue
import com.googlecode.javacv.cpp.opencv_ml$CvSVMSolver$GetRow as GetRow
import org.apache.commons.collections4.Get as Get

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-centreinffo.wylog.com/')

WebUI.click(findTestObject('Page_Homepage  localhost/b_Sign in'))

for (def rowNum = 1; rowNum <= findTestData('New Test Data').getRowNumbers(); rowNum++) {
    WebUI.comment('Remplissage Login')

    WebUI.setText(findTestObject('Page_Login  localhost/input_Email_login'), findTestData('New Test Data').getValue(1, rowNum))

    WebUI.setText(findTestObject('Page_Login  localhost/input_Password_password'), findTestData('New Test Data').getValue(
            2, rowNum))

    WebUI.click(findTestObject('Page_Login  localhost/button_Connexion'))
}

