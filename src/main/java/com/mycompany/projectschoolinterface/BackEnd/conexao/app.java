package com.mycompany.projectschoolinterface.BackEnd.conexao;

import com.mycompany.projectschoolinterface.Class.Student.student;
import com.mycompany.projectschoolinterface.Class.dao.studentDao;

import java.sql.SQLException;

public class app {
    public static void main(String[] args) throws SQLException {
        student stud = new student();


        new studentDao().create(stud);
    }
}
