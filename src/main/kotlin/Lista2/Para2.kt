package Lista2
fun main(){
    var somatoria = 0
    for(i in 1..500)
    {
        if(i%3==0 && i%2==1){
            somatoria += i
            println("$i")
        }
    }
    print(somatoria)
}
