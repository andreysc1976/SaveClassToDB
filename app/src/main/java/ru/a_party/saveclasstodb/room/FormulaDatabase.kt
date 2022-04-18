package ru.a_party.saveclasstodb.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(FormulaEntity::class),version =1, exportSchema = false)
abstract class FormulaDatabase: RoomDatabase()  {
    abstract fun formulaDao(): FormulaDao
}