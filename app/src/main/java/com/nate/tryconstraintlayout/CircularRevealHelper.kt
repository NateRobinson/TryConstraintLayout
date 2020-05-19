package com.nate.tryconstraintlayout

import android.content.Context
import android.util.AttributeSet
import android.view.ViewAnimationUtils
import androidx.constraintlayout.widget.ConstraintHelper
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.hypot

/**
 * Created by Nate on 2020/5/19
 */
class CircularRevealHelper(context: Context, attrs: AttributeSet) : ConstraintHelper(context, attrs) {
  override fun updatePostLayout(container: ConstraintLayout) {
    super.updatePostLayout(container)

    referencedIds.forEach {
      val view = container.getViewById(it)
      val radius = hypot(view.width.toDouble(), view.height.toDouble()).toInt()
      ViewAnimationUtils.createCircularReveal(view, view.width / 2, view.width / 2, 0f, radius.toFloat()).setDuration(2000L).start()
    }
  }
}