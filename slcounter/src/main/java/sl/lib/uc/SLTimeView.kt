package sl.lib.uc

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.time_view.view.*

/**
 * Created by ntlong on 1/25/18.
 */
class SLTimeView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0
) : RelativeLayout(context, attrs, defStyle, defStyleRes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = getMeasuredWidth()
        setMeasuredDimension(width, width)
    }
    init {
        LayoutInflater.from(context).inflate(R.layout.time_view, this)
        tvView.text = "da text"
    }
}