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
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.aptekarska.pl/o-nas/')

WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_O nas - Aptekarska Szkoa Zarzdzania/button_Nie zgadzam si'))














WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_O nas - Aptekarska Szkoa Zarzdzania/i_1_2'))

WebUI.waitForPageLoad(3)

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/o-nas/katarzyna-grebska/')

WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_Katarzyna Grbska - Aptekarska Szkoa Za_6b8522/span_O nas'))

WebUI.waitForPageLoad(3)

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/o-nas/')

WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_O nas - Aptekarska Szkoa Zarzdzania/a_Wicej_1_2'))

WebUI.waitForPageLoad(3)

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/o-nas/katarzyna-grebska/')

WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_Katarzyna Grbska - Aptekarska Szkoa Za_6b8522/span_O nas'))

WebUI.waitForPageLoad(3)

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/o-nas/')










WebUI.click(findTestObject('Object Repository/Podstrona O nas Przyciski/Page_Marta Baaziska - Aptekarska Szkoa Zarzdzania/span_Strona gwna'))

WebUI.waitForPageLoad(3)

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/')

WebUI.closeBrowser()

