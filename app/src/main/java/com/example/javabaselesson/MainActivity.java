package com.example.javabaselesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // эти  тестовые массив и  список с целыми числами далее будет использоваться в заданиях.
    //
    final static int[] testArray ={1,5,89,56,12,45,1,2,66,751,12,12,66,99,78,12,2,3,4,6,7,9,100};
    static List<Integer> testList=new ArrayList<>();
    /*обратите внимание - сам тестовый список невозможно модифицировать (добавлять и удалять элементы)
     для работы с ним в соответствущих заданиях необходимо создать новый список на его основе
     */
    static {
        for (Integer element :
             testArray) {
            testList.add(element);
        }
    testList= Collections.unmodifiableList(testList);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solveTask1(View view) {
        TextView solutionTextField=findViewById(R.id.task1);
        /* текст задачи, скопирован из layout файла
        Демонстрационное задание.\n По нажатию кнопки ниже заместить этот текст суммой
         чисел от одного до четырех
         */

        int solution = 1+2+3+4;
        String solutionString = "Решение задачи: сумма равна"+solution;
        solutionTextField.setText(solutionString);
    }


    public void solveTask2(View view) {
    }
}