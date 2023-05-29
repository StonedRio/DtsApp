package com.example.dts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class InspectedFragment extends Fragment {
    ConstraintLayout inspectedApplicationCardView,inspectedApplicationDetailsCardView;
    ImageView expandIcon,drawerIcon;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_inspected, container, false);

        inspectedApplicationCardView=view.findViewById(R.id.cl_inspected_application_cardview);
        expandIcon=inspectedApplicationCardView.findViewById(R.id.expand_icon);
        drawerIcon=view.findViewById(R.id.icon_hamburger_menu);

        inspectedApplicationDetailsCardView=inspectedApplicationCardView.findViewById(R.id.cl_inspected_application_details_cardview);

        drawerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) requireActivity();
                DrawerLayout drawerLayout = mainActivity.getDrawerLayout();
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        expandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inspectedApplicationDetailsCardView.getVisibility() == view.GONE)
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_up);
                    inspectedApplicationDetailsCardView.setVisibility(View.VISIBLE);
                }else
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_down);
                    inspectedApplicationDetailsCardView.setVisibility(View.GONE);
                }

            }
        });


        return view;
    }
}