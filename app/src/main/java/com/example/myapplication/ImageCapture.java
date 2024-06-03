package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageCapture extends AppCompatActivity {

    public static final int REQUEST_CODE = 102;
    public static final int REQUEST_CODE1 = 101;
    ImageView img;
    Button scan, gallery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_capture);

        img = findViewById(R.id.imageCapture);
        scan = findViewById(R.id.scanButton);



        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askPermissions();

                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, REQUEST_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img.setImageBitmap(photo);
        }
    }



          /*  private void openCamera() {
                Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera, REQUEST_CODE);

            }

*/
                private void askPermissions() {
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ImageCapture.this, new String[]{Manifest.permission.CAMERA}, REQUEST_CODE1);

                } else {


                }



            }

         //   private void onActivityResult() {
           //     Bitmap image = (Bitmap) data.getExtras().get("data");
             //   img.setImageBitmap(image);


            }


            //protected void onActivityResult(@NonNull Intent data){
              //
            // Bitmap image = (Bitmap) data.getExtras().get("data");
                //img.setImageBitmap(image);
         //   }








