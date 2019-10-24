package Tugas_Stack_Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Asus
 */
public class Method_Stack {
    Scanner scan;
    Stack<String> stack;
    int n;
    
    void push(){
        scan = new Scanner(System.in);
        stack = new Stack<String>();
        System.out.println("Masukkan Banyak Pakaian Yang Akan Disusun :");
        n =scan.nextInt();
        System.out.println("Masukkan Nama Jenis Pakaian Yang Dimasukkan");
        for (int i = 0; i < n; i++) {
            stack.push(scan.next());
            
        }
    }
    void peek(){
        System.out.println("  Jenis Pakaian Yang Berada Paling Atas Tumpukan :");
        
        if(stack.isEmpty())
            System.out.println("Maaf Tidak ada Pakaian");
        else
            System.out.println(stack.peek());
    }
    void pop(){
        System.out.println("Berikut Ini Susunan Tumpukan Jenis Pakaian :");
        
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
        peek();
    }
    
    
}

