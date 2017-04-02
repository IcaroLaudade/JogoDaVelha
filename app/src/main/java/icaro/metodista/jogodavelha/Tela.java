package icaro.metodista.jogodavelha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Icaro on 29/03/2017.
 */

public class Tela extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
    }
    public void carregarJogo(View view){
    String txtButton=((Button) view).getText().toString();

    if (txtButton.equalsIgnoreCase("1 PLAYER")){
        startActivity(new Intent(this,ComputadorVelha.class));
    }
        else{
        startActivity(new Intent(this,MainActivity.class));
    }

    }
}
