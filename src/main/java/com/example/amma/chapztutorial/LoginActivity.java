package com.example.amma.chapztutorial;

import android.app.ActionBar;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mancj.materialsearchbar.MaterialSearchBar;

public class LoginActivity extends AppCompatActivity {
Button login;
TextView signup;
EditText uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.btLogin);
        signup=findViewById(R.id.signup);
        uname=findViewById(R.id.txtUname);
        pwd=findViewById(R.id.txtPwd);
    }
    public  void  login(View view)
    {
        String username,pass;
        username=uname.getText().toString();
        pass=pwd.getText().toString();

        if((username.equals(""))||(pass.equals("")))
        {
            //firebase login
            Toast.makeText(getApplicationContext(),"All fields are necessary",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(getApplicationContext(), MainActivity_Nav.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_LONG).show();
        }
    }

    public void startSignup(View view)
    {
        Intent i=new Intent(getApplicationContext(),SignupActivity.class);
       // overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(i);
    }



}
