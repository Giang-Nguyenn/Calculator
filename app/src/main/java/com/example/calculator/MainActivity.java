package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_input;
    private TextView txt_result;

    int state; // bien trang thai - 1: nhap toan hang 1, 2 : nhap toan hang 2
    int op1, op2;   // 2 toan hang
    int op;         // toan tu - 1 : add, 2 : sub, 3 : mul, 4 : div

    private Button money;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khoitao();
        sukien();
        state = 1;
        op1 = op2 = 0;
        op = 0;
        edt_input.setText(String.valueOf(0));
        txt_result.setText(String.valueOf(0));
    }

    public void khoitao() {
        edt_input = findViewById(R.id.edt_input);
        txt_result = findViewById(R.id.txt_result);


        money =findViewById(R.id.money);
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
        money.setOnClickListener(this);
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
        if(id==R.id.money){
            Intent intent=new Intent(MainActivity.this,MoneyActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.btn_0)
            themso(0);
        else if (id == R.id.btn_1)
            themso(1);
        else if (id == R.id.btn_2)
            themso(2);
        else if (id == R.id.btn_3)
            themso(3);
        else if (id == R.id.btn_4)
            themso(4);
        else if (id == R.id.btn_5)
            themso(5);
        else if (id == R.id.btn_6)
            themso(6);
        else if (id == R.id.btn_7)
            themso(7);
        else if (id == R.id.btn_8)
            themso(8);
        else if (id == R.id.btn_9)
            themso(9);
        else if (id == R.id.btn_cong)
            pheptinh(1);
        else if (id == R.id.btn_tru)
            pheptinh(2);
        else if (id == R.id.btn_nhan)
            pheptinh(3);
        else if (id == R.id.btn_chia)
            pheptinh(4);
        else if (id == R.id.btn_bang)
            ketqua();
        else if (id == R.id.btn_dao)
            daodau();
        else if (id == R.id.btn_BS)
            xoaso();
        else if (id == R.id.btn_CE)
            xoahet();
        else if (id == R.id.btn_C) {
            // Khoi tao lai cac gia tri
            state = 1;
            op1 = op2 = 0;
            op = 0;
            txt_result.setText(String.valueOf(0));

        }
    }

    private void xoahet() {
        if (state == 1) {
            op1 = 0;
            txt_result.setText(String.valueOf(op1));
        } else {
            op2 = 0;
            txt_result.setText(String.valueOf(op2));
        }
    }

    private void xoaso() {
        if (state == 1) {
            op1 = op1 / 10;
            txt_result.setText(String.valueOf(op1));
        } else {
            op2 = op2 / 10;
            txt_result.setText(String.valueOf(op2));
        }
    }

    private void daodau() {
        if (state == 1) {
            op1 = -op1;
            txt_result.setText(String.valueOf(op1));
        } else {
            op2 = -op2;
            txt_result.setText(String.valueOf(op2));
        }
    }

    private void ketqua() {
        int result = 0;
        if (op == 1)
            result = op1 + op2;
        else if (op == 2)
            result = op1 - op2;
        else if (op == 3)
            result = op1 * op2;
        else {
            if (op2 != 0)
                result = op1 / op2;
        }

        if (op == 4 && op2 == 0)
            txt_result.setText("ERROR");
        else
            txt_result.setText(String.valueOf(result));

        // Quay lai trang thai 1
        state = 1;
        op1 = 0;
        op2 = 0;
        op = 0;
    }

    private void pheptinh(int _op) {
        op = _op;
        state = 2;
    }

    private void themso(int so) {
        if (state == 1) {
            if (op1 < 0)
                op1 = op1 * 10 - so;
            else
                op1 = op1 * 10 + so;
            edt_input.setText(String.valueOf(op1));
        } else {
            if (op2 < 0)
                op2 = op2 * 10 - so;
            else
                op2 = op2 * 10 + so;
            edt_input.setText(String.valueOf(op2));
        }
    }
}