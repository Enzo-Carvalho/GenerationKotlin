package Lista2

fun main(){
    var soma = 0
    var i = 0
    print("Digite um numero de 0 a 9: " )
    var num = readln().toInt()
    do{

        i++
        soma =  i + soma

    }while(i<num)
    print("$soma")
}