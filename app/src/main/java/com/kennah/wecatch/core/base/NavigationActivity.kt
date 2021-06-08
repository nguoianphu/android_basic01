package com.kennah.wecatch.core.base

import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.View
import com.kennah.wecatch.R

abstract class NavigationActivity: BaseActivity() {

    lateinit var mDrawerToggle: ActionBarDrawerToggle

    override fun afterViews() {
        setupBackNavigation()
        setupDrawer()
    }

    private fun setupDrawer() {

        supportActionBar?.let {

            mDrawerToggle = ActionBarDrawerToggle(this, drawerLayout(), toolbar(), R.string.app_name, R.string.app_name)
            mDrawerToggle.apply {
                toolbarNavigationClickListener = View.OnClickListener { drawerLayout().openDrawer(drawerView()) }
                isDrawerIndicatorEnabled = true
                drawerLayout().addDrawerListener(this)
                syncState()
            }
        }
    }

    abstract fun drawerLayout(): DrawerLayout
    abstract fun drawerView(): View
}