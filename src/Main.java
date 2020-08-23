import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Computer> computers = new TreeSet<>();

        computers.add(new Computer("LG", 2014, 4, 200,
                new HardDisk("FG21", Type.HDD, 200, Maker.CHINA,
                        new Processor("i5", 60, Maker.INDIA))));

        computers.add(new Computer("Lenovo", 2017, 8, 450,
                new HardDisk("SS43", Type.SSD, 600, Maker.KOREA,
                        new Processor("i7", 90, Maker.INDIA))));

        computers.add(new Computer("Apple", 2015, 6, 389,
                new HardDisk("Pro", Type.HDD, 500, Maker.USA,
                        new Processor("i5", 90, Maker.USA))));

        computers.add(new Computer("Dell", 2018, 8, 540,
                new HardDisk("E7332", Type.HDD, 500, Maker.CHINA,
                        new Processor("i5", 60, Maker.INDIA))));

        computers.add(new Computer("LG", 2019, 7, 660,
                new HardDisk("T59", Type.SSD, 1000, Maker.INDIA,
                        new Processor("i7", 120, Maker.KOREA))));

        computers.add(new Computer("HP", 2010, 2, 225,
                new HardDisk("PO33", Type.HDD, 300, Maker.USA,
                        new Processor("i3", 30, Maker.CHINA))));

        computers.add(new Computer("Lenovo", 2012, 4, 120,
                new HardDisk("KL21", Type.SSD, 200, Maker.KOREA,
                        new Processor("i5", 60, Maker.INDIA)))); // 7

        computers.add(new Computer("Samsung", 2015, 4, 300,
                new HardDisk("S55", Type.HDD, 600, Maker.CHINA,
                        new Processor("i3", 30, Maker.KOREA))));


        computers.add(new Computer("Dell", 2016, 4, 320,
                new HardDisk("D45", Type.SSD, 500, Maker.USA,
                        new Processor("i5", 60, Maker.KOREA))));

        computers.add(new Computer("LG", 2019, 6, 500,
                new HardDisk("FG22", Type.HDD, 500, Maker.USA,
                        new Processor("i5", 60, Maker.KOREA))));

        computers.add(new Computer("Lenovo", 2009, 4, 330,
                new HardDisk("G56", Type.HDD, 600, Maker.KOREA,
                        new Processor("i5", 60, Maker.INDIA))));

        computers.add(new Computer("Apple", 2008, 4, 229,
                new HardDisk("Pro2", Type.HDD, 300, Maker.USA,
                        new Processor("i3", 60, Maker.CHINA))));

        computers.add(new Computer("Dell", 2018, 8, 545,
                new HardDisk("E2121", Type.SSD, 200, Maker.USA,
                        new Processor("i7", 60, Maker.KOREA))));

        computers.add(new Computer("LG", 2007, 4, 310,
                new HardDisk("T59", Type.HDD, 300, Maker.INDIA,
                        new Processor("i3", 30, Maker.CHINA))));

        computers.add(new Computer("HP", 2009, 4, 335,
                new HardDisk("H66", Type.SSD, 500, Maker.KOREA,
                        new Processor("i5", 30, Maker.USA))));

        computers.add(new Computer("Lenovo", 2017, 6, 430,
                new HardDisk("KL3325", Type.SSD, 400, Maker.INDIA,
                        new Processor("i5", 60, Maker.CHINA))));

        computers.add(new Computer("Samsung", 2009, 2, 159,
                new HardDisk("S6641", Type.HDD, 600, Maker.INDIA,
                        new Processor("i3", 30, Maker.INDIA))));

        computers.add(new Computer("Apple", 2018, 6, 900,
                new HardDisk("A90", Type.SSD, 800, Maker.CHINA,
                        new Processor("i7", 90, Maker.CHINA))));

        computers.add(new Computer("Mac", 2015, 4, 900,
                new HardDisk("Y60", Type.SSD, 700, Maker.USA,
                        new Processor("i7", 60, Maker.USA))));

        computers.add(new Computer("Dell", 2008, 2, 100,
                new HardDisk("D7788", Type.HDD, 600, Maker.KOREA,
                        new Processor("i7", 60, Maker.CHINA))));


        Iterator<Computer> iterator = computers.iterator();
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник Китай
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник дисків не Китай
////        while (iterator.hasNext()) {
////            Computer next = iterator.next();
////            if (next.getYear() > 2010 && next.getHardDisk().getMaker() != Maker.CHINA) {
////                System.out.println(next);
////            }
////        }
//
//
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною
        while (iterator.hasNext()) {
            Computer next = iterator.next();
            if ( next.getHardDisk().getProcessor().getNuclearNum() == "i7"
                            && next.getHardDisk().getType() == Type.SSD
                            && next.getHardDisk().getHardDiskCapacity() > 500 ) {
                System.out.println(next);
            }
        }
    }
}
