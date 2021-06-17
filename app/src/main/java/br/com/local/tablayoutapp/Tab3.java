package br.com.local.tablayoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Tab3 extends Fragment {

    RecyclerView mRecyclerView;

    List<Livros> lstLivros;

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livros("A realidade de Madhu", "Ficção Científica", " Madhu é abduzida por uma nave intergaláctica", R.drawable.a_realidade));
        lstLivros.add(new Livros("Eu e Esse Meu Coração", "Auto ajuda", "Eu e Esse Meu Coração", R.drawable.coracao));
        lstLivros.add(new Livros("Dieta", "Alimentação", "Este não é mais um livro de dieta: O novo e libertador estilo de vida alimentar para saúde e boa", R.drawable.dieta));
        lstLivros.add(new Livros("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        lstLivros.add(new Livros("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        lstLivros.add(new Livros("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O poder do agora", "Auto Ajuda", "Um guia para a iluminação espiritual ", R.drawable.poder_agora));
        lstLivros.add(new Livros("Pai rico, pai pobre para jovens", "Administração e Negócios", "o que a escola não ensina sobre dinheiro", R.drawable.pai));


        mRecyclerView = view.findViewById(R.id.idRecyclerView);

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getContext(), lstLivros);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));


        mRecyclerView.setAdapter(mAdapter);


        return view;
    }
}