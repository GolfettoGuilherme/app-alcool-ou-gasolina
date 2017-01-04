package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView textoResultado;
    private Button botaoVerificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);

        textoResultado = (TextView) findViewById(R.id.textoVerificarId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //alcool / gasolina
                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    //gasolina
                    textoResultado.setText("É melhor utilizar Gasolina");
                } else{
                    //alcool
                    textoResultado.setText("É melhor utilizar Álcool");
                }

            }
        });
    }
}
