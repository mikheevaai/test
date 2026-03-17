public class FindSQLInjectionTest {

    public void review() {
        org.hibernate.Query query = session.createQuery(getQueryTextByIndex(3+6)); // ! Not a flaw
        org.hibernate.Query query = session.createQuery(
                "select FNAME, LNAME, SSN from USERS" +
                "where UNAME=Tom"
        ); // ! Not a flaw

        String val; // Null pointer
        org.hibernate.Query query = session.createQuery(val);

    }

    public void getUserHibernate(org.hibernate.Session session, String data) {

        // S_JAVA_002 SQL инъекция x1
        org.hibernate.Query query = session.createQuery("FROM students where fname = " + data);  // Flaw
        // S_JAVA_002 SQL инъекция x1
        org.hibernate.Query query2 = session.createQuery("FROM students where fname = " + data); // Flaw
        // S_JAVA_002 SQL инъекция x1
        org.hibernate.Query query4 = session.createQuery(
                "select FNAME, LNAME, SSN from USERS" +
                "where UNAME= " + data
        ); // Flaw
        org.hibernate.Query query3 = session.createQuery("FROM students where fname = ?"); // OK
        query = query.setParameter(0, data);  // Good; Parameter binding escapes all input

        String queryText1  = "FROM students where fname = " + data;
        org.hibernate.Query query4 = session.createQuery(queryText1); // Semantic Flaw

        String queryText2  = "FROM students where fname = ?";
        org.hibernate.Query query4 = session.createQuery(queryText2); // OK

    }

    public void getUserPrepareStatement(Connection con, String user) throws SQLException {

        // S_JAVA_002 SQL инъекция x1
        PreparedStatement pstmt1 = con.prepareStatement("select FNAME, LNAME, SSN from USERS where UNAME=" + user);  // Flaw
        ResultSet rs1 = pstmt.executeQuery(); // OK

        int targetAge = 30;
        PreparedStatement pstmt1 = con.prepareStatement(
                "select FNAME, LNAME, SSN from USERS " +
        // S_JAVA_002 SQL инъекция x1
                "where UNAME=" + user +         // Flaw
                "and AGE > " + targetAge        // Additional Flaw
        );
        ResultSet rs1 = pstmt.executeQuery(); // OK

        String query2 = "select FNAME, LNAME, SSN from USERS where UNAME="+user;
        PrepareStatement pstmt2 = con.prepareStatement(query2); // Semantic Flaw
        ResultSet rs2 = pstmt2.executeQuery(); // OK

        String query3 = "select FNAME, LNAME, SSN from USERS where UNAME=?";
        PreparedStatement pstmt3 = con.prepareStatement(query3); // OK
        pstmt.setString(1, user);
        ResultSet rs3 = pstmt.executeQuery(); // OK

    }

    public void getUserExecuteQuery(Connection con, String user) throws SQLException {
        Statement stmt = con.createStatement();
        // S_JAVA_002 SQL инъекция x1
        ResultSet rs1 = stmt.executeQuery("select FNAME, LNAME, SSN from USERS where UNAME=" + user); // Flaw
        ResultSet rs2 = stmt.executeQuery(
            "select FNAME, LNAME, SSN from USERS " +
        // S_JAVA_002 SQL инъекция x1
            "where UNAME=" + user +         // Flaw
            "and AGE > " + targetAge        // Additional Flaw
        );

        ResultSet rs3 = stmt.exectuteQuery("select FNAME, LNAME, SSN from USERS where UNAME=Tom"); // OK

        String query = "select FNAME, LNAME, SSN from USERS where UNAME=" + user;
        ResultSet rs3 = stmt.executeQuery(query); // Semantic Flaw

    }

    void method() {
        String custname = request.getParameter("customerName");
        String query = "SELECT account_balance FROM user_data WHERE user_name = ? ";
        PreparedStatement pstmt = connection.prepareStatement(query); // OK
        pstmt.setString(1, custname);
        ResultSet results = pstmt.executeQuery(); // OK

    }
}

