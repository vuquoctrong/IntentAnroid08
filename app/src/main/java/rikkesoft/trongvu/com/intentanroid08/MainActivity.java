package rikkesoft.trongvu.com.intentanroid08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements HangSo{
    private Button btn_clickone;
    private EditText et_one;
    private EditText et_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClickButtonOne();

    }

    /*
    ánh xạ
     */
    private void init(){
        btn_clickone = (Button) findViewById(R.id.btn_clickMovetwo);
        et_one = (EditText) findViewById(R.id.et_number1);
        et_two = (EditText) findViewById(R.id.et_number2);

    }

    /*
    Onclick button One
     */
    private void onClickButtonOne(){
        btn_clickone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MoveActivityTwo.class);
//                intent.putExtra(NUMBERON1,et_one.getText().toString());
//                intent.putExtra(NUMBERON2,et_two.getText().toString());
                Bundle thongtin = new Bundle();
                thongtin.putString(NUMBERON1,et_one.getText().toString());
                thongtin.putString(NUMBERON2,et_two.getText().toString());
                intent.putExtras(thongtin);
                startActivity(intent);

            }
        });
    }
}
