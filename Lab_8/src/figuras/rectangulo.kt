package figuras

class Rectangulo():Interface{

    override var a: Int = 0
    private var b: Int = 0

    override fun draw(): String {
        var drawing: String = ""
        for (i in 1..a){
            for(j in 1..b){
                drawing = drawing + "*"
            }
            drawing = drawing + "\n"

        }
        return drawing
    }

    override fun requestDimensions() {
        super.requestDimensions()
        println("Especifique el largo del otro lado")
        var d = readLine()!!
        b = Integer.parseInt(d)
    }
}