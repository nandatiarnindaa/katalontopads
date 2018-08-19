import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

String randGroup = 'grup' + RandomStringUtils.randomNumeric(5)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.tokopedia.com/authorize?client_id=1001&p=https%3A%2F%2Fwww.tokopedia.com&redirect_uri=https%3A%2F%2Fwww.tokopedia.com%2Fappauth%2Fcode&response_type=code&state=eyJyZWYiOiJodHRwczovL3d3dy50b2tvcGVkaWEuY29tIiwidXVpZCI6ImIzNzFkMzMxLWU4YWQtNDA2Yy05YzMwLTU3ZGY3NmY4ZWIxNyJ9')

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Tokopedia/input_email'), 'ndatiarninda@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Tokopedia/input_password'), 'dOUs4m8VVfmJZIkURU6ZpUPAhM5fFaKh')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Tokopedia/button_Masuk'))

WebUI.navigateToUrl('https://ta.tokopedia.com/v2/manage')

WebUI.click(findTestObject('Page_Daftar Iklan  Tokopedia/a_Tambah Iklan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Daftar Iklan  Tokopedia/Click Add Product'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Iklan  Tokopedia/input_group-name__input'), randGroup)

WebUI.click(findTestObject('Choose 1st Product'))

WebUI.setText(findTestObject('Page_Daftar Iklan  Tokopedia/Fill Price Bid'), '600')

WebUI.click(findTestObject('login/Page_Masuk  Tokopedia/button_Simpan'))

//WebUI.navigateToUrl('https://ta.tokopedia.com/v2/manage/group')
//WebUI.verifyTextPresent(randGroup, false)
//Boolean textPresent = WebUI.verifyTextPresent(randGroup, false, FailureHandling.CONTINUE_ON_FAILURE)
//if (textPresent) {
//    WebUI.comment('text found')
//} else {
//    WebUI.executeJavaScript('alert(\'text not found\')', null)
//}
WebUI.waitForPageLoad(15)

'Verify the name of new group is appear on the page'
String url = WebUI.getUrl()

WebUI.executeJavaScript('alert(url)', null)

not_run: WebUI.verifyTextPresent('grup', false)

