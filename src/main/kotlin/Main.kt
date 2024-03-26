fun main() {

    println(volume(3.14159 ,40))
    println(arr(45,67).contentToString())
    println(sentence("wow,kayak,madam"))
    println(myStrings("Kate kicked the kiwi fruit"))
    text("let leila lick the locust")

}


//question 3//
fun volume (num1:Double,num:Int):Double{
    var w =(4/3*num1*num*num*num)
    return w

}
//question 2//
fun arr (num1:Int,num2:Int):Array<Int>{
    var arr1 = (num1+num2)
            return arrayOf(arr1)
}
//Question
fun sentence (words:String):Boolean{
    if (words==words){
        return (true)
    }
    else{
        return (false)
    }

}
//question 1
fun myStrings(sentence:String){
    println(sentence.replace("k",""))
}
fun text(stmt:String){
    println(stmt.lowercase().split("l"))
}




