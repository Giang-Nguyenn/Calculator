package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MoneyActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txt_vn;
    private TextView txt_usd;

    int state; // bien trang thai - 1: nhap toan hang 1, 2 : nhap toan hang 2
    int op1, op2;   // 2 toan hang
    int op;         // toan tu - 1 : add, 2 : sub, 3 : mul, 4 : div

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;


    private Button btn_cong;
    private Button btn_tru;
    private Button btn_nhan;
    private Button btn_chia;

    private Button btn_CE;
    private Button btn_BS;
    private Button btn_C;

    private Button btn_phay;
    private Button btn_dao;
    private Button btn_bang;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        khoitao();
        sukien();
        state = 1;
        op1 = op2 = 0;
        op = 0;
        txt_vn.setText(String.valueOf(100));
        txt_usd.setText(String.valueOf(0));
    }
    public void khoitao() {
        txt_vn = findViewById(R.id.txt_vn);
        txt_usd = findViewById(R.id.txt_usd);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_cong = findViewById(R.id.btn_cong);
        btn_tru = findViewById(R.id.btn_tru);
        btn_nhan = findViewById(R.id.btn_nhan);
        btn_chia = findViewById(R.id.btn_chia);

        btn_dao = findViewById(R.id.btn_dao);
        btn_bang = findViewById(R.id.btn_bang);
        btn_phay = findViewById(R.id.btn_phay);

        btn_CE = findViewById(R.id.btn_CE);
        btn_C = findViewById(R.id.btn_C);
        btn_BS = findViewById(R.id.btn_BS);

    }

    public void sukien() {
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_CE.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_BS.setOnClickListener(this);
        btn_cong.setOnClickListener(this);
        btn_tru.setOnClickListener(this);
        btn_nhan.setOnClickListener(this);
        btn_dao.setOnClickListener(this);
        btn_bang.setOnClickListener(this);
        btn_phay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
    }
}
