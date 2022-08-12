fun main() {
    print("Digite o valor da base: ")
    var base = readln().toInt()
    print("Digite o valor da altura: ")
    var altura = readln().toInt()

    if (base>0 && altura>0)
    {
        var area = (base * altura)/2
        print("Área: $area")
    }
    else
    {
        print("Impossível calcular a área")
    }
}