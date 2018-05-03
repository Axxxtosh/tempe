package com.uriahsolution.homecare.ui.timetable;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.uriahsolution.homecare.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TimeTableActivity extends AppCompatActivity {


    @BindView(R.id.tabs)
    TabLayout tabLayout;

    @BindView(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @BindView(R.id.viewpager)
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        ButterKnife.bind(this);



        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupViewPager(viewPager);
        //Select category
        viewPager.setCurrentItem(3);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BlankFragment(), "Beauty");
        adapter.addFragment(new BlankFragment(), "TUE");
        adapter.addFragment(new BlankFragment(), "WED");
        adapter.addFragment(new BlankFragment(), "THU");
        adapter.addFragment(new BlankFragment(), "FRI");
        adapter.addFragment(new BlankFragment(), "SAT");
        adapter.addFragment(new BlankFragment(), "SUN");
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onNavigateUp() {
        finish();
        return super.onNavigateUp();

    }
}
