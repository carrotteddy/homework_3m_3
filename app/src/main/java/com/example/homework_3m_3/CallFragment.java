package com.example.homework_3m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CallFragment extends Fragment {
    private ArrayList<String> callNames;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.rv_calls);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()));
        CallAdapter adapter = new CallAdapter(getContext(), callNames);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        callNames = new ArrayList<>();
        callNames.add("Kiril");
        callNames.add("Vasiliy");
        callNames.add("Friend");
        callNames.add("Vitaliy");
        callNames.add("Akim");
        callNames.add("Nikita");
        callNames.add("Friend2");
        callNames.add("Friend3");
        callNames.add("Friend4");
        callNames.add("NotFriend");
        callNames.add("Lover");
        callNames.add("Sheldon");
        callNames.add("Tom");
        callNames.add("Jerry");
        callNames.add("Garry");
        callNames.add("SpongeBob");
        callNames.add("Patrick");
        callNames.add("Platon");
    }

}