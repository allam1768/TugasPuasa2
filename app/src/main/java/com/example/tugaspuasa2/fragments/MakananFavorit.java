
package com.example.tugaspuasa2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaspuasa2.AdapterList;
import com.example.tugaspuasa2.DataItem;
import com.example.tugaspuasa2.R;
import com.example.tugaspuasa2.AdapterList;
import com.example.tugaspuasa2.DataItem;

import java.util.ArrayList;
import java.util.List;

public class MakananFavorit extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;

    public MakananFavorit() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_favorit, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Rendang", "9.5", R.drawable.rendang));
        dataList.add(new DataItem("Nasi Padang", "9.0", R.drawable.nasipadang));
        dataList.add(new DataItem("Tongseng", "9.0", R.drawable.tongseng));
        dataList.add(new DataItem("Coca cola", "9.5", R.drawable.cocacola));
        dataList.add(new DataItem("Es Teh", "10", R.drawable.esteh));

        adapter = new AdapterList(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
