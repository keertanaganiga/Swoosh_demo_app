package com.keertana.swoosh.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keertana.swoosh.EXTRA_PLAYER
import com.keertana.swoosh.Model.Player
import com.keertana.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        if (player != null) {
            searchLeagueText.text="Looking for ${player.league} ${player.skill} league near you.."
        }
    }
}