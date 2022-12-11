package id.baihaqi.myviewsandviewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {
    public static final String EXTRA_PHONE = "extra_phone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        String phoneName = getIntent().getStringExtra(EXTRA_PHONE);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(phoneName);
        }

        TextView tvPhoneName = findViewById(R.id.tvPhoneName);
        tvPhoneName.setText(phoneName);



    }
}