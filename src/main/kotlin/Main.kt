fun main() {
    val toyo =Car("Toyota","Prado","KDG 112K",0)
    val audi =Car("Audi","A4","KCT 223K",0)
    audi.start()
    println(audi.speed)
    audi.accelerate(60)
    println(audi.speed)
    audi.accelerate(accaeleration = 35)
    println(audi.speed)
    audi.deccelerate(20)
    println(audi.speed)
    println(audi.stop())
    println(audi.speed)



    val myBook = Book("Born A Crime","Trevor Noah",295,2017)
    println(myBook.tittle)
    println(myBook.pages)
    println(myBook.author)


//    var bankAccount = BankAccount(20000,234567)
//    bankAccount.withdraw(30000.7)

    var person = Person("Lynet",19,"Female")
    println( person.speak("Hello"))
    var employee1 = Employee("Irene",30,"Female",345678)
    println( employee1.speak("Hi"))

    println( getAvarage(listOf(2,3,4,5,6,7)))
}
////1.Create a class BankAccount with properties balance and accountNumber. Add methods deposit(amount: Double)
//// and withdraw(amount: Double) that modify the balance property. The withdraw() method should throw an exception
//// if the amount is greater than the current balance.
//
//class BankAccount(var balance:Int,var accountNumber:Int) {
//    fun deposit(amount: Double) {
//
//    }
//
//    fun withdraw(amount: Double) {
//        throw Exception("your $amount is greater than the $balance")
//
//
//
//    }
//}

//2.Create a class Person with properties name, age, and gender. Add a method speak() that prints out
// a greeting. Create a subclass Employee that adds a property id and overrides the speak() method to
// print out a greeting that includes the employee's name and ID.

open class Person(var name:String,var age:Int,var gender:String){
   open fun speak(greeting:String):String{
        return greeting

    }
}
class Employee(name:String,age: Int,gender: String,var id:Int):Person(name, age, gender){
    override fun speak(greeting: String): String {
        return ("Hello $name your id number is $id")
    }
}

//Write a function getAverage(numbers: List<Int>): Double that takes a list of integers as an argument
//and returns the average of the numbers in the list. If the list is empty, the function should return 0 (edited)

fun getAvarage(numbers:List<Int>):Double {

    if (numbers.isEmpty())
        return 0.0
    else
       return(numbers.sum().toDouble())
}

class Car(var make:String, var model:String, var registration:String, var speed:Int){
    fun start(){
        println("Chogio gio gio,vruuuuum")
    }
    fun accelerate(accaeleration: Int):Int{
        speed += accaeleration
        return  speed

    }
    fun deccelerate(decceleration: Int):Int{
        speed -= decceleration
        return speed

    }
    fun hoot(){
        println("beep peep")
    }
    fun stop(){
        speed -= speed
        println("iitchj")
    }

}

data class Book(var tittle:String, var author: String, var pages: Int,var year: Int)


data class AgeStatus(var max:Int,var min: Int,var mean: Double,var median: Int)






