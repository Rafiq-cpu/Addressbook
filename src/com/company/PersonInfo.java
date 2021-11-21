package com.company;

import javax.swing.*;

public class PersonInfo {
String name;
String address;
String phoneNum;
//parameterized constructor
    public PersonInfo (String n, String a, String p)

    {
        name = n; address = a;  phoneNum = p;
    }
    /* method for displaying person record in GUI */

    public void print() {
        JOptionPane.showMessageDialog(null, "name:" +name + "address:" +address + "phoneno:" +phoneNum);

    }

}
