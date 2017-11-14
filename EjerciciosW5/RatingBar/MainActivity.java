package com.example.imt.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    /** Se muestran 5 estrellas, como un estandar de calificacion en el que en base al evento de
     * un boton se muestra un toast con la calificacion selecionada en las estrellas*/

    //Declaración de las variables a usar.//
    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.idratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                float ratingvalue = ratingBar.getRating();
                Toast.makeText(MainActivity.this,"Rating is " +ratingvalue,Toast.LENGTH_SHORT).show();
            }
        });

    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//
}
