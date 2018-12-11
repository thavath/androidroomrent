package com.example.user.roomrent.drawer

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.replaceFragmentay(fragment: Fragment, allowStateLoss: Boolean, @IdRes containerViewId: Int){

    val ft = supportFragmentManager
        .beginTransaction()
        .replace(containerViewId, fragment)
    ft.commitAllowingStateLoss()
//  val fragmentManager = supportFragmentManager
//  val fragmentTransaction = fragmentManager.beginTransaction()
//  val fragment = ProfileFragment()
//    if (!supportFragmentManager.isStateSaved){
//        ft.commit()
//    }else if(allowStateLoss){
//        ft.commitAllowingStateLoss()
//    }
}