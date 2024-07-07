package com.haris.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Intent j=getIntent();
EditText email,password;
Button login;
TextView signup;
FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//checkLogin();
        email=findViewById(R.id.email);
password=findViewById(R.id.password);
login=findViewById(R.id.login);
signup=findViewById(R.id.signup);
        FirebaseApp.initializeApp(this);
    }
    public void log(View v){
        auth=FirebaseAuth.getInstance();

        String em=email.getText().toString();
        String pass=password.getText().toString();

        if(em.isEmpty()||pass.isEmpty()) {
            Toast.makeText(this, "Must Fill Above!...", Toast.LENGTH_SHORT).show();
        } else if (em.equals("admin@123")&&pass.equals("123")) {
            Intent i=new Intent(MainActivity.this,AdminPannel.class);
            startActivity(i);
        } else{

            auth.signInWithEmailAndPassword(em,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(MainActivity.this,"Login Sucessfully",Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(MainActivity.this,Home.class);
                        startActivity(i);
                    }else{
                        email.setText("");
                        password.setText("");
                        Toast.makeText(MainActivity.this,"Alert! User Not Found...Sign Up First",Toast.LENGTH_LONG).show();
                    }
                }
            });

        }
    }
private void checkLogin(){

        FirebaseAuth auth= FirebaseAuth.getInstance();
    FirebaseUser user=auth.getCurrentUser();
    if(user!=null){
        Intent i =new Intent(MainActivity.this, Home.class);
        startActivity(i);
        finish();
    }else{
        Toast.makeText(this,"Login First",Toast.LENGTH_LONG).show();
    }
}


    public void Sign(View v){
        Intent i = new Intent(MainActivity.this,Signup.class);
        startActivity(i);
    }

}