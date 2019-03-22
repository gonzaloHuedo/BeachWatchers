package com.example.beachwatchers;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WMainActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipeRefresh;
    private TextView headerText;
    private ImageView backgroundHeader;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wmain);

        getSupportActionBar().setHomeAsUpIndicator(getDrawable(R.drawable.ic_dehaze_black_24dp));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        backgroundHeader = findViewById(R.id.backgroundHeader);
        setTitle(R.string.app_name);

        headerText = findViewById(R.id.headerText);

        swipeRefresh = findViewById(R.id.swipeRefresh);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mostrarSnackBar(getString(R.string.mess));
                swipeRefresh.setRefreshing(false);
            }
        });
    }

    public void mostrarSnackBar(String mensaje){
        final LinearLayout mrelativeLayout = (LinearLayout) findViewById(R.id.mainLayout);
        Snackbar snackbar = Snackbar
                .make(mrelativeLayout, mensaje, Snackbar.LENGTH_LONG);

        snackbar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.itemSettings) {
            mostrarSnackBar(getString(R.string.mess));

        } else {
            mostrarSnackBar(getString(R.string.mess));
        }

        return super.onOptionsItemSelected(item);
    }
}
