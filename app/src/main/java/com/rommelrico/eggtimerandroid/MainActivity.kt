package com.rommelrico.eggtimerandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var timerTextView: TextView? = null
    var timerSeekBar: SeekBar? = null
    var counterIsActive = false
    var goButton: Button? = null
    var countDownTimer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        // TODO.
    }

    fun resetTimer() {
        // TODO.
    }

    fun updateTimer(secondsLeft: Int) {
        // TODO.
    }

}
