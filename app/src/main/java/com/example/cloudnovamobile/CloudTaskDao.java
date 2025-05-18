package com.example.cloudnovamobile;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;



@Dao
public interface CloudTaskDao {

    @Insert
    void insert(CloudTask task);

    @Update
    void update(CloudTask task);

    @Delete
    void delete(CloudTask task);


    @Query("SELECT * FROM CloudTask ORDER BY id DESC")
    List<CloudTask> getAllTasks();
}

