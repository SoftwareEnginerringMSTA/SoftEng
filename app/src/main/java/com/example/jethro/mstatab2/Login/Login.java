package com.example.jethro.mstatab2.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.jethro.mstatab2.MainActivity;
import com.example.jethro.mstatab2.R;

/**
 * Created by Jethro on 2/8/2016.
 */
public class Login extends AppCompatActivity{

    private EditText userName,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        userName = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
    }

    public void OnButton(View view)
    {

        String user=userName.getText().toString();
        String pass=password.getText().toString();


        if(user.equals("cerio")&&pass.equals("123"))
        {
            Intent intent= new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if(user!="cerio" || pass!="123" )
        {
            userName.setError("Username and Password didnt match");
            password.setError("Username and Password didnt match");
        }


    }


}
