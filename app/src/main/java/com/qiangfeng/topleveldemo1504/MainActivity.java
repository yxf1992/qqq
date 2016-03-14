package com.qiangfeng.topleveldemo1504;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mContentPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.main_tab_layout);
        mContentPager = (ViewPager) findViewById(R.id.main_content_view_page);
        //给tabLayout添加Tab按钮
//        mTabLayout.addTab(mTabLayout.newTab().setText(""));
    }
}
