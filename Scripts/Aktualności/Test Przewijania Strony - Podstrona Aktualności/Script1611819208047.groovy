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

WebUI.navigateToUrl('https://www.aptekarska.pl/aktualnosci/')

WebUI.click(findTestObject('Object Repository/Strona Główna Przewijanie/Page_Aptekarska Szkoa Zarzdzania Szkolenia _8ea30e/button_Akceptuj wszystko'))

WebUI.scrollToElement(findTestObject('Spy - Podstrona Aktualności/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/div_Czytaj Wicej_wf-container-footer'), 
    0)

WebUI.click(findTestObject('Spy - Podstrona Aktualności/Page_Aktualnoci - Aptekarska Szkoa Zarzdzania/a_Do gry'))

WebUI.closeBrowser()

