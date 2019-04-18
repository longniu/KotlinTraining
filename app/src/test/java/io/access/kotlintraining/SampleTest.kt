package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

import java.util.Random


class SampleTest {
    @Test
    fun testWelcome() {
        hello()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
    }

    @Test
    fun testFizzbuzz() {
        fizzbuzz()
    }

    @Test
    fun testIsLeapYear(){
        if (isLeapYear(2100)){
            println("True")
        }else{
            println("False")
        }
    }

    @Test
    fun testExtendInt(){
        var a = 6
        if (a.isEven()){
            println("is Even")
        }
        if (a.isOdd()){
            println("is Odd")
        }
    }

    @Test
    fun testDise(){
        var dise = Dise(0)
        for(i in 1..101){
            println(dise.rall())
        }
    }

    @Test
    fun testCountCallTimes(){
        var p = CountCallTimes()
        p.propertyWithCounter=100
        p.propertyWithCounter=201
        p.propertyWithCounter=300
        println(p.counter)
    }

    @Test
    fun testNabeAtsu(){
        var n = NabeAtsu()
        for (i in 1..100){
            println(n.next())
        }
    }

    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer){

    }
}



class Dise(var dian: Int){
    private var n: Int = dian
    private var rallTimes:Int = 0

    fun rall():Int {
        rallTimes += 1
        val random = Random()
        this.n = 1 + random.nextInt(5)
        if(rallTimes>100){
            throw Exception("I was broken")
        }
        return this.n
    }
}



class CountCallTimes(){
    var counter:Int = 0
    var propertyWithCounter = 0
        set(i){
            counter++
            field = i
        }


}

class NabeAtsu(){
    var initRe:Int = 0
    fun next():String {
        initRe ++
        var initReStr = Integer.toString(initRe)
        if(initRe%3 == 0){
            return "Aho"
        }else if(initReStr.contains('3')){
            return "Aho"
        }else{
            return initReStr
        }
    }
}


// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}


