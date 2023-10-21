package com.example.hotel_booking_app;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LinearLayout lnPopularHotel;
    ArrayList<PopularHotel> arrayPopularHotel;
    PopularHotelAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new PopularHotelAdapter(this, R.layout.item_popularhotel, arrayPopularHotel);
        for (int i = 0; i < adapter.getCount(); i++) {
            View item = adapter.getView(i, null, null);
            lnPopularHotel.addView(item);
        }
    }
    private void AnhXa() {
        lnPopularHotel = (LinearLayout) findViewById(R.id.lvpopularhotel);
        arrayPopularHotel = new ArrayList<>();

        arrayPopularHotel.add(new PopularHotel("HAIAN","My An Beach","4.9",500,"$100/Day",R.drawable.haian));
        arrayPopularHotel.add(new PopularHotel("HAIAN","My An Beach","4.9",500,"$100/Day",R.drawable.haian));
    }
}