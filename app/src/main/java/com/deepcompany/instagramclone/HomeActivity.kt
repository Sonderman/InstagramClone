package com.deepcompany.instagramclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deepcompany.instagramclone.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigationView()
    }

    fun setupNavigationView() {
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
    }
}