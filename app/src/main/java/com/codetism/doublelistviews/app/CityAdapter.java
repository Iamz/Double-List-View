package com.codetism.doublelistviews.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Iamz on 2/11/2016 AD.
 * Copyright @ 2016 by Codetism Co., Ltd.
 */
public class CityAdapter extends ArrayAdapter<City> {
    public CityAdapter(Context context, List<City> objects) {
        super(context, R.layout.city_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.city_item, parent, false);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        if (holder == null) {
            holder = new ViewHolder();
            holder.cityName = ((TextView) convertView.findViewById(R.id.cityName));
            holder.population = ((TextView) convertView.findViewById(R.id.population));
            convertView.setTag(holder);
        }

        final City city = getItem(position);
        holder.cityName.setText(city.name);
        holder.population.setText("" + city.population);

        return convertView;
    }

    class ViewHolder {
        public TextView cityName;
        public TextView population;
    }
}
