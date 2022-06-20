package ar.com.onwave.repository.impl;

import ar.com.onwave.config.Conexion;
import ar.com.onwave.repository.PlanRepository;
import ar.com.onwave.repository.model.PlanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlanRepositoryImpl implements PlanRepository {

    final String SQL_SELECT = "SELECT * FROM plan";
    final String SQL_INSERT = "INSERT INTO plan (nombre, precio, internet, minutos, sms) VALUES (?, ?, ?, ?, ?)";
    final String SQL_DELETE = "DELETE FROM plan WHERE id_plan = ?";
    final String SQL_UPDATE = "UPDATE plan SET nombre=?, precio=?, internet=?, minutos=?, sms=? WHERE id_plan=?";
    final String SQL_SELECT_BY_ID = "SELECT nombre, precio, internet, minutos, sms WHERE id_plan=?";
    @Override
    public List<PlanModel> findAllPlans() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PlanModel planModel;
        List<PlanModel> planModels = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                int idPlan = rs.getInt("id_plan");
                String nombre = rs.getString("nombre");
                double precio = Double.parseDouble(rs.getString("precio"));
                String internet = rs.getString("internet");
                String minutos = rs.getString("minutos");
                String sms = rs.getString("sms");

                planModel = new PlanModel(idPlan, nombre, precio, internet, minutos, sms);
                planModels.add(planModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return planModels;
    }

    @Override
    public PlanModel findById(PlanModel planModel) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
          stmt.setInt(1,"id_plan");
            rs = stmt.executeQuery();
            rs.absolute(1);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
