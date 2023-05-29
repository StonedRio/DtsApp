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

public class NotRecomendedFragment extends Fragment {
    ConstraintLayout notRecomendedApplicationCardView,notRecomendedApplicationDetailsCardView;
    ImageView expandIcon,drawerIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_not_recomended, container, false);
        notRecomendedApplicationCardView=view.findViewById(R.id.cl_not_recomended_application_cardview);
        expandIcon=notRecomendedApplicationCardView.findViewById(R.id.expand_icon);
        drawerIcon=view.findViewById(R.id.icon_hamburger_menu);

        notRecomendedApplicationDetailsCardView=notRecomendedApplicationCardView.findViewById(R.id.cl_not_recomended_application_details_cardview);

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
                if (notRecomendedApplicationDetailsCardView.getVisibility() == view.GONE)
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_up);
                    notRecomendedApplicationDetailsCardView.setVisibility(View.VISIBLE);
                }else
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_down);
                    notRecomendedApplicationDetailsCardView.setVisibility(View.GONE);
                }

            }
        });
        return view;
    }
}