package com.example.lenovo.gestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements
        GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    TextView textView;
    GestureDetectorCompat  GestureDectect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);
        GestureDectect = new GestureDetectorCompat(this,this);
        GestureDectect.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        GestureDectect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        textView.setText("onSingleTapConfirmed "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        textView.setText("onDoubleTap "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        textView.setText("onDoubleTapEvent "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        textView.setText("onDown "+motionEvent.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        textView.setText("onShowPress "+motionEvent.toString());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        textView.setText(" onSingleTapUp "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText(" onScroll "+motionEvent.toString() + motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        textView.setText("onLongPress "+motionEvent.toString()  );

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("onFling "+motionEvent.toString() + motionEvent1.toString());
        return false;
    }
}
