package co.onmymobile.retailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutsListActivity extends AppCompatActivity {
    Button wifi, offers, in_traffic, refer, news, social, traffic, invite, loyalty, sublist,profile,order_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_list);
        wifi = (Button) findViewById(R.id.intro_wifi);
        offers = (Button) findViewById(R.id.intro_offers);
        in_traffic = (Button) findViewById(R.id.intro_traffic);
        refer = (Button) findViewById(R.id.intro_refer);
        news = (Button) findViewById(R.id.intro_news);
        social = (Button) findViewById(R.id.social);
        traffic = (Button) findViewById(R.id.traffic);
        invite = (Button) findViewById(R.id.invite);
        loyalty = (Button) findViewById(R.id.loyalty);
        sublist = (Button) findViewById(R.id.list_sub);
        profile = (Button) findViewById(R.id.profile);
        order_history = (Button) findViewById(R.id.order_history);

        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroWifiActivity.class);
                startActivity(intent);
            }
        });
        offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroOffersActivity.class);
                startActivity(intent);
            }
        });
        in_traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroTrafficActivity.class);
                startActivity(intent);
            }
        });
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroReferActivity.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroNewsActivity.class);
                startActivity(intent);
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SocialActivity.class);
                startActivity(intent);
            }
        });
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrafficActivity.class);
                startActivity(intent);
            }
        });
        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InviteFrindsActivity.class);
                startActivity(intent);
            }
        });
        loyalty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoyaltyActivity.class);
                startActivity(intent);
            }
        });
        sublist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyListSubActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        order_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderHistoryActivity.class);
                startActivity(intent);
            }
        });
    }

}
