package org.bits_waves.waves2017.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.bits_waves.waves2017.R;

public class AboutEvent extends Fragment {
    private String event_name_string;
    private TextView about_event;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_about_event, container, false);
        if (savedInstanceState == null) {
            Bundle extras = getActivity().getIntent().getExtras();
            if (extras == null) {
                event_name_string = null;
            } else {
                event_name_string = extras.getString("event_name");
            }
        } else {
            event_name_string = (String) savedInstanceState.getSerializable("event_name");
        }
        about_event = (TextView) view.findViewById(R.id.about_event);
        if (event_name_string.equals("Spin Off")){
            about_event.setText("Do you have it in you to win the ultimate band title?\n" +
                    "This is the intercollegiate band event. The bands may use a range of " +
                    "Indian/Western instruments and play songs in any Indian language to\n" +
                    "compete for the title.\n" +
                    "Team composition: 3-10 members\n" +
                    "Teams per college: 2\n" +
                    "Registration: On the spot");
        }
        return view;
    }
}

