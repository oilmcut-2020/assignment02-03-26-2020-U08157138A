package com.company;
public class Main {
        public static void main(String args[])
        {
          for(int i =0;i<=100;i++)
          {   boolean a = true;
              for(int j=2;j <= i-1;j++) {
                  int k = i % j;
                  if (k == 0) {
                      a = false;
                      break;
                  }
              }
              if(a) {
                  System.out.println(i);
              }
          }

          }
        }


