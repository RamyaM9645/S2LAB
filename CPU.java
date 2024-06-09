// create cpu with attribute price.create inner class processor(no.of cores,manufacturer ) and static nested class
// RAM(memorey,manufacturer).create object of cpu and print information pf processor and RAM



class CPU
{
    int price;
    class processor
    {
        int no_of_core;
        String manufacturer;
        processor(int core,String manu)
        {
            no_of_core=core;
            manufacturer=manu;
        }
        
        void display()
        {
            System.out.println("\nprocessor info.............");
            System.out.println("no of core is:"+no_of_core);
            System.out.println("manufacturer:"+manufacturer);

        }
    }
        static class RAM
        {
            int memorey;
            String manufacturer;
            RAM(int memo,String mani)
            {
                memorey=memo;
                manufacturer=mani;
            }
            void display()
            {
                System.out.println("ram info.................");
                System.out.println("memory:"+memorey+"GB");
                System.out.println("manufacturer "+manufacturer);
            }
        }
    public static void main(String args[])
    {
        CPU obj0=new CPU();
        CPU.processor obj1= obj0. new processor(8,"SAMSUNG");
        obj1.display();
       
        CPU.RAM obj2=new CPU.RAM(16,"intel");
        obj2.display();
    }

    }


