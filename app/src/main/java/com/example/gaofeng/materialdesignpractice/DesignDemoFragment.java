package com.example.gaofeng.materialdesignpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gaofeng on 2016-07-18.
 */
public class DesignDemoFragment extends Fragment {
    private static final String TAB_POSITION = "tab_position";

    public static DesignDemoFragment newInstance(int tabPosition) {
        DesignDemoFragment fragment = new DesignDemoFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, tabPosition);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int tabPosition = getArguments().getInt(TAB_POSITION);
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 50; ++i) {
            items.add("Tab #" + tabPosition + "item #" + i);
        }
        View v=inflater.inflate(R.layout.fragment_list_view,container,false);
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(new DesignDemoRecyclerAdapter(items));
        return v;
    }
}
