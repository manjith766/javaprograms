package com.neoteric;

public class Anniversary {
    public static void main(String[] args) {
        // WELCOME
        for (int i = 1; i <= 6; i++) {
            // W
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && (j == 1 || j == 7)) System.out.print("W");
                else if (i == 2 && (j == 2 || j == 6)) System.out.print("*");
                else if (i == 3 && (j == 2 || j == 6)) System.out.print("*");
                else if (i == 4 && (j == 3 || j == 5)) System.out.print("*");
                else if (i == 5 && (j == 4)) System.out.print("*");
                else if (i == 6 && (j == 1 || j == 7)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // E
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 6 || j == 1 || (i == 3 && j <= 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // L
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || i == 6) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // C
            for (int j = 1; j <= 4; j++) {
                if ((i == 1 || i == 6 || j == 1) && !(i == 1 && j == 1) && !(i == 6 && j == 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // O
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 6) && (j > 1 && j < 5)) System.out.print("*");
                else if ((j == 1 || j == 5) && (i > 1 && i < 6)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // M
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5) System.out.print("*");
                else if (i == 2 && (j == 2 || j == 4)) System.out.print("*");
                else if (i == 3 && j == 3) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // E
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 6 || j == 1 || (i == 3 && j <= 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // TO
        for (int i = 1; i <= 6; i++) {
            // T
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || (i > 1 && j == 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // O
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 6) && (j > 1 && j < 5)) System.out.print("*");
                else if ((j == 1 || j == 5) && (i > 1 && i < 6)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // NEOTERIC (CORRECTED SPELLING)
        for (int i = 1; i <= 6; i++) {
            // N
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // E
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 6 || j == 1 || (i == 3 && j <= 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // O
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 6) && (j > 1 && j < 5)) System.out.print("*");
                else if ((j == 1 || j == 5) && (i > 1 && i < 6)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // T
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || (i > 1 && j == 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // E
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 6 || j == 1 || (i == 3 && j <= 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // R
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || i == 1 || i == 3 || (i == 2 && j == 4) || (i > 3 && j == i - 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // I
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 6 || j == 3) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // C
            for (int j = 1; j <= 4; j++) {
                if ((i == 1 || i == 6 || j == 1) && !(i == 1 && j == 1) && !(i == 6 && j == 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // -
        for (int i = 1; i <= 6; i++) {
            if (i == 4) {
                for (int j = 1; j <= 5; j++) System.out.print("*");
            } else if (i == 2 || i == 3 || i == 5 || i == 6) {
                for (int j = 1; j <= 5; j++) {
                    if (j == 3) System.out.print("*");
                    else System.out.print(" ");
                }
            } else {
                for (int j = 1; j <= 5; j++) System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // 2ND
        for (int i = 1; i <= 6; i++) {
            // 2
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && j > 1 && j < 5) System.out.print("*");
                else if (i == 2 && (j == 1 || j == 5)) System.out.print("*");
                else if (i == 3 && j == 5) System.out.print("*");
                else if (i == 4 && j == 4) System.out.print("*");
                else if (i == 5 && j == 3) System.out.print("*");
                else if (i == 6) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // N
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // D
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (i == 1 && j < 5) || (i == 6 && j < 5) || (j == 5 && i > 1 && i < 6))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // ANNIVERSARY
        for (int i = 1; i <= 6; i++) {
            // A
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && j == 3) || (i == 2 && (j == 2 || j == 4)) || (i == 3) || (i > 3 && (j == 1 || j == 5)))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // N
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // N
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // I
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 6 || j == 3) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // V
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && (j == 1 || j == 5)) || (i == 2 && (j == 1 || j == 5)) || (i == 3 && (j == 1 || j == 5)) || (i == 4 && (j == 2 || j == 4)) || (i == 5 && j == 3))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // E
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 6 || j == 1 || (i == 3 && j <= 3)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // R
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || i == 1 || i == 3 || (i == 2 && j == 4) || (i > 3 && j == i - 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // S
            for (int j = 1; j <= 4; j++) {
                if ((i == 1 && j > 1) || (i == 3 && (j > 1 && j < 4)) || (i == 6 && j < 4) || (j == 1 && i == 2) || (j == 4 && i == 5))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // A
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && j == 3) || (i == 2 && (j == 2 || j == 4)) || (i == 3) || (i > 3 && (j == 1 || j == 5)))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // R
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || i == 1 || i == 3 || (i == 2 && j == 4) || (i > 3 && j == i - 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // Y
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && (j == 1 || j == 5)) || (i == 2 && (j == 2 || j == 4)) || (i >= 3 && j == 3))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}



