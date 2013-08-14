package com.essentialab.listview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.app.ListActivity;

public class HomeActivity extends ListActivity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        // Arreglo de Strings para llenar el adaptador
        final String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2" };
        // Adaptador utilizado para ser pasado al metodo setListAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        
        // Recuperamos la lista y colocamos un listener para cada elemento de la lista
        getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Log.i("Selected", values[position]);
				showMsg(values[position]);
			}
		});
    }
    
    // Muestra un mensaje con el elemento selecionado de la lista
    public void showMsg(String string){
    	Toast.makeText(this, "Selected: "+ string, Toast.LENGTH_SHORT).show();
    }

}
