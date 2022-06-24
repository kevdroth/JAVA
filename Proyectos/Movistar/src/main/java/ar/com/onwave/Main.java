package ar.com.onwave;

import ar.com.onwave.repository.impl.EquipmentRepositoryImpl;
import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
//    public static void main(String[] args) {
//
//        EquipmentRepositoryImpl equipmentRepository = new EquipmentRepositoryImpl();
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/movistar?serverTimezone=UTC");
//        dataSource.setUsername("root");
//        dataSource.setPassword("admin");
//        equipmentRepository.setDataSource(dataSource);
//
//        equipmentRepository.createEquipment("registrado", "imeireg", "marcatraf", "modelotra", "imeitr", "sim");
//
//        List<EquipmentModel> list = equipmentRepository.findAllEquipments();
//        for (EquipmentModel equipment : list){
//            System.out.println("registrado = " + equipment.getRegistrado());
//        }
//    }
}
