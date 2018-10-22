import java.util.*

class Team(
           val availableHeroes: ArrayList<Hero> = arrayListOf(
        Hero("EarthShaker", "Strength"),
        Hero("Sven", "Sven"),
        Hero("Tiny", "Strength"),
        Hero("Antimage" , "Agility"),
        Hero("Drow", "Agility"),
        Hero("Juggernaut", "Agility"),
        Hero("Mirana", "Agility"),
        Hero("CrystalMaiden", "Intelligence"),
        Hero("Puck", "Intelligence"),
        Hero("StormSpirit", "Intelligence"),
        Hero("WindRunner", "Intelligence"),
        Hero("BeastMaster", "Strength"),
        Hero("DragonKnight", "Strength"),
        Hero("Clockwerk", "Strength"),
        Hero("Omniknight", "Strength"),
        Hero("Morphling", "Agility"),
        Hero("PhantomLancer", "Agility"),
        Hero("VengefulSpirit", "Agility"),
        Hero("Rikimaru", "Agility")),
           var team: ArrayList<Hero> = arrayListOf(
                   availableHeroes.removeAt(Random().nextInt(availableHeroes.size)),
                   availableHeroes.removeAt(Random().nextInt(availableHeroes.size)),
                   availableHeroes.removeAt(Random().nextInt(availableHeroes.size)),
                   availableHeroes.removeAt(Random().nextInt(availableHeroes.size)),
                   availableHeroes.removeAt(Random().nextInt(availableHeroes.size))),
           var towers: ArrayList<Tower> = arrayListOf(Tower(), Tower(), Tower(), Tower(), Tower(), Tower()), val ancient: Ancient= Ancient()){
    fun Team(){
        var amount: Int = 0
        while(amount<6) {
            amount++
            team.add(availableHeroes.removeAt(Random().nextInt(availableHeroes.size)))
        }
    }
    fun heroes():String{
        return "\t${team.get(0)}\n\t${team.get(1)}\n\t${team.get(2)}\n\t${team.get(3)}\n\t${team.get(4)}"
    }
    fun towerDies(): Tower?{

        return towers.removeAt(Random().nextInt(towers.size))
    }
}