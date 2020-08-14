# StreetView crash (Google Maps SDK for Android v3.1.0 beta)

## Steps reproduce the problem

1. `git clone https://github.com/wf9a5m75/testSV`

2. Opens it with Android Studio

3. Runs it (and the app will be crashed)

4. Comments out the `implementation "com.google.android.gms:play-services-location:17.0.0"` in `app/build.gradle`
https://github.com/wf9a5m75/testSV/blob/master/app/build.gradle#L33

5. Runs it again (and you see the street view)

