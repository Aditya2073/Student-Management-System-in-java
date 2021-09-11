import java.io.*;

class Student {
    protected String studentName;
    protected String emailID;
    protected int year;
    protected int age;
    protected int studid;
    protected int dep;

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    // Taking Student details from User
    public void studentdetails() throws Exception {
        System.out.println();
        System.out.print("[1] Enter Student Name : ");
        studentName = r.readLine();
        System.out.println();
        System.out.print("[2] Select Year\n   1. First Year \n   2. Second Year \n   3. Third Year \n => ");
        year = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print(
                "[3] Select Deptartment ID\n   1. Mechanical (10)\n   2. Electrical (20)\n   3. Computer (30)\n   4.Information Technology (40)\n   5.Civil (50)\n => ");
        dep = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print("[4] Enter Student Email ID : ");
        emailID = r.readLine();
        System.out.println();
        System.out.print("[5] Enter Student Age : ");
        age = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print("[6] Enter Student ID : ");
        studid = Integer.parseInt(r.readLine());
    }

    // Updating Student Records
    public void updateStudRecord() throws Exception {
        System.out.println();
        System.out.print("[1] Enter New Student Name : ");
        studentName = r.readLine();
        System.out.println();
        System.out.print("[2] Select Year\n   1. First Year \n   2. Second Year \n   3. Third Year \n => ");
        year = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print(
                "[3] Select Deptartment ID\n   1. Mechanical (10)\n   2. Electrical (20)\n   3. Computer (30)\n   4.Information Technology (40)\n   5.Civil (50)\n => ");
        dep = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print("[4] Enter New Student Email ID : ");
        emailID = r.readLine();
        System.out.println();
        System.out.print("[5] Enter New Student Age : ");
        age = Integer.parseInt(r.readLine());
        System.out.println();
        System.out.print("[6] Enter New Student ID : ");
        studid = Integer.parseInt(r.readLine());
    }

    // Displaying Students Record And Converting Students Year and Department into
    // Class Eg: SYIF
    public void displayRecord() throws Exception {

        System.out.println();
        System.out.println("\t\t[*] Student Name            : " + studentName);
        System.out.println();
        System.out.println("\t\t[*] Student ID              : " + studid);
        System.out.println();
        System.out.println("\t\t[*] Student Age             : " + age);
        System.out.println();
        System.out.println("\t\t[*] Enter Students Email ID : " + emailID);
        if (year == 1 && dep == 10) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : FYME");
        } else if (year == 2 && dep == 10) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : SYME");
        } else if (year == 3 && dep == 10) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : TYME");
        } else if (year == 1 && dep == 20) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : FYEC");
        } else if (year == 2 && dep == 20) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : SYEC");
        } else if (year == 3 && dep == 20) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : TYEC");
        } else if (year == 1 && dep == 30) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : FYCO");
        } else if (year == 2 && dep == 30) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : SYCO");
        } else if (year == 3 && dep == 30) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : TYCO");
        } else if (year == 1 && dep == 40) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : FYIF");
        } else if (year == 2 && dep == 40) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : SYIF");
        } else if (year == 3 && dep == 40) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : TYIF");
        } else if (year == 1 && dep == 50) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : FYCE");
        } else if (year == 2 && dep == 50) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : SYCE");
        } else if (year == 3 && dep == 50) {
            System.out.println();
            System.out.println("\t\t[*] Student Class           : TYCE");
        }
        System.out.println("       ====================================================         ");
    }
}

public class StudentManagementSystem extends Student{
    // Main Method
    public static void main(String[] args) throws Exception {
        int ch, sno = 20;
        int flag = 0;

        // BufferReader Class to take input throught the code
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        // Creating Array of Objects of Class student
        Student s[] = new Student[sno];
        for (int i = 0; i < sno; i++) {
            s[i] = new Student();
        }

        // while loop to keep running Infinetly
        do {
            System.out.println();
            System.out.println("========================================================================");
            System.out.println("                          Select Your choice                            ");
            System.out.println("========================================================================");
            System.out.println(
                    "\n\t\t\t1. Enter Student Details\n\t\t\t2. Search Student Details\n\t\t\t3. Delete A Record\n\t\t\t4. Update Record\n\t\t\t5. Exit");
            System.out.println("========================================================================");
            System.out.print("\t\t\t=> ");
            ch = Integer.parseInt(r.readLine());
            switch (ch) {
                case 1:
                    // Case to request the total number of records that has to be Added
                    int noOfrec;
                    System.out.println();
                    System.out.println("\t[*] Enter How Many Records Do You Want To Enter: ");
                    System.out.print("\t => ");
                    noOfrec = Integer.parseInt(r.readLine());
                    for (int i = 0; i < noOfrec; i++) {
                        s[i].studentdetails();
                    }
                    break;
                case 2:
                    // Case to Search Student Details
                    int by;
                    System.out.println();
                    System.out.println();
                    System.out.println("========================================================================");
                    System.out.println("                       Search Student Details                           ");
                    System.out.println("========================================================================");
                    System.out.println(
                            "\n\t\t\t1. By Name\n\t\t\t2. By ID\n\t\t\t3. By Department ID\n\t\t\t4. By Age\n\t\t\t5. By Year\n\t\t\t6. All Records");
                    System.out.println("========================================================================");
                    System.out.print("\t\t\t=> ");
                    by = Integer.parseInt(r.readLine());
                    switch (by) {
                        case 1:
                            // Case to search Details By Name
                            String searchName;
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println("\t\t[*] Enter the Name You want to search ");
                            System.out.print("\t\t => ");
                            searchName = r.readLine();
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");
                            for (int i = 0; i < sno; i++) {
                                if (searchName.equals(s[i].studentName)) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Student Found By Name " + searchName);
                            }
                            flag = 0;
                            break;
                        case 2:
                            // case to search Details By ID
                            int s_id;
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println("\t\t[*] Enter Students ID whose details you want to search ");
                            System.out.print("\t\t => ");
                            s_id = Integer.parseInt(r.readLine());
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");
                            for (int i = 0; i < sno; i++) {
                                if (s_id == s[i].studid) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Student Found by ID " + s_id);
                            }
                            flag = 0;
                            break;
                        case 3:
                            // Case to search Details By Department ID
                            int d_id;
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println("\t\t[*] Enter Department ID you want to search ");
                            System.out.print("\t\t => ");
                            d_id = Integer.parseInt(r.readLine());
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");
                            for (int i = 0; i < sno; i++) {
                                if (d_id == s[i].dep) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Records Found by Department ID " + d_id);
                            }
                            flag = 0;
                            break;
                        case 4:
                            // Case to search Details By Age
                            int s_age;
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println("\t\t[*] Enter Age Category you want to search ");
                            System.out.print("\t\t => ");
                            s_age = Integer.parseInt(r.readLine());
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");

                            for (int i = 0; i < sno; i++) {
                                if (s_age == s[i].age) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Records found by Age " + s_age);
                            }
                            flag = 0;
                            break;
                        case 5:
                            // Case to Search Details By Year
                            int s_year;
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println("\t\t[*] Enter Year you want to search ");
                            System.out.print("\t\t => ");
                            s_year = Integer.parseInt(r.readLine());
                            System.out.println(
                                    "========================================================================");
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");
                            for (int i = 0; i < sno; i++) {
                                if (s_year == s[i].year) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Records found by Year " + s_year);
                            }
                            flag = 0;
                            break;
                        case 6:
                            flag = 0;
                            // Case To Display All Students Detals
                            System.out.println();
                            System.out.println(
                                    "========================================================================");
                            System.out.println(
                                    "                            Search Reasults                             ");
                            System.out.println(
                                    "========================================================================");
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studentName != null && s[i].studid != 0 && s[i].age != 0 && s[i].emailID != null) {
                                    s[i].displayRecord();
                                    flag = 1;
                                }

                            }
                            if (flag == 0) {;
                                System.out.println();
                                System.out.println("\t\t ! No Records Found ");
                            }
                            System.out.println(
                                        "========================================================================");
                            flag = 0;
                            break;

                        default:
                            System.out.println("Enter A Valid Choice");
                            break;
                    }
                    break;
                case 3:
                    // case To Delete A Record
                    int deleteRecord;
                    int n = sno, loc = 0;
                    String yesOrNo;
                    System.out.println();
                    System.out.println();
                    System.out.println("========================================================================");
                    System.out.println("                        Delete Student Record                           ");
                    System.out.println("========================================================================");
                    System.out.println("\t\t[*] Enter the Student ID to Delete Record");
                    System.out.print("\t\t => ");
                    deleteRecord = Integer.parseInt(r.readLine());
                    System.out.println("========================================================================");
                    for (int i = 0; i < n; i++) {
                        if (s[i].studid == deleteRecord) {
                            flag = 1;
                            loc = i;
                            break;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("\t\t[*] Do you confirm want to delete record (y/n)");
                        System.out.print("\t\t => ");
                        yesOrNo = r.readLine();
                        System.out.println("========================================================================");
                        if (yesOrNo.charAt(0) == 'y') {
                            for (int i = loc + 1; i < n; i++) {
                                s[i - 1].studentName = s[i].studentName;
                                s[i - 1].age = s[i].age;
                                s[i - 1].studid = s[i].studid;
                                s[i - 1].year = s[i].year;
                                s[i - 1].dep = s[i].dep;
                            }
                            System.out.println();
                            System.out.println("\t\t\tRecord Sucessfuly Deleted.");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("No Record found by Id : " + deleteRecord);
                    }
                    n--;
                    break;
                case 4:
                    // Case to Selectively Update A student Details
                    int selectiveUpdation;
                    System.out.println();
                    System.out.println();
                    System.out.println("========================================================================");
                    System.out.println("                        Update Student Record                           ");
                    System.out.println("========================================================================");
                    System.out.println(
                            "\n\t\t\t1. Update Name\n\t\t\t2. Update Student ID\n\t\t\t3. Update Age\n\t\t\t4. Update Class\n\t\t\t5. Update Email ID\n\t\t\t6. All Of the Above");
                    System.out.println("========================================================================");
                    System.out.print("\t\t\t=> ");
                    selectiveUpdation = Integer.parseInt(r.readLine());
                    System.out.println("========================================================================");
                    switch (selectiveUpdation) {
                        case 1:
                            // case to Update Student Name
                            int updateRecord;
                            System.out.println("\t\t[*] Enter the Student ID whose Name has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    System.out.println("\t\t[*] Enter New Student Name ");
                                    System.out.print("\t\t => ");
                                    s[i].studentName = r.readLine();

                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println("\t\t\tName Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;
                        case 2:
                            // case to Update Student ID
                            System.out.println("\t\t[*] Enter the Student ID whose ID has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    System.out.println("\t\t[*] Enter New Student ID ");
                                    System.out.print("\t\t => ");
                                    s[i].studid = Integer.parseInt(r.readLine());
                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println();
                                System.out.println("\t\t\tStudent ID Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;
                        case 3:
                            // case to Update Student Age
                            System.out.println("\t\t[*] Enter the Student ID whose Age has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    System.out.println("\t\t[*] Enter New Student Age");
                                    System.out.print("\t\t => ");
                                    s[i].age = Integer.parseInt(r.readLine());
                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println();
                                System.out.println("\t\t\tStudent Age Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;
                        case 4:
                            // case to Update Student Class
                            System.out.println("\t\t[*] Enter the Student ID whose Class has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    System.out.print(
                                            "[*] Select Year\n   1. First Year \n   2. Second Year \n   3. Third Year \n => ");
                                    s[i].year = Integer.parseInt(r.readLine());
                                    System.out.println();
                                    System.out.print(
                                            "[*] Select Deptartment ID\n   1. Mechanical (10)\n   2. Electrical (sno)\n   3. Computer (30)\n   4.Information Technology (40)\n   5.Civil (50)\n => ");
                                    s[i].dep = Integer.parseInt(r.readLine());
                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println();
                                System.out.println("\t\t\tStudent Class Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;
                        case 5:
                            // case to Update Student Email ID
                            System.out.println("\t\t[*] Enter the Student ID whose Email ID has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    System.out.println("\t\t[*] Enter New Student Email ID");
                                    System.out.print("\t\t => ");
                                    s[i].emailID = r.readLine();
                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println();
                                System.out.println("\t\t\tStudent Class Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;
                        case 6:
                            // case to Update All details of A Student
                            System.out.println("\t\t[*] Enter the Student ID that has to be Updated");
                            System.out.print("\t\t => ");
                            updateRecord = Integer.parseInt(r.readLine());
                            for (int i = 0; i < sno; i++) {
                                if (s[i].studid == updateRecord) {
                                    s[i].updateStudRecord();
                                    flag = 1;
                                }
                            }
                            System.out.println(
                                    "========================================================================");
                            if (flag == 1) {
                                System.out.println();
                                System.out.println("\t\t\tStudent Class Sucessfully Updated");
                            }
                            if (flag == 0) {
                                System.out.println();
                                System.out.println("\t\t ! No Record found by Id : " + updateRecord);
                            }
                            flag = 0;
                            break;

                        default:
                            System.out.println("Enter A Valid Choice");
                            break;
                    }
                    break;
                case 5:
                    // Case to Exit From the Code
                    System.exit(0);

                default:
                    System.out.println("Enter A Valid Choice");
                    break;
            }
        } while (1 != 0);
    }
}
