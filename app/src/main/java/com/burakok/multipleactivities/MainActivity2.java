package com.burakok.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2); // id' yi yakalıyoruz

        Intent intent = getIntent();  // intenti alıyoruz

        String userName =  intent.getStringExtra("userInput" ); // keyle gönderdiğimiz value'yu alıyoruz

        textView.setText(userName); // value set ediliyor
    }

    public  void  changeScreen(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class); // ilk ekrana geri dönüyoruz

        startActivity(intent);

    }
}