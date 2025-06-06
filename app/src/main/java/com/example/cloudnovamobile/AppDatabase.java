package com.example.cloudnovamobile;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {CloudTask.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {


    private static AppDatabase instance;

    public abstract CloudTaskDao cloudTaskDao();

    public static synchronized AppDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "cloudnova_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
}
