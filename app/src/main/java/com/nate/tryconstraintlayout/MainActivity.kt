package com.nate.tryconstraintlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Layer
import kotlinx.android.synthetic.main.activity_main.animateBtn
import kotlinx.android.synthetic.main.activity_main.barrierBtn
import kotlinx.android.synthetic.main.activity_main.baselineBtn
import kotlinx.android.synthetic.main.activity_main.chainStyleBtn
import kotlinx.android.synthetic.main.activity_main.circlePositionBtn
import kotlinx.android.synthetic.main.activity_main.customHelperBtn
import kotlinx.android.synthetic.main.activity_main.flowBtn
import kotlinx.android.synthetic.main.activity_main.goneMarginBtn
import kotlinx.android.synthetic.main.activity_main.groupBtn
import kotlinx.android.synthetic.main.activity_main.guideLineBtn
import kotlinx.android.synthetic.main.activity_main.layerBtn
import kotlinx.android.synthetic.main.activity_main.percentBtn
import kotlinx.android.synthetic.main.activity_main.placeHolderBtn
import kotlinx.android.synthetic.main.activity_main.ratioBtn
import kotlinx.android.synthetic.main.activity_main.weightLayoutBtn

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    baselineBtn.setOnClickListener {
      startActivity(Intent(this, BaseLineAlignActivity::class.java))
    }
    weightLayoutBtn.setOnClickListener {
      startActivity(Intent(this, WeightLayoutActivity::class.java))
    }
    circlePositionBtn.setOnClickListener {
      startActivity(Intent(this, CirclePositionActivity::class.java))
    }
    goneMarginBtn.setOnClickListener {
      startActivity(Intent(this, GoneMarginActivity::class.java))
    }
    chainStyleBtn.setOnClickListener {
      startActivity(Intent(this, ChainStyleActivity::class.java))
    }
    ratioBtn.setOnClickListener {
      startActivity(Intent(this, RatioActivity::class.java))
    }
    percentBtn.setOnClickListener {
      startActivity(Intent(this, PercentActivity::class.java))
    }
    guideLineBtn.setOnClickListener {
      startActivity(Intent(this, GuideLineActivity::class.java))
    }
    groupBtn.setOnClickListener {
      startActivity(Intent(this, GroupActivity::class.java))
    }
    layerBtn.setOnClickListener {
      startActivity(Intent(this, LayerActivity::class.java))
    }
    barrierBtn.setOnClickListener {
      startActivity(Intent(this, BarrierActivity::class.java))
    }
    customHelperBtn.setOnClickListener {
      startActivity(Intent(this, CustomHelperActivity::class.java))
    }
    placeHolderBtn.setOnClickListener {
      startActivity(Intent(this, PlaceHolderActivity::class.java))
    }
    flowBtn.setOnClickListener {
      startActivity(Intent(this, FlowActivity::class.java))
    }
    animateBtn.setOnClickListener {
      startActivity(Intent(this, AnimateActivity::class.java))
    }
  }
}
