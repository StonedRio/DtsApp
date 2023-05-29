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

public class LegalInfoFragment extends Fragment {
    ImageView expandIcon;
    ConstraintLayout ownershipDetails,hiddenOwnershipDetails;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_legal_info, container, false);
        ownershipDetails=view.findViewById(R.id.cl_ownership_details_cardview);
        hiddenOwnershipDetails=ownershipDetails.findViewById(R.id.cl_cl_ownership_details_cardview);
        expandIcon=ownershipDetails.findViewById(R.id.expand_icon);

        expandIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenOwnershipDetails.getVisibility() == view.GONE)
                {
                    expandIcon.setImageResource(R.drawable.ic_arrow_up);
                    hiddenOwnershipDetails.setVisibility(View.VISIBLE);
                }else {
                    expandIcon.setImageResource(R.drawable.ic_arrow_down);
                    hiddenOwnershipDetails.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }
}