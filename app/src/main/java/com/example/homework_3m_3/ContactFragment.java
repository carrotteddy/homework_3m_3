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


public class ContactFragment extends Fragment {

   private ArrayList<Contact> contactArrayList;
   private String[] namesOfContact;
   private int[] contactImageID;
   private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.rv_contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ContactAdapter adapter = new ContactAdapter(getContext(),contactArrayList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void loadData() {
        contactArrayList = new ArrayList<>();

        namesOfContact = new String[]{
                "Jenya",
                "Homer",
                "Dan",
                "Ram",
                "Kirito",
                "Larry",
                "Kiril",
                "Vasya",
                "Vanya",
                "Evgeny",
                "Max",
                "Umar",
                "Timur"
        };
        contactImageID = new int[]{
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
                R.drawable.ic_person,
        };

        for (int i = 0; i < namesOfContact.length; i++) {
            Contact contact = new Contact(namesOfContact[i], contactImageID[i]);
            contactArrayList.add(contact);
        }
    }
}