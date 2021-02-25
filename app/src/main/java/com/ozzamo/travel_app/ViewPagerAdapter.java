package com.ozzamo.travel_app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new First_Fragment_1();
        } else if (position == 1) {
            return new Second_Fragment_2();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 || position % 2 == 0) {
            return "First";
        } else if (position % 2 == 1) {
            return "Second";
        }
        throw new IllegalStateException("Position not valid");
    }
}
