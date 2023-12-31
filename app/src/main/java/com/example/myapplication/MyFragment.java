package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    private TextView textView;
    private Button addButton;
    private Button subtractButton;

    private int currentValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        textView = view.findViewById(R.id.textView);
        addButton = view.findViewById(R.id.addButton);
        subtractButton = view.findViewById(R.id.subtractButton);

        updateText();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue++;
                updateText();
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue--;
                updateText();
            }
        });

        return view;
    }

    private void updateText() {
        if (textView != null) {
            textView.setText(String.valueOf(currentValue));
        }
    }
}