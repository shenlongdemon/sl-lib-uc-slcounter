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

    var images: IntArray = intArrayOf(R.drawable.img_0, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4, R.drawable.img_5, R.drawable.img_6, R.drawable.img_7, R.drawable.img_8, R.drawable.img_9)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = getMeasuredWidth()
        setMeasuredDimension(width, width)
    }

    init {
        LayoutInflater.from(context).inflate(R.layout.time_view, this)

        this.setTime(0)
    }

    var hourTittle: String = ""
        get() = this.toString()
        set(value) {
            field = value
            tvHour.text = field
        }

    var minuteTittle: String = ""
        get() = this.toString()
        set(value) {
            field = value
            tvMinute.text = field
        }

    fun setTime(totalMinutes: Int) {
        var hour: Int = totalMinutes / 60;
        var minute: Int = totalMinutes % 60
        var h0 = 0;
        var h1 = 0;
        var m0 = 0;
        var m1 = 0;
        if (hour >= 0 && hour <= 59) {
            h0 = hour / 10
            h1 = hour % 10
        }
        if (minute >= 0 && minute <= 59) {
            m0 = minute / 10
            m1 = minute % 10
        }
        this.updateUI(h0, h1, m0, m1)
    }

    private fun updateUI(h0: Int, h1: Int, m0: Int, m1: Int) {
        imgHour_0.setImageResource(this.images.get(h0))
        imgHour_1.setImageResource(this.images.get(h1))

        imgMinute_0.setImageResource(this.images.get(m0))
        imgMinute_1.setImageResource(this.images.get(m1))
    }


}