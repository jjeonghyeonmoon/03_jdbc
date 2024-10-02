package com.ohgiraffers.section01.problem;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.*;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

//       problem1();
//       problem2();
//       problem3();
//       problem4();
//       problem5();
        problem6();

    }
    public static void problem1(){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM EMPLOYEE";

        try {
            pstmt = con.prepareStatement(query);

            rset = pstmt.executeQuery();

            while (rset.next()){
                System.out.println(rset.getString("EMP_ID"));
                System.out.println(rset.getString("EMP_NAME"));
                System.out.println(rset.getString("EMP_NO"));
                System.out.println(rset.getString("EMAIL"));
                System.out.println(rset.getString("PHONE"));
                System.out.println(rset.getString("DEPT_CODE"));
                System.out.println(rset.getString("JOB_CODE"));
                System.out.println(rset.getString("SAL_LEVEL"));
                System.out.println(rset.getInt("SALARY"));
                System.out.println(rset.getDouble("BONUS"));
                System.out.println(rset.getString("MANAGER_ID"));
                System.out.println(rset.getDate("HIRE_DATE"));
                System.out.println(rset.getDate("ENT_DATE"));
                System.out.println(rset.getString("ENT_YN"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(con);
            close(pstmt);
        }
    }
        public static void problem2(){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_ID,EMP_NAME FROM EMPLOYEE";

            try {
                pstmt = con.prepareStatement(query);
                rset = pstmt.executeQuery();

                while (rset.next()){
                    System.out.println(rset.getString("EMP_ID") + "번 " + rset.getString("EMP_NAME"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                close(con);
                close(pstmt);
                close(rset);
            }

        }

        public static void problem3(){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_NAME FROM EMPLOYEE WHERE DEPT_CODE = 'D9'";

            try {
                pstmt = con.prepareStatement(query);
                rset = pstmt.executeQuery();

                while (rset.next()){
                    System.out.println(rset.getString("EMP_NAME"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        public static void problem4(){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE WHERE SALARY >= 3000000 ";

            try {
                pstmt = con.prepareStatement(query);
                rset = pstmt.executeQuery();

                while (rset.next()){
                    System.out.println(rset.getString("EMP_ID") +" " + rset.getString("EMP_NAME") + " " + rset.getString("DEPT_CODE") + " " + rset.getString("SALARY"));
                }



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                close(con);
                close(pstmt);
                close(rset);
            }

        }

        public static void problem5(){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D6' AND SALARY > 2000000";

            try {
                pstmt = con.prepareStatement(query);
                rset = pstmt.executeQuery();

                while (rset.next()){
                    System.out.println(rset.getString("EMP_NAME") + " " + rset.getString("DEPT_CODE")+ " " + rset.getString("SALARY"));
                }



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                close(con);
                close(pstmt);
                close(rset);
            }

        }

        public static void problem6 (){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_ID,EMP_NAME,SALARY FROM EMPLOYEE WHERE BONUS IS NULL";

            try {
                pstmt = con.prepareStatement(query);
                rset = pstmt.executeQuery();

                while (rset.next()){
                    System.out.println(rset.getString("EMP_ID") + " " + rset.getString("EMP_NAME") + " " + rset.getString("SALARY"));

                }



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                close(con);
                close(pstmt);
                close(rset);
            }

        }

        public static void problem7(){
            Connection con = getConnection();
            PreparedStatement pstmt = null;
            ResultSet rset = null;

            String query = "SELECT EMP_NO "

        }


}
