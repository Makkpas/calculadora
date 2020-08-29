package cr.ac.ucr.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvInput;
    TextView tvOutput;
    String mostrar;
    int valorA;
    int valorB;
    int resultado;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInput = findViewById(R.id.tv_input);
        tvOutput = findViewById(R.id.tv_output);


        valorA = 0;
        valorB = 0;
        resultado = 0;
        operacion = "";
    }

    public void clear(){
        tvInput.setText("");
        tvOutput.setText("");

//        valorA = 0;
//        valorB = 0;
//        resultado = 0;
//        operacion = "";
    }

    public void reset(){
        valorA=0;
        resultado=0;
        valorB=0;
        operacion = "igualado";
    }

    public void onClick(View view){
        switch (view.getId()){
//                Boton para limpiar pantalla
            case R.id.btn_clear:
                clear();
                break;

//                Numerales
            case R.id.btn_cero:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"0");
                break;
            case R.id.btn_uno:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"1");
                break;
            case R.id.btn_dos:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"2");
                break;
            case R.id.btn_tres:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"3");
                break;
            case R.id.btn_cuatro:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"4");
                break;
            case R.id.btn_cinco:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"5");
                break;
            case R.id.btn_seis:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"6");
                break;
            case R.id.btn_siete:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"7");
                break;
            case R.id.btn_ocho:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"8");
                break;
            case R.id.btn_nueve:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"9");
                break;

//          Botones de calculos

            //TODO: Agregar las posibilidad de si se empieza con una operación
            case R.id.btn_suma:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"+");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0+");
                }

                break;

            case R.id.btn_menos:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"-");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0-");
                }
                break;

            case R.id.btn_division:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"/");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0/");
                }
                break;
            case R.id.btn_multiplicacion:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"*");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0*");
                }
                break;

            case R.id.btn_poncentaje:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"%");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0%");
                }
                break;

            case R.id.btn_punto:
                if (!tvInput.getText().toString().equals("")){
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+".");
                }else{
                    mostrar=tvInput.getText().toString();
                    tvInput.setText(mostrar+"0.");
                }
                break;

            case R.id.btn_parentesis_izquierdo:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+"(");
                break;

            case R.id.btn_parentesis_derecho:
                mostrar=tvInput.getText().toString();
                tvInput.setText(mostrar+")");
                break;

            case R.id.btn_igual:
               if (!tvInput.getText().toString().equals("")){
                   mostrar = tvInput.getText().toString();

                   mostrar = mostrar.replaceAll("%", "/100");

                   Context rhino = Context.enter();

                   rhino.setOptimizationLevel(-1);

                   String resultadoFinal = "";


                   try {
                       Scriptable scriptable = rhino.initStandardObjects();
                       resultadoFinal = rhino.evaluateString(scriptable,mostrar,"javascript",1,null).toString();
                   }catch (Exception e){
                       resultadoFinal="Pará pará boludo, que flashás haciendo  operciones?";
                   }

                   tvOutput.setText(resultadoFinal);
               }else {
                   Toast.makeText(this,"Digita un numero primero", Toast.LENGTH_SHORT).show();
               }


                break;
            default:
                break;
        }
    }
}