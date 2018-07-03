package com.ccs.app.viewdocandpdf;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f();
    }

    private void f() {
        File file = new File(getCacheDir(), "test.pdf");

        Uri uri = FileProvider.getUriForFile(this, "be.myapplication", file);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//        intent.setDataAndType(uri, "application/pdf");
        intent.setData(uri);

        startActivity(intent);
    }

}
