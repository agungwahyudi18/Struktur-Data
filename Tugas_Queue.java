/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Stack_Queue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
/**
 *
 * @author Asus
 */
public class Tugas_Queue {
     int kk;
    String nama,sembako;
    Tugas_Queue next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan no KK        : ");
        kk=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan Jenis Sembako :\n1.Gula\n2.Minyak\n3.Beras\n: ");
        sembako=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+kk+" \t|| "+nama+" \t|| "+sembako+" \t||");
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=3){
            System.out.print("1.Masukkan Antrian\n2.Mengeluarkan Antrian\n3.Daftar Antrian\n : ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}
class linked{
    Tugas_Queue head, tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        Tugas_Queue baru=new Tugas_Queue();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan no KK : "+head.kk);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| No KK \t|| Nama \t|| Sembako \t||");
            for(Tugas_Queue a=head; a!=null; a=a.next) a.read();
        }
    }
}
    

