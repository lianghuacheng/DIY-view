package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100,100,300,300,paint);

        Paint paint2 = new Paint();
        paint2.setColor(Color.RED);
        //paint2.setStyle(Paint.Style.STROKE);
        canvas.drawRect(350,100,450,200,paint2);
        //两个重载方法 drawRect(RectF rect, Paint paint) 和 drawRect(Rect rect, Paint paint) ，让你可以直接填写 RectF 或 Rect 对象来绘制矩形。
//        练习内容：使用 canvas.drawRect() 方法画矩形
    }
}
