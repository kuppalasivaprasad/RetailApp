package co.onmymobile.retailapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import co.onmymobile.retailapp.Signin.SigninActivity;
import co.onmymobile.retailapp.navigationdrawer.FragmentDrawer;


public class TrafficActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {
    private DrawerLayout drawerLayout;
    private FragmentDrawer drawerFragment;
    private Intent mIntent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.mipmap.menu);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.home);

        drawerLayout = (DrawerLayout) findViewById(R.id.home_drawer_layout);
        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.home_drawer_layout), toolbar);
        drawerFragment.setDrawerListener(this);
        drawerFragment.onDestroy();



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.traffic_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

       /* if (id == R.id.action_search) {
            Intent intent = new Intent(this, SearchActivity.class);
            intent.putExtra("activityname", "users");
            startActivity(intent);
        }*/

        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }
    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                Toast.makeText(getApplicationContext(),"this id "+position+" posations",Toast.LENGTH_SHORT).show();
                //finish();
                break;
            case 1:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                //finish();

                break;
            case 2:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                //finish();

                break;
            case 3:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                break;

            case 4:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                //finish();
                break;
            case 5:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                //finish();
                break;
            case 6:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                break;
            case 7:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                break;
            case 8:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                break;
            case 9:
                Toast.makeText(getApplicationContext(),"this id "+position+" posation",Toast.LENGTH_SHORT).show();

                break;

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();
        }

    }
}
