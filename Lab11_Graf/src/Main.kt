

fun main(args:Array<String>){
    var game:Narrator = Game()
    var on: Boolean = true
    var active:Boolean = true
    println("Pick a language/Elija un idioma:\n\t1.English\n\t2.Español")
    var language:String = readLine()!!
    while(on) {
        when (language) {
            "1" -> {
                on = false
            }
            "2" -> {
                game = Juego()
                on = false

            }
            else -> {
                println("Por favor elija 1 o 2: ")
            }
        }
    }
    var option:String
    game.welcome()
    game.begin()
    while(active){
        println("Menu:\n\t1.Ocurrieron Muertes\n\t2.Destruyen torre")
        option = readLine()!!
        when(option){
            "1"->{
                var b:Boolean = true
                println("De que equipo murieron? 1 para radiant y 2 para dire.")
                val equipo:String = readLine()!!
                when(equipo){
                    "1"->{
                        b = true
                    }
                    "2"->{
                        b = false
                    }
                }
                println("Cuantas muertes?")
                val d:Int = readLine()!!.toInt()

                when (d){
                    1 ->{
                        game.someoneDied(b)
                    }
                    5 ->{
                        game.rampage(b)
                    }
                    else->{
                        game.moreThanOneDied(b,d)
                    }

                }
            }
            "2"->{
                var b:Boolean = true
                println("De que equipo murieron? 1 para radiant y 2 para dire.")
                val equipo:String = readLine()!!
                when(equipo){
                    "1"->{
                        b = true
                    }
                    "2"->{
                        b = false
                    }
                }
                game.towerDied(b)
                

            }
            else->{
                println("Por favor elija 1 o 2: ")
            }
        }
    }
}