package modelo.EntityServices.utils;

import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBService {

    private static DBService instance;

    public static DBService getInstance() {
        if (instance == null) {
            instance = new DBService();
        }
        return instance;
    }

    public void iniciarDn() {
        try {
            Server.createTcpServer("-tcpPort","9092","-tcpAllowOthers","-tcpDaemon").start();

        } catch (SQLException ex) {
            System.out.println("Problema con la base de datos: "+ex.getMessage());
        }
    }
    public void init(){
        iniciarDn();
    }


}
