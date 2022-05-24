package com.example.appounting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public class TransaccionAdapter extends RecyclerView.Adapter<TransaccionAdapter.ViewHolder>{
    private ArrayList<TransaccionDTO> transaccionesArrayList;
    private Context context;

    public TransaccionAdapter(ArrayList<TransaccionDTO> transaccionesArrayList, Context context) {
        this.transaccionesArrayList = transaccionesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movimiento, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.textViewNombreMovimiento.setText(transaccionesArrayList.get(position).getNombre());
        viewHolder.textViewValorMovimiento.setText(String.valueOf(transaccionesArrayList.get(position).getMonto()));
        viewHolder.textViewFechaMovimiento.setText(transaccionesArrayList.get(position).getFecha());
        //if(!transaccionesArrayList.get(position).getIngreso()){
            //viewHolder.textViewValorMovimiento.set
        //}
    }

    @Override
    public int getItemCount() {
        return transaccionesArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombreMovimiento, textViewValorMovimiento, textViewFechaMovimiento;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombreMovimiento = itemView.findViewById(R.id.textViewNombreMovimiento);
            textViewValorMovimiento = itemView.findViewById(R.id.textViewValorMovimiento);
            textViewFechaMovimiento = itemView.findViewById(R.id.textViewFechaMovimiento);
        }
    }
}
