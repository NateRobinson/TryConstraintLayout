package com.nate.tryconstraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_group.changeBtn
import kotlinx.android.synthetic.main.activity_layer.layer

/**
 * Created by Nate on 2020/5/19
 */
class LayerActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_layer)
    changeBtn.setOnClickListener {
      layer.rotation = 45f
      layer.translationY = 100f
    }
  }
}