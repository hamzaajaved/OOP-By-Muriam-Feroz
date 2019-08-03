using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1-Rectangle\n2-Triangle\n3-Circle");
            Console.WriteLine("Enter Choice: ");
            int choice = Convert.ToInt16(Console.ReadLine());

            if (choice == 1)
            {
                Console.WriteLine("RECTANGLE CLASS");
                Rectangle rt = new Rectangle();
                Console.WriteLine("Enter Length: ");
                rt.length = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter Breadth: ");
                rt.breadth = Convert.ToDouble(Console.ReadLine());

                double rtArea = rt.calcArea();
                Console.WriteLine("Area of Rectangle is: " + rtArea);
            }
            else if(choice == 2)
            {
                Console.WriteLine("TRIANGLE CLASS");
                Triangle t = new Triangle();
                Console.WriteLine("Enter Length1 : ");
                t.l1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Length2 : ");
                t.l2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Length3 : ");
                t.l3 = Convert.ToDouble(Console.ReadLine());

                double tArea = t.getArea();
                Console.WriteLine("Area of Triangle is : " + tArea);

            }
            else if(choice == 3)
            {
                Console.WriteLine("CIRCLE CLASS");
                Circle circle = new Circle();

                Console.WriteLine("Enter Radius: ");
                circle.radius = Convert.ToDouble(Console.ReadLine());
                double AreaCircle = circle.getArea();
                Console.WriteLine("Area of Circle is : " + AreaCircle);
            }
            else
            {
                Console.WriteLine("You Entered Wrong Choice!!");
            }
        }
    }

    public class Rectangle
    {
        public double length;
        public double breadth;

        public double calcArea()
        {
            return length * breadth;
        }

        public double calcPerimeter()
        {
            return 2 * length + 2 * breadth;
        }
    }

    public class Circle
    {
        public double radius;

        public double getArea()
        {
            return Math.PI * radius * radius;
        }
    }

    public class Triangle
    {
        public double l1;
        public double l2;
        public double l3;

        public double getArea()
        {
            return l1 * l2 * l3;
        }

    }


}
