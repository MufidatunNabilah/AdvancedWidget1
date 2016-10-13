<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent">


<LinearLayout android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingBottom="@dimen/activity_vertical_margin"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin"
        tools:context="id.sch.smktelkom_mlg.learn.advancedwidget1.MainActivity">


<Spinner android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/spinnerJumlahAnak"/>


<Button android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Proses"
        android:id="@+id/buttonProses"/>

<TextView android:layout_width="match_parent"
        android:layout_height="wrap_content"
        tools:text="Hasil"
        android:id="@+id/textViewHasil"/>

</LinearLayout>
</ScrollView>
