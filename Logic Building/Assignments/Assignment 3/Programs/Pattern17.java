class Pattern17{
public static void main(String[] args) {

int rows=5;
for (int i = 0; i <= rows - 1; i++) { //For loop for Rows

for (int j = 0; j <= i; j++) { //For loop for Col

System.out.print(" "); // blank space

}

for (int k = 0; k <= rows - 1 - i; k++) { 

System.out.print("*" + " "); // prints * and blank space

}

System.out.println(); //Next line

}


}}