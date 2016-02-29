package com.shgc.study.generic;

/**
 * Created by make on 2/23/16.
 */
public class Stats<T extends Number>
{
    T[] nums;

    Stats(T[] o)
    {
        nums = o;
    }

    double average()
    {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }


    boolean sameAvg(Stats<?> ob)
    {
        if (average() == ob.average()) return true;
        return false;
    }


    public static void main(String args[])
    {
        Integer[] inums = {1,2,3,4,5,6};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);


    }
}
