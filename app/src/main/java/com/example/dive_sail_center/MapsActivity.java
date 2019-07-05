package com.example.dive_sail_center;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng center = new LatLng(38.679715, -28.204467);
        LatLng urz = new LatLng(38.64359414918326, -28.128154277801517);
        LatLng man = new LatLng(38.631486 ,-28.098284);

        mMap.addMarker(new MarkerOptions().position(center).title("Dive & Sail Center"));
        mMap.addMarker(new MarkerOptions().position(urz).title("Urzelina"));
        mMap.addMarker(new MarkerOptions().position(man).title("Manadas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urz));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(man));


    }
}
