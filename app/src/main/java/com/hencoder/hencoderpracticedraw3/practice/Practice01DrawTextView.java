package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice01DrawTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoderHello HenCoderHello HenCoder";

    public Practice01DrawTextView(Context context) {
        super(context);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 drawText() 来绘制文字
        // 文字坐标： (50, 100) 这个坐标是指文字左下角附近的一个位置
        // x值 指的是最左字母左侧再往左一点点的位置 每个字母左右都有一些间隙
        // y值 指的是文字基线的位置
        //canvas.drawText(text, 50, 100, paint);

        //另两个方法
        //drawTextRun 添加了 上下文和文字方向

        //

        //canvas.drawTextOnPath();
        //canvas.drawText(text, 0, 0, paint);

        paint.setStrokeWidth(30);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Path path = new Path();
        path.moveTo(100, 400);
        path.lineTo(300, 100);
        path.lineTo(600, 500);
        path.lineTo(800, 100);


        canvas.drawPath(path, paint);
        //paint.setStyle(Paint.Style.FILL);

        //canvas.drawTextOnPath(text, path, 10, 10, paint);
    }
}
