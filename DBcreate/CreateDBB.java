import java.sql.*;


class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/bankDB";
    static final String USER = "root";
    static final String PASSWORD = "Abhi"; // 🔁 change this

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

class B {
    public final String name = "SBI";
}

class A extends B {
    int Account_number;
    String holder_name;
    String IFSC_code;
    float balance;

    public A(int Account_number, String holder_name, String IFSC_code, float balance) {
        this.Account_number = Account_number;
        this.holder_name = holder_name;
        this.IFSC_code = IFSC_code;
        this.balance = balance;
    }

    // Withdraw
    public float withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
        return balance;
    }

    // Deposit
    public float deposit(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
        }
        return balance;
    }

    // Display balance
    void displayBal() {
        System.out.println("Balance: " + balance);
    }

    // Update name
    public String updateName(String name) {
        holder_name = name;
        System.out.println("Name updated!");
        return holder_name;
    }

    void displayName() {
        System.out.println("Account holder: " + holder_name);
    }

    public void saveToDB() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO accounts VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Account_number);
            ps.setString(2, holder_name);
            ps.setString(3, IFSC_code);
            ps.setFloat(4, balance);

            ps.executeUpdate();

            System.out.println("✅ Data inserted into database!");

            con.close();
        } catch (Exception e) {
            System.out.println("❌ Error:");
            e.printStackTrace();
        }
    }
}

// 🔹 Main Class
public class CreateDBB {
    public static void main(String[] args) {

        A acc = new A(12330, "Abhijeet", "IFSC001", 3330);

        acc.deposit(5000);
        acc.displayBal();

        acc.withdraw(2000);
        acc.displayBal();

        acc.updateName("Gungun");
        acc.displayName();
        System.out.println("Bank Name: " + acc.name);

        acc.saveToDB();
    }
}