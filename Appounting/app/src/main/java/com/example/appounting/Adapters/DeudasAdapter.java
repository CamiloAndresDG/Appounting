package com.example.appounting.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appounting.R;
import com.example.appounting.model.DeudaDTO;

import java.util.ArrayList;

public class DeudasAdapter extends RecyclerView.Adapter<DeudasAdapter.ViewHolder> {
    private ArrayList<DeudaDTO> deudasArrayList;
    private Context context;
    final DeudasAdapter.OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(DeudaDTO deudaDTO);
    }

    public DeudasAdapter(ArrayList<DeudaDTO> deudasArrayList, Context context, DeudasAdapter.OnItemClickListener listener) {
        this.deudasArrayList = deudasArrayList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transaccion, viewGroup, false);
        return new DeudasAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.binData(deudasArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return deudasArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombreDeuda, textViewCuotasRestantes, textViewMontoRestante;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombreDeuda = itemView.findViewById(R.id.textViewNombreMovimiento);
            textViewCuotasRestantes = itemView.findViewById(R.id.textViewValorMovimiento);
            textViewMontoRestante = itemView.findViewById(R.id.textViewFechaMovimiento);
        }

        void binData(DeudaDTO deudaDTO){
            textViewNombreDeuda.setText(deudaDTO.getNombre());
            textViewCuotasRestantes.setText(String.valueOf(deudaDTO.getCantidadCuotasRestantes()));
            textViewMontoRestante.setText(String.valueOf(deudaDTO.getMontoRestante()));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(deudaDTO);
                }
            });
        }
    }
}
