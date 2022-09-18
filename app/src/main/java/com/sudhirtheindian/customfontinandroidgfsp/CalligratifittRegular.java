package com.sudhirtheindian.customfontinandroidgfsp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CalligratifittRegular  extends androidx.appcompat.widget.AppCompatTextView {
    public CalligratifittRegular(@NonNull Context context) {
        super(context);
        initTypeFace(context);
    }

    public CalligratifittRegular(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initTypeFace(context);

    }

    public CalligratifittRegular(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeFace(context);

    }

    private void initTypeFace(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "robot_Bold.ttf");
        this.setTypeface(typeface);

    }
}
