package upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;

    float x = 0;
    float y = 0;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        //tvResultado.setText("HolaMundo");


    }

    public void Escribir7(View view){
        x =Float.parseFloat(tvResultado.getText().toString());
        if(x == 0){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void Escribir8(View view) {
        x =Float.parseFloat(tvResultado.getText().toString());
        if(x == 0){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void Escribir9(View view) {
        x =Float.parseFloat(tvResultado.getText().toString());
        if(x == 0){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void Clear(View view) {
        tvResultado.setText("0");
        x = 0;
        y = 0;
        operacion = "";
    }

    public void dividir(View view) {
        x = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");

    }

    public void Igual(View view) {
        y = Float.parseFloat(tvResultado.getText().toString());
        if (operacion.equals("/")){
            if (y == 0){


            }else {
                float result = x / y;
                tvResultado.setText(result + "");
            }
        }
        else if (operacion.equals("*")){
            float result = x * y;
            tvResultado.setText(result + "");
        }
        else if (operacion.equals("+")){
            float result = x + y;
            tvResultado.setText(result + "");

        }
        else if (operacion.equals("-")){
            float result = x - y;
            tvResultado.setText(result + "");

        }

        x = 0;
        y = 0;
        operacion = "";
    }
}