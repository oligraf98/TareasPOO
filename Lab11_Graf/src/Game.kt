import kotlin.test.assertNotEquals

class Game(public val dire:Team = Team(),public val radiant:Team = Team(), var rDeaths: Int =0, var dDeaths: Int = 0, var isOver:Boolean = false): Narrator {

   override fun welcome():String{
        return "Welcome to the game. These are the heroes:\nRadiant Heroes: ${radiant.availableHeroes}\nDire Heroes: ${dire.availableHeroes}"
    }
    override fun begin():String{
        return "Minions will spawn in 10 seconds"
    }
    override fun someoneDied(isRadiant:Boolean):String{
        if(isRadiant){
            rDeaths += 1
            return "A hero from the radiant has been killed!"
        }else{
            dDeaths += 1
            return "A hero from the dire has been killed!"
        }
    }
    override fun moreThanOneDied(isRadiant: Boolean, cant:Int):String{
        if(isRadiant) {
            rDeaths += cant
            return "Multiple heroes from the radiant have been killed!"
        }else{
            dDeaths += cant
            return "Multiple heroes from the dire have been killed!"
         }
        }
    override fun rampage(isRadiant: Boolean):String{
        if(isRadiant){
            rDeaths += 5
            return "Radiant RAMPAGE!"
        }else{
            dDeaths += 5
            return "Dire RAMPAGE!"
        }
    }
    override fun towerDied(isRadiant: Boolean):String{
        if(isRadiant){
            if(radiant.towerDies() == null){
              return win(true)
            }else{
                return "The dire have destroyed a tower."
            }


        }else{
            if(dire.towerDies() == null){
                return win(false)
            }else {
                return "The radiant have destroyed a tower."
            }
        }

    }
    override fun win(isRadiant: Boolean):String{
        if(isRadiant){
            return "The dire's ancient has been destroyed!"
        }else{
            return "The radiant's ancient has been destroyed!"
        }
    }

}