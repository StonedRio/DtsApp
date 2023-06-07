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

public class AllAppSummaryFragment extends Fragment {

    private int[] pieChartColors={
            Color.rgb(239, 87, 128),
            Color.rgb(138, 68, 123),
            Color.rgb(96, 54, 109),
            Color.rgb(7, 135, 167),
            Color.rgb(39, 167, 131),
            Color.rgb(150, 170, 59)
    };


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_all_app_summary, container, false);

        ImageView backIcon=view.findViewById(R.id.icon_arrow_back);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).ReplaceFragment(new HomeFragment());
            }
        });

        String[] applicationTypes={"Over Date", "This Week", "In Process",
                "Total Inspected","Total Recieved","Pending"};
        int[] numberOfApplications={6,14,9,4,8,5};

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
        pieChart.setCenterText("All Applications");
        pieChart.animateY(1000);
        pieChart.getLegend().setEnabled(false);

        TextView overDueDateCount=view.findViewById(R.id.over_date_count),
                thisWeekCount=view.findViewById(R.id.this_week_count),
                inProcessCount=view.findViewById(R.id.in_process_count),
                totalInspectedCount=view.findViewById(R.id.total_inspected_count),
                totalRecievedCount=view.findViewById(R.id.total_recieved_count),
                pendingCount=view.findViewById(R.id.pending_count);

        overDueDateCount.setText(""+numberOfApplications[0]);
        thisWeekCount.setText(""+numberOfApplications[1]);
        inProcessCount.setText(""+numberOfApplications[2]);
        totalInspectedCount.setText(""+numberOfApplications[3]);
        totalRecievedCount.setText(""+numberOfApplications[4]);
        pendingCount.setText(""+numberOfApplications[5]);

        return view;
    }
}