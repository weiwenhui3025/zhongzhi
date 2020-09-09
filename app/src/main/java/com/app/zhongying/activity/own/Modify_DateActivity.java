package com.app.zhongying.activity.own;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.zhongying.R;

public class Modify_DateActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView date_returns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify__date);
        initView();
    }

    private void initView() {
        date_returns = (ImageView) findViewById(R.id.date_returns);
        date_returns.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.date_returns:
                finish();
                break;
        }
    }
}