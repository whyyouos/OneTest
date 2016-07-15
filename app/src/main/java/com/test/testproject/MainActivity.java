package com.test.testproject;

import android.content.Context;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.OnClickListener;

/**
 *
 */
public class MainActivity extends ActionBarActivity implements OnClickListener{
    private String TAG = "MainActivity.class";
    private Context mContext;
    private TextView mText;
    private Button mMainBtn;
    private int mTemp = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mContext = MainActivity.this;
        mText = (TextView) findViewById(R.id.main_tx);
        mMainBtn = (Button) findViewById(R.id.main_btn);
        mMainBtn.setOnClickListener(this);

        if (mTemp==1){
            System.out.print("我来到这里了");
            Log.e(TAG,"我来到这里了");
        }
        Log.i(TAG,"打印log");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_btn:
                System.out.print("点中按钮");
                Log.d(TAG,"弄死你个逗逼丫的");
                Toast.makeText(mContext,"点中按钮",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
