package com.example.gaofeng.materialdesignpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by gaofeng on 2016-07-18.
 */
public class DesignDemoPagerAdapter extends FragmentStatePagerAdapter {

    public DesignDemoPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DesignDemoFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab "+position;
    }
}
