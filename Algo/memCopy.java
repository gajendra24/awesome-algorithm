 public static void Main()
    {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        byte[] byteArray = new byte[C]; 
        for(int i=0; i < C; i++) {
            byteArray[i] = sc.nextByte();
        }
        
        int dest = sc.nextInt();
        int src  = sc.nextInt();
        int size = sc.nextInt();
        if(size > 0) {
           for(int j=0; j<size; j++) {
                byteArray[dest++] = byteArray[src++];
            } 
        }
        
        for(byte b : byteArray) {
            System.out.print(b+" ");
        }