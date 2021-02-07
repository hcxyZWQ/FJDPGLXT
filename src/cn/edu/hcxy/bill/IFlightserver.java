package cn.edu.hcxy.bill;

import cn.edu.hcxy.bean.CustomerInformation;
import cn.edu.hcxy.bean.FlightInformation;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightserver {
    void insertFlightInformation(FlightInformation zwq_flight) throws SQLException;
    Set<FlightInformation> getAllFlightInformation() throws SQLException;
    FlightInformation getSeatsRemainder(String zwq_seatsRemainder);//按余座信息查询
    FlightInformation getDepartureTime(String zwq_departureTime) throws SQLException;//按起飞时间查询
    FlightInformation getDeparturePlase(String zwq_departurePlase) throws SQLException;//按起飞地点查询
    FlightInformation getDestinationPlace(String zwq_destinationPlace) throws SQLException;//按目的地查询
    FlightInformation getFlightId(String zwq_filghtId) throws SQLException;//输入航班号查询到的航班
    int getaldulprice(String zwq_filghtId) throws SQLException;//查询该航班的不同类型的票价
    int getchildprice(String zwq_filghtId) throws SQLException;//查询该航班的不同类型的票价
    void UpdateseatsRemainder(String zwq_filghtId,String zwq_name) throws SQLException;
    void UpdateseatsRemainder(String zwq_filghtId) throws SQLException;

    void insertCustomerInformation(CustomerInformation zwq_chengke) throws SQLException;
    void getFlightInformation(String zwq_name) throws SQLException;//输入名字查找航班
    void deleteCustomerInformation(String zwq_name) throws SQLException;
}
