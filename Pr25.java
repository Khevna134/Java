class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }
}

class T1 extends Thread {
    Table t;
    T1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class T2 extends Thread {
    Table t;
    T2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}

public class pr25 {
    public static void main(String[] args) {
        Table obj = new Table();

        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);

        t1.start();
        t2.start();
    }
}
/*output
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
  */
