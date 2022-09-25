package com.example.yoasobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Albun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albun);

        ListView lista = (ListView) findViewById(R.id.lv);

        ArrayList<Albuns> livros = adicionarLivros();

        ArrayAdapter adapter = new HonnAdapter(this,livros);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(chamaLista());

    }

    public AdapterView.OnItemClickListener chamaLista() {

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int position, long id) {

                Intent intent;

                switch (position) {

                    case 0:
                        intent = new Intent(getBaseContext(), YoruNiKakeru.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), TheBook.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(),Eside.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(),TheBook2.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(),Gunjou.class );
                        startActivity(intent);

                }

            }
        };
        return onItemClickListener;

    }

       private ArrayList<Albuns> adicionarLivros() {
        ArrayList<Albuns> albun = new ArrayList<>();

            Albuns a = new Albuns("夜に駆ける" + "\n(Yoru ni Kakeru)", R.drawable.backy);

            Albuns b = new Albuns("The Book", R.drawable.backya);

            Albuns c = new Albuns("E-Side", R.drawable.boeside);

            Albuns d = new Albuns("The Book 2", R.drawable.book);

            Albuns e = new Albuns("群青" + "\n(Gunjou)", R.drawable.ao);

            albun.add(a);
            albun.add(b);
            albun.add(c);
            albun.add(d);
            albun.add(e);

            return albun;

        }



    }
