package com.example.easy_fit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;


    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       v = inflater.inflate(R.layout.contact_fragment,container,false);
       myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
       RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstContact);
       myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Clara Clark", "FITNESS", R.drawable.claraclarck));
        lstContact.add(new Contact("Emma Paige", "YOGA", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "BODYBUILDING", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "JUDO", R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "CLIMBING", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "CYCLING6", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "SWIMMING", R.drawable.tomwhite));
        lstContact.add(new Contact("Clara Clark", "FITNESS", R.drawable.claraclarck));
        lstContact.add(new Contact("Emma Paige", "GYMNASTICS", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "CURLING", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "RUNNING", R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "BODYBUILDING", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "FITNESS", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "SWIMMING", R.drawable.tomwhite));
        lstContact.add(new Contact("Leon Fox", "YOGA", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "KARATE", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "BODYBUILDING", R.drawable.tomwhite));

    }
}
