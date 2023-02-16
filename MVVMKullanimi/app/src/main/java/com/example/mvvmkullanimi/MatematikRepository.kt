package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData

class MatematikRepository {

    var matematikselSonuc = MutableLiveData<String>()

    init {
        matematikselSonuc = MutableLiveData<String>("0")
    }

    fun matematikselSonucGetir() : MutableLiveData<String> {
        return matematikselSonuc
    }

    fun topla(input1: String,input2: String) {
        val sayi1 = input1.toInt()
        val sayi2 = input2.toInt()

        val toplam = sayi1+sayi2
        matematikselSonuc.value = toplam.toString()
    }

    fun carp(input1: String,input2: String) {
        val sayi1 = input1.toInt()
        val sayi2 = input2.toInt()

        val toplam = sayi1*sayi2
        matematikselSonuc.value = toplam.toString()
    }
}