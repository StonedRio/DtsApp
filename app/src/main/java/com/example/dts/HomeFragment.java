package com.example.dts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HomeFragment extends Fragment {
    ImageView drawerIcon;
    ConstraintLayout allAplSummary,incompleteAplSummary,recievedAplDistrictWise,inspectedAplDistrictWise;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        drawerIcon=view.findViewById(R.id.icon_hamburger_menu);
        allAplSummary=view.findViewById(R.id.cl_all_applications_summary);
        incompleteAplSummary=view.findViewById(R.id.cl_incomplete_applications_summary);
        recievedAplDistrictWise=view.findViewById(R.id.cl_recieved_applications_district_wise);
        inspectedAplDistrictWise=view.findViewById(R.id.cl_inspected_applications_district_wise);


        drawerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) requireActivity();
                DrawerLayout drawerLayout = mainActivity.getDrawerLayout();
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        allAplSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)requireActivity()).ReplaceFragment( new AllAppSummaryFragment());
            }
        });


        incompleteAplSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)requireActivity()).ReplaceFragment( new IncompleteAppSummaryFragment());
            }
        });


        recievedAplDistrictWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)requireActivity()).ReplaceFragment(new AllRecievedAplDistrictWiseFragment());
            }
        });


        inspectedAplDistrictWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)requireActivity()).ReplaceFragment(new InspectedAplDistrictWiseFragment());
            }
        });



        return view;
    }
}