package com.vmorenomarin.petbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSend;
    EditText etName,  etEmail, etComment, etSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        Toolbar custom_bar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(custom_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etName      = (EditText) findViewById(R.id.etNameContact);
        etEmail     = (EditText) findViewById(R.id.etEmailContact);
        etComment   = (EditText) findViewById(R.id.etComment);
        etSubject   = (EditText) findViewById(R.id.etSubject);
        btnSend     = (Button)   findViewById(R.id.btnConfirmation);

        btnSend.setOnClickListener(this);

    }



    public void setBtnSend(View view) {

        String email    = "vmorenomarin+alias@gmail.com";
        String comment  = etComment.getText().toString().trim();
        String subject  = etSubject.getText().toString().trim();

        SendMail sm = new SendMail(this, email, subject, comment);

        sm.execute();
    }

    @Override
    public void onClick(View v) {
        setBtnSend(v);
    }
}


