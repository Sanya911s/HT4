import java.util.Objects;

public class Processor {
    private String nuclearNum;
    private int frequency;
    private Maker maker;

    public Processor() {
    }

    public Processor(String nuclearNum, int frequency, Maker maker) {
        this.nuclearNum = nuclearNum;
        this.frequency = frequency;
        this.maker = maker;
    }

    public String getNuclearNum() {
        return nuclearNum;
    }

    public void setNuclearNum(String nuclearNum) {
        this.nuclearNum = nuclearNum;
    }

    public int getFrequency() {
        return frequency;
    }


    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return nuclearNum == processor.nuclearNum &&
                frequency == processor.frequency &&
                maker == processor.maker;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nuclearNum, frequency, maker);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "nuclearNum=" + nuclearNum +
                ", frequency=" + frequency +
                ", maker=" + maker +
                '}';
    }
}
