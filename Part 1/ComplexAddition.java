import java.util.Scanner;

class Complex {
    int real, imag;

    //Constructor
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    //Method to add
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    
    //Method to display
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter real part of the first complex number: ");
        int real1 = sc.nextInt();

        System.out.print("Enter imaginary part of the first complex number: ");
        int imag1 = sc.nextInt();

        System.out.print("Enter real part of the second complex number: ");
        int real2 = sc.nextInt();

        System.out.print("Enter imaginary part of the second complex number: ");
        int imag2 = sc.nextInt();

        Complex c1 = new Complex(real1, imag1); // creating first complex
        Complex c2 = new Complex(real2, imag2); // creating second complex
        Complex sum = c1.add(c2); // creating third complex as the sum of first two

        System.out.print("The first complex number is: ");
        c1.display();

        System.out.print("The second complex number is : ");
        c2.display();

        System.out.print("The sum of these complex numbers is: ");
        sum.display();
    }
}
