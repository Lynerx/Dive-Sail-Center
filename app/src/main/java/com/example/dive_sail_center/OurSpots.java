package com.example.dive_sail_center;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class OurSpots extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private DatabaseReference mDataBaseSpots;

    public OurSpots() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.our_spots_fragment, container, false);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Our Spots");
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);

        mDataBaseSpots = FirebaseDatabase.getInstance().getReference();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        DatabaseReference DivingSpots = FirebaseDatabase.getInstance().getReference();

        LocationData markerRosais = new LocationData("Baixa dos Rosais", "2", 38.756523, -28.332953);
        LocationData markerEntreMorros = new LocationData("Entre Morros", "2", 38.683619, -28.223249);
        LocationData markerManadas = new LocationData("Cais das Manadas", "1", 38.631486 ,-28.098284);
        LocationData markerUrzelina = new LocationData("Cais da Urzelina", "1", 38.64359414918326, -28.128154277801517);
        LocationData markerSJZCenter = new LocationData("Dive & Sail Center", null, 38.679813, -28.204486);

        DivingSpots.push().setValue(markerRosais);
        DivingSpots.push().setValue(markerEntreMorros);
        DivingSpots.push().setValue(markerManadas);
        DivingSpots.push().setValue(markerUrzelina);
        DivingSpots.push().setValue(markerSJZCenter);

        LatLng center = new LatLng(markerSJZCenter.latitude, markerSJZCenter.longitude);
        LatLng urz = new LatLng(markerUrzelina.latitude, markerUrzelina.longitude);
        LatLng man = new LatLng(markerManadas.latitude, markerManadas.longitude);
        LatLng morro = new LatLng(markerEntreMorros.latitude, markerEntreMorros.longitude);
        LatLng rosais = new LatLng(markerRosais.latitude, markerRosais.longitude);

        mMap.addMarker(new MarkerOptions().position(center).title(markerSJZCenter.name));
        mMap.addMarker(new MarkerOptions().position(rosais).title(markerRosais.name).snippet("Level " + markerRosais.level));
        mMap.addMarker(new MarkerOptions().position(morro).title(markerEntreMorros.name).snippet("Level " + markerEntreMorros.level));
        mMap.addMarker(new MarkerOptions().position(urz).title(markerUrzelina.name).snippet("Level " + markerUrzelina.level));
        mMap.addMarker(new MarkerOptions().position(man).title(markerManadas.name).snippet("Level " + markerManadas.level));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 10));                                                                         // 8 talvez ?


    }
}




