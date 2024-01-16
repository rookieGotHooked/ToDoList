package com.goodsoft.todolist.ui.thisweek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.goodsoft.todolist.databinding.FragmentThisWeekBinding;

public class ThisWeekFragment extends Fragment {

    private FragmentThisWeekBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ThisWeekViewModel galleryViewModel =
                new ViewModelProvider(this).get(ThisWeekViewModel.class);

        binding = FragmentThisWeekBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textThisWeek;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}