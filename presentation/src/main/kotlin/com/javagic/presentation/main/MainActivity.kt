package com.javagic.presentation.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.javagic.gotwiki.R
import com.javagic.presentation.list.BookListFragment
import com.javagic.presentation.list.CharacterListFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewPagerAdapter = MainPagerAdapter(supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setUpViewPager()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.action_search -> true
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }

    private fun setUpViewPager() {
        viewPagerAdapter.addFragment(
            CharacterListFragment.newInstance(),
            getString(R.string.tab_characters)
        )
        viewPagerAdapter.addFragment(
            BookListFragment.newInstance(),
            getString(R.string.tab_books)
        )
        viewPager.adapter = viewPagerAdapter
    }
}
