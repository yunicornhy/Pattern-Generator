//
//  Class author: Yuna Kim Brooks 
//  Date created:  10.28.26
//  General description: The class contains a main method that calls other methods to produce patterns 
//
public class PatternGenerator {
   
//
//  Pre-condition: what must be true prior to the method being called 
// //  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
//
public static void stars(int rows){
String star = "*"; //1 3 5 7 9 11 13

while(rows>0){
    System.out.println(star);
    star = star +"**";
    rows -= 1;

}
}

//precondition: rows is a positive integer
//post-condition: a pattern of stars is printed with the specified number of rows
public static void triangle(int rows){
int i = 1;
while (i <= rows) {
    int j = 1; 

    do {
        System.out.print(i);
        j++;
    } while (j <= i);

System.out.println();
i++;

   }
}


//precondition: start is a positive odd integer
//post-condition: a pattern of odd numbers is printed starting from the specified odd integer down to 1
public static void odds(int start){

for (int i=start; i >= 1; i-=2) {

    for (int j=1; j<=i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
}
//pre-condition: maxE is a positive integer
//post-condition: a pattern of E's and O's is printed with the specified number of rows, alternating between E and O for each row
public static void eo(int maxE) {
    boolean printE = maxE % 2 != 0;

    for (int i= 1; i < 2 * maxE; i++){
        int j;

        if (i <= maxE){
            j = i;
        } else {
            j = 2*maxE-i;
        }

        for (int k=1; k <= j; k++){
            if (printE == true){
                System.out.print("E");       
        } else {
            System.out.print("O");
        }
    }

    System.out.println();
    printE = !printE;
}
}



//pre-condition: rows is a positive integer
//post-condition: a pyramid pattern of numbers is printed with the specified number of rows
public static void pyramid(int rows) {
    for (int i=1; i <= rows; i++){
        for (int space =1; space < i; space++){
            System.out.print(" ");
        }

        for (int j=1; j<= 2*(rows-i) +1; j++){
            System.out.print(i);
        }

        System.out.println();
    }
    }





public static void main(String[]args){
stars(7);

System.out.println();

triangle(9); 

System.out.println();

odds (9); 

System.out.println();

eo (6);

System.out.println();

eo (5);

System.out.println();

pyramid(5);
}
}