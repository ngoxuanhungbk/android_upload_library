package vn.dyno.testlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.my_view.view.*

class MyView : ConstraintLayout,BaseAction{

    constructor(context: Context):super(context){
        initView(context)
    }

    constructor(context: Context,attrs:AttributeSet):super(context,attrs){
        initView(context)
    }

    constructor(context: Context,attrs:AttributeSet,defStyleAttr:Int):super(context,attrs,defStyleAttr){
        initView(context)
    }

    private fun initView(context: Context){
        inflate(context,R.layout.my_view,this)
        edt_input.addTextChangedListener { text ->
            tv_input.text = "${text?.length} + Characters !!"
        }
    }

    override fun setHintEditText(hint: String) {
        edt_input.hint = hint
    }

    override fun setStyle(style: Int) {
    }
}