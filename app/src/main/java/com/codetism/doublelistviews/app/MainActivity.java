package com.codetism.doublelistviews.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Country> countries;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        createMockData();

        this.listView = ((ListView) findViewById(R.id.listView));
        this.listView.setAdapter(new CountryAdapter(this, countries));
    }

    private void createMockData() {
        this.countries = new ArrayList<>();

        final ArrayList<City> usaCities = new ArrayList<>();
        usaCities.add(new City("New York", 8491079));
        usaCities.add(new City("Los Angeles", 3928864));
        usaCities.add(new City("Chicago", 2722389));
        final Country usa = new Country("USA", usaCities);

        final ArrayList<City> thaiCities = new ArrayList<>();
        thaiCities.add(new City("Bangkok", 5782159));
        thaiCities.add(new City("Nonthaburi", 270609));
        thaiCities.add(new City("Chiang Mai", 174236));
        final Country thailand = new Country("Thailand", thaiCities);

        for (int i = 0; i < 3; i++) {
            countries.add(usa);
            countries.add(thailand);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
