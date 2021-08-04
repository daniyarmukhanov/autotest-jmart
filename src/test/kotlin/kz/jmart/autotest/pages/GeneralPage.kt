package kz.jmart.autotest.pages

import io.appium.java_client.TouchAction
import kz.jmart.autotest.core.SeleniumAndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.touch.TouchActions
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
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

    @FindBy(id = "kz.tsb.app24.debug:id/registerButton")
    private val registerButton: WebElement? = null

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

    @FindBy(xpath = "//android.widget.TextView[@text='Акции месяца']")
    private val monthDiscounts: WebElement? = null

    @FindBy(xpath = "//android.widget.TextView[@text='Все']")
    private val all: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/nameTextView")
    private val firstProduct: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/isPaymentTextView")
    private val card: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/addTextView")
    private val chooseBtn: WebElement? = null

    @FindBy(id = "kz.tsb.app24.debug:id/scrollView")
    private val scrollView: WebElement? = null

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
    }

    fun pressLogin() {

        registerButton?.let {
            wait(it)
            val all =  SeleniumAndroidDriver.getDriver().findElements(By.id("loginButton"))
            println(all.toString())
            var last: WebElement? = null
            for (view in all) {
                last = view
            }
            last?.click()
        }
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

    fun selectMonthDiscounts() {
        monthDiscounts?.click()
    }

    fun selectAll() {
        all?.click()
        SeleniumAndroidDriver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)
    }

    fun selectFirstProduct() {
        firstProduct?.let {
            wait(it)
            it.click()
        }
    }

    fun chooseByCard() {
        card?.let {
            wait(it)
            it.click()
        }
    }

    fun pressChooseFirstMarket() {
//        val action = TouchAction(SeleniumAndroidDriver.getDriver())
//        action.scroll(scrollView, 10, 100)
//        action.perform()


        chooseBtn?.let {
            wait(it)
            it.click()
        }
    }

    /**
     * ---------------------------------------------------------------------------------------
     */

    private fun wait(webElement: WebElement) {
        val wait = WebDriverWait(  SeleniumAndroidDriver.getDriver(), 15)
        wait.until(ExpectedConditions.visibilityOf(webElement))
    }
}
