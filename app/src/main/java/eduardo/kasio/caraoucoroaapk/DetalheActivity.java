package eduardo.kasio.caraoucoroaapk;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imgMoeda,imgBtnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        inicializarComponentes();
        //Intent it = new Intent().getExtras()
        Bundle extra = getIntent().getExtras();
        if(extra!= null)
        {
            String opc = extra.getString("opcao");
            if(opc.equals("cara"))
            {
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this,R.drawable.moeda_cara));
                mensagem("Deu Cara!");
            }
            else{
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_coroa));
                mensagem("Deu Coroa!");
            }

        }

        imgBtnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void inicializarComponentes() {
        imgMoeda = (ImageView) findViewById(R.id.imgMoeda);
        imgBtnVoltar = (ImageView) findViewById(R.id.imgBtnVoltar);
    }

    private void mensagem(String msg)
    {
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
