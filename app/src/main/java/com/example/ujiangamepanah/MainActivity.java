package com.example.ujiangamepanah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView ImageView, ImageView2, ImageView3, ImageView4, ImageView5, ImageView7, ImageView8, ImageView9, ImageView10, ImageView11, ImageView12, ImageView13, ImageView14, ImageView15, ImageView16, ImageView17, ImageView18, ImageView19, ImageView20, ImageView21, ImageView22, ImageView23, ImageView24, ImageView25, ImageView26;

    Button btnAtas, btnBawah, btnKanan, btnKiri;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView2 = findViewById(R.id.imageView2);
        ImageView = findViewById(R.id.imageView);
        ImageView3 = findViewById(R.id.imageView3);
        ImageView4 = findViewById(R.id.imageView4);
        ImageView5 = findViewById(R.id.imageView5);
        ImageView7 = findViewById(R.id.imageView7);
        ImageView8 = findViewById(R.id.imageView8);
        ImageView9 = findViewById(R.id.imageView9);
        ImageView10 = findViewById(R.id.imageView10);
        ImageView11 = findViewById(R.id.imageView11);
        ImageView12 = findViewById(R.id.imageView12);
        ImageView13 = findViewById(R.id.imageView13);
        ImageView14 = findViewById(R.id.imageView14);
        ImageView15 = findViewById(R.id.imageView15);
        ImageView16 = findViewById(R.id.imageView16);
        ImageView17 = findViewById(R.id.imageView17);
        ImageView18 = findViewById(R.id.imageView18);
        ImageView19 = findViewById(R.id.imageView19);
        ImageView20 = findViewById(R.id.imageView20);
        ImageView21 = findViewById(R.id.imageView21);
        ImageView22 = findViewById(R.id.imageView22);
        ImageView23 = findViewById(R.id.imageView23);
        ImageView24 = findViewById(R.id.imageView24);
        ImageView25 = findViewById(R.id.imageView25);
        ImageView26 = findViewById(R.id.imageView26);

            btnKiri = findViewById(R.id.btnKiri);
            btnAtas = findViewById(R.id.btnAtas);
            btnBawah = findViewById(R.id.btnBawah);
            btnKanan = findViewById(R.id.btnKanan);

            btnKanan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(btnKanan.getText()=="Kanan"){
                        ImageView.setImageResource(R.drawable.putih);
                    }
                    else{
                        ImageView.setImageResource(R.drawable.hitam);

                    }
                }
            });

        btnKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btnKiri.getText()=="Kiri"){
                    ImageView.setImageResource(R.drawable.hitam);
                }
                else{
                    ImageView.setImageResource(R.drawable.putih);
                }
            }
        });

        btnBawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btnBawah.getText()=="Kanan"){
                    ImageView2.setImageResource(R.drawable.hitam);
                }
                else{
                    ImageView2.setImageResource(R.drawable.putih);
                }
            }
        });

        btnAtas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btnAtas.getText()=="Kiri"){
                    ImageView2.setImageResource(R.drawable.putih);
                }
                else{
                    ImageView2.setImageResource(R.drawable.hitam);
                }
            }
        });
    }



}
