fun main() {
    print("Codigo: ")
    var c = readln().toInt()
    print("Numero: ")
    var n = readln().toInt()

        if (n > 50) {
        var he = n - 50
        var e = he * 20
        var s = 500 + e
        print("Salario = $s")
         } else {
             var s = 10 * n
             print("Salario = $s")
        }
}