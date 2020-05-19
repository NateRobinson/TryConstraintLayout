package com.nate.tryconstraintlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gone_margin.view1

/**
 * Created by Nate on 2020/5/19
 */
class GoneMarginActivity:AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_gone_margin)
    view1.setOnClickListener {
      it.visibility = View.GONE
    }
  }
}