package eduardo.kasio.caraoucoroaapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView btnJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        inicializarComponentes();

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gerando aleaatório.
                Random rnd = new Random();
                int sorteado = rnd.nextInt(2);
                //0 cara e 1 coroa

                Intent it = new Intent(MainActivity.this, DetalheActivity.class);
                it.putExtra("opcao", opcao[sorteado]);

                startActivity(it);
            }

        });
        
    }

    private void inicializarComponentes() {
        btnJogar = (ImageView) findViewById(R.id.imgBtnJogar);
    }
}
