package com.ozzamo.travel_app;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class FormKomentar extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    private EditText editText;
    private Button btnKirim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_komentar);
        editText = findViewById(R.id.edtkomentar);
        btnKirim = findViewById(R.id.btn_kirim);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent move = new Intent(FormKomentar.this, TampilKomentar.class);
                move.putExtra(EXTRA_DATA, data);
                startActivity(move);
            }
        });
    }
}
