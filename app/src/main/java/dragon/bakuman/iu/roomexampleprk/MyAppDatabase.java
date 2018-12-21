package dragon.bakuman.iu.roomexampleprk;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {User.class}, version = 1)
public abstract class MyAppDatabase extends RoomDatabase {

    //this class must contain an abstract method that return object of the data access object (Dao)

    public abstract MyDao mMyDao();



}
