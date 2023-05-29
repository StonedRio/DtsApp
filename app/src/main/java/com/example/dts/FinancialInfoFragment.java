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

public class FinancialInfoFragment extends Fragment {
    ImageView expandIcon;
    ConstraintLayout bankDetails,hiddenBankDetails;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_financial_info, container, false);
        bankDetails=view.findViewById(R.id.cl_bank_details_cardview);
        hiddenBankDetails=bankDetails.findViewById(R.id.cl_cl_bank_details_cardview);
        expandIcon=bankDetails.findViewById(R.id.expand_icon);

        expandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenBankDetails.getVisibility() == view.GONE)
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_up);
                    hiddenBankDetails.setVisibility(View.VISIBLE);
                }else {
                    expandIcon.setImageResource(R.drawable.ic_arrow_down);
                    hiddenBankDetails.setVisibility(View.GONE);
                }
            }
        });
        return view;
    }
}