package modules

import org.openqa.selenium.chrome.ChromeDriver

class Like {
    val driver = ChromeDriver()
    var linkToPost : String ?= null

    constructor(linkToPost : String) {
        this.linkToPost = linkToPost
    }

    fun like() {
        this.driver.get(this.linkToPost)

        try {
            driver.findElementByXPath("//*[@id=\"react-root\"]/section/main/div/div/article/div[2]/section[1]/span[1]/button/span").click()
            println("Liked")
        }
        catch (e : Exception) {
            println("[ERROR ]\t${e}")
        }
    }
}