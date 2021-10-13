package com.ciencias.jdados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button j,r;
    TextView uno,dos,tres,cuatro,cinco,seis,cara;
    int dado,caja=1;
    int cont1,cont2,cont3,cont4,cont5,cont6=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno=(TextView) findViewById(R.id.c1);
        dos=(TextView) findViewById(R.id.c2);
        tres=(TextView) findViewById(R.id.c3);
        cuatro=(TextView) findViewById(R.id.c4);
        cinco=(TextView) findViewById(R.id.c5);
        seis=(TextView) findViewById(R.id.c6);
        cara=(TextView) findViewById(R.id.veces);

        j= (Button) findViewById(R.id.jugar);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=1; i<=1;){
                    if(caja<=99){
                        dado = (int) (Math.random() * 6) + 1;

                        if(dado==1){
                            cont1++;
                            uno.setText("Cara 1: "+cont1);
                        }
                        else if(dado==2){
                            cont2++;
                            dos.setText("Cara 2: " +cont2);
                        }
                        else if(dado==3){
                            cont3++;
                            tres.setText("Cara 3: " +cont3);
                        }
                        else if(dado==4){
                            cont4++;
                            cuatro.setText("Cara 4: " +cont4);
                        }
                        else if(dado==5){
                            cont5++;
                            cinco.setText("Cara 5: " +cont5);
                        }
                        else if(dado==6){
                            cont6++;
                            seis.setText("Cara 6: " +cont6);
                        }
                        if(cont1>cont2 & cont1>cont3 & cont1>cont4 & cont1>cont5 & cont1>cont6){
                            cara.setText("Cara que cayo mas veces: " + 1);
                        }else if(cont2>cont1 & cont2>cont3 & cont2>cont4 & cont2>cont5 & cont2>cont6){
                            cara.setText("Cara que cayo mas veces: " + 2);
                        }else if(cont3>cont1 & cont3>cont2 & cont3>cont4 & cont3>cont5 & cont3>cont6){
                            cara.setText("Cara que cayo mas veces: " + 3);
                        }else if(cont4>cont1 & cont4>cont2 & cont4>cont3 & cont4>cont5 & cont4>cont6){
                            cara.setText("Cara que cayo mas veces: " + 4);
                        }else if(cont5>cont1 & cont5>cont2 & cont5>cont3 & cont5>cont4 & cont5>cont6){
                            cara.setText("Cara que cayo mas veces: " + 5);
                        }else if(cont6>cont1 & cont6>cont2 & cont6>cont3 & cont6>cont4 & cont6>cont5){
                            cara.setText("Cara que cayo mas veces: " + 6);
                        }

                        //cara.setText("Cara que cayo mas veces: "+caja);
                        caja++;
                        i++;
                    }else{
                        Toast.makeText(getApplicationContext(), "Solo puedes Jugar 100 veces", Toast.LENGTH_SHORT).show();
                        break;
                    }//break;
                }

            }
        });

        r= (Button) findViewById(R.id.button4);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=0;
                caja=1;
                uno.setText("Cara 1: " + x);
                dos.setText("Cara 2: " + x);
                tres.setText("Cara 3: " + x);
                cuatro.setText("Cara 4: " + x);
                cinco.setText("Cara 5: " + x);
                seis.setText("Cara 6: " + x);
                cara.setText("Cara que cayo mas veces: "+x);
            }
        });
    }


}