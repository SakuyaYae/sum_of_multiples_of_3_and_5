/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sakuya.yae.problem_solver;

/**
 *
 * @author YaeSakuya
 */
public class Problem_Solver {

    public static void main(String[] args) {
   
        Calc_multiples_of_three div_of_three = new Calc_multiples_of_three();
        Calc_muliples_of_five div_of_five = new Calc_muliples_of_five();
        
        int sum_of_dividers = 0;
        
        int div_by_three_size = div_of_three.divide_by_three().size();
        int div_by_five_size = div_of_five.divide_by_five().size();
        
        for (int i = 0; i < div_by_three_size + 1; i++) {
            sum_of_dividers += (int) div_of_three.divide_by_three().get(i);
        }
        for (int i = 0; i < div_by_five_size + 1; i++) {
            sum_of_dividers += (int) div_of_five.divide_by_five().get(i);
        }
        System.out.println(sum_of_dividers);
        
    }
}
