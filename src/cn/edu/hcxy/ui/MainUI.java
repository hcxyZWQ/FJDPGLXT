package cn.edu.hcxy.ui;

import cn.edu.hcxy.bean.CustomerInformation;
import cn.edu.hcxy.bean.FlightInformation;
import cn.edu.hcxy.bill.IFlightserver;
import cn.edu.hcxy.bill.Impl.IFlightserverImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class MainUI {
    public static <IFlightService, flight> void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);//接受键盘输入
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，推出系统");

            int choice = sc.nextInt();

            int zwq_seatsRemainder = 0;
            
            if (choice == 1) {
                String id = UUID.randomUUID().toString().replace("-", "");
                System.out.println(id);
                System.out.print("请输入航班编号：");
                String zwq_filghtId=sc.next();
                System.out.print("请输入起飞时间：");
                String zwq_departureTime=sc.next();
                System.out.print("请输入起飞机场：");
                String zwq_departurePlase=sc.next();
                System.out.print("请输入目的机场：");
                String zwq_destinationPlace=sc.next();
                System.out.print("请输入座位数：");
                int zwq_seatsNumber=sc.nextInt();
                System.out.print("请输入成人价格:");
                int zwq_adultPrice=sc.nextInt();
                System.out.print("请输入儿童价格:");
                int zwq_childPrice=sc.nextInt();

                FlightInformation flight = new FlightInformation(id,zwq_filghtId,zwq_departureTime,zwq_departurePlase,zwq_destinationPlace,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);

                IFlightserver iFlightserver = new IFlightserverImpl();
                iFlightserver.insertFlightInformation(flight);
            }
            else if (choice == 2) {
                IFlightserver iFlightserver=new IFlightserverImpl();
                Set<FlightInformation> AllFlight=iFlightserver.getAllFlightInformation();
                for(FlightInformation flight:AllFlight)
                {
                    System.out.println(flight);
                }
            }
            else if(choice==3)
            {
                int choose=0;
                IFlightserver iFlightserver=new IFlightserverImpl();
                FlightInformation flight = null;
                System.out.println("查询航班信息可分为四种查询：");
                System.out.println("1，按空座查询");
                System.out.println("2，按起飞时间查询");
                System.out.println("3，按起飞地点查询");
                System.out.println("4，按目的地点查询");
                choose=sc.nextInt();
                if(choose==1)
                {
                    System.out.println("此选项功能为查询某航班的空座信息！");
                }
                else if(choose==2)
                {
                    System.out.println("请输入您要查询航班的起飞时间！");
                    String zwq_departureTime=sc.next();
                    flight=iFlightserver.getDepartureTime(zwq_departureTime);
                    if(flight!=null)
                    {
                        System.out.println("查询结果："+flight);
                    }
                    else {
                        System.out.println("没有找到该航班！请重新输入！");
                    }
                }
                else if(choose==3)
                {
                    System.out.println("请输入您要查询航班的起飞机场！");
                    String zwq_departurePlase=sc.next();
                    flight=iFlightserver.getDeparturePlase(zwq_departurePlase);
                    if(flight!=null)
                    {
                        System.out.println("查询结果："+flight);
                    }
                    else {
                        System.out.println("没有找到该航班！请重新输入！");
                    }
                }
                else if(choose==4)
                {
                    System.out.println("请输入您要查询航班的目的机场");
                    String zwq_destinationPlace=sc.next();
                    flight=iFlightserver.getDestinationPlace(zwq_destinationPlace);
                    if(flight!=null)
                    {
                        System.out.println("查询结果："+flight);
                    }
                    else {
                        System.out.println("没有找到该航班！请重新输入！");
                    }
                }
            }
            else if (choice==4)
            {
                //显示航班信息

                IFlightserver iFlightserver=new IFlightserverImpl();
                Set<FlightInformation> AllFlight=iFlightserver.getAllFlightInformation();
                for(FlightInformation flight:AllFlight)
                {
                    System.out.println(flight);
                }
                FlightInformation flight;

                System.out.println("请选择您要预定的航班");
                String zwq_flightId=sc.next();
                flight=iFlightserver.getFlightId(zwq_flightId);
                if(flight!=null)
                {
                    System.out.println("航班信息为："+flight);
                }
                else {
                    System.out.println("航班号错误！请重新输入！");
                }
                System.out.print("请输入需要预定的机票数：");
                int zwq_orderNumber=sc.nextInt();
                String zwq_id;
                String zwq_filghtId = null;
                String zwq_name = null;
                String zwq_phoneId;
                String zwq_identityCardId;
                String zwq_customerType = null;
                String zwq_sex;
                int sum=0;//计算机票总额
                int zongji=0;
                zongji=zwq_orderNumber;

                int flight1,flight2;


                String zwq_name1[]=new String[10];
                IFlightserver iFlightserver1 = null;
                CustomerInformation chengke = null;

                for (int i=1;i<=zwq_orderNumber;i++)
                {
                    System.out.println("请填写第"+i+"位乘客的乘客信息");
                     zwq_id= UUID.randomUUID().toString().replace("-", "");
                    System.out.println(zwq_id);
                    System.out.print("请输入航班编号：");
                    zwq_filghtId=sc.next();
                    System.out.print("请输入您的姓名：");
                    zwq_name=sc.next();
                    zwq_name1[i]=zwq_name;
                    System.out.print("请输入您的电话号码：");
                    zwq_phoneId=sc.next();
                    System.out.print("请输入身份证号：");
                    zwq_identityCardId=sc.next();
                    System.out.print("请输入您的选票类型:");
                    zwq_customerType=sc.next();
                    System.out.print("请输入您的性别:");
                    zwq_sex=sc.next();
                    if(i!=zongji)
                    {
                        zwq_orderNumber=0;
                    }
                    chengke=new CustomerInformation(zwq_id,zwq_filghtId,zwq_name,zwq_phoneId,zwq_identityCardId,zwq_orderNumber,zwq_customerType,zwq_sex);
                    iFlightserver1=new IFlightserverImpl();
                    zwq_orderNumber=zongji;

                    IFlightserver iFlightserver2=new IFlightserverImpl();
                    flight1=iFlightserver2.getaldulprice(zwq_filghtId);
                    System.out.println(flight1);
                    flight2=iFlightserver2.getchildprice(zwq_filghtId);
                    if(zwq_customerType.equals("成人"))
                    {
                        sum+=flight1;
                    }
                    else if(zwq_customerType.equals("儿童"))
                    {
                        sum+=flight2;
                    }
                }


                System.out.println("是否确定预定？");
                    int choose=0;
                System.out.println("1,确定");
                System.out.println("2.取消");
                choose=sc.nextInt();
                if (choose==1)
                {
                    int money=0;
                    System.out.println("您一共需要支付" + sum + "元");
                    System.out.println("1,支付");
                    System.out.println("2.取消");
                    money=sc.nextInt();
                    if(money==1)
                    {
                        iFlightserver1.insertCustomerInformation(chengke);
                        System.out.println("预订成功");
                        for (int i=1;i<=zongji;i++)
                        {
                            zwq_name=zwq_name1[i];
                            iFlightserver.getFlightInformation(zwq_name);
                        }

                    }else {
                        System.out.println("预定失败");
                        continue;
                    }
                }
                else {
                    System.out.println("预定失败");
                }
            }
            else  if (choice==5)
            {
                //输入姓名查找航班
                //显示航班信息
                //询问是否退订
                //是则删除
                FlightInformation flight;
                System.out.println("请输入您的姓名");
                String zwq_name=sc.next();
                IFlightserver iFlightserver=new IFlightserverImpl();
                System.out.println("是否确定退订？");
                int choose=0;
                System.out.println("1,确定");
                System.out.println("2.取消");
                choose=sc.nextInt();
                if (choose==1)
                {
                    iFlightserver.deleteCustomerInformation(zwq_name);
                    System.out.println("退订成功！");
                }
                else {
                    System.out.println("取消退订！");continue;
                }
            }
        }

    }
}
