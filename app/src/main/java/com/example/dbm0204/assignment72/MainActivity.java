package com.example.dbm0204.assignment72;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int CONTACT_PICKER_RESULT = 1001;
    private static final String DEBUG_TAG = "Contact List";
    private static final int RESULT_OK = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int PICK_CONTACT=101;
        if(view.getId()==R.id.button){
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivityForResult(intent,CONTACT_PICKER_RESULT);
        }
    }
    @Override
    public void onActivityResult(int requestCode,int resultCode, Intent data)
    {
        if(resultCode==RESULT_OK){
            switch (requestCode) {
                case CONTACT_PICKER_RESULT:
                    Log.w(DEBUG_TAG, "Warning: activity result is ok!");
                    break;
            }
        } else
        {
            Log.w(DEBUG_TAG,"Warning:activity result is ok");
        }
    }
}
