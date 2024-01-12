package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly rwonly = new RWOnly();
      //rwonly.name = "Rushil";
      //Facing an error - name' has private access in 'com.driver.RWOnly';

      rwonly.setName("Kageyama");
      System.out.println(rwonly.getName());
  }
}