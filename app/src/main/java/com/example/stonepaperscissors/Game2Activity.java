package com.example.stonepaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Game2Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        TextView textView=findViewById(R.id.final_result);
        TextView textView1=findViewById(R.id.winner);
        Button button=findViewById(R.id.restart);
        String player1_name=getIntent().getStringExtra("player1name");
        String player2_name=getIntent().getStringExtra("player2name");
        String player1_score=getIntent().getStringExtra("player1score");
        String player2_score=getIntent().getStringExtra("player2score");
        if (Integer.parseInt(player1_score)>Integer.parseInt(player2_score)){
            textView1.setText(player1_name +" Won the Game!");
            textView.setText("1. "+player1_name+"'s Score : "+player1_score+"\n"+"2. "+player2_name+"'s Score : "+player2_score);
        }
        else if (Integer.parseInt(player1_score)<Integer.parseInt(player2_score)){
            textView1.setText(player2_name +" Won the Game!");
            textView.setText("1. "+player2_name+"'s Score : "+player2_score+"\n"+"2. "+player1_name+"'s Score : "+player1_score);
        }
        else if (Integer.parseInt(player1_score)==Integer.parseInt(player2_score)){
            textView1.setText("Draw!");
            textView.setText("1. "+player1_name+"'s Score : "+player1_score+"\n"+"2. "+player2_name+"'s Score : "+player2_score);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Game2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}