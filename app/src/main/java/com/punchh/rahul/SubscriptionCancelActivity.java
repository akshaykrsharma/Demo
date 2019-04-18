package com.punchh.rahul;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SubscriptionCancelActivity extends AppCompatActivity {
    private Dialog mDialog;
    private Toolbar toolbar;

    TextView lblCalDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcription_cancel);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lblCalDescription = (TextView) findViewById(R.id.lblCalDescription);
        setSupportActionBar(toolbar);

        TextView title_toolbar = (TextView) toolbar.findViewById(R.id.title_toolbar);
        title_toolbar.setText(getString(R.string.cancel_subscription));

//        if (getIntent().hasExtra("data")) {
//            Subscription data = (Subscription) getIntent().getSerializableExtra("data");
//            title_toolbar.setText(data.getSubscriptionName());
//            //lblCalDescription.setText(data.getStartDate());
//        }


    }

    public void cancelSubscription(View view) {

    }
}
