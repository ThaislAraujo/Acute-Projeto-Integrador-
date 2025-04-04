package com.example.appdeongs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class mainmenu extends AppCompatActivity implements View.OnClickListener {
   ImageButton imagepefil,imageView2, imageView3, imageView4,imageView5,imageView6,imageView7;



   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_mainmenu);
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainmenu), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           return insets;
       });

       imagepefil = (ImageButton) findViewById(R.id.imagepefil);
       imageView2 = (ImageButton) findViewById(R.id.imageView2);
       imageView3 = (ImageButton) findViewById(R.id.imageView3);
       imageView4 = (ImageButton) findViewById(R.id.imageView4);
       imageView5 = (ImageButton) findViewById(R.id.imageVie5);
       imageView6 = (ImageButton) findViewById(R.id.imageView6);
imageView7 = (ImageButton) findViewById(R.id.imageView7);


       imagepefil.setOnClickListener(this);
       imageView2.setOnClickListener(this);
       imageView3.setOnClickListener(this);
       imageView4.setOnClickListener(this);
       imageView5.setOnClickListener(this);
       imageView6.setOnClickListener(this);
       imageView7.setOnClickListener(this);


   }




   @Override
   public void onClick(View v) {
       if (v.getId()==R.id.imagepefil) {
           // ir para a tela de perfil
(activity_perfil)
           Intent perfil = new Intent(this, perfil.class);
           startActivity(perfil);
       }
       if (v.getId()==R.id.imageView2) {
           // ir para a tela de abrigo
           //Intent Mainabrigo = new Intent(this, Mainabrigo.class);
           //startActivity(Mainabrigo);
       }
if (v.getId()==R.id.imageView3) {
           // ir para a tela de denuncia
           //Intent Maindenucia = new Intent(this, Maindenucia.class);
           //startActivity(Maindenucia);
       }


if (v.getId()==R.id.bimageView4) {
           // ir para a tela de noticias 
           //Intent mainnews = new Intent(this, mainnews.class);
           //startActivity(mainnews);
       }
       if (v.getId()==R.id.imageView5) {
           // ir para a tela de vaga
           //Intent vagadeemprego = new Intent(this, vagadeemprego.class);
           //startActivity(vagadeemprego);




       if (v.getId()==R.id.imageView6) {
           // ir para a tela de projeto 
           //Intent projeto_social = new Intent(this, projeto_social.class);
           //startActivity(projeto_social);






       if (v.getId()==R.id.imageView7) {
           // ir para a tela de emergência 
           //Intent emgrecia = new Intent(this, emgrecia.class);
           //startActivity(emgrecia):

       }
   }
}
