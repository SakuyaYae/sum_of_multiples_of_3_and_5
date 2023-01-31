/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sakuya.yae.problem_solver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YaeSakuya
 */
public class Calc_muliples_of_five {
    private final int divider = 5;
    private int number = 0;
    private List div_by_five = new ArrayList();
    private final List divider_of_five = new ArrayList();

    public Calc_muliples_of_five() {
    }
    
    private List list_filler(){
        for(int i = 0; i < 1000; i++){
            div_by_five.add(i);
        }
        return div_by_five;
    }
    
    public List divide_by_five(){
        div_by_five = list_filler();
        for(int i = 0; i < 1000; i++){
            number = (int) div_by_five.get(i);
            if(number%divider == 0){
                divider_of_five.add(i);
            }
        }
       
        
        return divider_of_five;
    };
}
