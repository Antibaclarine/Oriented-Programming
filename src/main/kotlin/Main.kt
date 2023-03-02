fun main(){
var man=Human("Mercy Otieno",19,60)
println(man.weight)
man.eat(60)
    println(man.name)
    man.speak("My name is May")
    println(man.age)
    man.birthday(19)
    var data=User("Mary","Jane","maryjane@gmail.com",111904899,"mar-y56")
    println(data.password)
    data.password
    println(data.email)
    data.email
}
class Human(var name:String,var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        var stmt="I am eating $foodWeight of food"
        weight  +=weight+1
        println(stmt)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(ages:Int){
        println(age++)
    }
}
data class User(var firstName:String,var lastName:String,val email:String,val phoneNumber:Int,var password:String)





