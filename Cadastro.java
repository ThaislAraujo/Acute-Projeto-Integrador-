package com.epackage com.example.appdeongs2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class Cadastre_se extends AppCompatActivity implements View.OnClickListener {
   Button signupbtn;
   EditText username, email, txtCADCpf, password, repassword;


   String username, email, txtCpf, password, repassword;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_cadastre);
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Cadastre_se), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           return insets;
       });


       signupbtn   = (Button)   findViewById(R.id.signupbtn);
       username    = (EditText) findViewById(R.id.username);
       email   = (EditText) findViewById(R.id.email);
       txtCADCpf     = (EditText) findViewById(R.id.txtCADCpf);
       password   = (EditText) findViewById(R.id.password);
       repassword  = (EditText) findViewById(R.id.repassword);
      
       btCADSalvar.setOnClickListener(this);
   }


   @Override
   public void onClick(View v) {
       Boolean erro = false;
       username   = username.getText().toString();
       email  = email.getText().toString();
       txtCpf    = txtCADCpf.getText().toString();
       password  = password.getText().toString();
       repassword = repassword.getText().toString();
      
       erro = VerificaDados();
       if (!erro){    // se erro == false
           //gravar os dados
           BancoController bd = new BancoController(getBaseContext());
           String resultado;




           resultado = bd.gravaUsuario(username, email, txtCpf, password);




           Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
       }
      
      
   }
   public boolean VerificaDados() {
       if (username.isEmpty()) {
           Toast.makeText(getApplicationContext(), "Atenção - O campo NOME deve ser preenchido!", Toast.LENGTH_LONG).show();
           return true;
       }
       if (email.isEmpty()) {
           Toast.makeText(getApplicationContext(), "Atenção - O campo E-MAIL deve ser preenchido!", Toast.LENGTH_LONG).show();
           return true;
       }
       if (txtCpf.isEmpty()) {
           Toast.makeText(getApplicationContext(), "Atenção - O campo CPF deve ser preenchido!", Toast.LENGTH_LONG).show();
           return true;
       }
       if (password.isEmpty()) {
           Toast.makeText(getApplicationContext(), "Atenção - O campo SENHA deve ser preenchido!", Toast.LENGTH_LONG).show();
           return true;
       }
       if (repassword.isEmpty()) {
           Toast.makeText(getApplicationContext(), "Atenção - O campo CONFIRMAÇÃO DE SENHA deve ser preenchido!", Toast.LENGTH_LONG).show();
           return true;
       }
       if (password.equals(repassword)){
           Toast.makeText(getApplicationContext(), "Atenção - O campos Senha e Confirma Senha não são iguais", Toast.LENGTH_LONG).show();
           return true;
       }
       return false;
   }
}


