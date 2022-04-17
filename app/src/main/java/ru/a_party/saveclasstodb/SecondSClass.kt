package ru.a_party.saveclasstodb

import kotlinx.serialization.Serializable

@Serializable
data class SecondSClass(
    val id:Int,
    val name:String
) {

}
