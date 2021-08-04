package com.example.viewpagerwithtabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter  extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  FragmentA.newInstance();
            case 1:
                return FragmentB.newInstance();
            case 2:
                return  FragmentC.newInstance();
        }
        return   FragmentA.newInstance();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String Tabname="";
        switch (position){
            case 0:
                Tabname="Names";
                break;
            case 1:
                Tabname="Places";
                break;
            case 2:
                Tabname="Tourism";
                break;
        }
        return Tabname;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
