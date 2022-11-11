package com.example.homework_3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BlankFragment extends Fragment {
    private final View.OnClickListener clickListener = view -> {
        if (view.getId() == R.id.btn_plus) {
            plusCounter();
        }
        if (view.getId() == R.id.btn_minus) {
            minusCounter();
        }
        if (view.getId() == R.id.btn_reset) {
            resetCounter();
        }
    };

    private TextView tvCounter;
    private int counter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvCounter = requireActivity().findViewById(R.id.tv_counter);

        Button btnPlus = requireActivity().findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(clickListener);

        Button btnMinus = requireActivity().findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(clickListener);

        Button btnReset = requireActivity().findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(clickListener);
        initCounter();
    }

    private void initCounter() {
        counter = 0;
        tvCounter.setText(String.valueOf(counter));
    }

    private void plusCounter() {
        counter++;
        tvCounter.setText(String.valueOf(counter));
    }

    private void minusCounter() {
        counter--;
        tvCounter.setText(String.valueOf(counter));
    }

    private void resetCounter() {
        counter = 0;
        tvCounter.setText(String.valueOf(counter));
    }
}