fun main(args: Array<String>) {
        print("Digite peso do tomate: ")
        var p = readln().toInt()
        var e = p - 50
        var m = e * 4


        if (p < 50) {
            e = 0
            m = 0
        }
        println("Exesso = $e \nMulta = $m$ \nPeso = $p")
    }