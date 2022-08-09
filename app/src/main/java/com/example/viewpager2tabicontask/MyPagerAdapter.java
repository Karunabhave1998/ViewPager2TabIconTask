package com.example.viewpager2tabicontask;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    Fragment fragment;
    String string;

    public MyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        fragment = new Fragment();
        switch (position)
        {
            case 0:
                fragment = new BookFragment();
                break;
            case 1:
                fragment = new MovieFragment();
                break;
            case 2:
                fragment = new GameFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {



        switch (position)
        {
            case 0:
                string="Android";
                break;
            case 1:
                string="IOS";
                break;
            case 2:
                string="Windows";
                break;
        }

        return string;
    }
}
