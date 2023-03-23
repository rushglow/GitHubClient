package com.example.githubclient.Login

import android.widget.Toast
import com.example.githubclient.Model.Model
import com.example.githubclient.databinding.ActivityLoginBinding

class LoginPresenter(
     var activityToken: String,
     var LogInterface: LoginInterface,
     var model: Model){

     lateinit var LoginActivity: LoginActivity
     var message = "Заполните поле!"

     fun btnCall(){
          if (activityToken.isNullOrBlank()){
               Toast.makeText(LoginActivity, message, Toast.LENGTH_SHORT).show()
          }else{

          }
     }
}