package fr.iut_fbleau.dessin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mGrib;
    private Button mChoix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrib = findViewById(R.id.gribouillage);
        mChoix = findViewById(R.id.choix);

        mGrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gribActivityIntent = new Intent(MainActivity.this, GribouillageActivity.class);
                startActivity(gribActivityIntent);
            }
        });

        mChoix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent choixActivityIntent = new Intent(MainActivity.this, ChoixActivity.class);
                startActivity(choixActivityIntent);
            }
        });
    }
}