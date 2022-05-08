package com.keertana.swoosh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SkillActivity : AppCompatActivity() {

    var league=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league= intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
}