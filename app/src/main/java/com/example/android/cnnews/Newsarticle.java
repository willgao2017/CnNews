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

import static android.R.attr.author;
import static com.example.android.cnnews.R.id.section;


public class Newsarticle {

    private String mSection;
    private String mDate;
    private String mTitle;
    private String mAuthor;
    private String mUrl;

    public Newsarticle(String section, String date, String title, String author, String url) {
        mSection = section;
        mDate = date;
        mTitle = title;
        mAuthor = author;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }
    public String getDate() {
        return mDate;
    }
    public String getTitle() {
        return mTitle;
    }
    public String getAuthor() {
        return mAuthor;
    }
    public String getUrl() {
        return mUrl;
    }
}