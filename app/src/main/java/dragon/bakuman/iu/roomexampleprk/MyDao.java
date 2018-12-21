package dragon.bakuman.iu.roomexampleprk;

//you can specify possible methods for database operation within this interface

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    void addUser(User user);

    @Query("select * from users")
    public List<User> getUsers(); //this method will read all the users and the return type is a List



}
