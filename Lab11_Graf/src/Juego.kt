class Juego(public val dire:Team = Team(),public val radiant:Team = Team(), var rDeaths: Int =0, var dDeaths: Int = 0, var isOver:Boolean = false): Narrator {
    override fun welcome():String{
        return "Bienvenido al juego. Estos son los heroes:\nHeroes de radiant: ${radiant.availableHeroes}\nHeroes de dire: ${dire.availableHeroes}"
    }
    override fun begin():String{
        return "Los minions apareceran en 10 segundos."
    }
    override fun someoneDied(isRadiant:Boolean):String{
        if(isRadiant){
            rDeaths += 1
            return "Un heroe de radiant ha sido eliminado!"
        }else{
            rDeaths += 1
            return "Un heroe de dire ha sido eliminado"
        }
    }
    override fun moreThanOneDied(isRadiant: Boolean, cant:Int):String{
        if(isRadiant) {
            rDeaths += cant
            return "Varios heroes de radiant han sido eliminados!"
        }else{
            dDeaths += cant
            return "Varios heroes de dire han sido eliminados!"
        }
    }
    override fun rampage(isRadiant: Boolean):String{
        if(isRadiant){
            rDeaths += 5
            return "RAMPAGE de dire!"
        }else{
            dDeaths += 5
            return "RAMPAGE de radiant!"
        }
    }
    override fun towerDied(isRadiant: Boolean):String{
        if(isRadiant){
            if(radiant.towerDies() == null){
                return win(true)
            }else{
                return "Dire destruyo una torre."
            }


        }else{
            if(dire.towerDies() == null){
                return win(false)
            }else {
                return "Radiant destruyo una torre."
            }
        }

    }
    override fun win(isRadiant: Boolean):String{
        if(isRadiant){
            dire.ancient.alive = false
            return "El ancient de dire ha sido destruido!"
        }else{
            radiant.ancient.alive = false
            return "El ancient de radiant ha sido destruido!"
        }
    }




}