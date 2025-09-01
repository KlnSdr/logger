package common.logger;

public enum LogLevel {
    ERROR(Colors.RED), WARN(Colors.YELLOW), INFO(Colors.GREEN), DEBUG(Colors.BLUE);

    private final Colors color;
    LogLevel(Colors color) {
        this.color = color;
    }

    public String getColorized() {
        return ColorHelper.colorize(this.name(), color);
    }
}
