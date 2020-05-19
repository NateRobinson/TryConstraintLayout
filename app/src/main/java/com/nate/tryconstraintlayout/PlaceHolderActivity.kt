package com.nate.tryconstraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_place_holder.placeHolder
import kotlinx.android.synthetic.main.activity_place_holder.view1
import kotlinx.android.synthetic.main.activity_place_holder.view2
import kotlinx.android.synthetic.main.activity_place_holder.view3

/**
 * Created by Nate on 2020/5/19
 */
class PlaceHolderActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_place_holder)
    view1.setOnClickListener {
      placeHolder.setContentId(R.id.view1)
    }
    view2.setOnClickListener {
      placeHolder.setContentId(R.id.view2)
    }
    view3.setOnClickListener {
      placeHolder.setContentId(R.id.view3)
    }
  }
}