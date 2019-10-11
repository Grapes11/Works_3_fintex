package com.company;

class Traffic_light {
    private String[] light_status = new String[4];
    private int number;
    Traffic_light()
    {
        light_status[0]="Состояние: Красный";
        light_status[1]="Состояние: Желтый";
        light_status[2]="Состояние: Зеленый";
        light_status[3]="Состояние: Мигающий желтый";
        number=3;
        Output_burning();
    }

    void Y ()
    {
        if (number != 3)
        {
            if (number+1<=2)
            {
                number = number + 1;
                Output_burning();
            }
            else
            {
                System.out.println("Такое действие невозможно");
            }
        }
        else
        {
            System.out.println("Чтобы выйти из режима мигающего Желтого, то введите команду: Work");
        }
    }
    void B ()
    {
        if (number != 3)
        {
            if (number-1>=0)
            {
                number = number - 1;
                Output_burning();
            }
            else
            {
                System.out.println("Такое действие невозможно");
            }

        }
        else
        {
            System.out.println("Чтобы выйти из режима мигающего Желтого, то введите команду: Work");
        }
    }
    void Work ()
    {
        if (number != 3)
        {
            number=3;
            Output_burning();
        }
        else
        {
            number=1;
            Output_burning();
        }

    }
    void Output_burning ()
    {
        String burning_now = light_status[number];
        System.out.println(burning_now);
    }

}
