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

public class TheBook extends AppCompatActivity {

    String ongaku[] = {"「たぶん」","「ハルカ」", "「あの夢をなぞって」", "「ハルジオン」"};
    int ongakuIMG[] = {R.drawable.tabun, R.drawable.haruka, R.drawable.anoyume, R.drawable.haruji};
    int more = R.drawable.more;
    MediaPlayer mySong;
    ListView list;
    ImageView beck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_book);

        beck = (ImageView) findViewById(R.id.beck);

        beck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela= new Intent(TheBook.this,Albun.class);
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
                            mySong = MediaPlayer.create(TheBook.this, R.raw.tabun);
                        }
                        mySong.start();
                        break;

                    case 1:
                        if (mySong == null) {
                            mySong = MediaPlayer.create(TheBook.this, R.raw.haruka);
                        }
                        mySong.start();
                        break;
                    case 2:
                        if (mySong == null) {
                            mySong = MediaPlayer.create(TheBook.this, R.raw.ano);
                        }
                        mySong.start();
                        break;
                    case 3:
                        if (mySong == null) {
                            mySong = MediaPlayer.create(TheBook.this, R.raw.harujion);
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

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }


}
