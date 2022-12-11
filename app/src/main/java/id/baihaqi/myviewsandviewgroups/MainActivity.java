package id.baihaqi.myviewsandviewgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("IPhone 14 Pro");
        }

        Button btnBuy = findViewById(R.id.btnBuy);
        btnBuy.setOnClickListener(MainActivity.this);
        Button btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBuy:
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                buyIntent.putExtra(BuyActivity.EXTRA_PHONE, "IPhone 14 Pro");
                startActivity(buyIntent);
                break;
            case  R.id.btnCall:
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:21932193"));
                startActivity(callIntent);
                break;
        }
    }
}