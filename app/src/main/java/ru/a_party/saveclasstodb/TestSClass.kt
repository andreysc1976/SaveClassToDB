package ru.a_party.saveclasstodb

import java.util.*
import kotlinx.serialization.Serializable


//Тествоый класс для сохранения в базе данных
@Serializable
class TestSClass {
    var property_a:Int = 0
        set(value) {
            field = value
        }
        get() = this.property_a

    var listElem: LinkedList<SecondSClass> = LinkedList<SecondSClass>() //список со вложенными классами, тоже сериализуемые
        set(value){
            field = value
        }

    fun addElem(elem:SecondSClass){
        listElem.add(elem)
    }
}