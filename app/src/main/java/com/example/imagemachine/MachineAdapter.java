package com.example.imagemachine;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MachineAdapter extends RecyclerView.Adapter<MachineAdapter.MachineViewHolder> {
    private static final String TAG = "Machine View Adapter";

    private List<String> machineTitle;
    private Context mContext;

    public static class MachineViewHolder extends RecyclerView.ViewHolder {
        public TextView machineTitle;
        public View layout;
        public ConstraintLayout parentLayout;
        public MachineViewHolder(View v) {
            super(v);
            layout = v;
            machineTitle = (TextView) v.findViewById(R.id.title_text);
            parentLayout = (ConstraintLayout) v.findViewById(R.id.parent_layout);
        }
    }

    public MachineAdapter(Context context, List<String> dataSet) {
        mContext = context;
        machineTitle = dataSet;
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
    public void onBindViewHolder(MachineViewHolder holder, final int position) {
        final String title = machineTitle.get(position);
        holder.machineTitle.setText(title);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on "+machineTitle.get(position));

                Intent intent = new Intent(mContext, DetailMachineActivity.class);
                intent.putExtra("machine_title", machineTitle.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return machineTitle.size();
    }
}
