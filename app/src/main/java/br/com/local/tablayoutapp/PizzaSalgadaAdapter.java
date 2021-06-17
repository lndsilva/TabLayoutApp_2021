package br.com.local.tablayoutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PizzaSalgadaAdapter extends RecyclerView.Adapter<PizzaSalgadaAdapter.ViewHolder> {


    Context ctx;
    List<Pizzas> listPizza;

    public PizzaSalgadaAdapter(Context ctx, List<Pizzas> listPizza) {
        this.ctx = ctx;
        this.listPizza = listPizza;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(ctx);

        view = inflater.inflate(R.layout.activity_exemplo_tab_layout,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        //holder.nomePizza.setText( listPizza[position]);
        //holder.saborPizza.setText(listPizza[position]);

        holder.btnComprarPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return listPizza.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nomePizza, valorPizza, saborPizza;
        ImageView imagemPizza;
        Button btnComprarPizza;


        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

        }
    }
}
