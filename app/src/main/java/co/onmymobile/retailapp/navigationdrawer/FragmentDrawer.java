package co.onmymobile.retailapp.navigationdrawer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.onmymobile.retailapp.R;


/**
 * Created by omm on 11/2/2015.
 */
public class FragmentDrawer extends android.support.v4.app.Fragment {
    private static String TAG = FragmentDrawer.class.getSimpleName();

    private RecyclerView recyclerView;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private NavigationDrawerAdapter adapter;
    private View containerView;
    private static String[] titles = null;
    private static String[] titles1 = null;
    private static String uid, name;
    private FragmentDrawerListener drawerListener;
    private Toolbar mtoolbar;
    private String firstName;
    private String lastName;
    private String logonId;
    private TextView first;
    private TextView email;

    public FragmentDrawer() {

    }

    public void setDrawerListener(FragmentDrawerListener listener) {
        this.drawerListener = listener;
    }



    public static List<NavigationDrawerItem> getData() {
        List<NavigationDrawerItem> data = new ArrayList<>();
        int[] icons = {R.mipmap.nav_mycart,R.mipmap.nav_prebook,R.mipmap.nav_order_history,R.mipmap.nav_news,R.mipmap.nav_location,
                R.mipmap.nav_refer,R.mipmap.nav_my_profile,R.mipmap.nav_feedback,R.mipmap.nav_survey,R.mipmap.nav_support};


        for (int i = 0; i < titles.length; i++) {
            NavigationDrawerItem navItem = new NavigationDrawerItem();
            navItem.setTitle(titles[i]);
            navItem.icons = icons[i];
            data.add(navItem);
        }

        return data;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // drawer labels
       // uid = Preferences.getString(Preferences.PrefType.USER_ID, getContext().getApplicationContext());
       /* firstName=Preferences.getString(Preferences.PrefType.FIRST_NAME,getContext().getApplicationContext());
        lastName=Preferences.getString(Preferences.PrefType.LAST_NAME,getContext().getApplicationContext());
        logonId=Preferences.getString(Preferences.PrefType.EMAIL_ID,getContext().getApplicationContext());*/


        titles = getActivity().getResources().getStringArray(R.array.nav_drawer_labels);

        //Log.e("UId", uid);

        //getActivity().getActionBar().setHomeButtonEnabled(true);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflating view layout
        View layout = inflater.inflate(R.layout.nav_fragment_drawer, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.nav_drawerList);
/*
        firstName=((MyApplication)getContext().getApplicationContext()).getFirstName();
        lastName=((MyApplication)getContext().getApplicationContext()).getLastName();
        logonId=((MyApplication)getContext().getApplicationContext()).getLogonId();
        first=(TextView)layout.findViewById(R.id.nav_firstname);
        email=(TextView)layout.findViewById(R.id.nav_email);
        if(firstName!=null && lastName!=null && email!=null) {
            first.setText(firstName + " " + lastName);
            email.setText(logonId);
        }

*/

        adapter = new NavigationDrawerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       /* TextView name = (TextView) layout.findViewById(R.id.nav_profilename);
        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(myintent);
            }
        });
*/
        //String Name = Preferences.getString(Preferences.PrefType.First_name, getContext().getApplicationContext());
        // Log.e("N",Name);
       /* db=((MyApplication) getContext().getApplicationContext()).getDatabaseHandler();
        String Name=db.getName();
        Log.e("Name",Name);
        if ("null".equals(uid) || "null".equals(Name)) {
            name.setText("Guest");
            editprofile.setVisibility(View.INVISIBLE);

        } else {
            name.setText(Name);
            Log.e("name", String.valueOf(name));
            editprofile.setVisibility(View.VISIBLE);
        }
        Typeface custom_name = Typeface.createFromAsset(getActivity().getAssets(), "font/Roboto-Regular.ttf");
        name.setTypeface(custom_name);

        TextView email = (TextView) layout.findViewById(R.id.nav_email);*/
       /* Typeface custom_email = Typeface.createFromAsset(getActivity().getAssets(), "font/Roboto-Regular.ttf");
        email.setTypeface(custom_email);*/
/*
        Typeface custom_name = Typeface.createFromAsset(getActivity().getAssets(), "font/Roboto-Regular.ttf");
        first.setTypeface(custom_name);
        email.setTypeface(custom_name);
*/
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                drawerListener.onDrawerItemSelected(view, position);
                mDrawerLayout.closeDrawer(containerView);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        return layout;
    }


    public void setUp(int fragmentId, final DrawerLayout drawerLayout, final Toolbar toolbar) {
        containerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;
        mtoolbar = toolbar;
        //actionBar.setDisplayShowHomeEnabled(true);
        // actionBar.setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, mtoolbar, R.string.nav_drawer_open, R.string.nav_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

                //getActivity().getActionBar().setTitle("Dealmaar");
                getActivity().invalidateOptionsMenu();

                //getActivity().getActionBar().setTitle("Dealmaar");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                getActivity().invalidateOptionsMenu();
                // mtoolbar.setVisibility(View.VISIBLE);

            }


            @Override
            public boolean onOptionsItemSelected(MenuItem item) { // <---- added
                if (mDrawerToggle.onOptionsItemSelected(item)) {
                    return true;
                }
                return super.onOptionsItemSelected(item);
            }

            @Override
            public void onConfigurationChanged(Configuration newConfig) {
                super.onConfigurationChanged(newConfig);
                mDrawerToggle.onConfigurationChanged(newConfig);
            }


        };


        /*mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerToggle.setHomeAsUpIndicator(R.drawable.logo2);*/
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }

        });


    }

    public static interface ClickListener {
        public void onClick(View view, int position);

        public void onLongClick(View view, int position);
    }


    static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }


    }

    public interface FragmentDrawerListener {
        public void onDrawerItemSelected(View view, int position);
    }
    public void onResume()
    {
        super.onResume();
/*
        firstName=((MyApplication)getContext().getApplicationContext()).getFirstName();
        lastName=((MyApplication)getContext().getApplicationContext()).getLastName();
        logonId=((MyApplication)getContext().getApplicationContext()).getLogonId();
*/
    }
}

