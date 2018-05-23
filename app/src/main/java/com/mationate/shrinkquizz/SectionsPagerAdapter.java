package com.mationate.shrinkquizz;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return MatchFragment.newInstance();
            case 2:
                return LuckyFragment.newInstance();

                default:
                    return PartyFragment.newInstance();
        }

        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Party";
            case 1:
                return "Match";
            case 2:
                return "Lucky";
        }
        return null;
    }
}
