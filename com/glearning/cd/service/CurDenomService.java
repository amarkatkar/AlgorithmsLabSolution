package com.glearning.cd.service;

public class CurDenomService {

 public void countnotes(int[] notes, int amt) {

 int[] Counter = new int[notes.length];

 for (int i = 0; i < notes.length; i++) {
 if (amt >= notes[i]) {
 Counter[i] = amt / notes[i];
 amt = amt - Counter[i] * notes[i];
 }
 }


 System.out.println("Your payment approach in order to give min no of notes will be ");
 for (int i = 0; i < notes.length; i++) {
 if (Counter[i] != 0) {
 System.out.println(notes[i] + " : " + Counter[i]);
 }
 }
 }

 public void descOrder(int[] arr) {

 for (int i = 0; i < arr.length; i++) {

 for (int j = 0; j < (arr.length - 1 - i); j++) {
 if (arr[j] < arr[j + 1]) {
 int temp = arr[j];
 arr[j] = arr[j + 1];
 arr[j + 1] = temp;
 }

 }
 }
 }
}
