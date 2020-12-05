package com.burakok.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editText;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =  findViewById(R.id.editText);  //id'yi yakalıyoruz

        userName = "";

    }

        public void changeActivity(View view) {

            userName = editText.getText().toString();   //Girilen String alınıyor

            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);  //Hangi main'e aktarılacağı belirtiliyor

            intent.putExtra("userInput", userName); //key , value ile kodlayarak gönderiyoruz

            startActivity(intent);




        }

}