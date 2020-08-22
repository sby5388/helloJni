package com.example.hellojni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.hellojni.module2.Module2;

/**
 * @author by5388  on 2020/8/22.
 */
public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.text_1);
        textView.setText(MyTools.stringFromJNI());

        final int number1 = 20;
        final int number2 = 10;

        final int add = Module2.addNative(number1, number2);
        final int sub = Module2.subNative(number1, number2);
        Log.d(TAG, "onCreate: add = " + add);
        Log.d(TAG, "onCreate: sub = " + sub);

    }
}
