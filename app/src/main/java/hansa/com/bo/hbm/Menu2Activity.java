package hansa.com.bo.hbm;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Menu2Activity extends AppCompatActivity {



    ArrayList<MenuHansa> listaMenu;
    RecyclerView recyclerMenu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        listaMenu = new ArrayList<>();
        recyclerMenu = (RecyclerView) findViewById(R.id.recyclerId);
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //recyclerMenu.setLayoutManager(new LinearLayoutManager(this));
        //recyclerMenu.setLayoutManager(new GridLayoutManager(this,2));

        recyclerMenu.setLayoutManager(new GridLayoutManager(this,2));


        llenarPersonajes();

        AdapterDatos adapter = new AdapterDatos(listaMenu);
        recyclerMenu.setAdapter(adapter);


    }
    // al nuestra lista
    private void llenarPersonajes() {

        listaMenu.add(new MenuHansa("inicio",R.drawable.usuario));
        listaMenu.add(new MenuHansa("clientes",R.drawable.usuario));
        listaMenu.add(new MenuHansa("productos",R.drawable.usuario));
        listaMenu.add(new MenuHansa("pedidos",R.drawable.usuario));
        listaMenu.add(new MenuHansa("facturacion",R.drawable.usuario));
        listaMenu.add(new MenuHansa("cobranzas",R.drawable.usuario));
        listaMenu.add(new MenuHansa("Dashboard",R.drawable.usuario));

    }


}
