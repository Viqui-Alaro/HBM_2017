package hansa.com.bo.hbm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private Context context;
    private String usuario;
    private LinearLayout lyInicio;
    private LinearLayout lyClientes;
    private LinearLayout lyProductos;
    private LinearLayout lyPedidos;
    private LinearLayout lyFacturacion;
    private LinearLayout lyCobranzas;
    private LinearLayout lyEntregas;
    private LinearLayout lyDashboard;




    private TextView txtNomU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        context = this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        usuario = intent.getStringExtra("usuario");

        txtNomU = (TextView) findViewById(R.id.txtNomU);
        lyInicio = (LinearLayout) findViewById(R.id.lyInicio);
        lyClientes = (LinearLayout) findViewById(R.id.lyClientes);
        lyProductos = (LinearLayout) findViewById(R.id.lyProductos);
        lyPedidos = (LinearLayout) findViewById(R.id.lyPedidos);
        lyFacturacion = (LinearLayout)findViewById(R.id.lyFacturacion);
        lyCobranzas = (LinearLayout)findViewById(R.id.lyCobranzas);
        lyEntregas = (LinearLayout)findViewById(R.id.lyEntregas);
        lyDashboard = (LinearLayout) findViewById(R.id.lyDashboard);




        lyInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent incioIntent = new Intent(context, InicioActivity.class);
                incioIntent.putExtra("titulo", "Inicio");
                startActivity(incioIntent);
            }
        });


        lyClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clientesIntent = new Intent(context, ClientesActivity.class);
                clientesIntent.putExtra("titulo", "Clientes");
                startActivity(clientesIntent);
            }
        });

        lyProductos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent productosIntent = new Intent(context,ProductosActivity.class);
                productosIntent.putExtra("titulo","productos");
                startActivity(productosIntent);
            }
        });

        lyPedidos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent pedidosIntent = new Intent(context,PedidosActivity.class);
                pedidosIntent.putExtra("titulo","Pedidos");
                startActivity(pedidosIntent);
            }
        });

        lyFacturacion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent facturacionIntent = new Intent(context,FacturacionActivity.class);
                facturacionIntent.putExtra("titulo","facturacion");
                startActivity(facturacionIntent);
            }
        });


        lyCobranzas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent cobranzasIntent = new Intent(context,CobranzasActivity.class);
                cobranzasIntent.putExtra("titulo","Cobramzas");
                startActivity(cobranzasIntent);
            }
        });


        lyEntregas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent entregasIntent = new Intent(context,EntregasActivity.class);
                entregasIntent.putExtra("titulo","Entregas");
                startActivity(entregasIntent);
            }
        });

        lyDashboard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent dashboardIntent =  new Intent(context,DashboardActivity.class);
                dashboardIntent.putExtra("titulo","Dashboard");
                startActivity(dashboardIntent);
            }
        });



    }
}
