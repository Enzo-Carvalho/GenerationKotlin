package Lista2

fun main() {

    var num = 0
    var somatoria = 0
    var valorLido = 0
    var media = 0
    while(num>=0)
    {
        print("Digite um numero: ")
        var num = readln().toInt()

        if(num>=0){
            valorLido = valorLido + 1
            somatoria = somatoria + num
            media = somatoria/valorLido
        }
    }
    println("$valorLido")
    println("$somatoria")
    print("$media")
}