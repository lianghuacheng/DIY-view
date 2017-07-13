package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        DisplayMetrics metric = new DisplayMetrics();

        //int width = metric.widthPixels;     // 屏幕宽度（像素）
        //int height = metric.heightPixels;   // 屏幕高度（像素）

        int row = 200;
        int width = 400;
        int height = 400;
        int lineHeight = 20;
        // 画仪器盘圆盘
        Paint paintCircle = new Paint();
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setColor(Color.GREEN);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(width/2, height/2, row, paintCircle);

        // 画刻度
        Paint paintDegree = new Paint();
        paintDegree.setColor(Color.GRAY);
        paintDegree.setStrokeWidth(3);
        for (int i = 0; i < 24; i++) {
            //区分整点和非整点
            if (i == 0 || i == 6 || i == 12 || i == 18) {
                paintDegree.setStrokeWidth(5);
                paintDegree.setTextSize(30);
                //canvas.drawLine(width/2,, paintDegree);
                String degree = String.valueOf(i);
                //canvas.drawText(degree,);
            }/*else{
                paintDegree.setStrokeWidth(3);
                paintDegree.setTextSize(15);
                canvas.drawLine();
                String degree = String.valueOf(i);
                canvas.drawText(degree,);
            }*/
            canvas.rotate(15, 200, 200);

        }

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
