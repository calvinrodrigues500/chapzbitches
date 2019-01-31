package com.example.amma.chapztutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    public LayoutInflater lInflator;
    RecyclerView recyclerView;
    private List<String> listNames;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle,txtAuthor;


        public MyViewHolder(View view) {
            super(view);
            txtTitle =view.findViewById(R.id.title);
            txtAuthor=view.findViewById(R.id.author);
            recyclerView=view.findViewById(R.id.recycler_view);

        }

    }
    public ListAdapter(Context context,List<String> names){
        this.lInflator=LayoutInflater.from(context);
        this.listNames=names;
    }

    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView=lInflator.inflate(R.layout.list_row,viewGroup,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.MyViewHolder myViewHolder, int i) {
        String id=listNames.get(myViewHolder.getAdapterPosition());
        myViewHolder.txtTitle.setText(id);
        String name=listNames.get(myViewHolder.getAdapterPosition());
        myViewHolder.txtAuthor.setText(name);
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }
}
