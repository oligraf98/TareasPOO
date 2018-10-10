fun main(args:Array<String>){
    val box = BoxOfChocolates<Chocolate>(arrayListOf<Chocolate>(
            Chocolate("Hersheys"),
            Chocolate("Snickers"),
            Chocolate("Milky Way"),
            Chocolate("Twix")
    ))


    val forrestGump = ForrestGump<Chocolate>(box)
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())

}