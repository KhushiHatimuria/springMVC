package com.khushi.jobapp.service;

import com.khushi.jobapp.model.job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//this annotation means that this class contains the business logic of the application
//when springboot starts it creates an object for us and manages it and it is caled spring bean
public class jobservice{
    private ArrayList<job> jobs=new ArrayList<job>();

    public  void addjobs(job jobn) {
       jobs.add(jobn);
    }

    public  List<job> getalljobs() {
        return jobs;
    }
}
