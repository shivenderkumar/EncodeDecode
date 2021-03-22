package com.shivenderkumar.encodedecode.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shivenderkumar.encodedecode.R;
import com.shivenderkumar.encodedecode.models.ChainDetailResponseAddress;
import com.shivenderkumar.encodedecode.models.ChainDetailResponseLocationList;

import java.util.ArrayList;
import java.util.List;


public class LocationListAdapter extends RecyclerView.Adapter<LocationListAdapter.ViewHolder> {

    private List<ChainDetailResponseLocationList> listLocationList;
    Context mContext;

    public LocationListAdapter(List<ChainDetailResponseLocationList> listLocationList, Context mContext) {
        this.listLocationList = listLocationList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChainDetailResponseLocationList ld = listLocationList.get(position);
        holder.tv_restaurant_name_2.setText(ld.getName());

        ChainDetailResponseAddress addr_obj = ld.Address;
        String addr = ""+ addr_obj.getAddressLine1()+", "+addr_obj.getCity()+ ", "+addr_obj.getState()+", "+addr_obj.getCountry()+", "+addr_obj.Zip;

        holder.tv_restaurant_location.setText(addr);
        holder.tv_restaurant_contact.setText(ld.getTel());

    }

    @Override
    public int getItemCount() {
        return listLocationList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_restaurant_name_2, tv_restaurant_location, tv_restaurant_contact;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_restaurant_name_2 = (TextView) itemView.findViewById(R.id.tv_restaurant_name_2);
            tv_restaurant_location = (TextView) itemView.findViewById(R.id.tv_restaurant_location);
            tv_restaurant_contact = (TextView) itemView.findViewById(R.id.tv_restaurant_contact);

        }
    }
}