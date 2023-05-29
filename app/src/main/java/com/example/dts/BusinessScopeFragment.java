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

public class BusinessScopeFragment extends Fragment {
    ConstraintLayout mainOfficeBusinessScopelayout,mainOfficeBusinessScopeDetailsLayout,
            mainGuaranteeBusinessScopelayout,mainGuaranteeBusinessScopeDetailsLayout,
            branchBusinessScopelayout,branchBusinessScopeDetailsLayout,
            guaranteeBusinessScopelayout,guaranteeBusinessScopeDetailsLayout;
    ImageView mainOfficeBusinessScopeExpandIcon,
            mainGuaranteeBusinessScopeExpandIcon,
            branchBusinessScopeExpandIcon,
            guaranteeBusinessScopeExpandIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_business_scope, container, false);

        mainOfficeBusinessScopelayout=view.findViewById(R.id.cl_main_office_business_scope_cardview);
        mainOfficeBusinessScopeDetailsLayout=mainOfficeBusinessScopelayout.findViewById(R.id.cl_main_office_business_scope_details_cardview);
        mainOfficeBusinessScopeExpandIcon=mainOfficeBusinessScopelayout.findViewById(R.id.main_office_business_scope_expand_icon);

        mainGuaranteeBusinessScopelayout=view.findViewById(R.id.cl_main_guarantee_business_scope_cardview);
        mainGuaranteeBusinessScopeDetailsLayout=mainGuaranteeBusinessScopelayout.findViewById(R.id.cl_main_guarantee_business_scope_details_cardview);
        mainGuaranteeBusinessScopeExpandIcon=mainGuaranteeBusinessScopelayout.findViewById(R.id.main_guarantee_business_scope_expand_icon);

        branchBusinessScopelayout=view.findViewById(R.id.cl_branch_business_scope_cardview);
        branchBusinessScopeDetailsLayout=branchBusinessScopelayout.findViewById(R.id.cl_branch_business_scope_details_cardview);
        branchBusinessScopeExpandIcon=branchBusinessScopelayout.findViewById(R.id.branch_business_scope_expand_icon);

        guaranteeBusinessScopelayout=view.findViewById(R.id.cl_guarantee_business_scope);
        guaranteeBusinessScopeDetailsLayout=guaranteeBusinessScopelayout.findViewById(R.id.cl_guarantee_business_scope_details);
        guaranteeBusinessScopeExpandIcon=guaranteeBusinessScopelayout.findViewById(R.id.guarantee_business_scope_expand_icon);


        mainOfficeBusinessScopeExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainOfficeBusinessScopeDetailsLayout.getVisibility() == view.GONE)
                {
                    mainOfficeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    mainOfficeBusinessScopeDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    mainOfficeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    mainOfficeBusinessScopeDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        mainGuaranteeBusinessScopeExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainGuaranteeBusinessScopeDetailsLayout.getVisibility() == view.GONE)
                {
                    mainGuaranteeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    mainGuaranteeBusinessScopeDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    mainGuaranteeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    mainGuaranteeBusinessScopeDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        branchBusinessScopeExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (branchBusinessScopeDetailsLayout.getVisibility() == view.GONE)
                {
                    branchBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    branchBusinessScopeDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    branchBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    branchBusinessScopeDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        guaranteeBusinessScopeExpandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (guaranteeBusinessScopeDetailsLayout.getVisibility() == view.GONE)
                {
                    guaranteeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_up);
                    guaranteeBusinessScopeDetailsLayout.setVisibility(View.VISIBLE);
                }else
                {
                    guaranteeBusinessScopeExpandIcon.setImageResource(R.drawable.ic_arrow_down);
                    guaranteeBusinessScopeDetailsLayout.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }
}