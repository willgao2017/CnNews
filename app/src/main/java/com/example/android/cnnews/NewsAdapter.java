/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.cnnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Newsarticle} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<Newsarticle> {

    /**
     * The part of the location string from the USGS service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */
    private static final String LOCATION_SEPARATOR = " of ";

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param newsarticles is the list of earthquakes, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<Newsarticle> newsarticles) {
        super(context, 0, newsarticles);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Newsarticle currentNewsarticle = getItem(position);

        String titleString = currentNewsarticle.getTitle();
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        titleView.setText(titleString);

        String sectionString = currentNewsarticle.getSection();
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(sectionString);

        String dateString = currentNewsarticle.getDate();
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(dateString);

        String authorString = currentNewsarticle.getAuthor();
        TextView authorView = (TextView) listItemView.findViewById(R.id.article_author);
        authorView.setText(authorString);

        return listItemView;
    }

}