package org.bits_waves.waves2017.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bits_waves.waves2017.Adapters.AppAdapter;
import org.bits_waves.waves2017.ListItems.AppItem;
import org.bits_waves.waves2017.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Keshav on 09-Sep-17.
 */

public class OurTeam_FragementWaves extends android.support.v4.app.Fragment{

    private static final String TAG="OurTeam_FragementWaves";
    public View inf;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<AppItem> appItems;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        inf=inflater.inflate(R.layout.our_team_fragement_waves, container,false);


        recyclerView = (RecyclerView) inf.findViewById(R.id.our_team_fragement_waves_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        appItems =new ArrayList<>();

        AppItem appItem1 =new AppItem("Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem2 =new AppItem("Aryan","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem3 =new AppItem("Keshv","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem4 =new AppItem("Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem5 =new AppItem("Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");
        AppItem appItem6 =new AppItem("Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg","Keshav","7218406202", "shanumittal147@gmail.com","https://www.w3schools.com/css/trolltunga.jpg");

        appItems.add(appItem1);
        appItems.add(appItem2);
        appItems.add(appItem3);
        appItems.add(appItem4);
        appItems.add(appItem5);
        appItems.add(appItem6);

        adapter = new AppAdapter(appItems,getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);


        return inf;
    }
}

