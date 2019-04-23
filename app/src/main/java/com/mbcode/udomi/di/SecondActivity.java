package com.mbcode.udomi.di;

import android.app.Activity;
import android.os.Bundle;
import android.os.Bundle.*;
import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


    }

    public void start(StartInterface startInterface) {
    }

    private interface StartInterface {

        void start();


    }
}
