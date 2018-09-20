import figuras.*

fun menuPrincipal(): String{
    return "Bienvenido al programa\n\t1.Dibujar una figura\n\t2.Salir"
}

fun menuSecundario(): String{
    return "Menu\n\t1.Dibujar un cuadrado\n\t2.Dibujar un rectangulo\n\t3.Dibujar un triangulo\n\t4.Salir al menu principal"
}

fun main(args: Array<String>){
    var on = true
    var dibujando = true
    var opcion1: String
    var opcion2: String

    while (on){
        println(menuPrincipal())
        println("Elija una opcion:")
        opcion1 = readLine()!!
        if (opcion1 == "1"){

            while(dibujando) {
                println(menuSecundario())
                println("Elija una opcion:")
                opcion2 = readLine()!!
                if(opcion2 == "1") {
                    val figura: Cuadrado = Cuadrado()
                    describa(figura)
                    dibuje(figura)

                }else if (opcion2 == "2") {
                    val figura: Rectangulo = Rectangulo()
                    describa(figura)
                    dibuje(figura)
                } else if (opcion2 == "3") {
                    val figura: Triangulo = Triangulo()
                    describa(figura)
                    println(dibuje(figura))
                } else if (opcion2 == "4") {
                    dibujando = false
                } else {
                    println("Esa opcion no es valida. Intente de nuevo.")
                }
            }
        }else if(opcion1 == "2"){
            println("Adios.")
            on = false
        }else{
            println("Esa opcion no es valida. Intente de nuevo.")
        }
    }
}

fun dibuje (interfaz: Interface){
    print(interfaz.draw())
}

fun describa (interfaz: Interface){
    interfaz.requestDimensions()
}