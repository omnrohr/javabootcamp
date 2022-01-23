import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Macchiato" };
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);
        menu[2] = "late";
        System.out.println(Arrays.toString(menu));
        String[] items = { "clock", "table", "ladder", "chair", "oven", "phone" };
        items[5 % 2] = "cup";
        System.out.println(Arrays.toString(items));

    }
}
