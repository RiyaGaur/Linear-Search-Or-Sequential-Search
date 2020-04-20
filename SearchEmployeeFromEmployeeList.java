import java.util.Scanner;

class Employee{
    int employeeid;
    String name;
    Employee next;
    public Employee(int id,String n){
        employeeid=id;
        name=n;
    }
}
public class SearchEmployeeFromEmployeeList {
    Employee head;
    public void insert(int employeeid,String name){
        Employee newnode=new Employee(employeeid,name);
        newnode.next=null;
        if(head==null){
            head=newnode;
        }
        else {
            Employee last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newnode;
        }
    }

    public void display(){
        Employee current=head;
        while (current!=null){
            System.out.println(current.employeeid + " " + current.name);
            current=current.next;
        }
        System.out.println();
    }

    public void search(int employeeid){
        Employee temp=head;
        while (temp.employeeid!=employeeid){
            temp=temp.next;
        }
        if(temp.employeeid==employeeid) {
            System.out.println("employeeid: " + temp.employeeid + "    ||         name: " + temp.name);
        }
    }

    public static void main(String[] args) {
        SearchEmployeeFromEmployeeList obj=new SearchEmployeeFromEmployeeList();
        Scanner sc=new Scanner(System.in);
        obj.insert(1,"Riya");
        obj.insert(2,"Sam");
        obj.insert(3,"Khushi");
        obj.insert(4,"Akanksha");
        obj.insert(5,"Pragya");
        obj.display();
        System.out.print("Enter employeeid to search employee's detail: ");
        obj.search(sc.nextInt());
    }
}
