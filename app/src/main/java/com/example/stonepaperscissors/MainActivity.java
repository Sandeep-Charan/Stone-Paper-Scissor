package com.example.stonepaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Play_button=findViewById(R.id.button);
        final EditText player1 = findViewById(R.id.playername1);
        final EditText player2 = findViewById(R.id.playername2);
        final EditText rounds = findViewById(R.id.round);
        Play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1.getText().toString().matches("") || player2.getText().toString().matches("") || rounds.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter the Required values", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, GameActivity.class);
                    intent.putExtra("player1", player1.getText().toString());
                    intent.putExtra("player2", player2.getText().toString());
                    intent.putExtra("rounds", rounds.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
