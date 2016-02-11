package com.codetism.doublelistviews.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Iamz on 2/11/2016 AD.
 * Copyright @ 2016 by Codetism Co., Ltd.
 */
public class CountryAdapter extends ArrayAdapter<Country> {

    public CountryAdapter(Context context, List<Country> objects) {
        super(context, R.layout.country_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.country_item, parent, false);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        if (holder == null) {
            holder = new ViewHolder();
            holder.countryName = ((TextView) convertView.findViewById(R.id.countryName));
            holder.listView = ((ListView) convertView.findViewById(R.id.listView));
            convertView.setTag(holder);
        }

        final Country country = getItem(position);
        holder.countryName.setText(country.name);
        holder.listView.setAdapter(new CityAdapter(getContext(), country.cities));

        return convertView;
    }

    class ViewHolder {
        public TextView countryName;
        public ListView listView;
    }
}
