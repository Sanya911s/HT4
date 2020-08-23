import java.util.Objects;

public class HardDisk {
    private String model;
    private Type type;
    private int hardDiskCapacity;
    private Maker maker;
    private Processor processor;

    public HardDisk() {
    }

    public HardDisk(String model, Type type, int hardDiskCapacity, Maker maker, Processor processor) {
        this.model = model;
        this.type = type;
        this.hardDiskCapacity = hardDiskCapacity;
        this.maker = maker;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return hardDiskCapacity == hardDisk.hardDiskCapacity &&
                Objects.equals(model, hardDisk.model) &&
                type == hardDisk.type &&
                maker == hardDisk.maker &&
                Objects.equals(processor, hardDisk.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, hardDiskCapacity, maker, processor);
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", maker=" + maker +
                ", processor=" + processor +
                '}';
    }
}
