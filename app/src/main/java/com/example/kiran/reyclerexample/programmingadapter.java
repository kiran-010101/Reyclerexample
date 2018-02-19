package com.example.kiran.reyclerexample;

import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kiran on 10/25/17.
 */

public class programmingadapter extends RecyclerView.Adapter<programmingadapter.programmingviewholder> {

     private String[] data;

    private int[] imgid;

    private String[] city;

    public programmingadapter(String[] data, int[] imgid, String[] checker){

        this.data = data;
        this.imgid = imgid;
        this.city = checker;
    }

    @Override
    public programmingviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);//upto here view is created
        return new programmingviewholder(view);//view point to listitem_layout.xml and so in lower part we use imgicon=(Imageview)itemview.Find---
    }//last line create view holder i.e return new pr....(view);

    @Override
    public void onBindViewHolder(programmingviewholder holder, int position) {

        String title = data[position];
        holder.texticon.setText(title);

        int id = imgid[position];
        holder.imageicon.setImageResource(id);

        String capital = city[position];
        holder.kdai.setText(capital);



    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programmingviewholder extends RecyclerView.ViewHolder{

            ImageView imageicon;
            TextView texticon;
        TextView kdai;

        public programmingviewholder(View itemView) {
            super(itemView);
            //using itemview.findview....cause itemview point is argument pointing to programmingviewholder..we have a constructor function
            imageicon=(ImageView)itemView.findViewById(R.id.imgicon);
            texticon = (TextView)itemView.findViewById(R.id.texttitle);
            kdai = (TextView)itemView.findViewById(R.id.kiran);
        }
    }
}
