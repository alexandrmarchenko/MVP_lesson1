package com.example.mvp.presenter

import com.example.mvp.model.CounterModel
import com.example.mvp.view.MainView

class MainPresenter(val view: MainView) {
    var mModel = CounterModel()

    fun counterClick(index: Int) {
        if(index in 0..mModel.counters.size ) {
            val nextValue = mModel.next(index)
            view.setButtonText(index, nextValue.toString())
        }
    }
}