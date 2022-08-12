package Lista2

fun main(){

    print("Digite um numero: ")
    var num = readln().toInt()
    print("$num")

    while(num<100){
        num = num * 3
        println()
        print("$num")
    }
}