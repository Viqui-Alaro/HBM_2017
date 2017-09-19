package hansa.com.bo.hbm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;

    public final static String LOG = "HBM_Android";

    public final static String USUARIO_VALIDO = "root";
    public final static String PASSWORD_VALIDO = "123456";


    private TextView txtUsuario;
    private TextView txtPassword;
    private Button btnIngresar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        Intent intent =getIntent();
        txtUsuario = (TextView) findViewById(R.id.txtUsuario);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        lblResultado = (TextView) findViewById(R.id.lblResultado);


        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String usuario = txtUsuario.getText().toString();
                String password = txtPassword.getText().toString();

                if (usuario.equals(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDO)) {

                    Intent menuIntent = new Intent(context,MenuActivity.class);
                    menuIntent.putExtra("titulo","Menu");
                    startActivity(menuIntent);
                    txtUsuario.setText("");
                    txtPassword.setText("");
                    txtUsuario.requestFocus();


                }
                else{
                    lblResultado.setText(getString((R.string.login_error)));
                    txtUsuario.setText("");
                    txtPassword.setText("");
                    txtUsuario.requestFocus();
                }

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG,"onRestart");
    }
}
