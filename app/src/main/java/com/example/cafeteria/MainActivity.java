package com.example.cafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int cont = 0;
    private int cont2 = 0;
    private int cont3 = 0;
    private int preoto;
    private int preço;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt(View view){
        Toast.makeText(this, "Add with success", Toast.LENGTH_LONG).show();
        this.cont++;
        this.apertar();
    }
    public void bt2(View view){
        Toast.makeText(this, "Add with success", Toast.LENGTH_LONG).show();
        this.cont2++;
        this.apertar2();
    }
    public void bt3(View view){
        Toast.makeText(this, "Add with success", Toast.LENGTH_LONG).show();
        this.cont3++;
        this.apertar3();
    }
    public void apertar(){
        TextView botao = findViewById(R.id.textView);
        botao.setText(String.valueOf(this.cont));
    }
    public void apertar2(){
        TextView botao2 = findViewById(R.id.textView2);
        botao2.setText(String.valueOf(this.cont2));
    }
    public void apertar3(){
        TextView botao3 = findViewById(R.id.textView3);
        botao3.setText(String.valueOf(this.cont3));

    }
    public void totalprice(View view){
        preço = cont + cont2 + cont3;
        preoto = preço * 3;
        TextView botao3 = findViewById(R.id.textView7);
        botao3.setText(String.valueOf(this.preoto));
    }
    public void encomenda(View view){
        email();
    }
    public void email() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, "cafe.do.ifc.concordia@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Encomenda de Café");
        intent.putExtra(Intent.EXTRA_TEXT, "Desejo comprar: "+cont+" Cappucinos, "+cont2+" Mylk Coffess e "+cont3+" Cafés normais");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        cont = 0;
        cont2 = 0;
        cont3 = 0;
        preoto = 0;






























    }

}
