package com.deepcompany.instagramclone.utils

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomNavigationViewHelper {

    companion object {
        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)
        }
    }
}