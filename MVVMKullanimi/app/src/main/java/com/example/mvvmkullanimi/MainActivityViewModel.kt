package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var sonuc = MutableLiveData<String>()
    var mrepo = MatematikRepository()

    init {
        sonuc = mrepo.matematikselSonucGetir()
    }

    fun toplamaYap(input1: String,input2: String) {
       mrepo.topla(input1,input2)
    }

    fun carpmaYap(input1: String,input2: String) {
        mrepo.carp(input1,input2)
    }
}