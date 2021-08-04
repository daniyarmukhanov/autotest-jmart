package kz.jmart.autotest

import kz.jmart.autotest.core.SeleniumAndroidDriver
import kz.jmart.autotest.core.SeleniumAndroidDriver.Companion.closeDriver
import kz.jmart.autotest.pages.GeneralPage
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class AuthTest {

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
        generalPage.pressProfile()
        generalPage.pressLoginOrSignUp()
        generalPage.pressLogin()
        generalPage.enterPhoneNumber("+77029016994")
        generalPage.pressNextAfterPhone()
        generalPage.enterPassword("qwerty123")
        generalPage.pressNextAfterPassword()
        println("The Test was successful")
    }

    @AfterClass
    fun clear() {
        //closeDriver()
        println("The close_up process is completed")
    }
}
