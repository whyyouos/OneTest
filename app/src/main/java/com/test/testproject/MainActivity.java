package com.test.testproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.OnClickListener;
/**
 * 类说明:branch_one
 *@data 2016年11月29日 15:14:55
 *@name LiangAn
 */
public class MainActivity extends ActionBarActivity implements OnClickListener{
    private String TAG = "MainActivity.class";
    private Context mContext;
    private TextView Branch_OneBtn;
    private int mTemp = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mContext = MainActivity.this;
        Branch_OneBtn = (TextView) findViewById(R.id.branch_one_btn);
        Branch_OneBtn.setOnClickListener(this);

        if (mTemp==1){
            System.out.print("我来到这里了");
            Log.e(TAG,"我来到这里了");
        }
        Log.i(TAG,"打印log");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.branch_one_btn:
                System.out.print("点中按钮");
                Log.d(TAG,"弄死你个逗逼丫的");
                Toast.makeText(mContext,"点中按钮",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
