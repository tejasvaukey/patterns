import java.util.Scanner;

class Main{

    static void rectangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void squareStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangleStarReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numberPattern1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void numberPattern1Reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void numberPattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    static void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

            
        }
    }

    static void pyramidReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n - (2*i +1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void halfDiamond(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i>n) stars = 2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void binarytriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            boolean bin = (i%2 != 0);
            for (int j = 1; j <= i; j++) {
                if(bin) System.out.print(1);
                else System.out.print(0);

                bin = !bin;
            }
            System.out.println();
        }
    }

    static void mShapeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2*n -2*i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void rightTriangleCounting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void rightTriangleCounting2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void rightTriangleAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void rightTriangleAlphabetReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (char ch = 'A';ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    static void rightTriangleAlphabet2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");

            }
            System.out.println();
            ch++;

        }
    }

    static void pyramidAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();


        }
    }

    static void rightTriangleAlphabetReverse2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            char ch;
            for (ch = (char) (('A' + n) - i); ch < ('A'+n); ch++) {
                System.out.print(ch+" ");

            }
            System.out.println();
        }
    }

    static void hollowDiamond(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initS = 0;

        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 0; j < initS; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            initS+=2;
            System.out.println();
        }
        initS-=2;
//        initS = 2*n-2;
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 0; j < initS; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            initS-=2;
            System.out.println();
        }
    }

    static void butterfly(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initS = 2*n-2;

        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if(i>n) stars = 2*n - i;

            for (int j = 1; j <= initS; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < initS; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i<n) initS -= 2;
            else initS += 2;
        }


    }


    static void main(String[] args) {
        butterfly();
    }
}