package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint); // 绘制扇形
            canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint); // 绘制弧形
            paint.setStyle(Paint.Style.STROKE); // 画线模式
            canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint); // 绘制不封口的弧形
        }

        paint.setTextSize(50);
        canvas.drawText("hello bolockchian",200,600,paint);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
