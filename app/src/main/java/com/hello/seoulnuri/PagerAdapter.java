package com.hello.seoulnuri;

import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return MainFragment.newInstance();
            case 1:
                return InfoFragment.newInstance();
            case 2:
                return PlannerFragment.newInstance();
            case 3:
                return CourseFragment.newInstance();
            case 4:
                return MypageFragment.newInstance();
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
