package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,reset;
TextView tv1;
int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        reset = findViewById(R.id.reset);

        tv1 = findViewById(R.id.tv1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_1.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_1.setText("O");
                    }
                    else if(turn==1){
                        turn=0;
                        btn_1.setText("X");
                    }
                }
                endgame();
            }
        });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_2.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_2.setText("O");

                    }
                    else if(turn==1){
                        turn=0;
                        btn_2.setText("X");

                    }
                }
                endgame();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_3.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_3.setText("O");

                    }
                    else if(turn==1){
                        turn=0;
                        btn_3.setText("X");

                    }
                }
                endgame();
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_4.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_4.setText("O");

                    }
                    else if(turn==1){
                        turn=0;
                        btn_4.setText("X");

                    }
                }
                endgame();
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_5.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_5.setText("O");
                    }
                    else if(turn==1){
                        turn=0;
                        btn_5.setText("X");
                    }
                }
                endgame();
            }
        });


        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_6.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_6.setText("O");
                    }
                    else if(turn==1){
                        turn=0;
                        btn_6.setText("X");
                    }
                }
                endgame();
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_7.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_7.setText("O");
                    }
                    else if(turn==1){
                        turn=0;
                        btn_7.setText("X");
                    }
                }
                endgame();
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_8.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_8.setText("O");

                    }
                    else if(turn==1){
                        turn=0;
                        btn_8.setText("X");

                    }
                }
                endgame();
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_9.getText().toString().equals("")){
                    if(turn==0){
                        turn=1;
                        btn_9.setText("O");
                    }
                    else if(turn==1){
                        turn=0;
                        btn_9.setText("X");
                    }
                }
                endgame();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_1.setText("");
                btn_2.setText("");
                btn_3.setText("");
                btn_4.setText("");
                btn_5.setText("");
                btn_6.setText("");
                btn_9.setText("");
                btn_7.setText("");
                btn_8.setText("");
                tv1.setText("");
            }
        });

    }

    public void endgame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = btn_1.getText().toString();
        b = btn_2.getText().toString();
        c = btn_3.getText().toString();
        d = btn_4.getText().toString();
        e = btn_5.getText().toString();
        f = btn_6.getText().toString();
        g = btn_7.getText().toString();
        h = btn_8.getText().toString();
        i = btn_9.getText().toString();

        if (a.equalsIgnoreCase("X") && b.equalsIgnoreCase("X") && c.equalsIgnoreCase("X")) {
            tv1.setText("X WINS ");
        }

        if (a.equalsIgnoreCase("O") && b.equalsIgnoreCase("O") && c.equalsIgnoreCase("O")) {
            tv1.setText("O WINS ");
        }

        if (d.equalsIgnoreCase("X") && e.equalsIgnoreCase("X") && f.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }

        if (d.equalsIgnoreCase("O") && e.equalsIgnoreCase("O") && f.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }

        if (g.equalsIgnoreCase("X") && h.equalsIgnoreCase("X") && i.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }


        if (g.equalsIgnoreCase("O") && h.equalsIgnoreCase("O") && i.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }


        if (a.equalsIgnoreCase("X") && d.equalsIgnoreCase("X") && g.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }


        if (a.equalsIgnoreCase("O") && d.equalsIgnoreCase("O") && g.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }


        if (b.equalsIgnoreCase("X") && e.equalsIgnoreCase("X") && h.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }


        if (b.equalsIgnoreCase(" O") && e.equalsIgnoreCase("O") && h.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }


        if (c.equalsIgnoreCase("X") && f.equalsIgnoreCase("X") && i.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }


        if (c.equalsIgnoreCase("O") && f.equalsIgnoreCase("O") && i.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }


        if (a.equalsIgnoreCase("X") && e.equalsIgnoreCase("X") && i.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }

        if (a.equalsIgnoreCase("O") && e.equalsIgnoreCase("O") && i.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");
        }

        if (c.equalsIgnoreCase("X") && e.equalsIgnoreCase("X") && g.equalsIgnoreCase("X")) {
            tv1.setText("X WINS");
        }


        if (c.equalsIgnoreCase("O") && e.equalsIgnoreCase("O") && g.equalsIgnoreCase("O")) {
            tv1.setText("O WINS");

        }
    }
}
