package com.ozzamo.travel_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GalleryHeha extends AppCompatActivity implements View.OnClickListener {

    private Button BtnKomentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_heha);


        // Untuk memanggil image view supaya bisa diklik dan digunakan untuk intent
        BtnKomentar = findViewById(R.id.btn_komentar);
        BtnKomentar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent pindah;

        // Untuk membuat intent, saat diklik pindah ke class lain
        switch (view.getId()) {
            case R.id.btn_komentar:
                pindah = new Intent(GalleryHeha.this, FormKomentar.class);
                startActivity(pindah);
                break;
        }
    }
}
