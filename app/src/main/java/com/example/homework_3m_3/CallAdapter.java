package com.example.homework_3m_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallViewHolder> {
    Context context;
    ArrayList<String> callNameArrayList;

    public CallAdapter(Context context, ArrayList<String> callNameArrayList) {
        this.context = context;
        this.callNameArrayList = callNameArrayList;
    }

    @NonNull
    @Override
    public CallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_calls, parent, false);
        return new CallViewHolder(view);
    }


    public void onBindViewHolder(@NonNull CallViewHolder holder, int position) {
         String callName = callNameArrayList.get(position);
         holder.callName.setText(callName);

    }

    @Override
    public int getItemCount() {
        return callNameArrayList.size();
    }

    public static class CallViewHolder extends RecyclerView.ViewHolder {
        TextView callName;

        public CallViewHolder(@NonNull View itemView) {
            super(itemView);
            callName = itemView.findViewById(R.id.call_contact_name);
        }
    }
}
