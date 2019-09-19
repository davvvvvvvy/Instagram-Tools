package modules

import org.openqa.selenium.chrome.ChromeDriver

class UtilCheck {

    private val driver = ChromeDriver()

    fun checkAge() {

        if (driver.findElementByClassName("XnQ-0").isEnabled) {
            driver.findElementByXPath("//input[@name='ageRadio']").click()
            driver.findElementByXPath("/html/body/div[3]/div/div[3]/div/button").click()
            println("[LOG ]\tAge selected")
        }

        else {
            println("No age section!")
        }

    }

}