package com.example.travelkitscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.travelkitscreen.Travel.BookingActivity;
import com.example.travelkitscreen.Travel.CitiesActivity;
import com.example.travelkitscreen.Travel.CityTwoActivity;
import com.example.travelkitscreen.Travel.FlightsActivity;
import com.example.travelkitscreen.Travel.Flights_search;
import com.example.travelkitscreen.Travel.HotelActivity;
import com.example.travelkitscreen.Travel.ListOfHotelsActivity;
import com.example.travelkitscreen.Travel.NearBYActivity;
import com.example.travelkitscreen.Travel.PlaceActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";

    private AdView mAdView;

    private ImageView image_BookingActivity,image_CitiesActivity,image_CityTwoActivity,image_Flights_search,image_FlightsActivity,image_HotelActivity,image_ListOfHotelsActivity
            ,image_NearBYActivity,image_PlaceActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        image_BookingActivity = findViewById(R.id.image_BookingActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.booking)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_BookingActivity);
        } catch (Exception e) {
        }
        image_BookingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, BookingActivity.class));
            }
        });



        image_CitiesActivity = findViewById(R.id.image_CitiesActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.cities)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_CitiesActivity);
        } catch (Exception e) {
        }
        image_CitiesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, CitiesActivity.class));
            }
        });



        image_CityTwoActivity = findViewById(R.id.image_CityTwoActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.cityplace)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_CityTwoActivity);
        } catch (Exception e) {
        }
        image_CityTwoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, CityTwoActivity.class));
            }
        });




        image_Flights_search = findViewById(R.id.image_Flights_search);
        try {
            Glide.with(ListActivity.this).load(R.drawable.flightsearch)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_Flights_search);
        } catch (Exception e) {
        }
        image_Flights_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, Flights_search.class));
            }
        });




        image_FlightsActivity = findViewById(R.id.image_FlightsActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.flights)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_FlightsActivity);
        } catch (Exception e) {
        }
        image_FlightsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, FlightsActivity.class));
            }
        });



        image_HotelActivity = findViewById(R.id.image_HotelActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.hotel)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_HotelActivity);
        } catch (Exception e) {
        }
        image_HotelActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, HotelActivity.class));
            }
        });



        image_ListOfHotelsActivity = findViewById(R.id.image_ListOfHotelsActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.listofhotel)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_ListOfHotelsActivity);
        } catch (Exception e) {
        }
        image_ListOfHotelsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, ListOfHotelsActivity.class));

            }
        });



        image_NearBYActivity = findViewById(R.id.image_NearBYActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.nearby)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_NearBYActivity);
        } catch (Exception e) {
        }
        image_NearBYActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, NearBYActivity.class));

            }
        });


        image_PlaceActivity = findViewById(R.id.image_PlaceActivity);
        try {
            Glide.with(ListActivity.this).load(R.drawable.place)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(image_PlaceActivity);
        } catch (Exception e) {
        }
        image_PlaceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this, PlaceActivity.class));
            }
        });









    }
}
