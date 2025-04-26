# Keep everything in MainActivity for now
-keep class com.example.mygridapp.MainActivity { *; }

# Don't obfuscate logs
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}
0
