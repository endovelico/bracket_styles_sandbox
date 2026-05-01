package com.brackets.demo.styles;

public class GNU
{
    private int value;

    public GNU(int value)
    {
        this.value = value;
    }

    public void process(int input)
    {
        if (input > 0)
        {
            for (int i = 0; i < input; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.println("Even: " + i);
                }
                else if (i % 3 == 0)
                {
                    System.out.println("Divisible by 3: " + i);
                }
                else
                {
                    System.out.println("Other: " + i);
                }
            }
        }
        else if (input == 0)
        {
            System.out.println("Zero input");
        }
        else
        {
            System.out.println("Negative input");
        }

        switch (input)
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Default");
        }

        int counter = 0;
        while (counter < 3)
        {
            try
            {
                riskyOperation(counter);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Caught exception: " + e.getMessage());
            }
            finally
            {
                counter++;
            }
        }
    }

    private void riskyOperation(int x)
    {
        if (x == 1)
        {
            throw new IllegalArgumentException("Bad value: " + x);
        }
    }

    public Runnable createTask()
    {
        return new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Running anonymous task");
            }
        };
    }

    public void lambdaExample()
    {
        java.util.List<Integer> list = java.util.Arrays.asList(1, 2, 3);

        list.forEach(n ->
        {
            if (n > 1)
            {
                System.out.println("Greater than one: " + n);
            }
        });
    }
}