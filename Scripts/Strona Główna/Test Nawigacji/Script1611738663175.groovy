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

WebUI.navigateToUrl('https://www.aptekarska.pl/')

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/button_Nie zgadzam si'))

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/span_Aktualnoci'))

WebUI.verifyElementText(findTestObject('Spy - Podstrona Aktualności/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/h1_Aktualnoci'), 
    'Aktualności')

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Artykuy'))

WebUI.verifyElementText(findTestObject('Spy - Nagłówki Podstron/Page_Artykuy - Aptekarska Szkoa Zarzdzania/h1_Artykuy'), 
    'Artykuły')

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Artykuy - Aptekarska Szkoa Zarzdzania/span_O nas'))

WebUI.verifyElementText(findTestObject('Spy - Nagłówki Podstron/Page_O nas - Aptekarska Szkoa Zarzdzania/h1_O nas'), 'O nas')

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_O nas - Aptekarska Szkoa Zarzdzania/span_Kontakt'))

WebUI.verifyElementText(findTestObject('Spy - Nagłówki Podstron/Page_Kontakt - Aptekarska Szkoa Zarzdzania/h1_Kontakt'), 
    'Kontakt')

WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/span_Oferta'))

WebUI.getUrl()

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/')

WebUI.closeBrowser()

