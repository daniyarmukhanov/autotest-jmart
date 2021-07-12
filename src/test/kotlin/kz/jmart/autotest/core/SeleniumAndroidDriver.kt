package kz.jmart.autotest.core

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

class SeleniumAndroidDriver {

    companion object {
        private lateinit var driver: AndroidDriver<WebElement>

        fun getInstance(): AndroidDriver<WebElement> {
            if (!::driver.isInitialized) {
                val cap = DesiredCapabilities()
                cap.setCapability(MobileCapabilityType.DEVICE_NAME, ConfProperties.getProperty("deviceName"))
                cap.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfProperties.getProperty("platformName"))
                cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfProperties.getProperty("platformVersion"))
                cap.setCapability(MobileCapabilityType.APP, ConfProperties.getProperty("appAPK"))
                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfProperties.getProperty("automationName"))

                driver = AndroidDriver(URL(ConfProperties.getProperty("appium")), cap)
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
                println("The setup process is completed")
            }
            return driver
        }

        fun getDriver(): AndroidDriver<WebElement> {
            return driver
        }

        fun closeDriver() {
            if (::driver.isInitialized) {
                driver.closeApp()
            }
        }
    }
}
