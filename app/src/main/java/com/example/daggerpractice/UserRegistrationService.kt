package com.example.daggerpractice

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository:UserRepository,
    private val emailService: EmailService

){

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"no-reply@zopsmart.com","welcome to ZopSmart")

    }
}