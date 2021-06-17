package br.com.local.tablayoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PizzaPequena_Fragment extends Fragment {

    TextView txtNome;
    RecyclerView mRecyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pizza_pequena, container, false);


        txtNome = view.findViewById(R.id.txtIdTitulo);
        mRecyclerView = view.findViewById(R.id.idRecyclerViewPizzas);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mRecyclerView.hasFixedSize();

        MyAdapterPizzas adapterPizzas = new MyAdapterPizzas();

        mRecyclerView.setAdapter(adapterPizzas);



        return view;
    }
}