package com.punchh.rahul;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CreditInfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_info);
        createTopTab();
    }


    private void createTopTab() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView title_toolbar = (TextView) toolbar.findViewById(R.id.title_toolbar);
        title_toolbar.setText(getString(R.string.str_credit));

        RadioGroup topTabBar = (RadioGroup) findViewById(R.id.radio_tab_group);
        topTabBar.getChildAt(1).setVisibility(View.GONE);
        RadioButton buttonOne = (RadioButton) topTabBar.getChildAt(0);
        RadioButton buttonTwo = (RadioButton) topTabBar.getChildAt(2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) topTabBar.getChildAt(0).getLayoutParams();
        layoutParams.weight = 1.5f;
        buttonOne.setLayoutParams(layoutParams);
        buttonTwo.setLayoutParams(layoutParams);
        buttonOne.setText(R.string.str_make_up_credit);
        buttonTwo.setText(R.string.str_referral_credit);

        buttonOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                buttonView.setTextColor(isChecked ? Color.WHITE : getResources().getColor(R.color.selectedTabColor));

                if (isChecked) {
                    //Call first tab is clicked
                    Toast.makeText(getApplicationContext(), "Tab 1 is clicked", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    buttonView.setTextColor(Color.WHITE);
                } else
                    buttonView.setTextColor(getResources().getColor(R.color.selectedTabColor));

                if (isChecked) {
                    //Call second tab is clicked
                    Toast.makeText(getApplicationContext(), "Tab 2 is clicked", Toast.LENGTH_LONG).show();

                }
            }
        });
        buttonOne.setChecked(true);
    }

}
