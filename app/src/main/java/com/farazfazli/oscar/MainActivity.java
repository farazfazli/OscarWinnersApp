package com.farazfazli.oscar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.oscar_nominees);
        ArrayList<OscarWinner> winners = new ArrayList<OscarWinner>() {{
            add(new OscarWinner("Leo", "1974", "1"));
            add(new OscarWinner("Matt Damon", "1973", "1"));
        }};

        OscarWinnersAdapter adapter  = new OscarWinnersAdapter(this, winners);
        mListView.setAdapter(adapter);
    }
}
