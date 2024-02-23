class IfTest

{

public static void main(String arg[])

{

int i, count, count1, count2;

float[] weight = { 45.0F, 55.0F, 47.0F, 51.0F, 54.0F };

float[] height = { 176.5F, 174.2F, 168.0F, 170.7F, 169.0F };

count = 0;

count1 = 0;

count2 = 0;

for (i = 0; i <= 4; i++)

{

if(weight[i] < 50.0 && height[1] > 170.0)

{
count1 = count1 + 1;
}

count = count + 1; // Total persons

}

count2 = count - count1;

System.out.println("Number of persons with..."); 
System.out.println("Weight <50 and height>170" + count1);
System.out.println("Others = " + count2);
}

}