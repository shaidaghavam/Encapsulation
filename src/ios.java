public class ios extends phone{

    @Override
    public String getOperatingSystem() {
        return "ios";
    }

    @Override
    public String getCameraQuality() {
        return super.getCameraQuality();
    }

    @Override
    public String getBattery() {
        return super.getBattery();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }
}
