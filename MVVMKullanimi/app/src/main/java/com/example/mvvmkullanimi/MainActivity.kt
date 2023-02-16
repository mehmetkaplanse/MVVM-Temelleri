package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)
        tasarim.mainActivityNesnesi = this

        viewModel.sonuc.observe(this,{s ->
            tasarim.hesaplamaSonucu = s
        })

    }


    fun btnToplama(input1: String,input2: String) {
        viewModel.toplamaYap(input1,input2)
    }

    fun btnCarpma(input1: String,input2: String) {
        viewModel.carpmaYap(input1,input2)
    }
}