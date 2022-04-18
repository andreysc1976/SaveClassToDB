package ru.a_party.saveclasstodb.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FormulaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(formulaEntity: FormulaEntity)

    @Query("Select * from FormulaEntity")
    fun getAll():List<FormulaEntity>

    @Query("Select * from FormulaEntity where id=:id")
    fun getFormulaEntityById(id:Int):List<FormulaEntity>
}