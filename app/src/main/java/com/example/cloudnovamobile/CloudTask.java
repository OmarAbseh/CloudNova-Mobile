package com.example.cloudnovamobile;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CloudTask {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String taskname;
    public String Service;
    public String status;
    public String notes;
    public String date;

}
