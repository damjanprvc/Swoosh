package com.damjan.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.damjan.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java) // Context passing in. Target: LeagueActivity
            startActivity(leagueIntent)
        }
    }
}
