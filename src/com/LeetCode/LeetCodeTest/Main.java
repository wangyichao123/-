package com.LeetCode.LeetCodeTest;

import org.junit.Test;
import org.w3c.dom.ls.LSException;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.AnnotatedArrayType;
import java.util.*;


public class Main {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }


    }


    @Test
    public void test(){
        TreeNode node1=new TreeNode(6);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(8);
        TreeNode node4=new TreeNode(0);
        TreeNode node5=new TreeNode(4);
        TreeNode node6=new TreeNode(7);
        TreeNode node7=new TreeNode(9);
        TreeNode node8=new TreeNode(3);
        TreeNode node9=new TreeNode(5);
        //TreeNode node10=new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        node5.left=node8;
        node5.right=node9;


        ListNode list11=new ListNode(0);
        ListNode list12=new ListNode(1);
        ListNode list13=new ListNode(2);
        ListNode list14=new ListNode(3);
        ListNode list15=new ListNode(4);
        ListNode list16=new ListNode(5);
        ListNode list17=new ListNode(6);
        list11.next=list12;
        list12.next=list13;
        list13.next=list14;
        list14.next=list15;
        list15.next=list16;
        list16.next=list17;

        char[][] board={{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};


        ListNode node11=new ListNode(2);
        ListNode node12=new ListNode(4);
        ListNode node13=new ListNode(3);
        node11.next=node12;
        node12.next=node13;
        ListNode node21=new ListNode(5);
        ListNode node22=new ListNode(6);
        ListNode node23=new ListNode(4);
        node21.next=node22;
        node22.next=node23;
        ListNode node=addTwoNumbers(node11,node21);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s="";
        while (l1!=null){
            s+=String.valueOf(l1.val);
            l1=l1.next;
        }
        StringBuilder s1=new StringBuilder(s);
        s=s1.reverse().toString();
        String s3="";
        while (l2!=null){
            s3+=String.valueOf(l2.val);
            l2=l2.next;
        }
        StringBuilder s2=new StringBuilder(s3);
        s3=s2.reverse().toString();
        String res="";
        boolean jinwei=false;
        for(int i=s.length()-1,j=s3.length()-1;;){
            if(i==0&&j==0){
                break;
            }


        }
        int i;

        return l1;
    }



    public static void main(String[] args) {
	// write your code here

    }

    //????????????
    /*public static int[] Merge_Sort(int[] arr, int start, int end) {
        //???start==end???????????????????????????????????????????????????????????????
        if (start < end) {
            //??????????????????????????????????????????
            int mid = (start + end) / 2;
            //???????????????
            Merge_Sort(arr, start, mid);
            //???????????????
            Merge_Sort(arr, mid + 1, end);
            //???????????????????????????????????????
            Merge(arr, start, mid, end);
        }
        return arr;
    }

    //????????????
    public static void Merge(int[] arr, int start, int mid, int end) {
        //?????????????????????i_start?????????i_end?????????????????????????????????
        int i_start = start;
        int i_end = mid;
        //?????????????????????j_start?????????j_end?????????????????????????????????
        int j_start = mid + 1;
        int j_end = end;
        //???????????????????????????????????????end-start+1
        int[] temp=new int[end-start+1];
        int len = 0;
        //????????????????????????
        while (i_start <= i_end && j_start <= j_end) {
            //???arr[i_start]<arr[j_start]?????????????????????????????????????????????????????????
            if (arr[i_start] < arr[j_start]) {
                temp[len] = arr[i_start];
                len++;
                i_start++;
            } else {
                temp[len] = arr[j_start];
                len++;
                j_start++;
            }
            //temp[len++]=arr[i_start]<arr[j_start]?arr[i_start++]:arr[j_start++];
        }

        //i??????????????????????????????
        while(i_start<=i_end){
            temp[len] = arr[i_start];
            len++;
            i_start++;
        }
        //j??????????????????????????????
        while(j_start<=j_end){
            temp[len] = arr[j_start];
            len++;
            j_start++;
        }
        //????????????????????????????????????
        for(int i=0;i<temp.length;i++){
            arr[start+i]=temp[i];
        }
    }*/


}
