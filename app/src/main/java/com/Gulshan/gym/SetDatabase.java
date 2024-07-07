package com.haris.gym;

import java.util.ArrayList;
import java.util.List;

public class SetDatabase {
    List<SetClass> getData(String a){
        List<SetClass> sen=new ArrayList<>();
        SetClass s1 = new SetClass(
                "https://blogscdn.thehut.net/app/uploads/sites/495/2020/05/iStock-1149242526_1590743557.jpg",
                "Push-Up",
                "Upper Body",
                "Chest, Shoulders, Triceps",
                "A bodyweight exercise that involves lowering and raising the body using the arms while keeping the body straight",
                "3-4"
        );

        SetClass s2 = new SetClass(
                "https://www.anytimefitness.com/wp-content/uploads/2024/01/AF-HERO_BenchPress.jpg",
                "Bench Press",
                "Upper Body",
                "Chest, Shoulders, Triceps",
                "A weightlifting exercise performed lying on a bench, pressing a barbell or dumbbells up from the chest",
                "3-4"
        );

        SetClass s3 = new SetClass(
                "https://www.dmoose.com/cdn/shop/articles/1_71d97192-f77f-47fa-a059-87456a2c1fb1.jpg?v=1647872386",
                "Dumbbell Shoulder Press",
                "Upper Body",
                "Shoulders, Triceps",
                "A weightlifting exercise where dumbbells are pressed overhead from shoulder height",
                "3-4"
        );

        SetClass s4 = new SetClass(
                "https://media.post.rvohealth.io/wp-content/uploads/2022/04/female-workout-bent-over-row-732-549-feature-thumb-732x549.jpg",
                "Bent-Over Row",
                "Upper Body",
                "Back, Biceps",
                "A weightlifting exercise where a barbell or dumbbells are pulled towards the torso while bent over",
                "3-4"
        );
        // Lower Body Exercises
        SetClass l1 = new SetClass(
                "https://static.strengthlevel.com/images/exercises/squat/squat-800.jpg",
                "Squat",
                "Lower Body",
                "Quads, Glutes, Hamstrings",
                "A lower body exercise where you bend your knees and lower your hips as if sitting down, then stand back up.",
                "3-4"
        );

        SetClass l2 = new SetClass(
                "https://media.gq.com/photos/59fcc9486c531f2c62ea3e9c/master/pass/gq-lunge.jpg",
                "Lunge",
                "Lower Body",
                "Quads, Glutes, Hamstrings",
                "A lower body exercise where you step forward with one leg and lower your hips until both knees are bent at a 90-degree angle.",
                "3-4"
        );

// Chest Exercises
        SetClass c1 = new SetClass(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIDciUoOWGXkgn2rLYU_PAia4YIEdziduVaw&s",
                "Chest Fly",
                "Chest",
                "Chest, Shoulders",
                "A weightlifting exercise performed lying on a bench, where dumbbells are moved in an arc motion, extending and contracting the chest.",
                "3-4"
        );

        SetClass c2 = new SetClass(
                "https://static.strengthlevel.com/images/exercises/bench-press/bench-press-800.jpg",
                "Incline Bench Press",
                "Chest",
                "Upper Chest, Shoulders, Triceps",
                "A weightlifting exercise performed on an inclined bench, pressing a barbell or dumbbells up from the upper chest.",
                "3-4"
        );

// Neck Exercises
        SetClass n1 = new SetClass(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLIcTf_3UjVK6PHgN6nocKPzAd1smau5RFCA&s",
                "Neck Flexion",
                "Neck",
                "Neck Flexors",
                "A neck exercise where you nod your head forward, bringing your chin towards your chest.",
                "3-4"
        );

        SetClass n2 = new SetClass(
                "https://www.researchgate.net/publication/360277427/figure/fig5/AS:11431281187917078@1694451118004/Neck-exercise-A-Head-retarction-B-Neck-extension-C-Neck-flexion-D-Neck.tif",
                "Neck Extension",
                "Neck",
                "Neck Extensors",
                "A neck exercise where you lift your head backward, extending your neck and looking upward.",
                "3-4"
        );
        // Leg Exercises
        SetClass leg1 = new SetClass(
                "https://static.strengthlevel.com/images/exercises/bodyweight-squat/bodyweight-squat-800.jpg",
                "Bodyweight Squat",
                "Legs",
                "Quads, Glutes, Hamstrings",
                "A leg exercise where you bend your knees and lower your hips as if sitting down, then stand back up.",
                "3-4"
        );

        SetClass leg2 = new SetClass(
                "https://hips.hearstapps.com/hmg-prod/images/front-squat-1662029944.jpg?resize=980:*",
                "Barbell Squat",
                "Legs",
                "Quads, Glutes, Hamstrings",
                "A leg exercise where you squat with a barbell placed on your shoulders, lowering your hips as if sitting down, then standing back up.",
                "3-4"
        );

// Arm Exercises
        SetClass arm1 = new SetClass(
                "https://www.trainheroic.com/wp-content/uploads/2023/01/AdobeStock_186644984-TH-jpg.webp",
                "Bicep Curl",
                "Arm Body",
                "Biceps",
                "An arm exercise where you curl dumbbells or a barbell towards your shoulders.",
                "3-4"
        );

        SetClass arm2 = new SetClass(
                "https://www.dmoose.com/cdn/shop/articles/1_b930cb3e-8dac-4e45-9617-1d7b4594d264.png?v=1646823099",
                "Tricep Extension",
                "Arm Body",
                "Triceps",
                "An arm exercise where you extend a dumbbell or barbell overhead, straightening your arms to engage the triceps.",
                "3-4"
        );

// Back Exercises
        SetClass back1 = new SetClass(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7FK2a5LU2teECa87G0ZxUYDJQulaeUJleAg&s",
                "Pull-Up",
                "Back Body",
                "Latissimus Dorsi, Biceps",
                "A back exercise where you pull your body up to a bar, lifting your chin above the bar.",
                "3-4"
        );

        SetClass back2 = new SetClass(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXDkThIy4oVo55s-nv_f1cqaHLUAMZMXGdtg&s",
                "Deadlift",
                "Back Body",
                "Lower Back, Hamstrings, Glutes",
                "A back exercise where you lift a barbell from the ground to hip level, keeping your back straight.",
                "3-4"
        );

        if(s1.getCategory().equals(a)){
            sen.add(s1);
        }if(s2.getCategory().equals(a)){
            sen.add(s2);
        }if(s3.getCategory().equals(a)){
            sen.add(s3);
        }if(s4.getCategory().equals(a)){
            sen.add(s4);
        }
        if(l1.getCategory().equals(a)){
            sen.add(l1);
        }if(l2.getCategory().equals(a)){
            sen.add(l2);
        }if(c1.getCategory().equals(a)){
            sen.add(c1);
        }if(c2.getCategory().equals(a)){
            sen.add(c2);
        }if(n1.getCategory().equals(a)){
            sen.add(n1);
        }if(n2.getCategory().equals(a)){
            sen.add(n2);
        }if(leg1.getCategory().equals(a)){
            sen.add(leg1);
        }if(leg2.getCategory().equals(a)){
            sen.add(leg2);
        }if(arm1.getCategory().equals(a)){
            sen.add(arm1);
        }if(arm2.getCategory().equals(a)){
            sen.add(arm2);
        }
        if(back1.getCategory().equals(a)){
            sen.add(back1);
        }if(back2.getCategory().equals(a)){
            sen.add(back2);
        }


return sen;
    }
}
