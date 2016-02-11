package com.codetism.doublelistviews.app;

import java.util.List;

/**
 * Created by Iamz on 2/11/2016 AD.
 * Copyright @ 2016 by Codetism Co., Ltd.
 */
public class Country {
    public final String name;
    public final List<City> cities;

    public Country(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }
}
