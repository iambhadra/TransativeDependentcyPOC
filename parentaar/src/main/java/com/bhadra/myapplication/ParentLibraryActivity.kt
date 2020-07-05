package com.bhadra.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.bhadra.subaar1.AAR1MainActivity
import kotlinx.android.synthetic.main.parent_lib_activity.*

class ParentLibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.parent_lib_activity)
        btn_aar1.setOnClickListener {
            startActivity(Intent(this@ParentLibraryActivity, com.bhadra.subaar1.AAR1MainActivity::class.java))
        }
        btn_aar2.setOnClickListener {
            startActivity(Intent(this@ParentLibraryActivity,com.bhadra.childaar2.ChildAar2Activity::class.java))
        }
    }
}