
fun main() {
    println(name("Nancy",21))
    word("akirachix")
    println(text("incredible"))
    myname("Nancy")
}

fun name(name: String, age: Int):String{
    return " Hi, my name is $name and I am $age years old."

}
fun word(name: String){
    println(name[0])
    println(name[2])
    println(name[3])
}
fun text(word: String):Int{
    return word.length

}
fun myname(name: String){
    if(name == "Nancy"){
        println("that's me")
    }else{
        println("I don't know who that is")
    }
}