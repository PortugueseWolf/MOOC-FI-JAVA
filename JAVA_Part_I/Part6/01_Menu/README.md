
# Menu

The gourmet restaurant 'Unicafe' on the Kumpula campus of the University of Helsinki needs a new menu. The chef knows about programming and wants a computer system to manage the menu. In this assignment, we'll implement the heart of the system, the Menu class.

The exercise template comes with a Main class that you can use to test the menu. For the implementation of the menu, you'll have the following boilerplate code:

```java
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
}
```

The menu object has an ArrayList as an instance variable to store the names of the dishes on the menu. The menu should provide the following methods:

public void addMeal(String meal) adds a meal to the menu. If the meal is already on the list, it should not be added again.

public void printMeals() prints the meals.

public void clearMenu() clears the menu.

Once the menu is done, you can use it as follows.

```java
Menu menu = new Menu();
menu.addMeal("Tofu ratatouille");
menu.addMeal("Chilli coconut chicken");
menu.addMeal("Chilli coconut chicken");
menu.addMeal("Meatballs with mustard sauce");

menu.printMeals();
menu.clearMenu();

System.out.println();
menu.addMeal("Tomato and mozzarella salad");
menu.printMeals();
```

```markdown
Tofu ratatouille
Chilli coconut chicken
Meatballs with mustard sauce

Tomato and mozzarella salad
```

## Part 1 - Adding a meal

Implement the public void addMeal(String meal) method, which adds a new meal to the meals list. If the meal you want to add is already on the list, you shouldn't add it again. The list method contains is handy for checking an items existence on it.

## Part 2 - Printing the meals

Implement the public void printMeals() method, which prints the meals. You can test out the program using the following example code.

```java
Menu menu = new Menu();
menu.addMeal("Tofu ratatouille");
menu.addMeal("Chilli Coconut Chicken");
menu.addMeal("Chilli Coconut Chicken");
menu.addMeal("Meatballs with mustard sauce");

menu.printMeals();
```

```markdown
Tofu ratatouille
Chilli Coconut Chicken
Meatballs with mustard sauce
```

## Part 3 - Clearing the food list

Implement the public void clearMenu() method, which clears the menu. The ArrayList class has a method which is useful here. NetBeans can hint at the available methods when you type the object name an a dot. Try to write meals. inside the method frame and see what happens.

Once the menu is ready, try it with the following example code.

```java
Menu menu = new Menu();
menu.addMeal("Tofu ratatouille");
menu.addMeal("Chilli Coconut Chicken");
menu.addMeal("Chilli Coconut Chicken");
menu.addMeal("Meatballs with mustard sauce");

menu.printMeals();
menu.clearMenu();

System.out.println();
menu.addMeal("Tomato and mozzarella salad");
menu.printMeals();
```

```markdown
Tofu ratatouille
Chilli Coconut Chicken
Meatballs with mustard sauce

Tomato and mozzarella salad
```
