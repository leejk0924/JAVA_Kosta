package com.javaex.ks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousTest {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!");

            }
        });
    }

}


class Button {
    public Button(){

    }
    public Button(String s){
        System.out.println(s);
    }

    void addActionListener(ActionListener b){

    }
}

