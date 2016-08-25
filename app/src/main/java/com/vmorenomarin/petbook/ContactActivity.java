package com.vmorenomarin.petbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactActivity extends AppCompatActivity {

    Button btnSend;
    EditText etName,  etEmail, etComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        Toolbar custom_bar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(custom_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etName = (EditText) findViewById(R.id.etNameContact);
        etEmail = (EditText) findViewById(R.id.etEmailContact);
        etComment = (EditText) findViewById(R.id.etComment);

    }



    public void setBtnSend(View view) {
        Intent intent = new Intent(ContactActivity.this, AboutActivity.class);
        intent.putExtra("name", etName.getText().toString());
        intent.putExtra("email", etEmail.getText().toString());
        intent.putExtra("comment", etComment.getText().toString());
        startActivity(intent);
        this.finish();

    }
}


