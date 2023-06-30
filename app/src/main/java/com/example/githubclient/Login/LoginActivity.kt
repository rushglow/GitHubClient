package com.example.githubclient.Login


import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityLoginBinding
import com.example.githubclient.databinding.ActivityRepoBinding
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.presenter.InjectPresenter

abstract class LoginActivity : MvpAppCompatActivity(R.layout.activity_login), LoginInterface{
        lateinit var binding: ActivityLoginBinding

        @InjectPresenter
        lateinit var presenter: LoginPresenter

        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
                binding = ActivityLoginBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.tokenEt.addTextChangedListener(object : TextWatcher{
                        override fun afterTextChanged(s: Editable) {
                                getLogin()
                        }

                        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

                        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
                })

                binding.btnSignIn.setOnClickListener(){
                        tokenToModel()
                }
        }

        override fun getLogin() {
                        presenter.getLogin()
        }

        override fun tokenToModel() {
                TODO("Not yet implemented")
        }

        override fun startRepoActivity() {
                super.startRepoActivity()
        }
}