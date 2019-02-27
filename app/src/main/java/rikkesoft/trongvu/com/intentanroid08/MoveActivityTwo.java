package rikkesoft.trongvu.com.intentanroid08;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import DTO.NhanVien;

public class MoveActivityTwo extends AppCompatActivity implements HangSo{

    private Button btn_backOne;
    private TextView tv_sum;
    private TextView tv_TTNhanVien;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_two);
        init();
        onClickBackActivityOne();
        tinhTong();
        layTTNhanVien();
    }

    /*
    ánh xạ
     */
    private void init(){
        btn_backOne = (Button) findViewById(R.id.btn_clickbackone);
        tv_sum = (TextView) findViewById(R.id.tv_sum);
        tv_TTNhanVien = (TextView) findViewById(R.id.tv_thongtinNV);

    }

    /*
    OnClick Bt back activity 2
     */
    private void onClickBackActivityOne(){
        btn_backOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MoveActivityTwo.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /*
    Tong
     */
    private void tinhTong(){
        Intent intent1nhanthongtin = getIntent();
//        int number1 =  Integer.parseInt(intent1nhanthongtin.getStringExtra(NUMBERON1));
//        int number2 =  Integer.parseInt(intent1nhanthongtin.getStringExtra(NUMBERON2));
        Bundle laythongtin = intent1nhanthongtin.getExtras();
        int number1 =  Integer.parseInt(laythongtin.getString(NUMBERON1));
        int number2 =  Integer.parseInt(laythongtin.getString(NUMBERON2));
        int tong = number1 + number2;
        tv_sum.setText("Tổng: "+ tong);
    }

    /*
    Thong tin Nhan Vien
     */
    private void layTTNhanVien(){
        NhanVien nhanVien = (NhanVien) getIntent().getSerializableExtra(NHANVIENTT);
        tv_TTNhanVien.setText("Id: "+nhanVien.getIdNV()+" Ten: "+nhanVien.getTenNV()+" Họ: "+nhanVien.getHoNv());
    }
}
