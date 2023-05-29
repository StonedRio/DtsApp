package com.example.dts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PendingFragment extends Fragment {
    ImageView expandIcon,viewDetailsIcon,generatePdfIcon,drawerIcon;
    TextView visibleText1,visibleText2;
    ConstraintLayout applicationLayout,detailsLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pending, container, false);
        expandIcon=view.findViewById(R.id.expand_icon);
        drawerIcon=view.findViewById(R.id.icon_hamburger_menu);

        visibleText1=view.findViewById(R.id.visible_textview1);
        visibleText2=view.findViewById(R.id.visible_textview2);

        applicationLayout=view.findViewById(R.id.cl_application_cardview);
        detailsLayout=applicationLayout.findViewById(R.id.application_details_cardview);
        viewDetailsIcon=detailsLayout.findViewById(R.id.icon_details);
        generatePdfIcon=detailsLayout.findViewById(R.id.icon_create_pdf);




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
                if (detailsLayout.getVisibility() == View.GONE){
                    visibleText1.setVisibility(View.GONE);
                    visibleText2.setVisibility(View.GONE);
                    detailsLayout.setVisibility(View.VISIBLE);
                    expandIcon.setImageResource(R.drawable.ic_arrow_up);
                }else
                {
                    visibleText1.setVisibility(View.VISIBLE);
                    visibleText2.setVisibility(View.VISIBLE);
                    detailsLayout.setVisibility(View.GONE);
                    expandIcon.setImageResource(R.drawable.ic_arrow_down);
                }

            }
        });

        viewDetailsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)requireActivity()).ReplaceFragment( new DetailsFormFragment());
            }
        });

        generatePdfIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Generate PDF", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}