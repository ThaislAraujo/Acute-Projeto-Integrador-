package com.example.appdeongs2;

import static android.app.ProgressDialog.show;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;


public class Login extends AppCompatActivity implements View.OnClickListener {
   Button loginbtn, btLOGCadastre;
   EditText username, userpassword;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_login);
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginbtn), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           return insets;
       });


       loginbtn = (Button) findViewById(R.id.loginbtn);
       btLOGCadastre = (Button) findViewById(R.id.btLOGCadastre);
       username = (EditText) findViewById(R.id.username);
       userpassword = (EditText) findViewById(R.id.userpassword);


       btLOGCadastre.setOnClickListener(this);
       loginbtn.setOnClickListener(this);
   }




   @Override
   public void onClick(@NonNull View v) {
       if (v.getId()==R.id.loginbtn) {
           // carregar a tela do menu
           if (VerificaDados()) {
               Intent mainmenu = new Intent(this, Menu.class);
               startActivity(mainmenu);
           }
       }
       if (v.getId()==R.id.btLOGCadastre) {
           // carregar a tela do cadastre_se
           Intent telacadastre = new Intent(this, Cadastre_se.class);
           startActivity(telacadastre);
       }
   }

   public boolean VerificaDados(){
       String name = username.getText().toString();
       String Senha = userpassword.getText().toString();
       if (name.isEmpty()) {
           Toast.makeText(getApplicationContext(), "O campo name deve ser preenchido!",
                   Toast.LENGTH_LONG).show();
           return false;
       }
       if (Senha.isEmpty()) {
           Toast.makeText(getApplicationContext(), "O campo SENHA deve ser preenchido!",
                   Toast.LENGTH_LONG).show();
           return false;
       }
       database bd = new database (getBaseContext());


       Cursor dados = bd.ProcuraDadosLogin(name, Senha) ;


       if(dados.moveToFirst()){
           return true;
       }else{
           Toast.makeText(getApplicationContext(), "Usuário / senha não cadastrada!", Toast.LENGTH_LONG).show();
           return false;
       }

   }
} 


