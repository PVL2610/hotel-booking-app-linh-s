package signin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;

import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.RelativeLayout;

import com.example.hotel_booking_app.R;
import java.util.ArrayList;

public class signin_homepage extends AppCompatActivity {
    LinearLayout lnNearbyHotel,lnPopularHotel;
    TextView nearbyHotels;
    ScrollView scrollview;
    RelativeLayout relativelayout;
    ArrayList<signin_nearbyhotel> arrayNearByHotel;
    ArrayList<signin_PopularHotel> arrayPopularHotel;
    signin_nearbyhotelAdapter adapter;
    signin_PopularHotelAdapter adapter_1;
    BottomNavigationView bottomNavigationView;
    signin_homepagee homefragment = new signin_homepagee();
    signin_mybooking mybookingfragment = new signin_mybooking();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_home_page);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //
        AnhXa();
        adapter = new signin_nearbyhotelAdapter(this, R.layout.signin_item_nearbyhotel, arrayNearByHotel);
        for (int i = 0; i < adapter.getCount(); i++) {
            View item = adapter.getView(i, null, null);
            lnNearbyHotel.addView(item);
        }
        adapter_1 = new signin_PopularHotelAdapter(this, R.layout.signin_item_popularhotel, arrayPopularHotel);
        for (int i = 0; i < adapter_1.getCount(); i++) {
            View item = adapter_1.getView(i, null, null);
            lnPopularHotel.addView(item);
        }

        //đổi màu nearby hotels
        relativelayout =(RelativeLayout) findViewById(R.id.laytout_homepage);
        scrollview = (ScrollView) findViewById(R.id.content);
        nearbyHotels = (TextView) findViewById(R.id.nearbyhotels);

        scrollview.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > relativelayout.getHeight()/8) {
                    nearbyHotels.setTextColor(Color.WHITE);
                } else {
                    nearbyHotels.setTextColor(Color.BLACK);
                }
            }
        });






    }
    private void AnhXa() {
        lnPopularHotel = (LinearLayout) findViewById(R.id.lvpopularhotel);
        arrayPopularHotel = new ArrayList<>();
        lnNearbyHotel = (LinearLayout) findViewById(R.id.lvNearbyHotel);
        arrayNearByHotel = new ArrayList<>();

        arrayPopularHotel.add(new signin_PopularHotel("HAIAN","My An Beach",4.9,500,"$100/Day",R.drawable.haian));
        arrayPopularHotel.add(new signin_PopularHotel("NOVOTEL","My An Beach",5,1000,"$100/Day",R.drawable.novotel));
        arrayPopularHotel.add(new signin_PopularHotel("HAIAN","My An Beach",4.9,500,"$100/Day",R.drawable.haian));
        arrayPopularHotel.add(new signin_PopularHotel("NOVOTEL","My An Beach",5,1000,"$100/Day",R.drawable.novotel));
        arrayPopularHotel.add(new signin_PopularHotel("HAIAN","My An Beach",4.9,500,"$100/Day",R.drawable.haian));
        arrayPopularHotel.add(new signin_PopularHotel("NOVOTEL","My An Beach",5,1000,"$100/Day",R.drawable.novotel));

        arrayNearByHotel.add(new signin_nearbyhotel("MUONG THANH","My An Beach",4.9,1000,"$100/Day",R.drawable.muongthanh));
        arrayNearByHotel.add(new signin_nearbyhotel("MERODA","My An Beach",4.9,500,"$100/Day",R.drawable.meroda));
        arrayNearByHotel.add(new signin_nearbyhotel("MUONG THANH","My An Beach",4.9,1000,"$100/Day",R.drawable.muongthanh));
        arrayNearByHotel.add(new signin_nearbyhotel("MERODA","My An Beach",4.9,500,"$100/Day",R.drawable.meroda));
        arrayNearByHotel.add(new signin_nearbyhotel("MUONG THANH","My An Beach",4.9,1000,"$100/Day",R.drawable.muongthanh));
        arrayNearByHotel.add(new signin_nearbyhotel("MERODA","My An Beach",4.9,500,"$100/Day",R.drawable.meroda));

    }

}
