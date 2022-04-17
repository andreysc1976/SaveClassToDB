package ru.a_party.saveclasstodb

import java.util.*
import kotlinx.serialization.Serializable

@Serializable
class TestSClass {
    var property_a:Int = 0
        set(value) {
            field = value
        }
        get() = this.property_a

    var listElem: LinkedList<SecondSClass> = LinkedList<SecondSClass>()
        set(value){
            field = value
        }

    fun addElem(elem:SecondSClass){
        listElem.add(elem)
    }
}