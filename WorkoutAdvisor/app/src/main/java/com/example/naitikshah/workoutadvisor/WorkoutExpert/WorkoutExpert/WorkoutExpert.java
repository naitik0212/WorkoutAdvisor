package com.example.naitikshah.workoutadvisor.WorkoutExpert.WorkoutExpert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naitikshah on 9/23/17.
 */

public class WorkoutExpert {

    public List<String> getWorkouts (String workouttypes){
        List <String> workout=new ArrayList<String>();

        if(workouttypes.equals("Chests")){
            workout.add("Barbell Bench Press(5 times)");
            workout.add("Flat Bench Dumbbell Press(10 times)");
            workout.add("Low-Incline Barbell Bench Press(10 times)");
            workout.add("Machine Decline Press(5 times)");
            workout.add("Seated Machine Chest Press(10 times)");
        }

        else if(workouttypes.equals("Biceps")){
            workout.add("Incline Hammer Curls(10 times)");
            workout.add("Incline Inner Biceps Curl(5 times)");
            workout.add("Standing Concentration Curl(10 times)");
            workout.add("EZ Bar Curl(10 times)");
            workout.add("Wide-Grip Standing Barrel Curl(10 times)");}

        else if(workouttypes.equals("Triceps")){
            workout.add("Band Skull Crusher(5 times)");
            workout.add("Bench Dips(10 times)");
            workout.add("Bench Press Power Lifting(5 times)");
            workout.add("Board Press(10 times)");
            workout.add("Body Tricep Press(10 times)");}

        else if(workouttypes.equals("Shoulders")){
            workout.add("Alternating Cable Shoulder Press(5 times)");
            workout.add("Alternating Deltoid Raise(10 times)");
            workout.add("Anti Gravity Press(10 times)");
            workout.add("Arm Circles(10 times)");
            workout.add("Back Flyes(10 times)");}

        else if(workouttypes.equals("Neck")){
            workout.add("Chin to Chin Stretch");
            workout.add("Isometric Neck Exercise");
            workout.add("Neck Bridge Prone");
            workout.add("Side Neck Stretch");
            workout.add("Neck SMR");}

        return workout;


        }

    }

