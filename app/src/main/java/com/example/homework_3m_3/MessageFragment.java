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


public class MessageFragment extends Fragment {
    ArrayList<String> nameArrayList;
    ArrayList<String> messageArrayList;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.rv_messages);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MessageAdapter adapter = new MessageAdapter(getContext(), nameArrayList, messageArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        nameArrayList = new ArrayList<>();
        nameArrayList.add("Bob");
        nameArrayList.add("John");
        nameArrayList.add("Manny");
        nameArrayList.add("Job");
        nameArrayList.add("Angela");
        nameArrayList.add("Ann");
        nameArrayList.add("Sasha");
        nameArrayList.add("Vika");
        nameArrayList.add("Victor");
        nameArrayList.add("Luke");
        nameArrayList.add("Dart");
        nameArrayList.add("Dad");

        messageArrayList = new ArrayList<>();
        messageArrayList.add("Hello");
        messageArrayList.add("Are you busy?");
        messageArrayList.add("I'm waiting for you");
        messageArrayList.add("just call me");
        messageArrayList.add("where are you now");
        messageArrayList.add("can we meet?");
        messageArrayList.add("That's really cool");
        messageArrayList.add("Are you kidding me?");
        messageArrayList.add("xD");
        messageArrayList.add("Now we gonna go there");
        messageArrayList.add("Let's try");
        messageArrayList.add("Hi");
        messageArrayList.add("How are you");


    }
}