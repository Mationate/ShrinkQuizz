package com.mationate.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }

    public static LuckyFragment newInstance() {
        return new LuckyFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox happy = view.findViewById(R.id.happyCb);
        final CheckBox mood = view.findViewById(R.id.moodCb);
        final Button button = view.findViewById(R.id.luckyBtn);

        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mood.setChecked(isChecked);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = mood.isChecked();
                Log.d("ANSWER", String.valueOf(answer));
            }
        });


    }
}
