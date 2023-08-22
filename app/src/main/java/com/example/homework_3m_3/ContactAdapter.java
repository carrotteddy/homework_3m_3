package com.example.homework_3m_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    Context context;
    ArrayList<Contact> contactsArrayList;

    public ContactAdapter(Context context, ArrayList<Contact> contactsArrayList) {
        this.context = context;
        this.contactsArrayList = contactsArrayList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contacts = contactsArrayList.get(position);
        holder.contact_img.setImageResource(contacts.getContactImage());
        holder.contact_name.setText(contacts.getName());
    }

    @Override
    public int getItemCount() {
        return contactsArrayList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView contact_img;
        TextView contact_name;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_img = itemView.findViewById(R.id.contact_image);
            contact_name = itemView.findViewById(R.id.contact_name);
        }
    }
}
