package com.hello.myali2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{

    private WindowManager.LayoutParams mParams;// 窗口的属性
    WindowManager mWindowManager;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button bn = (Button) findViewById(R.id.bn);
        bn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                addTextViewWindow();
            }
        });
    }


    private void addTextViewWindow(){


        LinearLayout linearLayout = new LinearLayout(this);
        WindowManager.LayoutParams layoutParams1WM = getWindow().getAttributes();

//        layoutParams1WM.windowAnimations = android.R.anim.slide_in_left;

        linearLayout.setBackgroundColor(Color.BLUE);
//        linearLayout.setVisibility(View.INVISIBLE);
        linearLayout.getBackground().setAlpha(0);


        Button buttonWM = new Button(this);
        buttonWM.setText("WM addView AddBtnWM");
        buttonWM.setBackgroundColor(Color.RED);

        WindowManager.LayoutParams layoutParams1L = new WindowManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams1L.gravity = Gravity.CENTER;
//
//        layoutParams1L.windowAnimations = android.R.anim.slide_in_left;

        layoutParams1L.type =  WindowManager.LayoutParams.TYPE_APPLICATION_MEDIA;

        linearLayout.addView(buttonWM, layoutParams1L);
        getWindowManager().addView(linearLayout,layoutParams1WM);

        Animation animation = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);

        buttonWM.startAnimation(animation);



        //
//
//        // 方式 1 ， 参数 设置
////        <alpha xmlns:android="http://schemas.android.com/apk/res/android"
////        android:interpolator="@interpolator/decelerate_quad"
////        android:fromAlpha="0.0" android:toAlpha="1.0"
////        android:duration="@android:integer/config_longAnimTime" />
//
////    <integer name="config_longAnimTime">500</integer>
//
//
//        layoutParams1WM.windowAnimations = android.R.anim.fade_in;
//////      layoutParams1WM.alpha = 0.0f;
//        getWindowManager().addView(linearLayout,layoutParams1WM);
//        ObjectAnimator animator = ObjectAnimator.ofFloat(buttonWM,
//                "alpha",0,1.0f)
//                .setDuration(3000);
//        animator.start();

//         Animation animation = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
//        buttonWM.startAnimation(animation);


//
//
//
//        // 方式 2 ， 代码实现
//        ValueAnimator anim = ValueAnimator.ofFloat(0.0f, 1.0f);
//        anim.setDuration(500);
//        anim.setInterpolator(new LinearInterpolator());
//        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float currentValue = (float) animation.getAnimatedValue();
//                Log.d("TAG", "cuurent value is " + currentValue);
//                layoutParams1WM.alpha = currentValue;
//                getWindowManager().updateViewLayout(linearLayout,layoutParams1WM);
//            }
//        });
//        anim.start();
//
//        ObjectAnimator animator = ObjectAnimator.ofFloat(buttonWM,
//                "alpha",0,1.0f)
//                .setDuration(3000);
//        animator.start();
    }


}
