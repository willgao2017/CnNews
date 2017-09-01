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

public class NewsAdapter extends ArrayAdapter<Newsarticle> {

    public NewsAdapter(Context context, List<Newsarticle> newsarticles) {
        super(context, 0, newsarticles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

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