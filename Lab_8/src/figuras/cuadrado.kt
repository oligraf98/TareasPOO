package figuras

class Cuadrado: Interface{
    override var a: Int = 0

    override fun draw(): String {
        var drawing: String = ""
        for (i in 1..a){
            for(j in 1..a){
                drawing = drawing + "*"
            }
            drawing = drawing + "\n"
        }
        return drawing
    }

    override fun requestDimensions() {
        super.requestDimensions()
    }
}