package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.myapplication.databinding.ActivityMainBinding;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class pen extends AppCompatActivity implements ExampleDialog.DialogListener {

    ImageView iv;
    Button button;



    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pen);


        // binding = ActivityMainBinding.inflate(getLayoutInflater());
        // setContentView(binding.getRoot());

      //  iv = findViewById(R.id.scanner);

        button = findViewById(R.id.AddClass);


       // iv.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View view) {
               // startActivity(new Intent(pen.this, Scan.class));
           // }

        //});

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog();
            }
        });



   /*     setupData();

        setupList();

        setUpOnClickListener();
    }

    private void setupData() {

    }


    private void setupList() {

        listView = (ListView) findViewById(R.id.list_item);

        //ListAdapter adapter = new ListAdapter(getApplicationContext(),0 list_sections);
//        listView.setAdapter(adapter);

    }


    private void setUpOnClickListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                List_Section select = (List_Section) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), List_Section.class);
            }
        });
    }

*/

        //String[] className = {"BSCS - 601", "BSIT - 401", "BSTM -701", "BSCRIM - 201", "BSCRIM - 201", "BSCRIM - 201"};

        //String[] yeaLevel = {"3rd Year", "2nd Year", "4th year", "1st year", "1st year", "1st year"};

        // listView = findViewById(R.layout.list_item);

        // ArrayList<List_Section> list_SectionArrayList = new ArrayList<>();

        // for (int i = 0; i < className.length; i++) {

        //   list_section = new List_Section(className[i], yeaLevel[i]);

        // list_sections.add(list_section);

     /*    ListView listView = findViewById(R.id.list_item);
        List<String> list = new ArrayList<>();

        list.add("BSCS - 601");
       list.add("BSCS - 602");
        list.add("BSCRIM - 201");
        list.add("BSIT - 204");
        list.add("BSIT - 205");
        list.add("BSIT - 206");
        list.add("BSIT - 207");
        list.add("BSIT - 208");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);


        listView.setAdapter(arrayAdapter);

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(pen.this, CS_601.class));
                }
                if (position == 1) {
                    startActivity(new Intent(pen.this, CS_602.class));
                }
            }


        });
        //    list_SectionArrayList.add(list_section);
        //  }

        //    ListAdapter listAdapter = new ListAdapter(pen.this, list_SectionArrayList);

        //  binding.listview.setAdapter(listAdapter);
    }
  /*  public void order(View v){
//Create excel to android app
        try {
            AssetManager am = getAssets();
            InputStream is = am.open("Book1.xls");
            Workbook wb = Workbook.getWorkbook(is);
            Sheet s = wb.getSheet(0);
            int row =s.getRows();
            int col = s.getColumns();
            String xx="";

            for (int i=0; i<row; i++){
                for(int c=0; c<col; c++){
                    Cell z  =s.getCell(c,i);
                     xx= xx+z.getContents();

                }
                xx=xx +"\n";
            }
            displayy(xx);


        }catch (Exception e){

        }

    }
        public void displayy (String value){

            TextView x = (TextView) findViewById(R.id.textView23);
            x.setText(value);
       }*/


    }


    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "ExampleDialog");
    }


    @Override
    public void applyTexts(String input) {


        ListView listView = findViewById(R.id.list_item);
        List<String> list = new ArrayList<>();

        list.add(input);





            // list.add("BSCS - 602");
            // list.add("BSCRIM - 201");
            // list.add("BSIT - 204");
            // list.add("BSIT - 205");
            // list.add("BSIT - 206");
            // list.add("BSIT - 207");
            // list.add("BSIT - 208");


            ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);


            listView.setAdapter(arrayAdapter);




            listView.setClickable(true);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        startActivity(new Intent(pen.this, CS_601.class));
                    }
                    if (position == 1) {
                        startActivity(new Intent(pen.this, CS_602.class));
                    }
                }


            });


        }
    }



