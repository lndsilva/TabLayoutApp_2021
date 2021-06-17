package br.com.local.tablayoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class PizzasFragment extends Fragment {

    RecyclerView recyclerView;

    List<Livros> listaLivros;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pizzas, container, false);

        recyclerView = view.findViewById(R.id.idRecyclerViewPizzas);

        //vou utilizar duas colunas no meu recyclerView
        // recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        //vou utilizar uma linha para cada item do recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Melhorar a performance do recyclerView
        recyclerView.hasFixedSize();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(),listaLivros);

        recyclerView.setAdapter(adapter);


        return view;
    }
}