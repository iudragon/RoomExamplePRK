package dragon.bakuman.iu.roomexampleprk;

//you can specify possible methods for database operation within this interface

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);


}
