package com.farazfazli.oscar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by faraz on 2/29/16.
 */
public class OscarWinnersAdapter extends ArrayAdapter<OscarWinner> {
    public OscarWinnersAdapter(Context context, ArrayList<OscarWinner> oscarWinnersArrayList) {
        super(context, 0, oscarWinnersArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        OscarWinner oscarWinner = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_oscar_winner, parent, false);
        }
        // Lookup view for data population
        TextView mNameTextView = (TextView) convertView.findViewById(R.id.name);
        TextView mDOBTextView = (TextView) convertView.findViewById(R.id.dob);
        TextView mOscarsTextView = (TextView) convertView.findViewById(R.id.oscars);
        // Populate the data into the template view using the data object
        mNameTextView.setText(oscarWinner.getName());
        mDOBTextView.setText(oscarWinner.getDOB());
        mOscarsTextView.setText(oscarWinner.getOscarsWon());
        // Return the completed view to render on screen
        return convertView;
    }
}