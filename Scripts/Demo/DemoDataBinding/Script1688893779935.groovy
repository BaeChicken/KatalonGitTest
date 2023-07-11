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

Mobile.startApplication('C:\\Users\\dmanhuynh\\Downloads\\SampleAndroidApp_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/DemoDataBinding/android.widget.txvDirectRegister'), 0)

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfName'), sName, 0)

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfEmail'), sEmail, 0)

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfPassword'), sPassword, 0)

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfConfirmPassword'), sConfirmPassword, 0)

Mobile.tap(findTestObject('Object Repository/DemoDataBinding/android.widget.btnRegister'), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfEmailLogin'), sEmail, 0)

Mobile.setText(findTestObject('Object Repository/DemoDataBinding/android.widget.txfPasswordLogin'), sPassword, 0)

Mobile.tap(findTestObject('Object Repository/DemoDataBinding/android.widget.btnLogin'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/DemoDataBinding/android.widget.txvValidation'),
	'text', 'huynhm.duy08@gmail.com', 0)