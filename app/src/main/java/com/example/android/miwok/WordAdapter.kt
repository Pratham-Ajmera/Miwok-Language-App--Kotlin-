package com.example.android.miwok

import android.app.Activity
import android.widget.ArrayAdapter
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import kotlin.collections.ArrayList




class WordAdapter(Context: Activity?, words: ArrayList<Word>, private val  colour: Int) : ArrayAdapter<Word?>(
    Context!!, 0, words as List<Word?>

) {

//    private val mcolrResource = colorResource
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false)
        }
        val currentWord = getItem(position)


        val englishTranslation = listItemView!!.findViewById<View>(R.id.English) as TextView
        englishTranslation.text = currentWord!!.getdefaulttraslation()
//        englishTranslation.setBackgroundColor(colorResource)


        val miwokTranslation = listItemView.findViewById<View>(R.id.Miwok) as TextView
        miwokTranslation.text = currentWord.getMiwokTranslation()
//        miwokTranslation.setBackgroundColor(colorResource)

        val image = listItemView.findViewById<View>(R.id.list_item_icon) as ImageView

        if(currentWord.getimageResource()==0){
            image.visibility = View.GONE

        }
        else{
            image.setImageResource(currentWord.getimageResource())
        }

        val colorList = listItemView.findViewById<LinearLayout>(R.id.rootpp)
//
//        val colourpp = ContextCompat.getColor(context,colour)
//
       colorList.setBackgroundColor(colour)



        return listItemView
    }
}