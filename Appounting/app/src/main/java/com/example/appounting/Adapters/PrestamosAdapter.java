package com.example.appounting.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.appounting.R;
import com.example.appounting.model.PrestamoDTO;
import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public class PrestamosAdapter extends RecyclerView.Adapter<PrestamosAdapter.ViewHolder>{
    private ArrayList<PrestamoDTO> prestamosArrayList;
    private Context context;
    final PrestamosAdapter.OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(PrestamoDTO PrestamoDTO);
    }

    public PrestamosAdapter(ArrayList<PrestamoDTO> prestamosArrayList, Context context, PrestamosAdapter.OnItemClickListener listener) {
        this.prestamosArrayList = prestamosArrayList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_prestamo, viewGroup, false);
        return new PrestamosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.binData(prestamosArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return prestamosArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void binData(PrestamoDTO prestamoDTO){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(prestamoDTO);
                }
            });
        }
    }
}
