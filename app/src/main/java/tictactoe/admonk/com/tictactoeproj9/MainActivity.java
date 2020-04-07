package tictactoe.admonk.com.tictactoeproj9;

import android.support.v7.app.AppCompatActivity;


//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import tictactoe.admonk.com.tictactoeproj9.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b[][] = new Button[9][9];//------------------------------------
    int i;
    int j;
    int k, ci, cj, bi, bj, p1i, p1j, p2i, p2j;  //-------------------------------------
    Button bReset;
    Boolean PLAYER_X;

    TextView tvinfo;
    int c_blk;  //////-------------------------------------------
    int TURN_COUNT = 0;
    int[][][] boardStatus = new int[9][3][3];

    int sboard[][] = new int[3][3];


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Intent j=getIntent();
        String name=j.getStringExtra("NAME");
        String nam=j.getStringExtra("NAME2");
        Toast.makeText(MainActivity.this,"Hello"+name, Toast.LENGTH_SHORT).show();*/


        // initializeBoard();
        // resetBoard();
        b[0][0] = (Button) findViewById(R.id.b00);
        b[0][1] = (Button) findViewById(R.id.b01);
        b[0][2] = (Button) findViewById(R.id.b02);

        b[1][0] = (Button) findViewById(R.id.b10);
        b[1][1] = (Button) findViewById(R.id.b11);
        b[1][2] = (Button) findViewById(R.id.b12);

        b[2][0] = (Button) findViewById(R.id.b20);
        b[2][1] = (Button) findViewById(R.id.b21);
        b[2][2] = (Button) findViewById(R.id.b22);
//block 1
        b[0][3] = (Button) findViewById(R.id.b03);
        b[0][4] = (Button) findViewById(R.id.b04);
        b[0][5] = (Button) findViewById(R.id.b05);

        b[1][3] = (Button) findViewById(R.id.b13);
        b[1][4] = (Button) findViewById(R.id.b14);
        b[1][5] = (Button) findViewById(R.id.b15);

        b[2][3] = (Button) findViewById(R.id.b23);
        b[2][4] = (Button) findViewById(R.id.b24);
        b[2][5] = (Button) findViewById(R.id.b25);

        //block 2

        b[0][6] = (Button) findViewById(R.id.b06);
        b[0][7] = (Button) findViewById(R.id.b07);
        b[0][8] = (Button) findViewById(R.id.b08);

        b[1][6] = (Button) findViewById(R.id.b16);
        b[1][7] = (Button) findViewById(R.id.b17);
        b[1][8] = (Button) findViewById(R.id.b18);

        b[2][6] = (Button) findViewById(R.id.b26);
        b[2][7] = (Button) findViewById(R.id.b27);
        b[2][8] = (Button) findViewById(R.id.b28);

        //block 3

        b[3][0] = (Button) findViewById(R.id.b30);
        b[3][1] = (Button) findViewById(R.id.b31);
        b[3][2] = (Button) findViewById(R.id.b32);

        b[4][0] = (Button) findViewById(R.id.b40);
        b[4][1] = (Button) findViewById(R.id.b41);
        b[4][2] = (Button) findViewById(R.id.b42);

        b[5][0] = (Button) findViewById(R.id.b50);
        b[5][1] = (Button) findViewById(R.id.b51);
        b[5][2] = (Button) findViewById(R.id.b52);

        //block 4

        b[3][3] = (Button) findViewById(R.id.b33);
        b[3][4] = (Button) findViewById(R.id.b34);
        b[3][5] = (Button) findViewById(R.id.b35);

        b[4][3] = (Button) findViewById(R.id.b43);
        b[4][4] = (Button) findViewById(R.id.b44);
        b[4][5] = (Button) findViewById(R.id.b45);

        b[5][3] = (Button) findViewById(R.id.b53);
        b[5][4] = (Button) findViewById(R.id.b54);
        b[5][5] = (Button) findViewById(R.id.b55);

        // block 5

        b[3][6] = (Button) findViewById(R.id.b36);
        b[3][7] = (Button) findViewById(R.id.b37);
        b[3][8] = (Button) findViewById(R.id.b38);

        b[4][6] = (Button) findViewById(R.id.b46);
        b[4][7] = (Button) findViewById(R.id.b47);
        b[4][8] = (Button) findViewById(R.id.b48);

        b[5][6] = (Button) findViewById(R.id.b56);
        b[5][7] = (Button) findViewById(R.id.b57);
        b[5][8] = (Button) findViewById(R.id.b58);

        //block 6

        b[6][0] = (Button) findViewById(R.id.b60);
        b[6][1] = (Button) findViewById(R.id.b61);
        b[6][2] = (Button) findViewById(R.id.b62);

        b[7][0] = (Button) findViewById(R.id.b70);
        b[7][1] = (Button) findViewById(R.id.b71);
        b[7][2] = (Button) findViewById(R.id.b72);

        b[8][0] = (Button) findViewById(R.id.b80);
        b[8][1] = (Button) findViewById(R.id.b81);
        b[8][2] = (Button) findViewById(R.id.b82);

        //block 7

        b[6][3] = (Button) findViewById(R.id.b63);
        b[6][4] = (Button) findViewById(R.id.b64);
        b[6][5] = (Button) findViewById(R.id.b65);

        b[7][3] = (Button) findViewById(R.id.b73);
        b[7][4] = (Button) findViewById(R.id.b74);
        b[7][5] = (Button) findViewById(R.id.b75);

        b[8][3] = (Button) findViewById(R.id.b83);
        b[8][4] = (Button) findViewById(R.id.b84);
        b[8][5] = (Button) findViewById(R.id.b85);

        //block 8

        b[6][6] = (Button) findViewById(R.id.b66);
        b[6][7] = (Button) findViewById(R.id.b67);
        b[6][8] = (Button) findViewById(R.id.b68);

        b[7][6] = (Button) findViewById(R.id.b76);
        b[7][7] = (Button) findViewById(R.id.b77);
        b[7][8] = (Button) findViewById(R.id.b78);

        b[8][6] = (Button) findViewById(R.id.b86);
        b[8][7] = (Button) findViewById(R.id.b87);
        b[8][8] = (Button) findViewById(R.id.b88);

        bReset = (Button) findViewById(R.id.bReset);
        tvinfo = (TextView) findViewById(R.id.tvInfo);
        //--------------------------
        for (i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j)
                b[i][j].setOnClickListener(this);
        }
        //-------------------------------------------------------

        bReset.setOnClickListener(this);
        resetBoard();
        // client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initializeBoard() {
        for (k = 0; k < 9; ++k) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    boardStatus[k][i][j] = -1;//-----------------------------------------
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sboard[i][j] = -1;
            }
        }
    }

    private void setInfo(String text) {
        tvinfo.setText(text);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        //int bii;
        //int bj;
        switch (id) {
            case R.id.b00:
                ci = 0;
                cj = 0;
                bi = 0;
                bj = 0;
                c_blk = 0;
                break;
            case R.id.b01:
                ci = 0;
                cj = 1;
                c_blk = 0;
                bi = 0;
                bj = 1;

                break;

            case R.id.b02:
                ci = 0;
                cj = 2;
                bi = 0;
                bj = 2;
                c_blk = 0;
                break;

            case R.id.b10:
                ci = 1;
                cj = 0;
                c_blk = 0;
                bi = 1;
                bj = 0;

                break;

            case R.id.b11:
                ci = 1;
                cj = 1;
                c_blk = 0;
                bi = 1;
                bj = 1;
                break;

            case R.id.b12:
                ci = 1;
                cj = 2;
                c_blk = 0;
                bi = 1;
                bj = 2;
                break;

            case R.id.b20:
                ci = 2;
                cj = 0;
                c_blk = 0;
                bi = 2;
                bj = 0;
                break;

            case R.id.b21:
                ci = 2;
                cj = 1;
                c_blk = 0;
                bi = 2;
                bj = 1;
                break;

            case R.id.b22:
                ci = 2;
                cj = 2;
                c_blk = 0;
                bi = 2;
                bj = 2;
                break;
            //---------------------------------------------------------------------block 1
            case R.id.b03:
                ci = 0;
                cj = 3;
                bi = 0;
                bj = 0;
                c_blk = 1;
                break;

            case R.id.b04:
                ci = 0;
                cj = 4;
                bi = 0;
                bj = 1;
                c_blk = 1;
                break;

            case R.id.b05:
                ci = 0;
                cj = 5;
                bi = 0;
                bj = 2;
                c_blk = 1;
                break;

            case R.id.b13:
                ci = 1;
                cj = 3;
                bi = 1;
                bj = 0;
                c_blk = 1;

                break;

            case R.id.b14:
                ci = 1;
                cj = 4;
                bi = 1;
                bj = 1;
                c_blk = 1;

                break;

            case R.id.b15:
                ci = 1;
                cj = 5;
                bi = 1;
                bj = 2;
                c_blk = 1;

                break;

            case R.id.b23:
                ci = 2;
                cj = 3;
                bi = 2;
                bj = 0;
                c_blk = 1;

                break;

            case R.id.b24:
                ci = 2;
                cj = 4;
                bi = 2;
                bj = 1;
                c_blk = 1;

                break;

            case R.id.b25:
                ci = 2;
                cj = 5;
                bi = 2;
                bj = 2;
                c_blk = 1;

                break;
            ///////  block 2

            case R.id.b06:
                ci = 0;
                cj = 6;
                bi = 0;
                bj = 0;
                c_blk = 2;
                break;
            case R.id.b07:
                ci = 0;
                cj = 7;
                c_blk = 2;
                bi = 0;
                bj = 1;

                break;

            case R.id.b08:
                ci = 0;
                cj = 8;
                bi = 0;
                bj = 2;
                c_blk = 2;
                break;

            case R.id.b16:
                ci = 1;
                cj = 6;
                c_blk = 2;
                bi = 1;
                bj = 0;

                break;

            case R.id.b17:
                ci = 1;
                cj = 7;
                c_blk = 2;
                bi = 1;
                bj = 1;
                break;

            case R.id.b18:
                ci = 1;
                cj = 8;
                c_blk = 2;
                bi = 1;
                bj = 2;
                break;

            case R.id.b26:
                ci = 2;
                cj = 6;
                c_blk = 2;
                bi = 2;
                bj = 0;
                break;

            case R.id.b27:
                ci = 2;
                cj = 7;
                c_blk = 2;
                bi = 2;
                bj = 1;
                break;

            case R.id.b28:
                ci = 2;
                cj = 8;
                c_blk = 2;
                bi = 2;
                bj = 2;
                break;

            //--------block 3

            case R.id.b30:
                ci = 3;
                cj = 0;
                bi = 0;
                bj = 0;
                c_blk = 3;
                break;
            case R.id.b31:
                ci = 3;
                cj = 1;
                c_blk = 3;
                bi = 0;
                bj = 1;

                break;

            case R.id.b32:
                ci = 3;
                cj = 2;
                bi = 0;
                bj = 2;
                c_blk = 3;
                break;

            case R.id.b40:
                ci = 4;
                cj = 0;
                c_blk = 3;
                bi = 1;
                bj = 0;

                break;

            case R.id.b41:
                ci = 4;
                cj = 1;
                c_blk = 3;
                bi = 1;
                bj = 1;
                break;

            case R.id.b42:
                ci = 4;
                cj = 2;
                c_blk = 3;
                bi = 1;
                bj = 2;
                break;

            case R.id.b50:
                ci = 5;
                cj = 0;
                c_blk = 3;
                bi = 2;
                bj = 0;
                break;

            case R.id.b51:
                ci = 5;
                cj = 1;
                c_blk = 3;
                bi = 2;
                bj = 1;
                break;

            case R.id.b52:
                ci = 5;
                cj = 2;
                c_blk = 3;
                bi = 2;
                bj = 2;
                break;
            //---------------------------------------------------------------------block 4
            case R.id.b33:
                ci = 3;
                cj = 3;
                bi = 0;
                bj = 0;
                c_blk = 4;
                break;

            case R.id.b34:
                ci = 3;
                cj = 4;
                bi = 0;
                bj = 1;
                c_blk = 4;
                break;

            case R.id.b35:
                ci = 3;
                cj = 5;
                bi = 0;
                bj = 2;
                c_blk = 4;
                break;

            case R.id.b43:
                ci = 4;
                cj = 3;
                bi = 1;
                bj = 0;
                c_blk = 4;

                break;

            case R.id.b44:
                ci = 4;
                cj = 4;
                bi = 1;
                bj = 1;
                c_blk = 4;

                break;

            case R.id.b45:
                ci = 4;
                cj = 5;
                bi = 1;
                bj = 2;
                c_blk = 4;

                break;

            case R.id.b53:
                ci = 5;
                cj = 3;
                bi = 2;
                bj = 0;
                c_blk = 4;

                break;

            case R.id.b54:
                ci = 5;
                cj = 4;
                bi = 2;
                bj = 1;
                c_blk = 4;

                break;

            case R.id.b55:
                ci = 5;
                cj = 5;
                bi = 2;
                bj = 2;
                c_blk = 4;

                break;
            ///////  block 5

            case R.id.b36:
                ci = 3;
                cj = 6;
                bi = 0;
                bj = 0;
                c_blk = 5;
                break;
            case R.id.b37:
                ci = 3;
                cj = 7;
                c_blk = 5;
                bi = 0;
                bj = 1;

                break;

            case R.id.b38:
                ci = 3;
                cj = 8;
                bi = 0;
                bj = 2;
                c_blk = 5;
                break;

            case R.id.b46:
                ci = 4;
                cj = 6;
                c_blk = 5;
                bi = 1;
                bj = 0;

                break;

            case R.id.b47:
                ci = 4;
                cj = 7;
                c_blk = 5;
                bi = 1;
                bj = 1;
                break;

            case R.id.b48:
                ci = 4;
                cj = 8;
                c_blk = 5;
                bi = 1;
                bj = 2;
                break;

            case R.id.b56:
                ci = 5;
                cj = 6;
                c_blk = 5;
                bi = 2;
                bj = 0;
                break;

            case R.id.b57:
                ci = 5;
                cj = 7;
                c_blk = 5;
                bi = 2;
                bj = 1;
                break;

            case R.id.b58:
                ci = 5;
                cj = 8;
                c_blk = 5;
                bi = 2;
                bj = 2;
                break;

            //block   6

            case R.id.b60:
                ci = 6;
                cj = 0;
                bi = 0;
                bj = 0;
                c_blk = 6;
                break;
            case R.id.b61:
                ci = 6;
                cj = 1;
                c_blk = 6;
                bi = 0;
                bj = 1;

                break;

            case R.id.b62:
                ci = 6;
                cj = 2;
                bi = 0;
                bj = 2;
                c_blk = 6;
                break;

            case R.id.b70:
                ci = 7;
                cj = 0;
                c_blk = 6;
                bi = 1;
                bj = 0;

                break;

            case R.id.b71:
                ci = 7;
                cj = 1;
                c_blk = 6;
                bi = 1;
                bj = 1;
                break;

            case R.id.b72:
                ci = 7;
                cj = 2;
                c_blk = 6;
                bi = 1;
                bj = 2;
                break;

            case R.id.b80:
                ci = 8;
                cj = 0;
                c_blk = 6;
                bi = 2;
                bj = 0;
                break;

            case R.id.b81:
                ci = 8;
                cj = 1;
                c_blk = 6;
                bi = 2;
                bj = 1;
                break;

            case R.id.b82:
                ci = 8;
                cj = 2;
                c_blk = 6;
                bi = 2;
                bj = 2;
                break;
            //---------------------------------------------------------------------block 7
            case R.id.b63:
                ci = 6;
                cj = 3;
                bi = 0;
                bj = 0;
                c_blk = 7;
                break;

            case R.id.b64:
                ci = 6;
                cj = 4;
                bi = 0;
                bj = 1;
                c_blk = 7;
                break;

            case R.id.b65:
                ci = 6;
                cj = 5;
                bi = 0;
                bj = 2;
                c_blk = 7;
                break;

            case R.id.b73:
                ci = 7;
                cj = 3;
                bi = 1;
                bj = 0;
                c_blk = 7;

                break;

            case R.id.b74:
                ci = 7;
                cj = 4;
                bi = 1;
                bj = 1;
                c_blk = 7;

                break;

            case R.id.b75:
                ci = 7;
                cj = 5;
                bi = 1;
                bj = 2;
                c_blk = 7;

                break;

            case R.id.b83:
                ci = 8;
                cj = 3;
                bi = 2;
                bj = 0;
                c_blk = 7;

                break;

            case R.id.b84:
                ci = 8;
                cj = 4;
                bi = 2;
                bj = 1;
                c_blk = 7;

                break;

            case R.id.b85:
                ci = 8;
                cj = 5;
                bi = 2;
                bj = 2;
                c_blk = 1;

                break;
            ///////  block 8

            case R.id.b66:
                ci = 6;
                cj = 6;
                bi = 0;
                bj = 0;
                c_blk = 8;
                break;
            case R.id.b67:
                ci = 6;
                cj = 7;
                c_blk = 8;
                bi = 0;
                bj = 1;

                break;

            case R.id.b68:
                ci = 6;
                cj = 8;
                bi = 0;
                bj = 2;
                c_blk = 8;
                break;

            case R.id.b76:
                ci = 7;
                cj = 6;
                c_blk = 8;
                bi = 1;
                bj = 0;

                break;

            case R.id.b77:
                ci = 7;
                cj = 7;
                c_blk = 8;
                bi = 1;
                bj = 1;
                break;

            case R.id.b78:
                ci = 7;
                cj = 8;
                c_blk = 8;
                bi = 1;
                bj = 2;
                break;

            case R.id.b86:
                ci = 8;
                cj = 6;
                c_blk = 8;
                bi = 2;
                bj = 0;
                break;

            case R.id.b87:
                ci = 8;
                cj = 7;
                c_blk = 8;
                bi = 2;
                bj = 1;
                break;

            case R.id.b88:
                ci = 8;
                cj = 8;
                c_blk = 8;
                bi = 2;
                bj = 2;
                break;

            default:
                break;
        }
        //-------------------------function to set button
        if (PLAYER_X) {
            b[ci][cj].setText("X");
            boardStatus[c_blk][bi][bj] = 1;
            p1i = ci;
            p1j = cj;
        }
        else {
            b[ci][cj].setText("0");
            boardStatus[c_blk][bi][bj] = 0;
            p2i = ci;
            p2j = cj;
        }
        b[ci][cj].setEnabled(false);
        //-----------------------------set_button(ci, cj);

        if (id == R.id.bReset) {
            resetBoard();
        } else {
            TURN_COUNT++;
            PLAYER_X = !PLAYER_X;
            //if (TURN_COUNT == 81) {
            //  result("DRAW");
            //}
            checki();
            nextTurn(PLAYER_X);

        }
    }//------------------------------


    private void enable_all(boolean value) {
        for (i = 0; i < 9; ++i) {
            for (j = 0; j < 9; ++j)
                b[i][j].setEnabled(value);
        }
    }


    private void resetBoard() {
        for (i = 0; i < 9; ++i) {
            for (j = 0; j < 9; ++j) {
                b[i][j].setText("");
            }
        }
        TURN_COUNT = 0;
        initializeBoard();

        PLAYER_X = true;
        setInfo("Play Again");

        enable_all(true);


    }//-----------------------------

    void nextTurn(boolean player) {
        if (player) {
            int block_num = -1;
            if (p1i / 3 == 0)
                block_num = p1j / 3;
            else if (p1i / 3 == 1)
                block_num = 3 + (p1j / 3);
            else if (p1i / 3 == 2)
                block_num = 6 + (p1j / 3);


            if (sboard[block_num / 3][block_num % 3]==-1) {
                for (i = 0; i < 9; i++) {
                    if (i == block_num)
                        setBlock(block_num, true);
                    else
                        setBlock(i, false);
                }
            } else {
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        if (sboard[i][j] == -1) {
                            setBlock((3 * i + j), true);
                        }
                    }
                }
            }
        } else {
            int block_num = -1;
            if (p2i / 3 == 0)
                block_num = (p2j / 3);
            else if (p2i / 3 == 1)
                block_num = 3 + (p2j / 3);
            else if (p2i / 3 == 2)
                block_num = 6 + (p2j / 3);


            if (sboard[block_num / 3][block_num % 3] == -1) {
                for (i = 0; i < 9; i++) {
                    if (i == block_num)
                        setBlock(block_num, true);
                    else
                        setBlock(i, false);
                }
            } else {
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        if (sboard[i][j] == -1) {
                            setBlock((3 * i + j), true);
                        }
                    }
                }

            }
        }
    }

    void setBlock(int block_num, boolean value) {
        int row = (block_num / 3) * 3;
        int colm = (block_num % 3) * 3;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (boardStatus[block_num][i][j] == -1)
                    b[row + i][colm + j].setEnabled(value);
            }
        }
    }

    private void checki() {
        int l, m, win = -1;
        //horizontal row
        for (int i = 0; i < 3; i++)
            if (boardStatus[c_blk][i][0] == boardStatus[c_blk][i][1] && boardStatus[c_blk][i][0] == boardStatus[c_blk][i][2]) {
                if (boardStatus[c_blk][i][0] == 1) {
                    win = 1;
                    break;
                } else if (boardStatus[c_blk][i][1] == 0) {
                    win = 0;
                    break;
                }
            }
        //vertical col
        for (int i = 0; i < 3; i++)
            if (boardStatus[c_blk][0][i] == boardStatus[c_blk][1][i] && boardStatus[c_blk][2][i] == boardStatus[c_blk][0][i]) {
                if (boardStatus[c_blk][0][i] == 1) {
                    win = 1;
                    break;
                } else if (boardStatus[c_blk][1][i] == 0) {
                    win = 0;
                    break;
                }
            }
        //ld


        if (boardStatus[c_blk][0][0] == boardStatus[c_blk][1][1] && boardStatus[c_blk][0][0] == boardStatus[c_blk][2][2]) {
            if (boardStatus[c_blk][0][0] == 1) {
                win = 1;
            } else if (boardStatus[c_blk][1][1] == 0) {
                win = 0;

            }

        }
        //rd
        if (boardStatus[c_blk][0][2] == boardStatus[c_blk][1][1] && boardStatus[c_blk][0][2] == boardStatus[c_blk][2][0]) {
            if (boardStatus[c_blk][0][2] == 1) {
                win = 1;

            } else if (boardStatus[c_blk][1][1] == 0) {
                win = 0;

            }

        }
        int v = 0; //check draw
        if (win == -1) {
            for (l = 0; (l < 3 )&& (v == 0); l++) {
                for (m = 0; m < 3; m++) {
                    if (boardStatus[c_blk][l][m] == -1) {
                        v = 1;
                        break;
                    }

                }

            }
        }
        if (v == 0) {// update bs =2;
            sboard[c_blk / 3][c_blk % 3] = 2;
        }

        if (win == 1) {
            sboard[c_blk / 3][c_blk % 3] = 1;
            setBlock(c_blk, false);
            for (l = 0; l < 3; l++) {
                for (m = 0; m < 3; m++) {

                    if (boardStatus[c_blk][l][m] == -1) {

                        boardStatus[c_blk][l][m] = 3;
                        TURN_COUNT++;
                    }
                }
            }

            checkwinner();
        }

        if (win == 0) {
            sboard[c_blk / 3][c_blk % 3] = 0;
            setBlock(c_blk, false);
            for (l = 0; l < 3; l++) {
                for (m = 0; m < 3; m++) {
                    if (boardStatus[c_blk][l][m] == -1) {

                        boardStatus[c_blk][l][m] = 3;
                        TURN_COUNT++;
                    }
                }
            }

            checkwinner();
        }


        if (TURN_COUNT == 81)
            checkwinner();
    }


    private void result(String s) {
        setInfo(s);
        enable_all(false);

    }

    private void checkwinner() {
        for (i = 0; i < 3; i++)
            if (sboard[i][0] == sboard[i][1] && sboard[i][0] == sboard[i][2]) {
                if (sboard[i][0] == 1) {
                    result("PLAYER X WINS");
                    break;
                } else if (sboard[i][1] == 0) {
                    result("PLAYER Y WINS");
                    break;
                }
            }
        //vertical col
        for (i = 0; i < 3; i++)
            if (sboard[0][i] == sboard[1][i] && sboard[2][i] == sboard[0][i]) {
                if (boardStatus[c_blk][0][i] == 1) {
                    result("PLAYER X WINS");
                    break;
                } else if (sboard[1][i] == 0) {
                    result("PLAYER Y WINS");
                    break;
                }
            }
        //ld


        if (sboard[0][0] == sboard[1][1] && sboard[0][0] == sboard[2][2]) {
            if (sboard[0][0] == 1) {
                result("PLAYER X WINS");
            } else if (sboard[1][1] == 0) {

                result("PLAYER Y WINS");
            }

        }
        //rd
        if (sboard[0][2] == sboard[1][1] && sboard[0][2] == sboard[2][0]) {
            if (sboard[0][2] == 1) {

                result("PLAYER X WINS");
            } else if (sboard[1][1] == 0) {
                result("PLAYER Y WINS");

            }

        }

        if (TURN_COUNT == 81) {
            //overall draw
            result("DRAW");
        }


    }


}