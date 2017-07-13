package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
     //Android中对 Shader 是这样解释的：

       // Shader 是一种基类对象，它在图形绘制过程中返回一段段颜色值，
        // 通过调用 Paint.setShader() 方法，可以将它的子类安装进画笔，
        // 这样 Paint 对象在绘制过程中所获取的颜色就是来自 Shader 对象。

        int w = getWidth();
        int h = getHeight();
        int radius = w<=h? w/2:h/2;

        //解析bitmap对象
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.yourname);
        // bitmapshader .分别是x方向和y方向的tilemode（clamp 、 mirror、repeat）
        //clamp:当要绘制的区间大于图片纹理本身的区间时，多出来的空间位置将被纹理图片的边缘颜色填充。
        // mirror:让纹理以镜像的方式在X和Y方向复制。
        //repeat:是将图片纹理沿XY轴进行复制。
        //BitmapShader mShader = new BitmapShader(bmp, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        BitmapShader mShader = new BitmapShader(bmp, Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
        Paint mPaint = new Paint();
        mPaint.setShader(mShader);
        canvas.drawCircle(w/2,h/2,radius,mPaint);
        //测试Paint 的shader功能




//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
