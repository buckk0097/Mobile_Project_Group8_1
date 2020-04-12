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
        lstContact.add(new Contact("Clara Clark", "(358) 589762846", R.drawable.claraclark));
        lstContact.add(new Contact("Emma Paige", "(358) 456893476", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "(356) 554867921", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "(358) 549813576", R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "(358) 476581234", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "(358) 489762846", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "(358) 489762846", R.drawable.tomwhite));
        lstContact.add(new Contact("Clara Clark", "(358) 589762846", R.drawable.claraclark));
        lstContact.add(new Contact("Emma Paige", "(358) 456893476", R.drawable.emmapaige));
        lstContact.add(new Contact("James Gate", "(356) 554867921", R.drawable.jamesgate));
        lstContact.add(new Contact("Jasmine Nekaty", "(358) 549813576", R.drawable.jasminenekaty));
        lstContact.add(new Contact("Leon Fox", "(358) 476581234", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "(358) 489762846", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "(358) 489762846", R.drawable.tomwhite));
        lstContact.add(new Contact("Leon Fox", "(358) 476581234", R.drawable.leonfox));
        lstContact.add(new Contact("Sara Ramirez", "(358) 489762846", R.drawable.sararamirez));
        lstContact.add(new Contact("Tom White", "(358) 489762846", R.drawable.tomwhite));

    }
}
