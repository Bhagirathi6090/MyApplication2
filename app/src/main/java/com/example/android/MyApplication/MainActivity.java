
package com.example.android.MyApplication;

        import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int SPLASH_TIME_OUT=2000;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
       new Handler().postDelayed(new Runnable(){
           @Override
           public void run(){
               Intent numbersIntent = new Intent(MainActivity.this, MusicActivity.class);
               startActivity(numbersIntent);
               finish();
           }

       },SPLASH_TIME_OUT);


       }
       public void method(){
       int i=4;
       int ii=5;
       int iii=i + ii;
       }


       String name="Bhagirathi";
   boolean value=true;
   }
