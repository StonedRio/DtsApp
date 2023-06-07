package com.example.dts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class IncompleteAppSummaryFragment extends Fragment {
    private int[] pieChartColors={
            Color.rgb(139, 139, 139), Color.rgb(25, 108, 220),
            Color.rgb(19, 173, 210)
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_incomplete_app_summary, container, false);

        ImageView backIcon=view.findViewById(R.id.icon_arrow_back);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).ReplaceFragment(new HomeFragment());
            }
        });



        String[] applicationTypes={"In Process","Over Due Date","This Week"};
        int[] numberOfApplications={14,5,21};

        PieChart pieChart=view.findViewById(R.id.pie_chart);
        ArrayList<PieEntry> applications=new ArrayList<>();
        for (int i=0; i<applicationTypes.length;i++)
        {
            applications.add(new PieEntry( numberOfApplications[i],applicationTypes[i]));
        }
        PieDataSet pieDataSet=new PieDataSet(applications,"");
        pieDataSet.setColors(pieChartColors);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(14f);

        PieData pieData=new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.isDrawHoleEnabled();
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(10f);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Incomplete Applications");
        pieChart.animateY(1000);
        pieChart.getLegend().setEnabled(false);

        TextView inProgressCount=view.findViewById(R.id.in_process_count),
                overDueDateCount=view.findViewById(R.id.over_due_date_count),
                thisWeekInspectionsCount=view.findViewById(R.id.this_week_Inspections_count);

        inProgressCount.setText(""+numberOfApplications[0]);
        overDueDateCount.setText(""+numberOfApplications[1]);
        thisWeekInspectionsCount.setText(""+numberOfApplications[2]);


        return view;
    }

}