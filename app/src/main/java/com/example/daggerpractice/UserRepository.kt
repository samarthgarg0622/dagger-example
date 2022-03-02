package com.example.daggerpractice

import android.util.Log
import javax.inject.Inject
//
//interface UserRepository {
//    fun saveUser(email: String, password: String)
//}

class UserRepository @Inject constructor()  {
    fun saveUser(email: String, password: String) {
        Log.d("TAG", "User saved in SQL")
    }
}
//
//class FirebaseRepository : UserRepository{
//    override fun saveUser(email: String, password: String) {
//        Log.d("TAG","User saved in Firebase")
//    }
//}