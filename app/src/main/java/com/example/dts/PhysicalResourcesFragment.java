package com.example.dts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PhysicalResourcesFragment extends Fragment {
    ConstraintLayout vehicleInfolayout,vehicleInfoDetailsLayout,
                    itDeviceLayout,itDeviceDetailsLayout,
                    branchDetailsLayout,clBranchDetailsLayout,
                    employeeDetailsLayout,clEmployeeDetailsLayout;
    ImageView vehicleInfoExpandIcon,itDeviceExpandIcon,branchDetailsExpandIcon,employeeDetailsExpandIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_physical_resources, container, false);


        vehicleInfolayout=view.findViewById(R.id.cl_vehicle_info_cardview);
        vehicleInfoDetailsLayout=vehicleInfolayout.findViewById(R.id.cl_vehicle_info_details_cardview);
        vehicleInfoExpandIcon=vehicleInfolayout.findViewById(R.id.vehicle_info_expand_icon);

        itDeviceLayout=view.findViewById(R.id.cl_it_device_details);
        itDeviceDetailsLayout=itDeviceLayout.findViewById(R.id.cl_cl_it_device_details_details);
        itDeviceExpandIcon=itDeviceLayout.findViewById(R.id.it_device_details_expand_icon);

        branchDetailsLayout=view.findViewById(R.id.cl_branch_details);
        clBranchDetailsLayout=branchDetailsLayout.findViewById(R.id.cl_cl_branch_details);
        branchDetailsExpandIcon=branchDetailsLayout.findViewById(R.id.branch_details_expand_icon);

        employeeDetailsLayout=view.findViewById(R.id.cl_employee_details);
        clEmployeeDetailsLayout=employeeDetailsLayout.findViewById(R.id.cl_cl_employee_details);
        employeeDetailsExpandIcon=employeeDetailsLayout.findViewById(R.id.employee_details_expand_icon);

        vehicleInfoExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vehicleInfoDetailsLayout.getVisibility() == view.GONE)
                {
                    vehicleInfoExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    vehicleInfoDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    vehicleInfoExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    vehicleInfoDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        itDeviceExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itDeviceDetailsLayout.getVisibility() == view.GONE)
                {
                    itDeviceExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    itDeviceDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    itDeviceExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    itDeviceDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        branchDetailsExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clBranchDetailsLayout.getVisibility() == view.GONE)
                {
                    branchDetailsExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    clBranchDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    branchDetailsExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    clBranchDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        employeeDetailsExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clEmployeeDetailsLayout.getVisibility() == view.GONE)
                {
                    employeeDetailsExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    clEmployeeDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    employeeDetailsExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    clEmployeeDetailsLayout.setVisibility(View.GONE);
                }
            }
        });




        return view;
    }
}