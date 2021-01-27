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
WebUI.navigateToUrl('https://www.aptekarska.pl/')
WebUI.click(findTestObject('Object Repository/Strona Główna Nawigacja/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/button_Nie zgadzam si'))

WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/a_Wicej o nas'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/o-nas/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_O nas - Aptekarska Szkoa Zarzdzania/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/a_Wszystkie aktualnoci'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/aktualnosci/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/a_Wszystkie artykuy'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Artykuy - Aptekarska Szkoa Zarzdzania/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/div_Jak odzyska kontrol nad swoim czasem w _1cb63d_1'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2021/01/24/jak-odzyskac-kontrole-nad-swoim-czasem-w-6-krokach/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Jak odzyska kontrol nad swoim czasem w_66149d/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/div_Jak zwikszy przychody w aptece'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/10/jak-zwiekszyc-przychody-w-aptece/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Jak zwikszy przychody w aptece - Aptek_bf68d0/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/div_Maa zmiana, ktra daje due efekty w pole_91eb46'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/04/mala-zmiana-ktora-daje-duze-efekty-w-polepszeniu-jakosci-obslugi-pacjenta-w-aptece/')
WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Maa zmiana, ktra daje due efekty w pol_a2020f/span_Strona gwna'))


WebUI.click(findTestObject('Object Repository/Strona Główna Przyciski/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/a_ofert'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/')


WebUI.closeBrowser()

