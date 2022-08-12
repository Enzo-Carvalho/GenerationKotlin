fun main() {

    print("Digite o Indice de Poluição: ")
    var indice = readln().toDouble()

    if(indice>=0.3 && indice<0.4)
    {
        print("1 grupo de industrias devem paralisar suas atividades")
    }
    else if(indice>=0.4 && indice<0.5)
    {
        print("1 e 2 grupo de industrias devem paralisar suas atividades")
    }
    else if(indice>=0.5)
    {
        print("Todos os grupos de industrias devem paralisar suas atividades")
    }
    else
    {
        print("Indice de poluição aceitavel")
    }
}