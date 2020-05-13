package com.example.homework

import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_banner.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    private val chatsFragment = ChatsFragment()
    private val contactsFragment = ContactsFragment()
    private val discoverFragment = DiscoverFragment()
    private val meFragment = MeFragment()
    private val dynamicFragmentContainer = R.id.dynamic_fragment
    private val replaceFragment = ReplaceFragment()



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragment_banner, BannerFragment())
            .commit()


        chats.setOnClickListener() {
            val transition = supportFragmentManager.beginTransaction()
            if (!chatsFragment.isAdded) {
                transition.add(dynamicFragmentContainer, chatsFragment)
            }
            transition.show(chatsFragment).commit()

        }

        contacts.setOnClickListener() {
            val transition = supportFragmentManager.beginTransaction()
            if (!contactsFragment.isAdded) {
                transition.add(dynamicFragmentContainer, contactsFragment)
            }
            transition.show(contactsFragment).commit()
        }

        discover.setOnClickListener() {
            val transition = supportFragmentManager.beginTransaction()
            if (!discoverFragment.isAdded) {
                transition.add(dynamicFragmentContainer, discoverFragment)
            }
            transition.show(discoverFragment).commit()
        }

        me.setOnClickListener() {
            val transition = supportFragmentManager.beginTransaction()
            if (!meFragment.isAdded) {
                transition.add(dynamicFragmentContainer, meFragment)
            }
            transition.show(meFragment).commit()
        }

        btn_remove_all_fragment.setOnClickListener(){
            val transition = supportFragmentManager.beginTransaction()
            transition.remove(chatsFragment)
                .remove(contactsFragment)
                .remove(discoverFragment)
                .remove(discoverFragment)
                .remove(meFragment)
                .remove(replaceFragment)
                .commit()
        }

        btn_replace_fragment.setOnClickListener(){
            val transition = supportFragmentManager.beginTransaction()
            if(!replaceFragment.isAdded) {
                transition.replace(dynamicFragmentContainer,replaceFragment)
            }
            transition.show(replaceFragment)
                .commit()
        }


    }
}
