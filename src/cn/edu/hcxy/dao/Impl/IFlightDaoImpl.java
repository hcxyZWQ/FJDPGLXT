package cn.edu.hcxy.dao.Impl;

import cn.edu.hcxy.bean.CustomerInformation;
import cn.edu.hcxy.bean.FlightInformation;
import cn.edu.hcxy.dao.IFlightDao;
import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.LexicalContextNode;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class IFlightDaoImpl implements IFlightDao {
    Connection conn;
    PreparedStatement pstmt;
    @Override
    public void insertFlightInformation(FlightInformation zwq_flight) throws SQLException {

        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?,?,?)";

         pstmt= conn.prepareStatement(sql);//执行sql语句
        pstmt.setString(1,zwq_flight.getZwq_Id());
        pstmt.setString(2,zwq_flight.getZwq_filghtId());
        pstmt.setString(3,zwq_flight.getZwq_departureTime());
        pstmt.setString(4,zwq_flight.getZwq_departurePlase());
        pstmt.setString(5,zwq_flight.getZwq_destinationPlace());
        pstmt.setInt(6,zwq_flight.getZwq_seatsNumber());
        pstmt.setInt(7, zwq_flight.getZwq_seatsNumber());
        pstmt.setInt(8,zwq_flight.getZwq_adultPrice());
        pstmt.setInt(9,zwq_flight.getZwq_childPrice());
        pstmt.executeUpdate();
    }

    @Override
    public Set<FlightInformation> getAllFlightInformation() throws SQLException {
        Set<FlightInformation> AllFlight=new HashSet<>();//容器
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT flightId,departureTime,departurePlase,destinationPlace,"
        +"seatsNumber,seatsRemainder,adultPrice,childPrice FROM Flight";

        pstmt= conn.prepareStatement(sql);//执行sql语句
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId=rs.getString("flightId");
            String zwq_departureTime=rs.getString("departureTime");
            String zwq_departurePlase=rs.getString("departurePlase");
            String zwq_destinationPlace=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价

            FlightInformation flight= new FlightInformation(zwq_filghtId,zwq_departureTime,zwq_departurePlase,zwq_destinationPlace,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
            AllFlight.add(flight);
        }
        return AllFlight;
    }

    @Override
    public FlightInformation getSeatsRemainder(String zwq_seatsRemainder) {
        return null;
    }

    @Override
    public FlightInformation getDepartureTime(String zwq_departureTime) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT flightId,departureTime,departurePlase,destinationPlace,"
                +"seatsNumber,seatsRemainder,adultPrice,childPrice FROM Flight where departureTime=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_departureTime);
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId=rs.getString("flightId");
            String zwq_departureTime1=rs.getString("departureTime");
            String zwq_departurePlase=rs.getString("departurePlase");
            String zwq_destinationPlace=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价

            flight= new FlightInformation(zwq_filghtId,zwq_departureTime1,zwq_departurePlase,zwq_destinationPlace,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
        }
        return flight;
    }

    @Override
    public FlightInformation getDeparturePlase(String zwq_departurePlase) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT flightId,departureTime,departurePlase,destinationPlace,"
                +"seatsNumber,seatsRemainder,adultPrice,childPrice FROM Flight where departurePlase=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_departurePlase);
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId=rs.getString("flightId");
            String zwq_departureTime1=rs.getString("departureTime");
            String zwq_departurePlase1=rs.getString("departurePlase");
            String zwq_destinationPlace=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价

            flight= new FlightInformation(zwq_filghtId,zwq_departureTime1,zwq_departurePlase1,zwq_destinationPlace,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
        }
        return flight;
    }

    @Override
    public FlightInformation getDestinationPlace(String zwq_destinationPlace) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT flightId,departureTime,departurePlase,destinationPlace,"
                +"seatsNumber,seatsRemainder,adultPrice,childPrice FROM Flight where destinationPlace=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_destinationPlace);
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId=rs.getString("flightId");
            String zwq_departureTime1=rs.getString("departureTime");
            String zwq_departurePlase1=rs.getString("departurePlase");
            String zwq_destinationPlace1=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价

            flight= new FlightInformation(zwq_filghtId,zwq_departureTime1,zwq_departurePlase1,zwq_destinationPlace1,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
        }
        return flight;
    }

    @Override
    public FlightInformation getFlightId(String zwq_filghtId) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT flightId,departureTime,departurePlase,destinationPlace,"
                +"seatsNumber,seatsRemainder,adultPrice,childPrice FROM Flight where flightId=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_filghtId);
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId1=rs.getString("flightId");
            String zwq_departureTime1=rs.getString("departureTime");
            String zwq_departurePlase1=rs.getString("departurePlase");
            String zwq_destinationPlace1=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价

            flight= new FlightInformation(zwq_filghtId1,zwq_departureTime1,zwq_departurePlase1,zwq_destinationPlace1,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
        }
        return flight;
    }

    @Override
    public int getaldultprice(String zwq_filghtId) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT adultPrice FROM Flight where flightId=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_filghtId);
        ResultSet rs = pstmt.executeQuery();//执行查询
        int zwq_adultPrice = 0;
        while(rs.next())
        {
            zwq_adultPrice = Integer.parseInt(String.valueOf(rs.getInt("adultPrice")));
        }

        return zwq_adultPrice;
    }

    @Override
    public int getchildtprice(String zwq_filghtId) throws SQLException {
        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT childPrice FROM Flight where flightId=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_filghtId);
        ResultSet rs = pstmt.executeQuery();//执行查询
        int zwq_childPrice = 0;
        while(rs.next())
        {
            zwq_childPrice = Integer.parseInt(String.valueOf(rs.getInt("childPrice")));
        }

        return zwq_childPrice;
    }




    @Override
    public void insertCustomerInformation(CustomerInformation zwq_chengke) throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?)";

        pstmt= conn.prepareStatement(sql);//执行sql语句
        pstmt.setString(1,zwq_chengke.getZwq_id());
        pstmt.setString(2,zwq_chengke.getZwq_filghtId());
        pstmt.setString(3,zwq_chengke.getZwq_name());
        pstmt.setString(4,zwq_chengke.getZwq_phoneId());
        pstmt.setString(5,zwq_chengke.getZwq_identityCardId());
        pstmt.setInt(6,zwq_chengke.getZwq_orderNumber());
        pstmt.setString(7,zwq_chengke.getZwq_customerType());
        pstmt.setString(8,zwq_chengke.getZwq_sex());
        pstmt.executeUpdate();
    }

    @Override
    public  void UpdateseatsRemainder(String zwq_filghtId, String zwq_name) throws SQLException {
        FlightInformation flight=null;
        CustomerInformation flight1=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = " UPDATE flight SET seatsRemainder=seatsRemainder-(SELECT orderNumber FROM Customer WHERE name=?) where flightId=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句
        pstmt.setString(1,zwq_name);
        pstmt.setString(2,zwq_filghtId);


        ResultSet rs = pstmt.executeQuery();//执行查询

        while(rs.next())
        {
            String zwq_name1=rs.getString("name");
            String zwq_filghtId1=rs.getString("flightId");
            String zwq_departureTime1=rs.getString("departureTime");
            String zwq_departurePlase1=rs.getString("departurePlase");
            String zwq_destinationPlace1=rs.getString("destinationPlace");
            int zwq_seatsNumber=rs.getInt("seatsNumber");
            int zwq_seatsRemainder=rs.getInt("seatsRemainder");//作为
            int zwq_adultPrice=rs.getInt("adultPrice");//成人票价
            int zwq_childPrice=rs.getInt("childPrice");//儿童票价
            String zwq_sex=rs.getString("sex");

            flight= new FlightInformation(zwq_filghtId1,zwq_departureTime1,zwq_departurePlase1,zwq_destinationPlace1,zwq_seatsNumber,zwq_seatsRemainder,zwq_adultPrice,zwq_childPrice);
            flight1=new CustomerInformation(zwq_name1,zwq_sex);
        }

    }

    @Override
    public void getFlightInformation(String zwq_name) throws SQLException {
        FlightInformation flight2 = null;
        CustomerInformation flight1=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT Customer.flightid,name,sex,departurePlase,destinationPlace,departureTime FROM Customer\n" +
                "JOIN Flight ON Customer.flightid=Flight.flightid WHERE name=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_name);
        ResultSet rs = pstmt.executeQuery();//执行查询
        while(rs.next())
        {
            String zwq_filghtId1=rs.getString("flightId");
            String zwq_name1=rs.getString("name");
            String zwq_sex=rs.getString("sex");
            String zwq_departurePlase1=rs.getString("departurePlase");
            String zwq_destinationPlace1=rs.getString("destinationPlace");
            String zwq_departureTime1=rs.getString("departureTime");

            flight1= new CustomerInformation(zwq_name1,zwq_sex);
            flight2=new FlightInformation(zwq_filghtId1,zwq_departurePlase1,zwq_destinationPlace1,zwq_departureTime1);

        }

        System.out.print(flight1.toString(1));System.out.println(flight2.toString(2));
    }

    @Override
    public void deleteCustomerInformation(String zwq_name) throws SQLException {
        CustomerInformation flight1=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT Flight.flightid FROM flight JOIN Customer ON Customer.flightid=Flight.flightid DELETE FROM Customer WHERE name=?";
        pstmt= conn.prepareStatement(sql);//执行sql语句

        pstmt.setString(1,zwq_name);
        ResultSet rs = pstmt.executeQuery();//执行查询
        int zwq_childPrice = 0;
        String zwq_filghtId1 = null;
        while(rs.next())
        {
            zwq_filghtId1=rs.getString("flightId");

        }
        //UpdateseatsRemainder(zwq_filghtId1);
    }
    @Override
    public void UpdateseatsRemainder(String zwq_filghtId) throws SQLException {

        FlightInformation flight=null;
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=FJDPGLXT;";
        String username = "sa";
        String password = "123456";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "UPDATE flight SET seatsRemainder=seatsRemainder+1";
        pstmt= conn.prepareStatement(sql);//执行sql语句

    }

}
