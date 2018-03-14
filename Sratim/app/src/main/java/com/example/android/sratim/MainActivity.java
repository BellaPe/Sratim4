package com.example.android.sratim;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListAdapter MyAdapter;
    ListView MyListView;
    private MenuItem Exit;
    private MenuItem Delete;
    private MenuItem Manual;
    private MenuItem Internet;
    private MenuItem Group;
    private MenuItem Group2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.optionmenu, menu);
            //Menu items
            Group = menu.findItem(R.id.MainMenu);
            Group2 = menu.findItem(R.id.EditMenu);
            Exit = menu.findItem(R.id.Exit);
            Delete = menu.findItem(R.id.Delete);
            Manual = menu.findItem(R.id.Manual);
            Internet = menu.findItem(R.id.Internet);

            //Exiting the app
            Exit.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                   finish();
                   return true;
                }
            });
            //Deleting all the movies
            // TODO: 14/03/2018  this

            Manual.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Intent i = new Intent(MainActivity.this, ManualNew.class);
                    startActivityForResult(i, 1);

                    //Toast
                    return true;
                }
            });

            Internet.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Intent i = new Intent(MainActivity.this, InternetNew.class);
                    startActivityForResult(i, 1);
                    //toast
                    return true;
                }
            });
                return true;
        }


    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==RESULT_OK)
        {
            Toast.makeText(MainActivity.this, "Movie added",
                    Toast.LENGTH_LONG).show();

        }
    }
        //final Sratim [] movies = {};

       // MyAdapter = new ArrayAdapter<Sratim>(this, android.R.layout.simple_list_item_1, movies);


      //  MyListView = (ListView) findViewById(R.id.MyListView);

        //adding the ListAdapter that we created to the ListView
     //   MyListView.setAdapter(MyAdapter);

        //adding event listener to the ListView
     //   MyListView.setOnItemClickListener(
                //On item click we will show to the screen a popup with the item's content
             //   new AdapterView.OnItemClickListener(){
            //        @Override
               //     public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

      //              }

            //    }
    //    );
 //   }

}