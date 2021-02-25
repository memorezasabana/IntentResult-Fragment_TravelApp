package com.ozzamo.travel_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TampilEditKomentar extends AppCompatActivity {

    public static final String EXTRA_NAME = "EXTRA_NAME";

    @BindView(R.id.edtkomentar2)
    EditText editText2;
    @BindView(R.id.btn_savekomentar)
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_edit_komentar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_savekomentar)
    public void onViewClicked(){
        String name = editText2.getText().toString();
        Intent intentedt2 = new Intent();
        intentedt2.putExtra(EXTRA_NAME, name);
        setResult(RESULT_OK, intentedt2);
        finish();
    }
}
