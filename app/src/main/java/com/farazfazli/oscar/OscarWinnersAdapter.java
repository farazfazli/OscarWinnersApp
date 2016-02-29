package com.farazfazli.oscar;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.farazfazli.oscar.databinding.ItemOscarWinnerBinding;

import java.util.ArrayList;

/**
 * Created by faraz on 2/29/16.
 */
public class OscarWinnersAdapter extends ArrayAdapter<OscarWinner> {
    private Context mContext;
    public OscarWinnersAdapter(Context context, ArrayList<OscarWinner> oscarWinnersArrayList) {
        super(context, 0, oscarWinnersArrayList);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        OscarWinner oscarWinner = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view

        ItemOscarWinnerBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_oscar_winner, parent, false);
        // Lookup view for data population
        binding.setWinner(oscarWinner);
        return binding.getRoot();
    }
}