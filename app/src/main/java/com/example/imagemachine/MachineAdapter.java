package com.example.imagemachine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MachineAdapter extends RecyclerView.Adapter<MachineAdapter.MachineViewHolder> {
    private List<String> machineDataset;

    public static class MachineViewHolder extends RecyclerView.ViewHolder {
        public TextView machineTitle;
        public View layout;
        public MachineViewHolder(View v) {
            super(v);
            layout = v;
            machineTitle = (TextView) v.findViewById(R.id.title_text);
        }
    }

    public MachineAdapter(List<String> dataSet) {
        machineDataset = dataSet;
    }

    @Override
    public MachineAdapter.MachineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create new view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        MachineViewHolder machineViewHolder = new MachineViewHolder(view);
        return machineViewHolder;
    }

    @Override
    public void onBindViewHolder(MachineViewHolder holder, int position) {
        final String title = machineDataset.get(position);
        holder.machineTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return machineDataset.size();
    }
}
