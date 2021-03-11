package week_05.exercise_017_03;

public class Computer implements ComputerOperations{
    private String className;

    public Computer() {
        this.className = "Computer";
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void turnOn() {
        System.out.println(getClassName() + " is now turned on!");
    }

    public void turnOff() {
        System.out.println(getClassName() + " is now turned off!");
    }

    public void performDownload() {
        System.out.println(getClassName() + " is now performing a download!");
    }

    public void performUpload() {
        System.out.println(getClassName() + " is now performing an upload!");
    }

    public void playVideo() {
        System.out.println(getClassName() + " is now playing a video!");
    }

    public void playMusic() {
        System.out.println(getClassName() + " is now playing your favorite tune!");
    }
}
