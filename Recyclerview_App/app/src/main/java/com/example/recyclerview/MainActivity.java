package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdabter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button buttonInsert;
    private Button buttonRemove;
    private EditText editTextInsert;
    private EditText editTextRemove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleList();
        buildRecyclerView();

        buttonInsert = findViewById(R.id.button_insert);
        buttonRemove = findViewById(R.id.button_remove);
        editTextInsert = findViewById(R.id.edittext_insert);
        editTextRemove = findViewById(R.id.edittext_remove);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(editTextInsert.getText().toString());
                insertItem(position);
            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt(editTextRemove.getText().toString());
                removeItem(position);

            }
        });

    }

    public void insertItem(int position) {
        mExampleList.add(position, new ExampleItem(R.drawable.ic_android,
                "New Item at postion" + position, "This is SubText Also Added"));
        mAdabter.notifyItemInserted(position);
    }
    public void removeItem(int position) {
        mExampleList.remove(position);
        mAdabter.notifyItemRemoved(position);
    }

    public void changeItem(int position, String text) {

        mExampleList.get(position).changeText1(text);
        mAdabter.notifyItemChanged(position);

    }

    public void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.ic_android, "Android Teacher", "Description"));
        mExampleList.add(new ExampleItem(R.drawable.ic_female, "Yasmina heikko", "Bikini fitness"));
        mExampleList.add(new ExampleItem(R.drawable.ic_male, "Joni James", "Bodybuilding"));
        mExampleList.add(new ExampleItem(R.drawable.ic_female, "Clara Rose", "Hiking"));
        mExampleList.add(new ExampleItem(R.drawable.ic_male, "JAMAL BOGHADE", "Fitness"));
        mExampleList.add(new ExampleItem(R.drawable.ic_female, "Essi Mackey", "Life coach"));
        mExampleList.add(new ExampleItem(R.drawable.ic_male, "Jhon wick", "gunfu"));
        mExampleList.add(new ExampleItem(R.drawable.ic_male, "James Franklen", "Swimming"));

    }
    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdabter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdabter);

        mAdabter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                changeItem(position, "Clicked!");
            }
        });
    }
}