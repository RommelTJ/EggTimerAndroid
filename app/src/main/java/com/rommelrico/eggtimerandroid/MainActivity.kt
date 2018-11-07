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

        // Initializing the views.
        timerSeekBar = findViewById(R.id.timerSeekBar)
        timerTextView = findViewById(R.id.countdownTextView)
        goButton = findViewById(R.id.goButton)

        // Setting values for the SeekBar.
        timerSeekBar?.max = 600
        timerSeekBar?.progress = 30

        // Adding listener for SeekBar changes.
        timerSeekBar?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            /**
             * Notification that the progress level has changed. Clients can use the fromUser parameter
             * to distinguish user-initiated changes from those that occurred programmatically.
             *
             * @param seekBar The SeekBar whose progress has changed
             * @param progress The current progress level. This will be in the range min..max where min
             * and max were set by [ProgressBar.setMin] and
             * [ProgressBar.setMax], respectively. (The default values for
             * min is 0 and max is 100.)
             * @param fromUser True if the progress change was initiated by the user.
             */
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            /**
             * Notification that the user has started a touch gesture. Clients may want to use this
             * to disable advancing the seekbar.
             * @param seekBar The SeekBar in which the touch gesture began
             */
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            /**
             * Notification that the user has finished a touch gesture. Clients may want to use this
             * to re-enable advancing the seekbar.
             * @param seekBar The SeekBar in which the touch gesture began
             */
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
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
