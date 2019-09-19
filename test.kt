import modules.IAC
import modules.Login
import modules.Like
import modules.Comment
import org.openqa.selenium.chrome.ChromeDriver

import java.io.File
import java.util.concurrent.CyclicBarrier

/*fun main() {
    val login = Login(false, false, "177.53.8.83:53514", "neznamgdjesambio", "FotoIvek:3")
    login.login()
    val l = Like("https://www.instagram.com/p/B1wXrjOAlU2JNM_p6xdi_9RVH7UiFgeYd1Nwb40/")
    l.like()
}*7

 */

fun main() {
    val path = System.getProperty("user.dir") + "\\assets\\chromedriver.exe"
    val driver = ChromeDriver()

    System.setProperty("webdriver.chrome.driver", path)

    driver.get("https://google.com")
}