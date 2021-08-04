package com.example.circleindicater;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewPagerAdapter extends FragmentStatePagerAdapter {

    public viewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return FragmentA.newInstance();
            case 1:
                return FragmentB.newInstance();
            case 2:
                return FragmentC.newInstance();
            case 3:
                return FragmentD.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
