package fr.iut_fbleau.dessin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GribouillageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Gribouillage(this));
    }

}