package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Paint.Style.FILL_AND_STROKE;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//开关抗锯齿
        //Paint paint = new Paint();
        paint.setColor(Color.RED);

        //Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
        // FILL 是填充模式，STROKE 是画线模式（即勾边模式），
        // FILL_AND_STROKE 是两种模式一并使用：既画线又填充。它的默认值是 FILL，填充模式。
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);// 线条宽度为20像素
        canvas.drawCircle(100,100,50,paint);

        Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.YELLOW);
        canvas.drawCircle(200,200,50,paint2);

        Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint3.setColor(Color.BLUE);
        canvas.drawCircle(300,100,50,paint3);

        Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(Color.YELLOW);
        paint4.setStrokeWidth(20);// 线条宽度为20像素
        canvas.drawCircle(300,300,50,paint4);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
