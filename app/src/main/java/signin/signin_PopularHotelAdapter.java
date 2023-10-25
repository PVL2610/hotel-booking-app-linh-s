package signin;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import signin.signin_PopularHotel;
import com.example.hotel_booking_app.R;

import java.util.List;

public class signin_PopularHotelAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<signin_PopularHotel> popularHotelList;

    public signin_PopularHotelAdapter(Context context, int layout, List<signin_PopularHotel> popularHotelList) {
        this.context = context;
        this.layout = layout;
        this.popularHotelList = popularHotelList;
    }

    @Override
    public int getCount() {
        return popularHotelList.size();
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
        TextView txtTen = (TextView) view.findViewById(R.id.name_popularhotel);
        TextView txtDiaChi = (TextView) view.findViewById(R.id.location_popularhotel);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.img_popularhotel);
        TextView txtDanhGia = (TextView) view.findViewById(R.id.rate_popularhotel);
        TextView txtSLDanhGia = (TextView) view.findViewById(R.id.SLdanhgia_popularhotel);
        TextView txtGia = (TextView) view.findViewById(R.id.prince_popularhotel);


        //gán giá trị
        signin_PopularHotel popularHotel = popularHotelList.get(i);

        txtTen.setText(popularHotel.getTen());
        txtDiaChi.setText(popularHotel.getDiaChi());
        imgHinh.setImageResource(popularHotel.getHinh());
        txtDanhGia.setText(String.valueOf(popularHotel.getDanhGia()));
        txtSLDanhGia.setText(String.valueOf(popularHotel.getSoLuongDanhGia()));
        txtGia.setText(popularHotel.getGia());
        return view;
    }

}

