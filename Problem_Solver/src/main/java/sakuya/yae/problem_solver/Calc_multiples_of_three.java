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
public class Calc_multiples_of_three {
    private final int divider = 3;
    private int number = 0;
    private List div_by_three = new ArrayList();
    private final List divider_of_three = new ArrayList();

    public Calc_multiples_of_three() {
    }
    
    
    private List list_filler(){
        for(int i = 0; i < 1000; i++){
            div_by_three.add(i);
        }
        return div_by_three;
    }
    
    public List divide_by_three(){
        div_by_three = list_filler();
        for(int i = 0; i < 1000; i++){
            number = (int) div_by_three.get(i);
            if(number%divider == 0){
                divider_of_three.add(i);
            }
        }
       
        
        return divider_of_three;
    };
    
    
}
