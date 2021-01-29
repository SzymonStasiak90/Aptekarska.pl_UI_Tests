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




// Artykuły
WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Rosnco_post-thumbnail-rollover'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2021/01/24/jak-odzyskac-kontrole-nad-swoim-czasem-w-6-krokach/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Jak odzyska kontrol nad swoim czasem w 6 krokach'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2021/01/24/jak-odzyskac-kontrole-nad-swoim-czasem-w-6-krokach/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2021/01/24/jak-odzyskac-kontrole-nad-swoim-czasem-w-6-krokach/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')






// Jak zwiększyć przychody w aptece?
WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_post-thumbnail-rollover'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/10/jak-zwiekszyc-przychody-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Jak zwikszy przychody w aptece'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/10/jak-zwiekszyc-przychody-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_1'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/10/jak-zwiekszyc-przychody-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')





// Mała zmiana, która daje duże efekty w polepszeniu jakości obsługi pacjenta w aptece
WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_post-thumbnail-rollover_1'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/04/mala-zmiana-ktora-daje-duze-efekty-w-polepszeniu-jakosci-obslugi-pacjenta-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Maa zmiana, ktra daje due efekty w poleps_62a5d1'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/04/mala-zmiana-ktora-daje-duze-efekty-w-polepszeniu-jakosci-obslugi-pacjenta-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_1_2'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/04/mala-zmiana-ktora-daje-duze-efekty-w-polepszeniu-jakosci-obslugi-pacjenta-w-aptece/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')



// Płukanki zawierające oktenidynę i fenoksyetanol istotnie zmniejszają poziom wirusa SARS-CoV-2 na błonach śluzowych
WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_post-thumbnail-rollover_1_2'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/03/plukanki-zawierajace-oktenidyne-i-fenoksyetanol-istotnie-zmniejszaja-poziom-wirusa-sars-cov-2-na-blonach-sluzowych/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')

WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Pukanki zawierajce oktenidyn i fenoksyeta_44fe9f'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/03/plukanki-zawierajace-oktenidyne-i-fenoksyetanol-istotnie-zmniejszaja-poziom-wirusa-sars-cov-2-na-blonach-sluzowych/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')


WebUI.click(findTestObject('Object Repository/Podstrona Artykuły/Page_Artykuy - Aptekarska Szkoa Zarzdzania/a_Czytaj Wicej_1_2_3'))
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/2020/12/03/plukanki-zawierajace-oktenidyne-i-fenoksyetanol-istotnie-zmniejszaja-poziom-wirusa-sars-cov-2-na-blonach-sluzowych/')

WebUI.back()
WebUI.getUrl()
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/artykuly/')


WebUI.closeBrowser()

