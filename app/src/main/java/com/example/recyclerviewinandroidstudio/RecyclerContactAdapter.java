package com.example.recyclerviewinandroidstudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> contactList;
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> contactList)
    {
        this.context = context;
        this.contactList = contactList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgView.setImageResource(contactList.get(position).img);
        holder.txtViewName.setText(contactList.get(position).name);
        holder.txtViewNumber.setText(contactList.get(position).number);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtViewName, txtViewNumber;
        ImageView imgView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtViewName = itemView.findViewById(R.id.txtViewName);
            txtViewNumber = itemView.findViewById(R.id.txtViewNumber);
            imgView = itemView.findViewById(R.id.imgView);

        }

    }
}
