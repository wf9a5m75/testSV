package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.libraries.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.libraries.maps.StreetViewPanorama;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import com.google.android.libraries.maps.StreetViewPanoramaView;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewSource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StreetViewPanoramaOptions svOptions = new StreetViewPanoramaOptions();
        svOptions.position(new LatLng(42.345573, -71.098326), StreetViewSource.OUTDOOR);
        StreetViewPanoramaCamera.Builder cameraBuilder = new StreetViewPanoramaCamera.Builder();
        cameraBuilder.bearing(0);
        cameraBuilder.zoom(1);
        cameraBuilder.tilt(0);

        svOptions.panoramaCamera(cameraBuilder.build());

        final StreetViewPanoramaView panoramaView = new StreetViewPanoramaView(this, svOptions);
        FrameLayout.LayoutParams lParams = new FrameLayout.LayoutParams(1000, 1000);

        lParams.topMargin = 10;
        lParams.leftMargin = 10;
        panoramaView.setLayoutParams(lParams);
        final ConstraintLayout root = this.findViewById(R.id.main_frame);
        panoramaView.onCreate(null);

        panoramaView.getStreetViewPanoramaAsync(new OnStreetViewPanoramaReadyCallback() {
            @Override
            public void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {
                panoramaView.onResume();
                root.addView(panoramaView);
            }
        });;
    }
}