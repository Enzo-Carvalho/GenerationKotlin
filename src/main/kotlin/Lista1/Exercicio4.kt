fun main() {
    print("Digite um numero: ")
    var numero = readln().toInt()

    if (numero>=0 && numero%2==0)
    {
        print("Numero é positivo e par")
    }
    else if (numero>=0 && numero%2==1)
    {
        print("Numero é positivo e impar")
    }
    else if (numero<0 && numero%2==0)
    {
        print("Numero é negativo e par")
    }
    else
    {
        print("Numero é negativo e impar")
    }
}