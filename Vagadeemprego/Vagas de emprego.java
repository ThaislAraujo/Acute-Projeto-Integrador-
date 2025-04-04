
package com.example.appdeongs2;

import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


      TextView carddetails;
       LinearLayout layoutcard;
       button buttoncard;



public class Mainvagadeemprego extends AppCompatActivity {



   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       View carddetails = findViewById(R.id.carddetails);
       View layoutcard = findViewById(R.id.layoutcard);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_mainvagadeemprego);
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           return insets;
       });
   }
}


