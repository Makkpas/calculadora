package cr.ac.ucr.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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

//        textView.setText("");
        valorA = 0;
        valorB = 0;
        resultado = 0;
        operacion = "";
    }

    public void clear(){
        valorA = 0;
        valorB = 0;
        resultado = 0;
        operacion = "";
//        textView.setText("");
    }

    public void reset(){
        valorA=0;
        resultado=0;
        valorB=0;
        operacion = "igualado";
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_uno:
                if(operacion.equals("igualado")){
//                    textView.setText("1");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"1";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_dos:
                if(operacion.equals("igualado")){
//                    textView.setText("2");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"2";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_tres:
                if(operacion.equals("igualado")){
//                    textView.setText("3");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"3";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_cuatro:
                if(operacion.equals("igualado")){
//                    textView.setText("4");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"4";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_cinco:
                if(operacion.equals("igualado")){
//                    textView.setText("5");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"5";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_seis:
                if(operacion.equals("igualado")){
//                    textView.setText("6");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"6";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_siete:
                if(operacion.equals("igualado")){
//                    textView.setText("7");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"7";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_ocho:
                if(operacion.equals("igualado")){
//                    textView.setText("8");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"8";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_nueve:
                if(operacion.equals("igualado")){
//                    textView.setText("9");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"9";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_cero:
                if(operacion.equals("igualado")){
//                    textView.setText("0");
                    operacion = "";
                }else{
//                    mostrar=textView.getText().toString()+"0";
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_clear:
                clear();
                break;
            case R.id.btn_suma:
                operacion="suma";
                if(valorA == 0){
//                    valorA = Integer.parseInt(textView.getText().toString());
//                    textView.setText("");
                }else {
                    if(resultado == 0){
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado = valorA + valorB;
                    }else{
//                        resultado = resultado + Integer.parseInt(textView.getText().toString());
                    }
                    mostrar=""+resultado;
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_menos:
                operacion="resta";
                if(valorA == 0){
//                    valorA = Integer.parseInt(textView.getText().toString());
//                    textView.setText("");
                }else {
                    if(resultado == 0){
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado = valorA - valorB;
                    }else{
//                        resultado = resultado - Integer.parseInt(textView.getText().toString());
                    }
                    mostrar=""+resultado;
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_division:
                operacion="division";
                if(valorA == 0){
//                    valorA = Integer.parseInt(textView.getText().toString());
//                    textView.setText("");
                }else {
                    if(resultado == 0){
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado = valorA / valorB;
                    }else{
//                        resultado = resultado / Integer.parseInt(textView.getText().toString());
                    }
                    mostrar=""+resultado;
//                    textView.setText(mostrar);
                }
                break;
            case R.id.btn_multiplicacion:
                operacion="multiplicacion";
                if(valorA == 0){
//                    valorA = Integer.parseInt(textView.getText().toString());
//                    textView.setText("");
                }else {
                    if(resultado == 0){
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado = valorA * valorB;
                    }else{
//                        resultado = resultado * Integer.parseInt(textView.getText().toString());
                    }
                    mostrar=""+resultado;
//                    textView.setText(mostrar);
                }
                break;


            case R.id.btn_igual:
                switch(operacion){
                    case "suma":

//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado=valorA+valorB;
                        mostrar=""+resultado;
//                        textView.setText(mostrar);
                        reset();

                        break;
                    case "resta":
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado=valorA-valorB;
                        mostrar=""+resultado;
//                        textView.setText(mostrar);
                        reset();
                        break;
                    case "division":
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado=valorA/valorB;
                        mostrar=""+resultado;
//                        textView.setText(mostrar);
                        reset();
                        break;
                    case "multiplicacion":
//                        valorB = Integer.parseInt(textView.getText().toString());
                        resultado=valorA*valorB;
                        mostrar=""+resultado;
//                        textView.setText(mostrar);
                        reset();
                        break;
                }
                break;
            default:
                break;
        }
    }
}