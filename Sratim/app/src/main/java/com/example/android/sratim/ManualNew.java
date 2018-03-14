package com.example.android.sratim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ManualNew extends AppCompatActivity {
    private Button OK;
    private Button Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_new);

        OK = (Button) findViewById((R.id.Ok));
        OK.setText("OK");
        Cancel = (Button) findViewById((R.id.Cancel));
       Cancel.setText("Cancel");
        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result(view);
            }
        };
        OK.setOnClickListener(myOnClickListener);
        Cancel.setOnClickListener(myOnClickListener);
    }

    public void Result(View view) {
        String Click = (String) ((Button) view).getText();
        switch (Click) {
            case "OK": {
                Intent returnIntent = getIntent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
            case "Cancel": {
                Intent returnIntent = getIntent();
                setResult(RESULT_CANCELED, returnIntent);
                finish();

            }
        }

    }

}
