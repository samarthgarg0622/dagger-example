package com.example.daggerpractice

import android.util.Log
import javax.inject.Inject

//interface NotificationService{
//    fun send(to:String, from:String, body:String)
//}
class EmailService @Inject constructor(){
    fun send(to:String, from:String, body:String){
        Log.d("TAG","email sent")
    }
}
//class MessageService :NotificationService{
//    override fun send(to: String, from: String, body: String) {
//        Log.d("TAG","message sent")
//    }
//}