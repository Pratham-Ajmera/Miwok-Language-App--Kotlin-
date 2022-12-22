package com.example.android.miwok

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)
        var mediaPlayer: MediaPlayer = MediaPlayer()

        val param = ArrayList<Word>()
        param.add(Word("one", "Lutti", R.drawable.number_one,R.raw.audio_number_one))
        param.add(Word("2", "Lotti", R.drawable.number_two,R.raw.m))
        param.add(Word("3", "Lotti", R.drawable.number_three,R.raw.audio_number_one))
        param.add(Word("34", "Lotti", R.drawable.number_four,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_five,R.raw.audio_number_one))
        param.add(Word("5", "Lotti", R.drawable.number_six,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_seven,R.raw.audio_number_one))
        param.add(Word("66", "Lotti", R.drawable.number_eight,R.raw.audio_number_one))
        param.add(Word("77", "Lotti", R.drawable.number_nine,R.raw.audio_number_one))
        param.add(Word("7789", "Lotti", R.drawable.number_ten,R.raw.audio_number_one))
        param.add(Word("one", "Lutti", R.drawable.number_one,R.raw.audio_number_one))
        param.add(Word("2", "Lotti", R.drawable.number_two,R.raw.audio_number_one))
        param.add(Word("3", "Lotti", R.drawable.number_three,R.raw.audio_number_one))
        param.add(Word("34", "Lotti", R.drawable.number_four,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_five,R.raw.audio_number_one))
        param.add(Word("5", "Lotti", R.drawable.number_six,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_seven,R.raw.audio_number_one))
        param.add(Word("66", "Lotti", R.drawable.number_eight,R.raw.audio_number_one))
        param.add(Word("one", "Lutti", R.drawable.number_one,R.raw.audio_number_one))
        param.add(Word("2", "Lotti", R.drawable.number_two,R.raw.audio_number_one))
        param.add(Word("3", "Lotti", R.drawable.number_three,R.raw.audio_number_one))
        param.add(Word("34", "Lotti", R.drawable.number_four,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_five,R.raw.audio_number_one))
        param.add(Word("5", "Lotti", R.drawable.number_six,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_seven,R.raw.audio_number_one))
        param.add(Word("66", "Lotti", R.drawable.number_eight,R.raw.audio_number_one))
        param.add(Word("77", "Lotti", R.drawable.number_nine,R.raw.audio_number_one))
        param.add(Word("7789", "Lotti", R.drawable.number_ten,R.raw.audio_number_one))
        param.add(Word("one", "Lutti", R.drawable.number_one,R.raw.audio_number_one))
        param.add(Word("2", "Lotti", R.drawable.number_two,R.raw.audio_number_one))
        param.add(Word("3", "Lotti", R.drawable.number_three,R.raw.audio_number_one))
        param.add(Word("34", "Lotti", R.drawable.number_four,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_five,R.raw.audio_number_one))
        param.add(Word("5", "Lotti", R.drawable.number_six,R.raw.audio_number_one))
        param.add(Word("55", "Lotti", R.drawable.number_seven,R.raw.audio_number_one))
        param.add(Word("66", "Lotti", R.drawable.number_eight,R.raw.audio_number_one))



        val rootView = findViewById<ListView>(R.id.root)
        val arrayAdapter = WordAdapter(this, param, R.color.category_numbers)
        rootView.adapter = arrayAdapter

        rootView.isClickable= true
        rootView.setOnItemClickListener { parent, view, position, id ->

            mediaPlayer.reset()
            mediaPlayer = MediaPlayer.create(applicationContext,param[position].maudioResource)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener {
                Toast.makeText(this,"completed",Toast.LENGTH_SHORT).show()

            }


        }

//        mediaPlayer.release()

    }
}