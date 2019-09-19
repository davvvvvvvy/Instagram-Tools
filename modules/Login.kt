package modules

import org.openqa.selenium.Proxy
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import java.lang.Exception
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList

import java.util.concurrent.CyclicBarrier

class Login {

    private val driver = ChromeDriver()
    private val options = ChromeOptions()
    private val proxy : Proxy ?= null
    private var proks : String ?= null

    //  Username and password and email
    private var username : String ?= null
    private var password : String ?= null

    init {
        System.setProperty(
            "webdriver.chrome.driver",
            System.getProperty("user.dir") + "\\assets\\chromedriver.exe"
        ) // set webdriver path
        this.options.addArguments("--user-agent='Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1'")
        this.options.addArguments("--dns-prefetch-disable")
        this.options.addArguments("--lang=en-US")
        if (proxy != null) {
            proxy.setHttpProxy(proks)
        } //    other way to write this -> proxy?.setHttpProxy(proks)
        this.options.setCapability(CapabilityType.PROXY, proxy)
    }

    constructor(headless: Boolean = true, mute: Boolean = true, proks : String, username : String, password : String) {
        if (headless) {
            this.options.addArguments("-headless")
        }

        if (mute) {
            this.options.addArguments("--mute-audio")
        }

        //  Init
        this.proks = proks
        this.username = username
        this.password = password
    }

    fun login() {
        this.driver.get("https://www.instagram.com/accounts/login/")

        try {
            val inputUsername = driver.findElementByXPath("//input[@name='username']")
            inputUsername.sendKeys(this.username)
            println("Username -> ${this.username} inputed")
        }
        catch (e : Exception) {
            println("[ERROR ]\t${e}")
        }

        try {
            val inputPassword = driver.findElementByXPath("//input[@name='password']")
            inputPassword.sendKeys(this.password)
            println("Password -> ${this.password} inputed")
        }
        catch (e : Exception) {
            println("[ERROR ]\t${e}")
        }
    }

}