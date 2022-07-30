package com.example.rowapp.ui.a_home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rowapp.R;
import com.example.rowapp.adapters.HomeHorAdapter;
import com.example.rowapp.adapters.HomeVerAdapter;
import com.example.rowapp.models.HomeHorModel;
import com.example.rowapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    // Horizontal
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;
    // Vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

//////////////////////// Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();
        // Insert Data
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizaa"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"Hamburger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

//////////////////////// Horizontal RecyclerView
        homeVerModelList = new ArrayList<>();
        // Insert Data
        homeVerModelList.add(new HomeVerModel
                (R.drawable.pizza1,"America Pizza","10:00 - 23:00","5.0","Min - $30"));
        homeVerModelList.add(new HomeVerModel
                (R.drawable.pizza2,"Japan Pizza","10:00 - 23:00","5.0","Min - $30"));
        homeVerModelList.add(new HomeVerModel
                (R.drawable.pizza3,"Anime Pizza","10:00 - 23:00","5.0","Min - $30"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);


        return root;
    }
}