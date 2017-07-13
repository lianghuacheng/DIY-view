package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            Path path = new Path();
            path.addArc(200, 200, 400, 400, -225, 225);
            path.arcTo(400, 200, 600, 400, -180, 225, false);
            path.lineTo(400, 542);

            canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成


            Path path2 = new Path();
            path2.addCircle(800,200,100,Path.Direction.CCW);
            canvas.drawPath(path2,paint);

            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            path2.lineTo(900,400);
            path2.rLineTo(100,50);
            //path2.close();
            canvas.drawPath(path2,paint);

            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sample_arc);
            canvas.drawBitmap(bitmap,500,500,paint);
        }



//        练习内容：使用 canvas.drawPath() 方法画心形
    }
}
