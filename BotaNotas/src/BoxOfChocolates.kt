import java.util.*

class BoxOfChocolates<T>(private val chocolates:ArrayList<T>){
    fun pickOne():T?{
        if(chocolates.size>0){
            return chocolates.removeAt(Random().nextInt(chocolates.size))
        }
        return null
    }

}