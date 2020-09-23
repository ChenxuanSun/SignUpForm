package edu.temple.signupform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    AlertDialog.Builder alert;


    EditText Username;
    EditText Name;
    EditText Password;
    EditText ConfirmPassword;
    EditText Email;

    Button SaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username =(EditText)findViewById(R.id.Username);
        Name = (EditText)findViewById(R.id.Name);
        Password = (EditText)findViewById(R.id.Password);
        ConfirmPassword = (EditText)findViewById(R.id.Confirmpassword);
        Email = (EditText)findViewById(R.id.Email);

        SaveButton = (Button)findViewById(R.id.SaveButton);



        alert = new AlertDialog.Builder(FormActivity.this);

        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().isEmpty()||Name.getText().toString().isEmpty()||Password.getText().toString().isEmpty()
                        ||ConfirmPassword.getText().toString().isEmpty()||Email.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this,"You must enter all information!",Toast.LENGTH_SHORT).show();
                }else if (!Password.getText().toString().equals(ConfirmPassword.getText().toString())){
                    Toast.makeText(FormActivity.this,"Password not match",Toast.LENGTH_SHORT).show();
                }else{
                    alert.setMessage("Welcome:"+" "+Name.getText().toString()+" "+"to the SignUpForm App").show();
                }
            }
        });


    }
}