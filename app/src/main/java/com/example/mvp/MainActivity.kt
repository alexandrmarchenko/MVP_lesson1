package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvp.presenter.MainPresenter
import com.example.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    val mPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = View.OnClickListener {
            mPresenter.counterClick(it.id)
        }

        btnCounter1.setOnClickListener(listener)

        btnCounter2.setOnClickListener(listener)

        btnCounter3.setOnClickListener(listener)

    }

    override fun setButtonText(index: Int, text: String) {
        when (index) {
            0 -> btnCounter1.text = text
            1 -> btnCounter2.text = text
            2 -> btnCounter3.text = text
        }

    }
}