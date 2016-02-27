package com.example.jethro.mstatab2.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Jethro on 2/4/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter{

    private final int mNumOfTabs;
    int mNumbOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);

        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
