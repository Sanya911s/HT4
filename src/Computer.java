import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private String model;
    private int year;
    private int memoryCapacity;
    private int price;
    private HardDisk hardDisk;

    public Computer() {
    }

    public Computer(String model, int year, int memoryCapacity, int price, HardDisk hardDisk) {
        this.model = model;
        this.year = year;
        this.memoryCapacity = memoryCapacity;
        this.price = price;
        this.hardDisk = hardDisk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                memoryCapacity == computer.memoryCapacity &&
                price == computer.price &&
                Objects.equals(model, computer.model) &&
                Objects.equals(hardDisk, computer.hardDisk);
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, year, memoryCapacity, price, hardDisk);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memoryCapacity=" + memoryCapacity +
                ", price=" + price +
                ", hardDisk=" + hardDisk +
                '}';
    }

    @Override
    public int compareTo(Computer comp) {
        int result = this.price - comp.price;
        if (result == 0) {
            return this.model.compareTo(comp.model);
        }
        return result;
    }
}

