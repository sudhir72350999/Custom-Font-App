package com.sudhirtheindian.customfontinandroidgfsp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         this is first methdod to change font
        // java file me font ko change karna  font folder ki madad se

         */
//
//        TextView textView = findViewById(R.id.textView);
//
//        Typeface typeface = ResourcesCompat.getFont(this, R.font.roboto_light);
//
//        textView.setTypeface(typeface);

       // this is second method
        // java file me asset me font file ko paste karke  font lo change karna

        TextView textView = findViewById(R.id.textView);
        Typeface typeface = Typeface.createFromAsset(
                getAssets(),
                "roboto_italic.ttf");
//                "macondo_swash_caps_regular.ttf");
        textView.setTypeface(typeface);

    }
}