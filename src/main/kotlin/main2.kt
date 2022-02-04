class Bax<T>(t:T){
   private var value=t
    fun getInsides(){
        println("$value is inside the box")
    }
}
data class Rabbit(var id:Int,val name:String,var color:String):Animal()
data class Hamster(var id:Int,val name: String,var age:Int):Animal()
class Cage<T>(private var memberList:List<T>){
    fun getMemberCount():Int{
        return memberList.size
    }
    fun getMemberNumberX(number:Int){
        val member:T
        if (number in memberList.indices) {
           member= memberList[number]
            println(member)
        }else{
            println("there is not such member")
        }
    }
    fun addMember(member:T):List<T>{
       val memberList1= memberList.toMutableList()
        memberList1.add(member)
        this.memberList=memberList1
        return this.memberList
    }
//    fun getMemberList(){
//        println(this.memberList)
//    }
    fun hasMember(t:T):Boolean{
        return memberList.contains(t)
    }
}
open class Animal
fun main(){
    val box=Bax(1)
    box.getInsides()
    val box1=Bax<Int>(2)
    box1.getInsides()
    val box2=Bax(1.3)
    box2.getInsides()
    val box3=Bax<Double>(2.2)
    box3.getInsides()
    val animals1= listOf<Animal>(Rabbit(1234,"Bony","Black"),Rabbit(1232,"Bony","Brown"))
    val animals2= listOf<Animal>(Hamster(1234,"Buster",1))
    val cage1=Cage(animals1)
    println("the number of memberList in Cage1")
    println(cage1.getMemberCount())
    cage1.getMemberNumberX(1)
    cage1.getMemberNumberX(2)
    val cage2=Cage(animals2)
   cage2.addMember(Hamster(1234,"Bonnie",2))
    println(cage2.hasMember(Hamster(1234,"Buster",1)))
   println(cage1.hasMember(Rabbit(1234,"Buster","withe")))
    val cage:MutableList<Cage<Animal>> =ArrayList()
    cage.add(cage1)
    cage.add(cage2)
    println(numberOfAllMemberInAllCage(cage))
}
fun <T>numberOfAllMemberInAllCage(cage:List<Cage<T>>):Int{
    var numberOfCage=0
    for (c in cage){
       numberOfCage+=c.getMemberCount()
    }
    return numberOfCage
}