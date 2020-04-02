package com.example.basedatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basedatos.Data.StudentsDb
import com.example.basedatos.Data.StudentsEntity

class MainActivity : AppCompatActivity() {

    val studentsDb = StudentsDb(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        studentsDb.stundetsGetAll()


        var values= StudentsEntity(3,"Xochitl","Monfante",1,"1986/11/16")
        studentsDb.studentEdit(values)

    Log.d("UDELP","Después de editar")
        studentsDb.stundetsGetAll()






    }
}
