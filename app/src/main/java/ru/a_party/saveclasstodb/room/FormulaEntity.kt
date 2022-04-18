package ru.a_party.saveclasstodb.room

import androidx.room.Entity
import androidx.room.PrimaryKey




@Entity(tableName = "FormulaEntity")
class FormulaEntity(
    @PrimaryKey
    var id: Int,
    var numberABC: Int,
    var name: String,
    var formula: String
) {


}