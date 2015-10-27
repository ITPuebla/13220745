package com.example.linux.aplicacionferclase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,password; //cajas de texto en el xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.usuario);
        password = (EditText)findViewById(R.id.password);
    }
    public void Login(View view){
        if (user.getText().toString().equals("david") && password.getText().toString().equals("123456")
        {
            Intent intent = new Intent(this,login.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Datos Invalidos loco",Toast.LENGTH_LONG).show();
        }
    }
}
