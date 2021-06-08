package com.kennah.wecatch.core.base

import androidx.recyclerview.widget.RecyclerView
import android.view.View

class Wrapper<out V : View>(val view: V) : RecyclerView.ViewHolder(view)