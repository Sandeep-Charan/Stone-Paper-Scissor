package com.example.stonepaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class GameActivity extends AppCompatActivity {
private TextView Player1score;
private TextView Player2score;
private TextView comment;
private TextView result;
private ImageView stone;
private ImageView paper;
private ImageView scissor;
String player1;
String player2;
private int stone_clicked=0;
private int paper_clicked=0;
private int scissor_clicked=0;
private int rounds=1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Player1score=findViewById(R.id.score1);
        Player2score=findViewById(R.id.score2);
        comment=findViewById(R.id.Comment);
        stone=findViewById(R.id.stone);
        paper=findViewById(R.id.paper);
        scissor=findViewById(R.id.scissor);
        player1=getIntent().getStringExtra("player1");
        player2=getIntent().getStringExtra("player2");
        result=findViewById(R.id.result);
        final String round=getIntent().getStringExtra("rounds");
        final int[] player1_score = {0};
        final int[] player2_score = {0};
        Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
        Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
        comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stone_clicked += 1;
                comment.setText("Round: " + 1 + "\n" + player2 + "'s Turn");
                if (paper_clicked==1){
                    player1_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player1 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (scissor_clicked==1){
                    player2_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player2 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (stone_clicked==1){
                    comment.setText("Round: " + rounds + "\n" + player2 + "'s Turn");
                    paper_clicked=0;
                    scissor_clicked=0;
                }
                else if(stone_clicked==2){
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    result.setText("Result: Draw");
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paper_clicked += 1;
                comment.setText("Round: " + rounds + "\n" + player2 + "'s Turn");
                if (stone_clicked==1){
                    player2_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player2 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (scissor_clicked==1){
                    player1_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player1 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (paper_clicked==1){
                    comment.setText("Round: " + rounds + "\n" + player2 + "'s Turn");
                    stone_clicked=0;
                    scissor_clicked=0;
                }
                else if(paper_clicked==2){
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    result.setText("Result: Draw");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scissor_clicked += 1;
                comment.setText("Round: " + rounds + "\n" + player2 + "'s Turn");
                if (paper_clicked==1){
                    player2_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player2 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (stone_clicked==1){
                    player1_score[0]+=1;
                    Player1score.setText(player1+"'s \nScore: "+ player1_score[0]);
                    Player2score.setText(player2+ "'s \nScore: "+ player2_score[0]);
                    result.setText("Result: "+ player1 + " Won "+"Round " +rounds);
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);

                        finish();
                    }
                }
                else if (scissor_clicked==1){
                    comment.setText("Round: " + rounds + "\n" + player2 + "'s Turn");
                    stone_clicked=0;
                    paper_clicked=0;
                }
                else if(scissor_clicked==2){
                    stone_clicked=0;
                    scissor_clicked=0;
                    paper_clicked=0;
                    rounds+=1;
                    result.setText("Result: Draw");
                    comment.setText("Round: " + rounds + "\n" + player1 + "'s Turn");
                    if (rounds==Integer.parseInt(round)+1){
                        Intent intent = new Intent(GameActivity.this,Game2Activity.class);
                        intent.putExtra("player1name",player1);
                        intent.putExtra("player2name",player2);
                        String int_score_1=String.valueOf(player1_score[0]);
                        String int_score_2=String.valueOf(player2_score[0]);
                        intent.putExtra("player1score",int_score_1);
                        intent.putExtra("player2score",int_score_2);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }
}
