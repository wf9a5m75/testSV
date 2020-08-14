# StreetView crash (Google Maps SDK for Android v3.1.0 beta)

## Steps reproduce the problem

1. `git clone https://github.com/wf9a5m75/testSV`

2. Opens it with Android Studio

3. Runs it (and the app will be crashed)

4. Comments out the `implementation "com.google.android.gms:play-services-location:17.0.0"` in `app/build.gradle`
https://github.com/wf9a5m75/testSV/blob/master/app/build.gradle#L33

5. Runs it again (and you see the street view)

## Crash log

```
E/AndroidRuntime: FATAL EXCEPTION: GLThread 10717
    Process: com.example.myapplication, PID: 4825
    java.lang.NoSuchMethodError: No static method toByteArray(Ljava/io/File;)[B in class Lcom/google/android/gms/common/util/IOUtils; or its super classes (declaration of 'com.google.android.gms.common.util.IOUtils' appears in /data/app/com.example.myapplication-aokGPmcwzU2jTGvIqGUH5Q==/base.apk)
        at com.google.android.libraries.maps.ko.zza$zze.zza(DiskBackedLruCache.java:2)
        at com.google.android.libraries.maps.ko.zza.zza(DiskBackedLruCache.java:62)
        at com.google.android.libraries.maps.kn.zzb.zza(PanoramaDataCache.java:53)
        at com.google.android.libraries.maps.kn.zzj.zza(StreetViewTileFetchingService.java:30)
        at com.google.android.libraries.maps.kk.zzp.zza(StreetViewSphereRenderer.java:63)
        at com.google.android.libraries.maps.kh.zza.onDrawFrame(GLSurfaceViewRenderer.java:158)
        at android.opengl.GLSurfaceView$GLThread.guardedRun(GLSurfaceView.java:1573)
        at android.opengl.GLSurfaceView$GLThread.run(GLSurfaceView.java:1272)
```
