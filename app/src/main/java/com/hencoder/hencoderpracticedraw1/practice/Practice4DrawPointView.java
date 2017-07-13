package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Paint paint1 = new Paint();
        paint1.setStrokeWidth(30);
        paint1.setColor(Color.RED);
paint1.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(100,100,paint1);

        Paint paint2 = new Paint();
        paint2.setStrokeWidth(50);
        paint2.setColor(Color.BLUE);
paint2.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(300,100,paint2);


        Paint paint3 = new Paint();
        //绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        float[] points = {0,0,100,200,100,300,100,300,300,200};
        paint3.setStrokeWidth(30);
        paint3.setColor(Color.BLACK);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoints(points,2,8,paint3);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
    }
}
