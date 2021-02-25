package com.ozzamo.travel_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment_2 extends AppCompatActivity {

    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tab)
    TabLayout tab;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.viewpage_main);
        ButterKnife.bind(this) ;

        ViewPagerAdapter viewPagerAdapter = new
                ViewPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(viewPagerAdapter);
        tab.setupWithViewPager(pager);
    }
}
