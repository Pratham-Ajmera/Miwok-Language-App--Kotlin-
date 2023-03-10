/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*
import com.example.android.miwok.R

// import android.support.v7.app.AppCompatActivity;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)
    }

    fun open_num(view: View) {
        val intent = Intent(this,NumberActivity::class.java)
        startActivity(intent)
    }
    fun open_family(view: View) {
        val intent = Intent(this,FamilyActivity::class.java)
        startActivity(intent)
    }
    fun open_color(view: View) {
        val intent = Intent(this,ColorActivity::class.java)
        startActivity(intent)
    }
    fun open_phrase(view: View) {
        val intent = Intent(this,PhraseActivity::class.java)
        startActivity(intent)
    }

}