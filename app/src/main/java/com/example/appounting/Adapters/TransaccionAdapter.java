package com.example.appounting.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appounting.R;
import com.example.appounting.model.TransaccionDTO;

import java.util.ArrayList;

public class TransaccionAdapter extends RecyclerView.Adapter<TransaccionAdapter.ViewHolder>{
    private ArrayList<TransaccionDTO> transaccionesArrayList;
    private Context context;
    final TransaccionAdapter.OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(TransaccionDTO transaccionDTO);
    }

    public TransaccionAdapter(ArrayList<TransaccionDTO> transaccionesArrayList, Context context, TransaccionAdapter.OnItemClickListener listener) {
        this.transaccionesArrayList = transaccionesArrayList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movimiento, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        //System.out.println("aqui" + position);
        viewHolder.binData(transaccionesArrayList.get(position));
        //if(!transaccionesArrayList.get(position).getIngreso()){
        //viewHolder.textViewValorMovimiento.set
        //}
    }

    @Override
    public int getItemCount() {
        return transaccionesArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombreMovimiento, textViewValorMovimiento, textViewFechaMovimiento;

        //Constructor
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombreMovimiento = itemView.findViewById(R.id.textViewNombreMovimiento);
            textViewValorMovimiento = itemView.findViewById(R.id.textViewValorMovimiento);
            textViewFechaMovimiento = itemView.findViewById(R.id.textViewFechaMovimiento);
            //itemView.setOnClickListener();

        }

        void binData(TransaccionDTO transaccionDTO){
            textViewNombreMovimiento.setText(transaccionDTO.getNombre());
            textViewValorMovimiento.setText(String.valueOf(transaccionDTO.montoToString()));
            if(transaccionDTO.getIngreso()){
                textViewValorMovimiento.setTextColor(Color.rgb(0, 255, 0));
            }else{
                textViewValorMovimiento.setTextColor(Color.rgb(255, 0, 0));
            }
            textViewFechaMovimiento.setText(transaccionDTO.getFecha());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(transaccionDTO);
                }
            });
        }

    }
}
