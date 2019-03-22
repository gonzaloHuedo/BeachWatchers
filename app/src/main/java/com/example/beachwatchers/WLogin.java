package com.example.beachwatchers;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class WLogin extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextInputEditText etxNombre;
    private TextInputEditText etxPassword;
    private static final String USER_NAME = "ordasraul@gmail.com";
    private static final String PASSWORD = "1234";
    private Drawable backgroundBN;
    private ImageView background;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlogin);


        progressBar = findViewById(R.id.progressBar);


        progressBar.setVisibility(View.GONE);
    }




    public void signIn(View view) {


            progressBar.setVisibility(View.VISIBLE);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBar.setVisibility(View.GONE);
                    startActivity(new Intent(WLogin.this, WMainActivity.class));
                }
            }, 3000);


                progressBar.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        startActivity(new Intent(WLogin.this, WMainActivity.class));
                    }
                }, 3000);

            }



    public void mostrarSnackBar(String mensaje){
        final RelativeLayout mrelativeLayout = (RelativeLayout) findViewById(R.id.layoutLogin);
        Snackbar snackbar = Snackbar
                .make(mrelativeLayout, mensaje, Snackbar.LENGTH_LONG);

        snackbar.show();
    }

    public Drawable convertToGrayscale(Drawable drawable) {
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        drawable.setColorFilter(filter);

        return drawable;
    }
}
