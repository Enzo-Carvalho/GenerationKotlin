fun main() {

    print("Digite sua idade: ")
    var idade = readln().toInt()

    if(idade>=5 && idade<=7)
    {
        print("Categoria Infantil A")
    }
    else if(idade>=8 && idade<=11)
    {
        print("Categoria Infantil B")
    }
    else if(idade>=12 && idade<=13)
    {
        print("Categoria Juvenil A")
    }
    else if(idade>=14 && idade<=17)
    {
        print("Categoria Juvenil B")
    }
    else
    {
        print("Categoria Adulto")
    }
}