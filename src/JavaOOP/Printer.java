package JavaOOP;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 100 || tonerLevel < 0) {
            this.tonerLevel = -1;
        }
        else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount <= 100) {
                return tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
