package uk.co.phartmaster.nav_bar_tut;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import uk.co.phartmaster.nav_bar_tut.MenuPages.AboutActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.BlogActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.ContactActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.LegendsActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.MissionActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.ProductsActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.RecipesActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.StockistsActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.VideosActivity;
import uk.co.phartmaster.nav_bar_tut.MenuPages.YourTofooActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

        } else if (id == R.id.mission) {

            Intent intent = new Intent(this, MissionActivity.class);
            startActivity(intent);

        } else if (id == R.id.about) {

            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.blog) {

            Intent intent = new Intent(this, BlogActivity.class);
            startActivity(intent);

        } else if (id == R.id.yourTofoo) {

            Intent intent = new Intent(this, YourTofooActivity.class);
            startActivity(intent);

        } else if (id == R.id.products) {

            Intent intent = new Intent(this, ProductsActivity.class);
            startActivity(intent);

        } else if (id == R.id.recipes) {

            Intent intent = new Intent(this, RecipesActivity.class);
            startActivity(intent);

        } else if (id == R.id.videos) {

            Intent intent = new Intent(this, VideosActivity.class);
            startActivity(intent);

        } else if (id == R.id.legends) {

            Intent intent = new Intent(this, LegendsActivity.class);
            startActivity(intent);

        } else if (id == R.id.stockists) {

            Intent intent = new Intent(this, StockistsActivity.class);
            startActivity(intent);

        }else if (id == R.id.contact) {

            Intent intent = new Intent(this, ContactActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
