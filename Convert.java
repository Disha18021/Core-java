class Convert
{
    public static void main(String args[])
    {
       // Assigning a byte value to short and int variables
        byte byteValue = 120;
        short shortVar = byteValue; // Implicit 
        int intVar = byteValue;     // Implicit 
        
        
        System.out.println("Assigning byte value to short and int:");
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
    
       // Assigning an int value to short and byte variables
        int intValue = 300;
        short shortVar2 = (short) intValue; // Explicit 
        byte byteVar = (byte) intValue;     // Explicit 
    
        System.out.println("\nAssigning int value to short and byte:");
        System.out.println("intValue: " + intValue);
        System.out.println("shortVar2: " + shortVar2);
        System.out.println("byteVar: " + byteVar);
    }
}
    
