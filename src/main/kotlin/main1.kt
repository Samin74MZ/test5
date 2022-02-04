data class  User(var name:String,var age:Int) {
  //   val isVaccinated: Boolean = false
    //there is no need to override equals function
//    override fun equals(other: Any?): Boolean {
//        return this.name == (other as User).name && this.age == other.age
//    }
}
// class  UserClass(private var name:String, private var age:Int) {
//    //val isVaccinated: Boolean = false
//    override fun equals(other: Any?): Boolean {
//        return this.name == (other as User).name && this.age == other.age
//    }
////     fun copy(u:UserClass){
////         this.age=u.age
////         this.name=u.name
////     }
//}
fun main(){
    val user1=User("Samin",26)
    val user2=User("Samin",26 )
    if (user2==user1){
        println("$user1 and $user2 Equal")
    }else{
        println("$user1 and $user2 notEqual")
    }
//    val userClass1=UserClass("Sara",26)
//    val userClass2=UserClass("Sara",26 )
//    if (userClass1==userClass2){
//        println("$userClass1 and $userClass2 Equal")
//    }else{
//        println("$userClass1 and $userClass2 notEqual")
//    }
     //userClass1.copy(UserClass("Navid",28))

}