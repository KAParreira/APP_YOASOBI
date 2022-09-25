package com.example.yoasobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Gunjou extends AppCompatActivity {

    String ongaku[] = {"「群青」"};
    int ongakuIMG[] = {R.drawable.ao};
    int more = R.drawable.more;
    MediaPlayer mySong;
    ListView list;
    ImageView beck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunjou);

        beck = (ImageView) findViewById(R.id.beck);

        beck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela= new Intent(Gunjou.this,Albun.class);
                startActivity(tela);
            }
        });

        list = (ListView) findViewById(R.id.musics);
        OngakuAdapter ongakuAdapter = new OngakuAdapter(getApplicationContext(),ongaku,ongakuIMG,more);
        list.setAdapter(ongakuAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                switch (position) {
                    case 0:
                        if (mySong == null) {
                            mySong = MediaPlayer.create(Gunjou.this, R.raw.gunjou);
                        }
                        mySong.start();
                        break;
                }
            }
        });

    }

    public void pauseIT(View v) {
        if(mySong != null){
            mySong.pause();
        }
    }

    public void stopIT(View v){
        stopPlayer();
    }

    private void stopPlayer(){
        if(mySong != null){
            mySong.release();
            mySong = null;
            Toast.makeText(this,"MediaPlayer Finished", Toast.LENGTH_SHORT).show();
        }
    }

}
