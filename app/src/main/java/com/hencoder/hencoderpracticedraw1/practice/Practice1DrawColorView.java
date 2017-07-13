package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       // canvas.drawColor(Color.RED);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.yourname);
        canvas.drawBitmap(bmp,0,0,null);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawCircle(100,100,100,paint);
        // canvas.drawColor(Color.parseColor("#88880000"));
        //canvas.drawRGB(100,200,100);
        //canvas.drawARGB(100,100,200,200);
//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
        //       这类颜色填充方法一般用于在绘制之前设置底色，或者在绘制之后为界面设置半透明蒙版。
//        黄色： Color.YELLOW
    }
}
