package signin;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import signin.signin_nearbyhotel;

import com.example.hotel_booking_app.R;

import org.w3c.dom.Text;

import java.util.List;

public class signin_nearbyhotelAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<signin_nearbyhotel> nearbyHotelList;

    public signin_nearbyhotelAdapter(Context context, int layout, List<signin_nearbyhotel> nearbyHotelList) {
        this.context = context;
        this.layout = layout;
        this.nearbyHotelList = nearbyHotelList;
    }

    @Override
    public int getCount() {
        return nearbyHotelList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        // ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.name_nearbyhotel);
        TextView txtDiaChi = (TextView) view.findViewById(R.id.location_nearbyhotel);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.img_nearbyhotel);
        TextView txtDanhGia = (TextView) view.findViewById(R.id.rate_nearbyhotel);
        TextView txtSLDanhGia = (TextView) view.findViewById(R.id.SLdanhgia_nearbyhotel);
        TextView txtGia = (TextView) view.findViewById(R.id.prince_nearbyhotel);


        //gán giá trị
        signin_nearbyhotel nearbyhotel = nearbyHotelList.get(i);

        txtTen.setText(nearbyhotel.getTen());
        txtDiaChi.setText(nearbyhotel.getDiaChi());
        imgHinh.setImageResource(nearbyhotel.getHinh());
        txtDanhGia.setText(String.valueOf(nearbyhotel.getDanhGia()));
        txtSLDanhGia.setText(String.valueOf(nearbyhotel.getSoLuongDanhGia()));
        txtGia.setText(nearbyhotel.getGia());
        return view;
    }
}
