package com.example.hardikdesaii.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardViewClick extends AppCompatActivity {
ImageView image;
    ImageButton send;
    TextView name;
    int photouri;
    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_click);
    Intent intent=getIntent();
        image=(ImageView)findViewById(R.id.cardviewphoto);
        name=(TextView)findViewById(R.id.cardviewname);

        photouri=intent.getIntExtra("photo",R.mipmap.ic_launcher);
        image.setImageResource(photouri);
        name.setText(intent.getStringExtra("name").toString());

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CardViewClick.this,PhotoActivity.class);
                intent.putExtra("image",photouri);
                startActivity(intent);

            }
        });
        send=(ImageButton)findViewById(R.id.cardviewsend);
        send.setImageResource(android.R.drawable.ic_media_play);
        message=(EditText)findViewById(R.id.cardviewmessage);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(message.getText().length() > 0)
                {
                    Toast.makeText(CardViewClick.this,"Message :"+message.getText().toString(),Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
