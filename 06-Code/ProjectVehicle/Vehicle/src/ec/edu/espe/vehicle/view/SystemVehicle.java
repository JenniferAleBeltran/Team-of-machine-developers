//This project is created to help the client to quote a vehicle in a dealership,
//according to his budget, it helps him choose between several options of brands and models,
//so he will choose the one that best suits him.


package ec.edu.espe.vehicle.view;
import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Register;
import ec.edu.espe.vehicle.model.ModelofVehicle;
import ec.edu.espe.vehicle.model.Vehicle;

import java.util.Scanner; // Falta library json

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemVehicle {

    public static void main(String[] args) {

        float money;
        String brand;
        String color;
        Scanner read = new Scanner(System.in);
        int option;
        int option2;
        int option3;
        int option4;
        int option5;
        
        do{
        System.out.println("Welcome to the dealership");
        System.out.println("Enter the money you have to purchase the vehicle:");
        money = read.nextFloat();
        if (money <= 13000) { // Este if no condiciona nada 
            System.out.println("At the moment we do not have vehicles according to your budget, but you can view the new vehicles that we have.");
        } else {
            System.out.println("you can buy a new vehicle");
        }
            System.out.println("");
        System.out.println("What brand of vehicle do you want to buy?");
        System.out.println("1.-Chevrolet");
        System.out.println("2.-Toyota");
        System.out.println("3.-KIA");
        System.out.println("4.-Hyundai");
        System.out.println("5.-Exit");
        option = read.nextInt();

        switch (option) {

            case 1:
                System.out.println("Welcome to Chevrolet");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Aveo");
                System.out.println("2.-Sparkgt");
                System.out.println("3.-Beat");
                System.out.println("4.-Sail");
                option2 = read.nextInt();
                switch (option2) {
                    case 1:
                        System.out.println("The Chevrolet Aveo version features:");
                        System.out.println("1.5L 4-cylinder engine\n"
                                + "    107 HP of power and 104 lb.-ft. of torque\n"
                                + "    McPherson® front suspension\n"
                                + "    5 speed manual transmission\n"
                                + "    Air conditioning with manual control\n"
                                + "    AM / FM radio, MP3 player, input for USB and Aux In and Bluetooth® connection\n"
                                + "    14 ”steel wheels\n"
                                + "    2 front airbags for driver and passenger\n"
                                + "    4-wheel ABS brakes");
                        System.out.println("Its price is: $15000");
                        break;
                    case 2:
                        System.out.println("The Chevrolet Sparkgt version features:");
                        System.out.println(" Gasoline engine\n"
                                + "    Displacement 1999 cc\n"
                                + "    Maximum Power 152 hp @ 6,200 rpm\n"
                                + "    Maximum torque 191 nm @ 4,700 rpm\n"
                                + "    6-speed manual transmission + reverse\n"
                                + "    Driver and Passenger Airbag\n"
                                + "    ABS anti-lock braking system");
                        System.out.println("Its price is: $13000");
                        break;
                    case 3:
                        System.out.println("The Chevrolet Beat version features:");
                        System.out.println("1.2L 4-cylinder engine\n"
                                + "   5-speed manual transmission\n"
                                + "   Electro-assisted steering\n"
                                + "   Mylink system with 7-inch touch screen (Compatible with Android Auto and Apple CarPlay)\n"
                                + "   Air-conditioning\n"
                                + "   Mirrors with electrical adjustment\n"
                                + "   Electric windows on the 4 doors\n"
                                + "   Audio and phone controls behind the wheel\n"
                                + "   ABS + EBD braking systems\n"
                                + "   Double front airbag");
                        System.out.println("Its price is: $14799");
                        break;
                    case 4:
                        System.out.println("The Chevrolet Sail version features:");
                        System.out.println("Slope start assistant\n"
                                + "   Electronic stability control\n"
                                + "   Aluminum rings\n"
                                + "   Power: 109 hp");
                        System.out.println("Its price is: $16000");
                        break;
                    default:
                        System.out.println("WARNING!!!!"); 
                        break;
                       
            }break;
            case 2:
                System.out.println("Welcome to Toyota");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Corolla");
                System.out.println("2.-Yaris");
                System.out.println("3.-Hilux");
                System.out.println("4.-Fortuner");
                option3 = read.nextInt();
                switch (option3) {
                    case 1:
                        System.out.println("The Toyota Corolla version features:");
                        System.out.println("Hybrid 1.8 L engine.\n"
                                + "    Power of 122cv.\n"
                                + "    170 Nm torque.\n"
                                + "    CVT transmission.\n"
                                + "    86 km / Gal consumption.");
                        System.out.println("Its price is: $30000");
                        break;
                    case 2:
                        System.out.println("The Toyota Yaris version features:");
                        System.out.println(" car body\n"
                                + "doors 5.\n"
                                + "squares5.\n"
                                + "trunk286 l.\n"
                                + "power125 hp.\n"
                                + "consumption4.8 l / 100km");
                        System.out.println("Its price is: $22000");
                        break;
                    case 3:
                        System.out.println("The Toyota Hilux version features:");
                        System.out.println("2,700cc engine\n"
                                + "160 horsepower power\n"
                                + "maximum torque of 241 Nm ");
                        System.out.println("Its price is: $53000");
                        break;
                    case 4:
                        System.out.println("The Toyota Fortuner version features:");
                        System.out.println("2,700 cc engine"
                                + "4 cylinders in line"
                                + "16 valves"
                                + " DOHC and DUAL VVT-i technology"
                                + " 163Hp power"
                                + "torque of 245 Nm");
                        System.out.println("Its price is: $56000");
                        break;
                    default:
                        System.out.println("WARNING!!!!");
                        break;
            }break;
            case 3:
                System.out.println("Welcome to KIA");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Picanto");
                System.out.println("2.-Sportage");
                System.out.println("3.-Optima");
                System.out.println("4.-Rio");
                option4 = read.nextInt();
                switch (option4) {
                    case 1:
                        System.out.println("Kia Picanto version features:");
                        System.out.println("Gasoline Extra / Eco-country.\n"
                                + "    1.0 / 1.2 engine.\n"
                                + "    Maximum power 83hp.\n"
                                + "    Vehicle consumption 65 km / g.\n"
                                + "    10-year / 160 thousand km warranty.\n"
                                + "    seven-inch touchscreen multimedia system\n"
                                + "    It develops 84 horses and 122 Nm at 4,000 revolutions\n"
                                + "    3.59 meters long, 1.59 meters wide and 1.48 meters high");
                        System.out.println("Its price is: $13000");
                        break;
                    case 2:
                        System.out.println("Kia Sportage version features:");
                        System.out.println(" 2.4L 4-cylinder, 181 hp, 175 pound-feet of torque engine\n"
                                + "    6-speed automatic transmission with Sportmatic®.\n"
                                + "    17 \"alloy wheels\n"
                                + "    Rear privacy glass\n"
                                + "    Led daytime running lights\n"
                                + "    Available all-wheel drive\n"
                                + "    Dynamax ™ All-Wheel Drive (AWD) with Locking Center Differential");
                        System.out.println("Its price is: $29000");
                        break;
                    case 3:
                        System.out.println("Kia Optima version features:");
                        System.out.println("4 cyl, 2.4 L, 185 hp engine\n"
                                + "   16 \"alloy wheels \n"
                                + "   Autonomous emergency braking and warning\n"
                                + "   Cloth seat with CleanTex ™\n"
                                + "   Air-conditioning\n"
                                + "   8 \"touch screen with rear camera\n"
                                + "   Lane Keeping and Lane Following Assist\n"
                                + "   Dual Overhead Cam (DOHC), 16-valve\n"
                                + "   Gasoline Direct Injection (GDI)\n"
                                + "   6-speed automatic transmission");
                        System.out.println("Its price is: $34000");
                        break;
                    case 4:
                        System.out.println("Kia Rio version features:");
                        System.out.println("1.6-liter, 4-cylinder in-line engine\n"
                                + "   Air-conditioning\n"
                                + "   Tilting steering wheel with mounted audio controls\n"
                                + "   Heated power windows, locks and exterior mirrors\n"
                                + "   horsepower 120hp\n"
                                + "   6-way adjustable driver's seat");
                        System.out.println("Its price is: $20000");
                        break;
                    default:
                        System.out.println("WARNING!!!!");
                        break;
            }break;
            case 4:
                System.out.println("Welcome to Hyundai");
                System.out.println("What model do you want of vehicle?");
                System.out.println("1.-Santa Fe");
                System.out.println("2.- i10");
                System.out.println("3.- Tucson");
                System.out.println("4.- IONIQ");
                option5 = read.nextInt();
                switch (option5) {
                    case 1:
                        System.out.println("Hyundai Santa FE version features:");
                        System.out.println("BodySUV Large.\n"
                                + "    doors 5.\n"
                                + "    squares7.\n"
                                + "    trunk547 l.\n"
                                + "    power 150 - 202 hp.\n"
                                + "    Consumption 5.6 - 9.3 l / 100km\n"
                                + "    long, 1.89 meters wide and 1.68 meters high\n"
                                + "    2.4 GDI with 184 horsepower and 241 Nm of torque");
                        System.out.println("Its price is: $45000");
                        break;
                    case 2:
                        System.out.println("Hyundai i10 version features:");
                        System.out.println(" 1.0 MPi 3-cylinder with 67 hp and 96 Nm of torque\n"
                                + "    Kind. Valves Power (HP / RPM)\n"
                                + "    System. Front and rear. Hand brake."
                                + "    Tires. Front steel hoops. Later.\n"
                                + "    System. MDPS (Electric Motor Assisted)\n"
                                + "    Kind. Speeds. Handbook.\n"
                                + "    Third brake light. Roof antenna");
                        System.out.println("Its price is: $15000");
                        break;
                    case 3:
                        System.out.println("Hyundai Tucson version features:");
                        System.out.println("SUV body\n"
                                + "   \"Medium. \n"
                                + "   doors 5.\n"
                                + "   squares5.\n"
                                + "   trunk546 l.\n"
                                + "   power 115 - 180 hp.\n"
                                + "   consumption6,1 l / 100km\n"
                                + "   Conventional engines are made up of a 115 hp 1.6 diesel and a 150 hp 1.6 turbo petrol\n"
                                + "   full support for Apple CarPlay and Android Auto\n"
                                + "   48-volt micro-hybrids");
                        System.out.println("Its price is: $40000");
                        break;
                    case 4:
                        System.out.println("Hyundai IONIQ version features:");
                        System.out.println("Consumption3.6 l / 100km\n"
                                + "   power141 hp.\n"
                                + "   Compact body.\n"
                                + "   trunk563 l\n"
                                + "   4,470 mm long, 1,820 mm wide and 1,450 mm high.\n"
                                + "   141 hp, with a maximum torque of 265 Nm.");
                        System.out.println("Its price is: $19000");
                        break;
                    default:
                        System.out.println("WARNING!!!!");
                        break;
            }break;
            case 5:
                System.out.println("");
                break;
            default:
                System.out.println("WARNING!!!!");
                break;
        }
        }while(option !=5);// Recomendacion demasiados cases tratar de optimizar 
        }
    } // Falta el codigo json
