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
WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/button_Nie zgadzam si'))


WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/span_Aktualnoci'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/aktualnosci/')


WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Artykuy'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')


WebUI.click(findTestObject('SPY - NAWIGACJA STRONA GŁOWNA BUTTON/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/img_Szkolenia cige dla farmaceutw, farmacji, farmaceutyczne  Aptekarska.pl_preload-me'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/')


WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_O nas - Aptekarska Szkoa Zarzdzania/span_Kontakt'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/kontakt/')


WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/span_Oferta'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/')


WebUI.closeBrowser()

