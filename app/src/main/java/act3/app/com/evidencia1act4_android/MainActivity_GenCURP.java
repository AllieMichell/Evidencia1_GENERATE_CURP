package act3.app.com.evidencia1act4_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_GenCURP extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    Spinner estados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__gen_curp);

        radioGroup = findViewById(R.id.radio_genero);


        estados = (Spinner)findViewById(R.id.sp_estados);
        ArrayAdapter<CharSequence> eleccion = ArrayAdapter.createFromResource(this, R.array.estados, android.R.layout.simple_spinner_item);
        estados.setAdapter(eleccion);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_back:
                Toast.makeText(this, "Regresar", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_settings:
                Toast.makeText(this, "Ajustes", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_logout:
                Toast.makeText(this, "Cerrar sesión", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
