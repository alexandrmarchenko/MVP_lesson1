package com.example.mvp.presenter

import com.example.mvp.R
import com.example.mvp.model.CounterModel
import com.example.mvp.view.MainView

class MainPresenter(val view: MainView) {
    var mModel = CounterModel()

    fun counterClick(id: Int) {
        when (id) {
            R.id.btnCounter1 -> {
                val nextValue = mModel.next(0)
                view.setButtonText(0, nextValue.toString())

            }

            R.id.btnCounter2 -> {
                val nextValue = mModel.next(1)
                view.setButtonText(1, nextValue.toString())

            }

            R.id.btnCounter3 -> {
                val nextValue = mModel.next(2)
                view.setButtonText(2, nextValue.toString())

            }
        }
    }
}