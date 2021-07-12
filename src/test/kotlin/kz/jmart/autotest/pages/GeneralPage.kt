package kz.jmart.autotest.pages

import kz.jmart.autotest.core.SeleniumAndroidDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class GeneralPage() {
    init {
        PageFactory.initElements(SeleniumAndroidDriver.getDriver(), this)
    }

    @FindBy(id = "kz.tsb.app24.debug:id/kazButton")
    private val kazBtn: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/marketTextView")
    private val jmartBtn: WebElement? = null


    fun selectKaz() {
        kazBtn!!.click()
    }


    fun clickMarket() {
        jmartBtn!!.click()
    }

}
