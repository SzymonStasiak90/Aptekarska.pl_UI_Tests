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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.aptekarska.pl/oferta/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Formularz/Page_Aptekarska Szkoa Zarzdzania/button_Nie zgadzam si'))

WebUI.scrollToElement(findTestObject('SPY - Newsletter/Page_Aptekarska Szkoa Zarzdzania/iframe__fm-fc-f-jquodjjgyu'), 0)

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/input_Imi_freshmail_custom_fieldimie'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/input_Imi_freshmail_custom_fieldimie'))

WebUI.setText(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/input_Imi_freshmail_custom_fieldimie'), 
    'Szymon')

WebUI.setText(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/input_Email (ktry regularnie odbierasz)_fre_eca03e'), 
    'SS@wp.pl')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/label'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/button_Zapisz mnie'))

WebUI.closeBrowser()

