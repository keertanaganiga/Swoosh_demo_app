package com.keertana.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.keertana.swoosh.EXTRA_PLAYER
import com.keertana.swoosh.Model.Player
import com.keertana.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player= intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player= savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked=false

        player.skill="baller"
    }

    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked=false

        player.skill="beginner"
    }

    fun onSkillFinishClicked(view:View){
        if (player.skill!="") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}