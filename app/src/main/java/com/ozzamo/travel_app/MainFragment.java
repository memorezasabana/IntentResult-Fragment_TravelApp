package com.ozzamo.travel_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainFragment extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.btn_siang)
    ImageView btnSiang;
    @BindView(R.id.btn_malam)
    ImageView btnMalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.add(R.id.frame_container, new FirstFragment());
        fragmentTransaction.add(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_siang)
    public void onBtnSiangClicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction
                fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new FirstFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_malam)
    public void onBtnMalamClicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction
                fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }
}
