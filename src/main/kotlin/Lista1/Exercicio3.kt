fun main() {
    print("Digite um numeros: ")
    var num1 = readln().toInt()
    print("Digite um numeros: ")
    var num2 = readln().toInt()
    print("Digite um numeros: ")
    var num3 = readln().toInt()
    print("Digite um numeros: ")
    var num4 = readln().toInt()

    var quadrado1 = num1 * num1
    var quadrado2 = num2 * num2
    var quadrado3 = num3 * num3
    var quadrado4 = num4 * num4

            if(quadrado3>=1000)
            {
                print("Quadrado do terceiro = " + quadrado3)
            }
                else
                 {
                     println("Primeiro numero digitado: $num1 ")
                     println("Primeiro numero digitado ao quadrado: $quadrado1")
                     println("Segundo numero digitado: $num2")
                     println("Segundo numero digitado ao quadrado: $quadrado2")
                     println("Terceiro numero digitado: $num3")
                     println("Terceiro numero digitado ao quadrado: $quadrado3")
                     println("Quarto numero digitado: $num4")
                     println("Quarto numero digitado ao quadrado: $quadrado4")
                }
}