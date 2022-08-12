package Lista2

fun main() {
    var filhos = 0
    var salario =0
    var somaSal =0
    var somaFil = 0
    var mediaF = 0
    var mediaSal = 0
    var maiorSal = 0
    var qntPessoas = 0

    for(i in 1..20){
        print("Digite numero de filhos: ")
        var filhos = readln().toInt()
        somaFil += filhos
        print("Digite o valor de seu salario: ")
        var salario = readln().toInt()
        somaSal += salario
        mediaF = somaFil / i
        mediaSal = somaSal / i

        if(maiorSal<=salario){
            maiorSal = salario
        }
        if(salario<=100){
            qntPessoas++
        }

    }
    var perc = qntPessoas/20.0 * 100.0
    println("$mediaF")
    println("$mediaSal")
    println("$maiorSal")
    println("$perc %")
}