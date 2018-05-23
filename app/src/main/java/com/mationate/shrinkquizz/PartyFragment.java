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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }

    public static PartyFragment newInstance() {
        return new PartyFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = view.findViewById(R.id.partyRadioGroup);
        Button partyButton = view.findViewById(R.id.partyButton);

        partyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1){

                    RadioButton radioButton = radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getContext(), "Debes marcar una opción", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
