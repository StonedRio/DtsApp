package com.example.dts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.dts.adapter.PagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class DetailsFormFragment extends Fragment {
    ImageView drawerIcon;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_details_form, container, false);
        tabLayout=view.findViewById(R.id.tab_layout);
        viewPager=view.findViewById(R.id.view_pager);
        drawerIcon=view.findViewById(R.id.icon_hamburger_menu);

        drawerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) requireActivity();
                DrawerLayout drawerLayout = mainActivity.getDrawerLayout();
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        PagerAdapter pagerAdapter=new PagerAdapter(getChildFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Remarks");
        tabLayout.getTabAt(1).setText("Basic Info");
        tabLayout.getTabAt(2).setText("Contact Info");
        tabLayout.getTabAt(3).setText("Legal Info");
        tabLayout.getTabAt(4).setText("Financial Info");
        tabLayout.getTabAt(5).setText("Physical Resources");
        tabLayout.getTabAt(6).setText("Business Scope");
        tabLayout.getTabAt(7).setText("Upload Files");



        return view;
    }
}