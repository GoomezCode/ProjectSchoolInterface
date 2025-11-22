package com.mycompany.projectschoolinterface.Class.dao;

import com.mycompany.projectschoolinterface.BackEnd.conexao.conexao;
import com.mycompany.projectschoolinterface.Class.Student.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentDao {

    public void create(student s) throws SQLException {
    String sql = "INSERT INTO student (idResponsavel, nome, nascimento, rg, cpf, serieEscolar" +
            "residencia, sexo) values (?,?,?,?,?,?,?,?)";

        Connection conn = conexao.getConnection();
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);
    //      Irei Arrumar As Class para inserir os Dados Corretamente
//            ps.setString(1,);
//            ps.setString(2,);
//            ps.setString(3,);
//            ps.setString(4,);
//            ps.setString(5,);
//            ps.setString(6,);
//            ps.setString(7,);
//            ps.setString(8,);

        ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            conexao.closeConnection(conn, ps);
        }
    }
}
