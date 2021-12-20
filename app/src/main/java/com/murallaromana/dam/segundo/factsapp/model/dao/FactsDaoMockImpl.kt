package com.murallaromana.dam.segundo.factsapp.model.dao

import com.murallaromana.dam.segundo.factsapp.model.entities.Fact

class FactsDaoMockImpl: FactsDao {

    private val list = ArrayList<Fact>()

    override fun getAll(): ArrayList<Fact> {
        list.addAll(listOf(
            Fact("AD 69", "Vespasian, formerly a general under Nero, enters Rome to claim the title of Emperor."),
            Fact("217", "Callixtus I is elected as the sixteenth pope, although Hippolytus of Rome is soon thereafter elected as a rival pope."),
            Fact("1192", "Richard I of England is captured and imprisoned by Leopold V of Austria on his way home to England after the Third Crusade."),
            Fact("1334", "Pope Benedict XII is elected."),
            Fact("1522", "Siege of Rhodes: Suleiman the Magnificent accepts the surrender of the surviving Knights of Rhodes, who are allowed to evacuate. They eventually settle on Malta and become known as the Knights of Malta."),
            Fact("1606", "The Virginia Company loads three ships with settlers and sets sail to establish Jamestown, Virginia, the first permanent English settlement in the Americas.")
        ))
        return list
    }


}