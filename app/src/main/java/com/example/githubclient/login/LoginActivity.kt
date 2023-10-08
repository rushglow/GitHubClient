package com.example.githubclient.login


import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.githubclient.R
import com.example.githubclient.repositories.RepoActivity
import com.example.githubclient.databinding.ActivityLoginBinding
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

abstract class LoginActivity : MvpAppCompatActivity(R.layout.activity_login), LoginInterface{
        lateinit var binding: ActivityLoginBinding

        @InjectPresenter
        lateinit var presenter: LoginPresenter

        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
                binding = ActivityLoginBinding.inflate(layoutInflater)
                setContentView(binding.root)

                presenter = LoginPresenter()

                binding.tokenEt.addTextChangedListener(object : TextWatcher{
                        override fun afterTextChanged(s: Editable) {
                                presenter.getLogin()
                        }

                        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

                        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
                })

                binding.btnSignIn.setOnClickListener(){
                        presenter.loginToModel()
                }
        }

        override fun getLogin() {
                presenter.login = binding.tokenEt.text.toString()
        }

        override fun startRepoActivity() {
                val intent = Intent(this, RepoActivity::class.java)
                startActivity(intent)
        }

        override fun showError() {
                Toast.makeText(applicationContext,"Неправильно введен логин", Toast.LENGTH_SHORT).show()
        }
}