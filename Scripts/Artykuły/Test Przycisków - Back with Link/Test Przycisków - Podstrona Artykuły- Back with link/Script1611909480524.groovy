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
WebUI.navigateToUrl('https://www.aptekarska.pl/artykuly/')



WebUI.click(findTestObject('Object Repository/Podstrona Aktualności Przyciski/Page_WEBINAR nt. recept - Aptekarska Szkoa _d7070e/button_Nie zgadzam si'))
WebUI.click(findTestObject('Object Repository/Podstrona Aktualności Przyciski/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Sortuj po dacie_filter-switch left-act_ca62bb'))
WebUI.click(findTestObject('Object Repository/Podstrona Aktualności Przyciski/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Sortuj po dacie_filter-switch-toggle'))
WebUI.click(findTestObject('Object Repository/Podstrona Aktualności Przyciski/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Malejco_filter-switch-toggle'))
WebUI.click(findTestObject('Object Repository/Podstrona Aktualności Przyciski/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/span_Malejco_filter-switch-toggle_1'))





WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Rosnco_post-thumbnail-rollover'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2021/01/24/jak-odzyskac-kontrole-nad-swoim-czasem-w-6-krokach/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Jak odzyska kontrol nad swoim czasem w_66149d/span_Artykuy'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')



//https://www.aptekarska.pl/category/artykuly/

WebUI.closeBrowser()

