package kz.jmart.autotest.pages

import kz.jmart.autotest.core.SeleniumAndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import java.util.concurrent.TimeUnit

class GeneralPage() {
    init {
        PageFactory.initElements(SeleniumAndroidDriver.getDriver(), this)
    }

    @FindBy(id = "kz.tsb.app24.debug:id/ruButton")
    private val ruBtn: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/marketTextView")
    private val jmartBtn: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/profileButton")
    private val profileButton: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/loginButton")
    private val loginOrSignUp: WebElement? = null

    @FindBy(xpath = "//android.widget.TextView[@text='Войти']")
    private val loginButton: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/phoneNumberEditText")
    private val phoneNumberEditText: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/nextButton")
    private val nextButtonAfterPhone: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/passwordEditText")
    private val passwordEditText: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/nextButton")
    private val nextButtonAfterPassword: WebElement? = null

    @FindBy(xpath = "//android.widget.TextView[@text='Алматы']")
    private val almatyCity: WebElement? = null

    /**
     * ---------------------------------------------------------------------------------------
     */
    fun pressRu() {
        ruBtn?.click()
    }

    fun pressProfile() {
        profileButton?.click()
    }

    fun pressLoginOrSignUp() {
        loginOrSignUp?.click()
        SeleniumAndroidDriver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    fun pressLogin() {
        val all =  SeleniumAndroidDriver.getDriver().findElements(By.id("loginButton"))
        var last: WebElement? = null
        for (view in all) {
            last = view
        }
        last?.click()
    }

    fun enterPhoneNumber(phone: String) {
        phoneNumberEditText?.sendKeys(phone)
    }


    fun pressNextAfterPhone() {
        nextButtonAfterPhone?.click()
    }

    fun enterPassword(password: String) {
        passwordEditText?.sendKeys(password)
    }

    fun pressNextAfterPassword() {
        nextButtonAfterPassword?.click()
    }
    /**
     * ---------------------------------------------------------------------------------------
     */


    /**
     * ---------------------------------------------------------------------------------------
     */
    fun pressJmart() {
        jmartBtn?.click()
    }

    fun chooseCity() {
        almatyCity?.click()
    }

    fun selectCategory(category: String) {

    }

    fun selectSubCategory(subCategory: String) {

    }

    fun selectFirstProduct() {

    }

    fun chooseByCard() {

    }

    fun pressChooseFirstMarket() {

    }

    fun pressNextToDeliver() {

    }

    fun pressNextToPay() {

    }
    /**
     * ---------------------------------------------------------------------------------------
     */

}
