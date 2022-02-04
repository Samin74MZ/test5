class Person(var name:String, var gender:Gender,var nationalNumber:String,var age:Int){
    val children: MutableList<Person> = mutableListOf()
//    constructor(name: String, dad: Person) : this(name) {
//        dad.children.add(this)
//    }
//    constructor(name: String, dad: Person , mom : Person) : this(name) {
//        dad.children.add(this)
//        mom.children.add(this)
//    }
//    fun newChild(baby : Person){
//        children.add(baby)
//    }
//    var childCount={ it:Person->
//        var count1=0
//        it.children
//        for (child in it.children){
//            if (child.age>=14){
//                count1++
//            }
//        }
//        count1
//    }
}

enum class Gender{
    F,
    M
}
fun main(){
    val calRectangularArea={lenght:Int,wight:Int->
        lenght*wight
    }
    //var calA:(Int,Int)->Int={x,y->x*y}

    calRectangularArea(2,7)
    doCalculation(2,3,::calE)
    val listOfPerson:MutableList<Person> =ArrayList()
    //var familyList:MutableList<Person> =ArrayList()
     val person1=Person("Sanaz",Gender.F,"1823777",46)
    val person2=Person("Iman",Gender.M,"12344477",51)
    val person3=Person("Samin",Gender.F,"1823777",12)
    val person4=Person("Samin",Gender.F,"1823777",4)
    val person5=Person("Samin",Gender.F,"1823777",17)
    listOfPerson.add(person1)
    listOfPerson.add(person2)
    listOfPerson.add(person3)
    listOfPerson.add(person4)
    listOfPerson.add(person5)
    person1.children.add(person3)
    person1.children.add(person4)
    person1.children.add(person5)
    person2.children.add(person3)
    person2.children.add(person4)
    person2.children.add(person5)
     person2.numberOfSon()
    println(person1.numberOfSon())
   person1.age
    person1.name
    person1.nationalNumber


}
fun doCalculation(firstOne:Int,secondOne:Int,operation:(Int,Int)->Int){
   println(operation(firstOne,secondOne))
}
fun calE(i:Int,j:Int):Int{
    return (i+j)*2
}
fun Person.numberOfSon()= run {
    var count=0
    for (child in children){
        if (child.gender==Gender.M){
            count++
        }
    }
    count
}
//fun Person.numberOfSon1():Int{
//    var count=0
//    for (child in children){
//        if (child.gender==Gender.M){
//            count++
//        }
//    }
//    return count
//}