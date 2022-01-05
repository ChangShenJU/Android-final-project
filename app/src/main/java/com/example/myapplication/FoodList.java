package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FoodList extends AppCompatActivity {
    private Button btn_Menu,btn_Pay;
    private TextView TextView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        btn_Menu = findViewById(R.id.btn_Menu);
        btn_Pay = findViewById(R.id.btn_Pay);
        TextView2 = findViewById(R.id.TextView2);

        btn_Menu.setOnClickListener(new View.OnClickListener() {   //按鈕返回菜單
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(FoodList.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_Pay.setOnClickListener(new View.OnClickListener() {   //按鈕返回菜單
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(FoodList.this)
                        .setTitle("確認視窗")
                        .setMessage("確定要送出菜單了嗎?")
                        .setPositiveButton("確定", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast toast = Toast.makeText(FoodList.this, "菜單已送出!",
                                                Toast.LENGTH_LONG);
                                        toast.show();
                                        finish();
                                    }
                                })
                        .setNegativeButton("取消", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })
                        .show();
            }
        });
        String[] s = new String[]{};
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        for(int i=0;i<7;i++) {
            String foodNameArray =bundle.getString("NAME");
            int num = bundle.getInt("NUM");
            int price = bundle.getInt("PRICE");
            s[i] = "餐點:" + foodNameArray + "      " + "數量:" + num + "      " + "價格:" + price;
            TextView2.setText(s[i]);
        }





        //這裡setText(s[n])
        //顯示陣列

    }
}
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(FoodList.this)
                        .setTitle("確認視窗")
                        .setMessage("確定要送出菜單了嗎?")
                        .setPositiveButton("確定", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast toast = Toast.makeText(FoodList.this, "菜單已送出!",
                                                Toast.LENGTH_LONG);
                                        toast.show();
                                        finish();
                                    }
                                })
                        .setNegativeButton("取消", new
                                DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })
                        .show();
            }
        });
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("NAME");
        int num = bundle.getInt("NUM");
        int price = bundle.getInt("PRICE");
        String s = "餐點:" + name + "      " + "數量:" + num + "      " + "價格:" + price;

        TextView2.setText(s);
        //這裡setText(s[n])
        //顯示陣列

    }
}
