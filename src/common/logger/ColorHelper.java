package common.logger;

public class ColorHelper {
    public static String colorize(String text, Colors color) {
        return color.getColor() + text + Colors.RESET.getColor();
    }
}
