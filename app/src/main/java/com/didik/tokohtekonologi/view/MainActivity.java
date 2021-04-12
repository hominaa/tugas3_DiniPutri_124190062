package com.didik.tokohtekonologi.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.didik.tokohtekonologi.R;
import com.didik.tokohtekonologi.data.Data;
import com.didik.tokohtekonologi.data.Tokoh;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Tokoh>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(Data.getListTokoh());

        setActionBarTitle("Tampilan List");
        showRecyclerList();
    }

    private void clickList() {
        ItemClickSupport.addTo(rv).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedTokoh(list.get(position));
            }
        });
    }

    private void showRecyclerList(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        TokohAdapter tokohAdapter = new TokohAdapter(this);
        tokohAdapter.setListTokoh(list);
        rv.setAdapter(tokohAdapter);
        clickList();
    }

    private void showRecyclerGrid(){
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        TokohAdapterGrid tokohAdapterGrid = new TokohAdapterGrid(this);
        tokohAdapterGrid.setListTokoh(list);
        rv.setAdapter(tokohAdapterGrid);
        clickList();
    }

    private void showRecyclerCard(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        TokohAdapterCard tokohAdapterCard = new TokohAdapterCard(this);
        tokohAdapterCard.setListTokoh(list);
        rv.setAdapter(tokohAdapterCard);
        clickList();
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    private void showSelectedTokoh(Tokoh tokoh){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", tokoh.getName());
            intent.putExtra("remarks", tokoh.getRemarks());
            intent.putExtra("photo", tokoh.getPhoto());
            intent.putExtra("desc", tokoh.getDesc());
        startActivity(intent);
//        Toast.makeText(this, "Kamu memilih "+tokoh.getDesc(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = null;
        switch (item.getItemId()){
            case R.id.menu_list:
                title = "Tampilan List";
                showRecyclerList();
                break;

            case R.id.menu_grid:
                title = "Tampilan Grid";
                showRecyclerGrid();
                break;

            case R.id.menu_cardview:
                title = "Tampilan Card";
                showRecyclerCard();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
