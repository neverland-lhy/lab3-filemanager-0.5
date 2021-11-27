package com.michaldabski.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.michaldabski.filemanager.clipboard.Clipboard;
import com.michaldabski.filemanager.favourites.FavouritesManager;

public class updateLogActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_log);

        findViewById(R.id.btnBack).setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBack:
            Intent intent = new Intent(this, com.michaldabski.filemanager.about.AboutActivity.class);
            startActivity(intent);
            break;
        }

    }
}
