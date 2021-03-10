package com.company.PepCoding.StacksQueues;
import java.io.*;

public class DynamicStack {

    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {
            // overFLow
//            if (size() == data.length) {
//                System.out.println("Stack overflow");
//                return;
//            }
            if (size() == data.length) {
                //STEP_1 : create new array with twice length
                int newData[] = new int[data.length * 2];

                // STEP_2 : copy elements
                for (int i =0; i < data.length; i++) {
                    newData[i] = data[i];
                }

                //STEP_3 : Change the reference of the data
                data = newData;

                //STEP_4 : Push the element
                push(val);
                return;
            }
            tos++;
            data[tos] = val;
        }

        int pop() {
            // write ur code here
            //underflow error
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = data[tos];
            data[tos] = 0;
            tos--;
            return val;
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = data[tos];
            return val;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            } else if(str.startsWith("display")){
                st.display();
            }
            str = br.readLine();
        }
    }
}
