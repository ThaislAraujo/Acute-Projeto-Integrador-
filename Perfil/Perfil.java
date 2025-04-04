package com.example.appdeongs2;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class perfil extends AppCompatActivity {
   private button linear_button;




   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_perfil);
       linear_button=findViewById(R.id.linear_button);
       linear_button.setOnClickListener(new View.OnClickListenereditor() {


           @Override
           public void onClick(View v) {


               Intent intent = new Intent();
               startActivity(linear_button);
           }


       }

