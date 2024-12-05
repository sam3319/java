package BankManagement;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;

public class FoodService {

    public static void main(String[] args) {
        // MySQL 연결 정보
        String url = "jdbc:mysql://localhost:3306/foodservice";
        String user = "root"; // MySQL 사용자 이름
        String password = "chol294240"; // MySQL 비밀번호

        // JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found!",
                                          "Driver Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // JFrame 설정
        JFrame frame = new JFrame("동현이의 맛집 추천 테이블");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        // JTable 및 테이블 모델 생성
        DefaultTableModel tableModel = new DefaultTableModel(
            new String[]{"번호", "카테고리", "이름", "주소", "대표메뉴", "평점", "전화번호", "오픈시간"},
            0
        );
        JTable table = new JTable(tableModel);

        // 테이블 헤더 스타일 설정
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("굴림", Font.BOLD, 20));
        header.setBackground(new Color(145, 196 ,229)); //
        header.setForeground(Color.WHITE);

        // 테이블 본문 스타일 설정
        table.setFont(new Font("굴림", Font.PLAIN, 15));
        table.setRowHeight(30); // 행 높이 설정

        // 텍스트 정렬 (중앙 정렬)
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // 스크롤 패널에 JTable 추가
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // MySQL 데이터베이스 연결 및 데이터 가져오기
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM FoodService")) {

            // 데이터베이스에서 데이터 가져와 JTable에 추가
            while (rs.next()) {
                int place_no = rs.getInt("place_no");
                String category = rs.getString("category");
                String name = rs.getString("name");
                String location = rs.getString("location");
                String bestmenu = rs.getString("bestmenu");
                double rating = rs.getDouble("rating");
                String phone = rs.getString("phone");
                String opentime = rs.getString("opentime");

                tableModel.addRow(new Object[]{place_no, category, name, location, bestmenu, rating, phone, opentime});
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error connecting to database: " + e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        // 프레임 표시
        frame.setVisible(true);
    }
}
