package com.example.githubclient.Login

import android.widget.Toast
import com.example.githubclient.Model.Model
import com.example.githubclient.databinding.ActivityLoginBinding

class LoginPresenter(){
     lateinit var binding: ActivityLoginBinding
     lateinit var model: Model
     lateinit var logActivity: LoginActivity

     fun getToken(): String {
          var token = binding.tokenEt.text.toString()
          return token
     }

     fun tokenToModel(){
          if (getToken().isNullOrBlank()){
               Toast.makeText(logActivity,"Введите логин",Toast.LENGTH_LONG).show()
          }else {
               model.setLoginToken(getToken())
          }
     }
}