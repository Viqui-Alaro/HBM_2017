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
    private LinearLayout lyInfo;


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

        txtNomU = (TextView)findViewById(R.id.txtNomU);
        lyInicio = (LinearLayout)findViewById(R.id.lyInicio);
        lyClientes = (LinearLayout)findViewById(R.id.lyClientes);
        lyProductos = (LinearLayout)findViewById(R.id.lyProductos);



        lyInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent incioIntent = new Intent(context,InicioActivity.class);
                incioIntent.putExtra("titulo","Inicio");
                startActivity(incioIntent);
            }
        });


    }

}
