package com.example.anhkhoa.hocrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Observable.from(new Integer[]{1,2,3}).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Toast.makeText(MainActivity.this, "Complete", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                Log.d("onnext",String.valueOf(integer));
            }
        });
    }
}
