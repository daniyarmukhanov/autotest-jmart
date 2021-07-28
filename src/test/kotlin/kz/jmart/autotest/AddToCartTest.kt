package kz.jmart.autotest

import kz.jmart.autotest.core.SeleniumAndroidDriver
import kz.jmart.autotest.core.SeleniumAndroidDriver.Companion.closeDriver
import kz.jmart.autotest.pages.GeneralPage
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class AddToCartTest {

    companion object {
        private lateinit var generalPage: GeneralPage
    }

    @BeforeClass
    fun setup() {
        SeleniumAndroidDriver.getInstance()
        generalPage = GeneralPage()
    }

    @Test
    fun test() {
        generalPage.pressRu()
        generalPage.pressJmart()
        generalPage.chooseCity()
        generalPage.selectCategory("Акции месяца")
        generalPage.selectSubCategory("Все")
        generalPage.selectFirstProduct()
        generalPage.chooseByCard()
        generalPage.pressChooseFirstMarket()
        generalPage.pressNextToDeliver()
        generalPage.pressNextToPay()
        println("The Test was successful")
    }

    @AfterClass
    fun clear() {
        closeDriver()
        println("The close_up process is completed")
    }
}
