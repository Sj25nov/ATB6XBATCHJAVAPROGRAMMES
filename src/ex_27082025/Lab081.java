package ex_27082025;

import java.util.Locale;
import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        //Realtime use in automation framework
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter Your browser name where you want to execute your code...!!");
        String broswername=Sc.nextLine();
        broswername=broswername.toLowerCase();
        switch (broswername) {
            case "chrome":
                System.out.println("Starting the chromebrowser");
                //further code you need to write here
                //webdriver driver=new chromedriver();
                break;

                case "mozila":
                    System.out.println("Starting the mozila");
                    //further code you need to write here
                    //webdriver driver=new chromedriver();
                    break;

                    case "firefox":
                        System.out.println("Starting the firefoxbrowser");
                        //further code you need to write here
                        //webdriver driver=new chromedriver();
                        break;

                        case "Brave":
                            System.out.println("Starting the Bravebrowser");
                            //further code you need to write here
                            //webdriver driver=new chromedriver();
                            break;
                        default:
                            System.out.println("Not Supported browser");

                    }
                }
            }

