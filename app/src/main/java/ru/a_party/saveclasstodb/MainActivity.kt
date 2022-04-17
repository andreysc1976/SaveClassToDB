package ru.a_party.saveclasstodb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.google.gson.Gson
import kotlinx.serialization.json.Json
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cl = TestSClass()
        cl.property_a=1;
        var sc1 = SecondSClass(1,"aaa")
        var sc2 = SecondSClass(2,"bbb")
        cl.addElem(sc1)
        cl.addElem(sc2)
        val json = Gson().toJson(cl)
        Log.d("LogD",json.toString())

        val db = Room.databaseBuilder(
            getApplicationContext(),
            FormulaDatabase::class.java,
            "mydb.db")
            .allowMainThreadQueries()
            .build()
        db.formulaDao().insert(
            FormulaEntity(3,1,"Третья формула",json.toString())
        )

        val le = db.formulaDao().getAll()

        val formula1 = Gson().fromJson(le[0].formula,TestSClass::class.java)


    }
}