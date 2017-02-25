package com.example.sneha.femmehacks;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CreateFamily extends AppCompatActivity {
    EditText member;
    Button enter;
    ArrayList<String> familyM=new ArrayList<>();
    ListView familyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_family);

        member=(EditText)(findViewById(R.id.editText));
        enter=(Button)(findViewById(R.id.button));

       enter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               familyM.add(member.getText()+"");
           }
       });

        CustomAdapter myAdapter=new CustomAdapter(this,R.layout.custom,familyM);
        Log.d("PRINT",familyList.toString());
        familyList.setAdapter(myAdapter);
    }

    public class CustomAdapter extends ArrayAdapter<String> {
        Context mainActivityContext;
        int layoutId;
        List alist;
        public CustomAdapter(Context context, int resource, List<String> objects){
            super(context, resource, objects);
            mainActivityContext=context;
            layoutId=resource;
            alist=objects;
        }
        /*
        public View getView (int position, View convertView, ViewGroup parent){
            Log.d("PRINT",mainActivityContext.toString());
            Log.d("PRINT",alist.toString());
            Log.d("PRINT",layoutId+"");
            LayoutInflater layoutInflater=(LayoutInflater)mainActivityContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            View adapterLayout=layoutInflater.inflate(layoutId,null);
            TextView textView=(TextView)adapterLayout.findViewById(R.id.name);
            textView.setText(alist.get(position).toString());
            return adapterLayout;
        }
        */

    }

}
