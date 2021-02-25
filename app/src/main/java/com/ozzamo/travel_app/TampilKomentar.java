package com.ozzamo.travel_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class TampilKomentar extends AppCompatActivity {
    private TextView txtKomentar;
    private static final int RC_EDIT_KOMENTAR = 112;
    @BindView(R.id.text_view_result)
    TextView textViewResult;
    @BindView(R.id.btn_edit)
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_komentar);
        ButterKnife.bind(this);
        txtKomentar = findViewById(R.id.text_view_result);

        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(FormKomentar.EXTRA_DATA);
            txtKomentar.setText(data);

        }
    }

    @OnClick(R.id.btn_edit)
    public void onViewClicked() {
        Intent intentedt = new Intent(this, TampilEditKomentar.class);
        startActivityForResult(intentedt, RC_EDIT_KOMENTAR);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RC_EDIT_KOMENTAR && resultCode == RESULT_OK) {
            String name = data.getExtras().getString(TampilEditKomentar.EXTRA_NAME);
            textViewResult.setText(name);
        }
    }

}