package com.keertana.swoosh.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keertana.swoosh.EXTRA_LEAGUE
import com.keertana.swoosh.EXTRA_SKILL
import com.keertana.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league=intent.getStringExtra(EXTRA_LEAGUE)
        val skill=intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text="Looking for $league $skill league near you.."
    }
}