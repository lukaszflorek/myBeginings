public class TemperaturePathFinder {
    private String tempPath;
    private String configPath;

    public TemperaturePathFinder() {
        tempPath = "Temperature/temp_table";
        configPath= "Temperature/temperature.conf";
    }

    public String getConfigPath() {
        return configPath;
    }

    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    public String getTempPath() {
        return tempPath;
    }

    public void setTempPath(String tempPath) {
        this.tempPath = tempPath;
    }

}
