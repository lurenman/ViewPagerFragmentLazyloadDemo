package com.example.administrator.viewpagerfragmentlazyloaddemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<String> mTitle = new ArrayList<>();
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVariables();
        initViews();
        initEvents();
    }

    private void initVariables() {
        mTitle.add("Fragment1");
        mTitle.add("Fragment2");
        mTitle.add("Fragment3");
        mTitle.add("Fragment4");

        mFragments.add(new Fragment1());
        mFragments.add(new Fragment2());
        mFragments.add(new Fragment3());
        mFragments.add(new Fragment4());


    }


    private void initViews() {
        mTabLayout = (TabLayout) findViewById(R.id.tl);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
       /* FragmentPagerAdapter默认是setOffscreenPageLimit(1)--（0和1都是一样效果）
       * FragmentPagerAdapter只是移除view，FragmentStatePagerAdapter移除fragment走ondestroy
       */
        // mViewPager.setOffscreenPageLimit(2);
    }

    private void initEvents() {
        mTabLayout.setTabsFromPagerAdapter(mAdapter1);
        mViewPager.setAdapter(mAdapter1);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private FragmentPagerAdapter mAdapter = new FragmentPagerAdapter
            (MainActivity.this.getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mTitle.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }
    };
    private FragmentStatePagerAdapter mAdapter1 = new FragmentStatePagerAdapter
            (MainActivity.this.getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mTitle.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }

    };

}
