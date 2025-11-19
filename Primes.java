public class Primes {
    public static boolean isPrime(int number)
    {
        boolean prime = true;
        for (int i=2; i<=number-1; i++)
        {
            if (number % i == 0)
            {
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int per;
        int count = 0;
        
        for (int i=2; i<=n; i++)
        {
            if (isPrime(i) == true)
            {
                count++;
            }
        }
        per = (int)(100 * count / n);
        System.out.println("There are " + count + " primes between 2 and " + n +" (" + per + "% are primes)");
    }
}