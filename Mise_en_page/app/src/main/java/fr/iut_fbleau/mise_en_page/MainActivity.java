package fr.iut_fbleau.mise_en_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mChat;
    private Button mCroix;
    private Button mPave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChat = findViewById(R.id.chat);
        mCroix = findViewById(R.id.croix);
        mPave = findViewById(R.id.pave);

        mChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatActivityIntent = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(chatActivityIntent);
            }
        });

        mCroix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent croixActivityIntent = new Intent(MainActivity.this, CroixActivity.class);
                startActivity(croixActivityIntent);
            }
        });

        mPave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paveActivityIntent = new Intent(MainActivity.this, PaveActivity.class);
                startActivity(paveActivityIntent);
            }
        });
    }
}