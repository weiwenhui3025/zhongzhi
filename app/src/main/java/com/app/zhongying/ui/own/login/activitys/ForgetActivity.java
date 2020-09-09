package com.app.zhongying.ui.own.login.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.zhongying.R;
public class ForgetActivity extends AppCompatActivity {

    private EditText mForgetPhone;
    private Button mForgetVer;
    private EditText mForgetVerification;
    private Button mBtnForget;
    private ImageView mForgetBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        initView();
    }

    private void initView() {
        mForgetPhone = (EditText) findViewById(R.id.forget_phone);
        mForgetVer = (Button) findViewById(R.id.forget_ver);
        mForgetVerification = (EditText) findViewById(R.id.forget_verification);
        mBtnForget = (Button) findViewById(R.id.btn_forget);
        mForgetBack = (ImageView) findViewById(R.id.forget_back);
        mForgetBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

            mForgetVer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CountDownTimer timer = new CountDownTimer(60000, 1000) {
                        @Override
                        public void onTick(long l) {
                            mForgetVer.setText("获取验证码（"+l/1000+"秒）");
                        }

                        @Override
                        public void onFinish() {
                            mForgetVer.setText("点击获取验证码");
                        }
                    };
                    timer.start();
                }
            });
            mBtnForget.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(TextUtils.isEmpty(mForgetPhone.getText().toString())
                    &&TextUtils.isEmpty(mForgetVerification.getText().toString())){
                        Toast.makeText(ForgetActivity.this, "请输入正确验证码", Toast.LENGTH_SHORT).show();
                    }else {
                        Intent intent = new Intent(ForgetActivity.this, ReviseActivity.class);
                        startActivity(intent);
                    }
                }
            });
    }
}