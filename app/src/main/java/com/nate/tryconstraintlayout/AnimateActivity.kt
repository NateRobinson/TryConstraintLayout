package com.nate.tryconstraintlayout

import android.os.Bundle
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_animate_start.changeBtn
import kotlinx.android.synthetic.main.activity_animate_start.constraint

/**
 * Created by Nate on 2020/5/19
 */
class AnimateActivity : AppCompatActivity() {

  private var isSecond = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_animate_start)
    changeBtn.setOnClickListener {
      val constraintSet = ConstraintSet().apply {
        isForceId = false
        if (isSecond) {
          isSecond = false
          clone(
            this@AnimateActivity, R.layout.activity_animate_start
          )
        } else {
          isSecond = true
          clone(
            this@AnimateActivity, R.layout.activity_animate_end
          )
        }
      }
      TransitionManager.beginDelayedTransition(constraint)
      constraintSet.applyTo(constraint)
    }
  }
}