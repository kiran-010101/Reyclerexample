package com.example.kiran.reyclerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerview = (RecyclerView)findViewById(R.id.programminglist);

        mrecyclerview.setLayoutManager(new LinearLayoutManager(this));


        int[] imageid= {R.drawable.america,R.drawable.nepal,
                R.drawable.position,R.drawable.spain,
                R.drawable.cher,R.drawable.usa,R.drawable.america,R.drawable.nepal,
                R.drawable.position,R.drawable.spain,
                R.drawable.cher,R.drawable.usa};

        String[] icha ={"cricket","dc","footbal","volleyball","rogby","badminton","cricket","dc","footbal","volleyball","rogby","badminton"};

        String[] languages ={"c","c++","java","php","r","photo","c","c++","java","php","r","photo"};
        mrecyclerview.setAdapter( new programmingadapter(languages,imageid,icha));
    }
}
