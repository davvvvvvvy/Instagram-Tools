import modules.IAC
import modules.Login
import modules.Like
import modules.Comment

import java.io.File
import java.util.concurrent.CyclicBarrier

val emails = File("\\txt_files\\getEmails.txt").readLines()
val passwords = File("\\txt_file\\getPasswords.txt").readLines()
val proxies = File("\\txt_files\\getProxies.txt").readLines()
val usernames = File("\\txt_files\\getUsernames.txt").readLines()

//  FOR CREATING ACCOUNTS
/*class run : Runnable {

    private val gate : CyclicBarrier? = null
    private var i : Int ?= null

    constructor(i : Int) {
        this.i = i
    }

    override fun run() {
        this.gate?.await()
        (0..this.i!!).forEach() {
            val c = IAC(true, true, proxies[it], usernames[it], passwords[it], emails[it])
        }

        println("${Thread.currentThread()} Finished")
    }
}

fun main() {

    val howManyAccs : Int = 10

    for (i in (0..howManyAccs)) {
        val r = run(howManyAccs)
        val t = Thread(r)
        t.start()
    }

}*/


//  FOR LIKING
/*class run : Runnable {

    private val gate : CyclicBarrier? = null
    private var i : Int ?= null
    private var linkTarget : String ?= null

    constructor(i : Int, linkTarget : String) {
        this.i = i
        this.linkTarget = linkTarget
    }

    override fun run() {
        this.gate?.await()
        (0..this.i!!).forEach() {
            val c = Login(usernames[it], passwords[it])
            val l = Like(this.linkTarget)
        }

        println("${Thread.currentThread()} Finished")
    }
}

fun main() {

    val howManyAccs : Int = 10
    val linktTarget : String = "url"

    for (i in (0..howManyAccs)) {
        val r = run(howManyAccs, linktTarget)
        val t = Thread(r)
        t.start()
    }

}*/


//  FOR COMMENTING
/*class run : Runnable {

    private val gate : CyclicBarrier? = null
    private var i : Int ?= null
    private var linkTarget : String ?= null
    private var text : String ?= null

    constructor(i : Int, linkTarget : String, text : String) {
        this.i = i
        this.linkTarget = linkTarget
        this.text = text
    }

    override fun run() {
        this.gate?.await()
        (0..this.i!!).forEach() {
            val c = Login(usernames[it], passwords[it])
            val l = this.linkTarget?.let { it1 -> this.text?.let { it2 -> Comment(it1, it2) } }
        }

        println("${Thread.currentThread()} Finished")
    }
}

fun main() {

    val howManyAccs : Int = 10
    val linktTarget : String = "url"
    val text : String = "some text"

    for (i in (0..howManyAccs)) {
        val r = run(howManyAccs, linktTarget, text)
        val t = Thread(r)
        t.start()
    }

}*/