package modules

import org.openqa.selenium.chrome.ChromeDriver

class Comment {

    val driver = ChromeDriver()
    var linkToPost : String ?= null
    var text : String ?= null

    constructor(linkToPost : String, text : String) {
        this.linkToPost = linkToPost
        this.text = text
    }

    fun comment() {
        this.driver.get(this.linkToPost)

        try {
            driver.findElementByXPath("//*[@id=\"react-root\"]/section/main/div/div/article/div[2]/section[1]/span[2]/button/span").click()
            driver.findElementByXPath("//*[@id=\"react-root\"]/section/main/div/div/article/div[2]/section[3]/div/form/textarea").sendKeys(this.text)
            println("Commented")
        }
        catch (e : Exception) {
            println("[ERROR ]\t${e}")
        }
    }
}