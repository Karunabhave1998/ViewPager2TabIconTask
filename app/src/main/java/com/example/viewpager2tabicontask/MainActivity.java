package com.example.viewpager2tabicontask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;
    int[] images={R.drawable.ic_baseline_android_24,R.drawable.ic_baseline_phone_iphone_24,R.drawable.ic_baseline_laptop_windows_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);




        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);



        tabLayout.getTabAt(0).setIcon(images[0]);


        tabLayout.getTabAt(1).setIcon(images[1]);
        tabLayout.getTabAt(2).setIcon(images[2]);

    }


}