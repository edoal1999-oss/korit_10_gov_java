package study.ch15.Test;

import java.lang.classfile.Interfaces;

interface Printable {
    void print();
        }

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable {

    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}

public class EX17 {
}
