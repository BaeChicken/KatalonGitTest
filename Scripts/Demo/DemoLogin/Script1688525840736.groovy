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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.loginmodule.learning')

/*
 * Create multiple account
 */
//for (def rowNum = 1; rowNum <= findTestData('Demo/DemoMobileData').getRowNumbers(); rowNum++) {
//    Mobile.tap(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txvDirectRegister'), 0)
//
//    Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfName'), findTestData('Demo/DemoMobileData').getValue(
//            1, rowNum), 0)
//
//    Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfEmail'), findTestData('Demo/DemoMobileData').getValue(
//            2, rowNum), 0)
//
//    Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfPassword'), findTestData('Demo/DemoMobileData').getValue(
//            3, rowNum), 0)
//
//    Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfConfirmPassword'), findTestData(
//            'Demo/DemoMobileData').getValue(4, rowNum), 0)
//
//    Mobile.tap(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.btnRegister'), 0)
//
//    Mobile.pressBack()
//}

Mobile.tap(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txvDirectRegister', ['preClass': GlobalVariable.gClassAndroid]), 0)

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfName', ['preClass': GlobalVariable.gClassAndroid]), 'Duy', 0)

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfEmail', ['preClass': GlobalVariable.gClassAndroid]), sUserName, 0)

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfPassword', ['preClass': GlobalVariable.gClassAndroid]), sPassword, 0)

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfConfirmPassword', ['preClass': GlobalVariable.gClassAndroid]), sPassword, 0)

Mobile.scrollToText('REGISTER');

Mobile.tap(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.btnRegister', ['preClass': GlobalVariable.gClassAndroid]), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfEmailLogin', ['preClass': GlobalVariable.gClassAndroid]), sUserName, 0)

Mobile.setText(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txfPasswordLogin', ['preClass': GlobalVariable.gClassAndroid]), sPassword, 0)

Mobile.tap(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.btnLogin', ['preClass': GlobalVariable.gClassAndroid]), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/DemoRegisterAndLogin/android.widget.txvValidation', ['preClass': GlobalVariable.gClassAndroid]), 
    'text', sUserName, 0)