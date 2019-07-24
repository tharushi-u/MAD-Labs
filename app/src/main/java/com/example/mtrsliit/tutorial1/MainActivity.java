package com.example.mtrsliit.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the text view within the layout foe class object
        txtView2 = findViewById(R.id.textView2);

        //this set the value of message2 as the text string
        txtView2.setText(R.string.Msg2);

        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }



    public void onStart()
    {
        super.onStart();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }

    public void OnRestart()
    {
        super.onRestart();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }

    public void OnStop()
    {
        super.onStop();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }

    public void OnResume()
    {
        super.onResume();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }

    public void OnPause()
    {
        super.onPause();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }

    public void onDestory()
    {
        super.onDestroy();
        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }
}
