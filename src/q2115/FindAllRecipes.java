package q2115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * LeetCode Q2115 从给定原材料中找到所有可以做出的菜
 * (<a href="https://leetcode.cn/problems/find-all-possible-recipes-from-given-supplies/">Q2115 从给定原材料中找到所有可以做出的菜</a>)
 *
 * @author napdada
 * @version v 0.1 2023/6/14 下午8:17
 */
public class FindAllRecipes {

    public static void main(String[] args) {
        String[] recipes = {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(new ArrayList<>(Arrays.asList("yeast", "flour")));
        ingredients.add(new ArrayList<>(Arrays.asList("bread", "meat")));
        ingredients.add(new ArrayList<>(Arrays.asList("sandwich", "meat", "bread")));
        String[] supplies = {"yeast", "flour", "meat"};
        System.out.println(FindAllRecipes.findAllRecipes(recipes, ingredients, supplies));
    }

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> supply = new HashSet<>(Arrays.asList(supplies));
        List<String> doneRecipes = new ArrayList<>();
        int lastDoneNum, doneNum = 0;
        do {
            for (int i = 0; i < ingredients.size(); i++) {
                if (ingredients.get(i).size() != 0) {
                    ingredients.get(i).removeIf(supply::contains);
                    if (ingredients.get(i).size() == 0) {
                        doneRecipes.add(recipes[i]);
                        supply.add(recipes[i]);
                    }
                }
            }
            lastDoneNum = doneNum;
            doneNum = doneRecipes.size();
        } while (doneNum != lastDoneNum);
        return doneRecipes;
    }
}
