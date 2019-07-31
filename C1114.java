

public class C1114
{
    public static void main(String[] args)
    {
        if(args.length != 1) {
            System.out.println("Usage: cmd N ");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);

        int key = lg(n);

        System.out.printf("lgN -> lg %d = %d \n", n, key);
        System.out.println("Math.log = " + (Math.log(n)/Math.log(2.0)) );
    }

    public static int lg(int N)
    {
        if(N <= 0) {
            return -1;
        }

        int multi = 1;
        int pow = 0;
        while(multi < N) {
            multi *= 2;
            pow++;
        }


        return (multi == N? pow: pow -1);
    }
}