package com.example.myapplication.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterInterface;
import com.example.myapplication.adapter.SimpleRecyclerViewAdapter;
import com.example.myapplication.model.PlacesBean;
import com.example.myapplication.viewmodel.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterInterface<PlacesBean> {
    //android components
    private FloatingActionButton fab;
    RecyclerView recyclerView;
    //variables
    MainActivityViewModel viewModel;
    SimpleRecyclerViewAdapter<PlacesBean>simpleRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    private void initializeUI(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.recyclerView);

        initializeObjects();
        initializeListeners();
        initializeRecyclerView();
    }

    private void initializeObjects(){
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        viewModel.initializeRemote();
    }

    private void initializeListeners(){
        fab.setOnClickListener(this);
    }

    private void initializeRecyclerView(){
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        simpleRecyclerViewAdapter = new SimpleRecyclerViewAdapter<>(this,R.layout.recycler_view_places,this,recyclerView,null);
        recyclerView.setAdapter(simpleRecyclerViewAdapter);
        observeData();
    }
    private void observeData(){
        if (viewModel!=null){
            viewModel.getPlacesList().observe(this, new Observer<List<PlacesBean>>() {
                @Override
                public void onChanged(@Nullable List<PlacesBean> placesBeans) {
                    if (placesBeans!=null&&!placesBeans.isEmpty()){
                        simpleRecyclerViewAdapter.refreshAdapter(placesBeans);
                    }
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(PlacesBean object, View view, int position) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position, View view) {
        return new MainActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position, PlacesBean object) {
        ((MainActivityViewHolder)viewHolder).textViewName.setText(object.getLocation());
    }
}
