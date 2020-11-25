package com.curso.mapagooglecoursera;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private int ubicacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Bundle bundle = getIntent().getExtras();
        ubicacion = bundle.getInt("ubicacion1");

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng target;
        String mensaje = "";

        switch (ubicacion){
            case 1:
                target = new LatLng(6.228709113046331, -75.59572036448729);
                mensaje = "San Bernardo";
                break;
            case 2:
                target = new LatLng(6.231565860945733, -75.59150184223236);
                mensaje = "Belen";
                break;
            case 3:
                target = new LatLng(6.230453761751884, -75.60478198996725);
                mensaje = "La palma";
                break;
            case 4:
                target = new LatLng(6.237054574141134, -75.59731190656515);
                mensaje = "Los almendros";
                break;
            default:
                target = new LatLng(0, -0);
                mensaje = "Error, no hubo selección";
        }
        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions().position(target).title(mensaje));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(target));
    }
}