/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9pp1;

/**
 *
 * @author ASUS
 */

public class TestStack {
    
    public static void main(String[] args) {
        // Membuat objek StrukturStack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);
        
//    // Sebelum push
//        System.out.println("#Sebelum push");
//        System.out.println("Size: " + stack.size());
//        System.out.println("Empty: " + stack.isEmpty());
//        System.out.println("Full: " + stack.isFull());
//        System.out.println("Top: " + stack.TOP());
//        stack.displayElements();
//
//        // Melakukan push 3x
//        System.out.println("#Melakukan push 3x:");
//        stack.push(2);
//        stack.push(4);
//        stack.push(1);
//
//        // Setelah push 3x
//        System.out.println("Size: " + stack.size());
//        System.out.println("Empty: " + stack.isEmpty());
//        System.out.println("Full: " + stack.isFull());
//        System.out.println("Top: " + stack.TOP());
//        stack.displayElements();
//}
               // Melakukan push 3x
            System.out.println("#Melakukan push 3x:");
            stack.push(2);
            stack.push(4);
            stack.push(1);

            // Setelah push 3x
            System.out.println("Size: " + stack.size());
            System.out.println("Empty: " + stack.isEmpty());
            System.out.println("Full: " + stack.isFull());
            System.out.println("Top: " + stack.TOP());
            System.out.print("Elemen from TOP:");
            stack.displayElements();

            // Melakukan pop 1x
            System.out.println("\n#Melakukan pop 1x:");
            stack.pop();

            // Setelah pop 1x
            System.out.println("Size: " + stack.size());
            System.out.println("Empty: " + stack.isEmpty());
            System.out.println("Full: " + stack.isFull());
            System.out.println("Top: " + stack.TOP());
            System.out.print("Elemen from TOP:");
            stack.displayElements();

    }
}






