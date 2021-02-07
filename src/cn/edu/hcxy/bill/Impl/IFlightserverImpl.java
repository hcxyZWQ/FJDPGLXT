package cn.edu.hcxy.bill.Impl;

import cn.edu.hcxy.bean.CustomerInformation;
import cn.edu.hcxy.bean.FlightInformation;
import cn.edu.hcxy.bill.IFlightserver;
import cn.edu.hcxy.dao.IFlightDao;
import cn.edu.hcxy.dao.Impl.IFlightDaoImpl;

import java.sql.SQLException;
import java.util.Set;

public class IFlightserverImpl implements IFlightserver {

    IFlightDao iFlightDao;
    public IFlightserverImpl() {
        iFlightDao=new IFlightDaoImpl();
    }

    @Override
    public void insertFlightInformation(FlightInformation zwq_flight) throws SQLException {
        iFlightDao.insertFlightInformation(zwq_flight);
    }

    @Override
    public Set<FlightInformation> getAllFlightInformation() throws SQLException {
        return iFlightDao.getAllFlightInformation();
    }

    @Override
    public FlightInformation getSeatsRemainder(String zwq_seatsRemainder) {
        return null;
    }

    @Override
    public FlightInformation getDepartureTime(String zwq_departureTime) throws SQLException {
        return iFlightDao.getDepartureTime(zwq_departureTime);
    }

    @Override
    public FlightInformation getDeparturePlase(String zwq_departurePlase) throws SQLException {
        return iFlightDao.getDeparturePlase(zwq_departurePlase);
    }

    @Override
    public FlightInformation getDestinationPlace(String zwq_destinationPlace) throws SQLException {
        return iFlightDao.getDestinationPlace(zwq_destinationPlace);
    }

    @Override
    public FlightInformation getFlightId(String zwq_filghtId) throws SQLException {
        return iFlightDao.getFlightId(zwq_filghtId);
    }

    @Override
    public int getaldulprice(String zwq_filghtId) throws SQLException {
        return iFlightDao.getaldultprice(zwq_filghtId);
    }

    @Override
    public int getchildprice(String zwq_filghtId) throws SQLException {
        return iFlightDao.getchildtprice(zwq_filghtId);
    }

    @Override
    public void UpdateseatsRemainder(String zwq_filghtId, String zwq_name) throws SQLException {
        iFlightDao.UpdateseatsRemainder(zwq_filghtId,zwq_name);
    }

    @Override
    public void UpdateseatsRemainder(String zwq_filghtId) throws SQLException {
        iFlightDao.UpdateseatsRemainder(zwq_filghtId);
    }


    @Override
    public void insertCustomerInformation(CustomerInformation zwq_chengke) throws SQLException {
        iFlightDao.insertCustomerInformation(zwq_chengke);
    }

    @Override
    public void getFlightInformation(String zwq_name) throws SQLException {
        iFlightDao.getFlightInformation(zwq_name);
    }

    @Override
    public void deleteCustomerInformation(String zwq_name) throws SQLException {
        iFlightDao.deleteCustomerInformation(zwq_name);
    }
}
