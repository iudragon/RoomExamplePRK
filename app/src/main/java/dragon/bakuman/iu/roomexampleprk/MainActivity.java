package dragon.bakuman.iu.roomexampleprk;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

 import dragon.bakuman.iu.roomexampleprk.R;

 public class MainActivity extends AppCompatActivity {

     public static FragmentManager sFragmentManager;
     public static MyAppDatabase sMyAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sFragmentManager = getSupportFragmentManager();

        sMyAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "userdb").allowMainThreadQueries().build();

        if (findViewById(R.id.fragment_container) != null){

            if (savedInstanceState != null){


                return;
            }

            sFragmentManager.beginTransaction().add(R.id.fragment_container, new HomeFragment()).commit();
        }






    }
}
