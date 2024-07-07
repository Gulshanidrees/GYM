package com.haris.gym;

import java.util.ArrayList;
import java.util.List;

public class ExerciseDatabase {
    List<ExerClass> getData(){
        List<ExerClass>data=new ArrayList<>();

        ExerClass ex=new ExerClass("https://images.squarespace-cdn.com/content/v1/5b9343ce4611a05bc46ea084/1579583611114-NIWJ4LHSBBZMH38F9FAF/Screen+Shot+2020-01-20+at+9.13.02+PM.png?format=2500w","Upper Body","5 sets a day");

        ExerClass ex1=new ExerClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStUpHKuS7jQDJNRwf7qtonToLP7MwJExpel6l_Uxo22kpBXc6xlBFSWT55dV-M7fnAkkQ&usqp=CAU","Lower Body","5 sets a day");

        ExerClass ex2=new ExerClass("https://i.ytimg.com/vi/Epit6DSq_ww/maxresdefault.jpg","Chest","5 sets a day");

        ExerClass ex3=new ExerClass("https://www.mensjournal.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTk2MTM3MjYxNjU0MTU2NDMz/fit-man-lunging.jpg","Legs","5 sets a day");

        ExerClass ex4=new ExerClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmP0TaTuc3tXxlXw0_hmfNhH1x_LUHfn3KBpr6zBV-sx5TcVdPGMJoTVx75bdMgS9k2bs&usqp=CAU","Arm Body","5 sets a day");

        ExerClass ex5=new ExerClass("https://www.bodybuilding.com/images/2021/march/10-best-back-exercises-for-muscle-header-v2-960x540.jpg","Back Body","5 sets a day");

        ExerClass ex6=new ExerClass("https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg","Neck","5 sets a day");
data.add(ex);
        data.add(ex1);
        data.add(ex2);
        data.add(ex3);
        data.add(ex4);
        data.add(ex5);
        data.add(ex6);

        return data;
    }


}
