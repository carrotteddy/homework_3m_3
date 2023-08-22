package com.example.homework_3m_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
    Context context;
    ArrayList<String> names;
    ArrayList<String> messages;

    public MessageAdapter(Context context, ArrayList<String> names, ArrayList<String> messages) {
        this.context = context;
        this.names = names;
        this.messages = messages;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_message, parent, false);
        return new MessageViewHolder(view);
    }

    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        String name = names.get(position);
        String message = messages.get(position);
        holder.nameOfContactMessage.setText(name);
        holder.message.setText(message);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView nameOfContactMessage;
        TextView message;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            nameOfContactMessage = itemView.findViewById(R.id.contact_message_name);
            message = itemView.findViewById(R.id.message_text);
        }
    }
}
