package com.enoch.studio.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Enoch on 2018/5/11.
 */
public class MainTest {
    public static void main(String[] args) {
        List<Set<Integer>> tmp = new ArrayList<>();
        Set<Integer> mSet = new HashSet();
        mSet.add(1);
        mSet.add(4);
        tmp.add(mSet);
        mSet = new HashSet();
        mSet.add(2);
        mSet.add(4);
        tmp.add(mSet);
        mSet = new HashSet();
        mSet.add(2);
        mSet.add(3);
        tmp.add(mSet);
        mSet = new HashSet();
        mSet.add(1);
        mSet.add(3);
        tmp.add(mSet);
        mSet = new HashSet();
        mSet.add(7);
        mSet.add(3);
        tmp.add(mSet);
        yesOrNo(4, tmp);
    }

    public static void yesOrNo(int n, List<Set<Integer>> mMets) {
        List<Set<Integer>> tmp = new ArrayList<Set<Integer>>();

        List<Set<Integer>> all = enumAll(tmp, 1, n);
        for (Set<Integer> set : all) {
            for (Set<Integer> mSet : mMets) {
                for (Integer integer : mSet) {
                    if (set.contains(integer)) {
                        all.remove(set);
                    }
                }
            }
        }
        if (all.isEmpty())
            System.out.println("no");
        else
            System.out.println("yes");

    }

    public static List<Set<Integer>> enumAll(List<Set<Integer>> sets, int i, int n) {
        List<Set<Integer>> setsTmp = new ArrayList<Set<Integer>>();


        for (Set<Integer> set : sets) {
            Set<Integer> news = new HashSet<>();
            news.addAll(set);
            news.add(2 * i - 1);
            setsTmp.add(news);
            set.add(2 * i);
            setsTmp.add(set);
        }

        if (i == 1) {
            Set<Integer> set = new HashSet<>();
            set.add(2 * i - 1);
            setsTmp.add(set);
            set = new HashSet<>();
            set.add(2 * i);
            setsTmp.add(set);
        }

        if (i <= n)
            return enumAll(setsTmp, i + 1, n);
        else return setsTmp;
    }
}
