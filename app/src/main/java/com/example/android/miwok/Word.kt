package com.example.android.miwok

class Word() {
    var mdefaulttranslation: String? = null
    var mMiwokTranslation: String? = null
    var mimageResource: Int = 0
    var maudioResource: Int = 0



    constructor(defaulttranslation: String, Miwoktraslation:String, audioResource:Int) : this() {
        mdefaulttranslation = defaulttranslation
        mMiwokTranslation =  Miwoktraslation
        maudioResource = audioResource
    }

    constructor(defaulttranslation: String, Miwoktraslation: String): this(){
        mdefaulttranslation = defaulttranslation
        mMiwokTranslation = Miwoktraslation
    }



    constructor(defaulttranslation: String,Miwoktraslation:String, imageResource: Int,audioResource:Int) : this() {
        mdefaulttranslation = defaulttranslation
        mMiwokTranslation =  Miwoktraslation
        mimageResource = imageResource
        maudioResource = audioResource
    }

    fun getdefaulttraslation(): String {
        return mdefaulttranslation!!
    }

    fun getMiwokTranslation(): String {
        return mMiwokTranslation!!
    }

    fun getimageResource(): Int {
        return mimageResource
    }


}