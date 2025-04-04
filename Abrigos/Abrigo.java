package com.example.appdeongs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.button.MaterialButton;


public class Mainabrigo extends AppCompatActivity {






   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_mainabrigo);








           MaterialButton buttVM = (MaterialButton) findViewById(R.id.buttVM);


           CardView exit = findViewById(R.id.buttVM);
           exit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
              Intent packageContext; mainabrigo.this,mainmenu.class;
                   startActivity(new Intent(packageContext: mainabrigo.this,mainmenu.class) );


               }


)};


           ;
       });
   }
}



