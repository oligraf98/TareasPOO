package figuras

interface Interface{

    var a:Int
    fun draw(): String{
        return ""
    }

    fun requestDimensions(){
        println("Especifique el largo de un lado")
      var c = readLine()!!
        a = Integer.parseInt(c)
    }
}