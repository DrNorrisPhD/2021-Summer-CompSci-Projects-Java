import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class App {
    public static boolean defined = false;
    public static int[] five = { 0, 0, 0, 0, 0, 0, 0 };
    public static int[] four = { 0, 0, 0, 0, 0, 0, 0 };
    public static int[] three = { 0, 0, 0, 0, 0, 0, 0 };
    public static int[] two = { 0, 0, 0, 0, 0, 0, 0 };
    public static int[] one = { 0, 0, 0, 0, 0, 0, 0 };
    public static int[] zero = { 0, 0, 0, 0, 0, 0, 0 };
    public static boolean p = true;
    public static boolean found = true;
    public static String winner = "nobody";
    public static boolean won = false;
    public static void main(String[] args) throws Exception {
        System.out.println("Note: Columns and Rows are 0 indexed");
        Scanner column = new Scanner(System.in);
        while (won == false) {
            int af = (int) Array.get(zero, 0);
            int bf = (int) Array.get(zero, 1);
            int cf = (int) Array.get(zero, 2);
            int df = (int) Array.get(zero, 3);
            int ef = (int) Array.get(zero, 4);
            int ff = (int) Array.get(zero, 5);
            int gf = (int) Array.get(zero, 6);
            int ae = (int) Array.get(one, 0);
            int be = (int) Array.get(one, 1);
            int ce = (int) Array.get(one, 2);
            int de = (int) Array.get(one, 3);
            int ee = (int) Array.get(one, 4);
            int fe = (int) Array.get(one, 5);
            int ge = (int) Array.get(one, 6);
            int ad = (int) Array.get(two, 0);
            int bd = (int) Array.get(two, 1);
            int cd = (int) Array.get(two, 2);
            int dd = (int) Array.get(two, 3);
            int ed = (int) Array.get(two, 4);
            int fd = (int) Array.get(two, 5);
            int gd = (int) Array.get(two, 6);
            int ac = (int) Array.get(three, 0);
            int bc = (int) Array.get(three, 1);
            int cc = (int) Array.get(three, 2);
            int dc = (int) Array.get(three, 3);
            int ec = (int) Array.get(three, 4);
            int fc = (int) Array.get(three, 5);
            int gc = (int) Array.get(three, 6);
            int ab = (int) Array.get(four, 0);
            int bb = (int) Array.get(four, 1);
            int cb = (int) Array.get(four, 2);
            int db = (int) Array.get(four, 3);
            int eb = (int) Array.get(four, 4);
            int fb = (int) Array.get(four, 5);
            int gb = (int) Array.get(four, 6);
            int aa = (int) Array.get(five, 0);
            int ba = (int) Array.get(five, 1);
            int ca = (int) Array.get(five, 2);
            int da = (int) Array.get(five, 3);
            int ea = (int) Array.get(five, 4);
            int fa = (int) Array.get(five, 5);
            int ga = (int) Array.get(five, 6);
            winCheckDiag(ac, bd, ce, df);
            winCheckDiag(ab, bc, cd, de);
            winCheckDiag(bc, cd, de, ef);
            winCheckDiag(aa, bb, cc, dd);
            winCheckDiag(bb, cc, dd, ee);
            winCheckDiag(cc, dd, ee, ff);
            winCheckDiag(ba, cb, dc, ed);
            winCheckDiag(cb, dc, ed, fe);
            winCheckDiag(dc, ed, fe, gf);
            winCheckDiag(ca, db, ec, fd);
            winCheckDiag(db, ec, fd, ge);
            winCheckDiag(da, eb, fc, gd);
            winCheckDiag(ad, bc, cb, da);
            winCheckDiag(ae, bd, cc, db);
            winCheckDiag(bd, cc, db, ea);
            winCheckDiag(af, be, cd, dc);
            winCheckDiag(be, cd, dc, eb);
            winCheckDiag(cd, dc, eb, fa);
            winCheckDiag(bf, ce, dd, ec);
            winCheckDiag(ce, dd, ec, fb);
            winCheckDiag(dd, ec, fb, ga);
            winCheckDiag(cf, de, ed, fc);
            winCheckDiag(de, ed, fc, gb);
            winCheckDiag(df, ee, fd, gc);
            if (won == true) {
                column.close();
                System.out.println(winner + " won!");
                System.exit(1);
            }
            System.out.println(Arrays.toString(five));
            System.out.println(Arrays.toString(four));
            System.out.println(Arrays.toString(three));
            System.out.println(Arrays.toString(two));
            System.out.println(Arrays.toString(one));
            System.out.println(Arrays.toString(zero));
            System.out.println("Pick Your column");
            int Kolumn = column.nextInt();
            int a = (int) Array.get(zero, Kolumn);
            int b = (int) Array.get(one, Kolumn);
            int c = (int) Array.get(two, Kolumn);
            int d = (int) Array.get(three, Kolumn);
            int e = (int) Array.get(four, Kolumn);
            int f = (int) Array.get(five, Kolumn);
            winCheckRows(zero, Kolumn);
            winCheckRows(one, Kolumn);
            winCheckRows(two, Kolumn);
            winCheckRows(three, Kolumn);
            winCheckRows(four, Kolumn);
            winCheckRows(five, Kolumn);
            winCheckColumns(Kolumn, a, b, c, d, e, f);
            move(Kolumn, zero, a);
            if (defined == false) {
                move(Kolumn, one, b);
            }
            if (defined == false) {
                move(Kolumn, two, c);
            }
            if (defined == false) {
                move(Kolumn, three, d);
            }
            if (defined == false) {
                move(Kolumn, four, e);
            }
            if (defined == false) {
                move(Kolumn, five, f);
            }
        }
        if (won == true) {
            column.close();
            System.out.println(Arrays.toString(five).replace("[],", ""));
            System.out.println(Arrays.toString(four));
            System.out.println(Arrays.toString(three));
            System.out.println(Arrays.toString(two));
            System.out.println(Arrays.toString(one));
            System.out.println(Arrays.toString(zero));
            System.out.println(winner + " won!");
            System.exit(1);
        }
    }

    static void move(int Kol, int[] zero, int g) {
        defined = false;
        if (defined == false) {
            for (int i = 0; i <= zero.length; i++) {
                if (i == Kol) {
                    if (g == 0) {
                        if (p == true) {
                            Array.set(zero, Kol, 1);
                        }
                        if (p == false) {
                            Array.set(zero, Kol, 2);
                        }
                        System.out.println((int) Array.get(zero, Kol));
                        defined = true;
                        found = true;
                        p = !p;
                    } else {
                        defined = false;
                    }
                }
            }
        }
    }

    static void winCheckRows(int[] name, int Kol) {
        // Rows
        int a1 = 0;
        int b1 = 0;
        /*
         * int c1 = 0; int d1 = 0; int e1 = 0; int f1 = 0;
         */
        for (int i = 0; i < name.length; i++) {
            int a = (int) Array.get(name, i);
            if (a == 1) {
                a1 += 1;
                b1 = 0;
                if (a1 >= 4) {
                    won = true;
                    winner = "Player 1";
                }
            }
            else if (a == 2) {
                a1 = 0;
                b1 += 1;
                if (b1 >= 4) {
                    won = true;
                    winner = "Player 2";
                }
            }
            else {
                a1 = 0;
                b1 = 0;
            }
        }
    }

    static void winCheckColumns(int Kol, int a, int y, int x, int w, int v, int u) {
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i <= zero.length; i++) {
            if (i == Kol) {
                if (a == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (a == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }

                }
            }
        }
        for (int j = 0; j <= one.length; j++) {
            if (j == Kol) {
                if (y == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (y == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }

                }
            }
        }
        for (int k = 0; k <= two.length; k++) {
            if (k == Kol) {
                if (x == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (x == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }

                }
            }
        }
        for (int l = 0; l <= three.length; l++) {
            if (l == Kol) {
                if (w == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (w == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }
                }
            }
        }
        for (int m = 0; m <= four.length; m++) {
            if (m == Kol) {
                if (v == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (v == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }
                }
            }
        }
        for (int n = 0; n <= five.length; n++) {
            if (n == Kol) {
                if (u == 1) {
                    a1 += 1;
                    b1 = 0;
                    if (a1 >= 3) {
                        won = true;
                        winner = "Player 1";
                    }
                }
                if (u == 2) {
                    a1 = 0;
                    b1 = 1;
                    if (b1 >= 3) {
                        won = true;
                        winner = "Player 2";
                    }
                }
            }
        }
    }

    static void winCheckDiag(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            if (a == 1) {
                won = true;
                winner = "Player 1";
            }
            if (a == 2) {
                won = true;
                winner = "Player 2";
            }
        }
    }
}