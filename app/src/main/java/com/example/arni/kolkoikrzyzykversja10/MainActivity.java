package com.example.arni.kolkoikrzyzykversja10;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends Activity {


    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    private int move;
    private int countRow = 0;
    private int countCol = 0;
    private int movesCount = 0;
    private String[][] checkingWinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.text_view_1);
        textView2 = (TextView) findViewById(R.id.text_view_2);
        textView3 = (TextView) findViewById(R.id.text_view_3);
        textView4 = (TextView) findViewById(R.id.text_view_4);
        textView5 = (TextView) findViewById(R.id.text_view_5);
        textView6 = (TextView) findViewById(R.id.text_view_6);
        textView7 = (TextView) findViewById(R.id.text_view_7);
        textView8 = (TextView) findViewById(R.id.text_view_8);
        textView9 = (TextView) findViewById(R.id.text_view_9);


        checkingWinner = new String[][]{{textView1.getText().toString(), textView4.getText().toString(), textView7.getText().toString()},
                {textView2.getText().toString(), textView5.getText().toString(), textView8.getText().toString()},
                {textView3.getText().toString(), textView6.getText().toString(), textView9.getText().toString()}};

        move = 1;


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView1.setText("X");
                        movesCount++;
                        checkingWinner[0][0] = textView1.getText().toString();

                    } else if (move == 2) {
                        move = 1;
                        textView1.setText("O");
                        movesCount++;
                        checkingWinner[0][0] = textView1.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });


        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView2.setText("X");
                        movesCount++;
                        checkingWinner[1][0] = textView2.getText().toString();

                    } else if (move == 2) {
                        move = 1;
                        textView2.setText("O");
                        movesCount++;
                        checkingWinner[1][0] = textView2.getText().toString();

                    }

                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView3.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView3.setText("X");
                        movesCount++;
                        checkingWinner[2][0] = textView3.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView3.setText("O");
                        movesCount++;
                        checkingWinner[2][0] = textView3.getText().toString();
                    }

                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView4.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView4.setText("X");
                        movesCount++;
                        checkingWinner[0][1] = textView4.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView4.setText("O");
                        movesCount++;
                        checkingWinner[0][1] = textView4.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView5.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView5.setText("X");
                        movesCount++;
                        checkingWinner[1][1] = textView5.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView5.setText("O");
                        movesCount++;
                        checkingWinner[1][1] = textView5.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView6.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView6.setText("X");
                        movesCount++;
                        checkingWinner[2][1] = textView6.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView6.setText("O");
                        movesCount++;
                        checkingWinner[2][1] = textView6.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView7.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView7.setText("X");
                        movesCount++;
                        checkingWinner[0][2] = textView7.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView7.setText("O");
                        movesCount++;
                        checkingWinner[0][2] = textView7.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView8.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView8.setText("X");
                        movesCount++;
                        checkingWinner[1][2] = textView8.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView8.setText("O");
                        movesCount++;
                        checkingWinner[1][2] = textView8.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView9.getText().toString().equals("")) {
                    if (move == 1) {
                        move = 2;
                        textView9.setText("X");
                        movesCount++;
                        checkingWinner[2][2] = textView9.getText().toString();
                    } else if (move == 2) {
                        move = 1;
                        textView9.setText("O");
                        movesCount++;
                        checkingWinner[2][2] = textView9.getText().toString();
                    }
                }

                if (movesCount >= 5) {
                    finishTheGame();
                }
            }
        });
    }


    private void finishTheGame() {
        boolean finishedGame = false;

        for (int i = 0; i < checkingWinner.length; i++) {
            for (int j = 0; j < checkingWinner[i].length; j++) {
                if (checkingWinner[i][j].equals("X")) {
                    countRow++;
                }
                if (checkingWinner[i][j].equals("O")) {
                    countRow--;
                }
                if (checkingWinner[j][i].equals("X")) {
                    countCol++;
                }
                if (checkingWinner[j][i].equals("O")) {
                    countCol--;
                }
            }
            if ((checkingWinner[0][0].equals("X") && checkingWinner[1][1].equals("X") && checkingWinner[2][2].equals("X")) ||
                    (checkingWinner[0][0].equals("O") && checkingWinner[1][1].equals("O") && checkingWinner[2][2].equals("O")) ||
                    (checkingWinner[2][0].equals("X") && checkingWinner[1][1].equals("X") && checkingWinner[0][2].equals("X")) ||
                    (checkingWinner[2][0].equals("O") && checkingWinner[1][1].equals("O") && checkingWinner[2][2].equals("O"))) {
                finishedGame = true;

            }
            if (countRow == 3 || countRow == -3 || countCol == 3 || countCol == -3) {
                finishedGame = true;
            }
            countRow = 0;
            countCol = 0;
        }

        if (finishedGame) {
            Toast.makeText(this, "We have a winner :)", Toast.LENGTH_SHORT).show();
            textView1.setEnabled(false);
            textView2.setEnabled(false);
            textView3.setEnabled(false);
            textView4.setEnabled(false);
            textView5.setEnabled(false);
            textView6.setEnabled(false);
            textView7.setEnabled(false);
            textView8.setEnabled(false);
            textView9.setEnabled(false);

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Do you want to play again?");
            dialog.setCancelable(false);
            dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    finish();
                    startActivity(intent);
                }
            });
            dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });


            dialog.show();

            ParticleSystem ps = new ParticleSystem(this, 100, R.drawable.green_star, 1100);
            ps.setScaleRange(0.7f, 1.3f);
            ps.setSpeedRange(0.1f, 0.25f);
            ps.setRotationSpeedRange(90, 180);
            ps.setFadeOut(200, new AccelerateInterpolator());
            ps.emit(findViewById(R.id.text_view_5), 8);

            ParticleSystem ps2 = new ParticleSystem(this, 100, R.drawable.red_star, 1100);
            ps2.setScaleRange(0.7f, 1.3f);
            ps2.setSpeedRange(0.1f, 0.25f);
            ps2.setRotationSpeedRange(90, 180);
            ps2.setFadeOut(200, new AccelerateInterpolator());
            ps2.emit(findViewById(R.id.text_view_5), 8);
        }
    }
}

