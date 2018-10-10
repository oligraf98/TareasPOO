class ForrestGump<T>(var caja: BoxOfChocolates<T>){
    fun pickChocolate():String{
        val picked = caja.pickOne()

        if (picked == null){
            return "...and sometimes...oh...se acabaron...Me llevan las p****"
        }
        return "Life is like a box of chocolates. Sometimes you get a $picked"
    }
}