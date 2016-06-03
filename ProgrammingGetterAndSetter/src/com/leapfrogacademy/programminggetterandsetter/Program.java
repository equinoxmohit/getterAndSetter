/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogacademy.programminggetterandsetter;

import com.leapfrogacademy.programminggetterandsetter.entity.Book;
import com.leapfrogacademy.programminggetterandsetter.entity.Building;
import com.leapfrogacademy.programminggetterandsetter.entity.Course;
import com.leapfrogacademy.programminggetterandsetter.entity.Laptop;
import com.leapfrogacademy.programminggetterandsetter.entity.Marker;
import com.leapfrogacademy.programminggetterandsetter.entity.Mobile;
import com.leapfrogacademy.programminggetterandsetter.entity.Room;
import com.leapfrogacademy.programminggetterandsetter.entity.Student;
import com.leapfrogacademy.programminggetterandsetter.entity.Table;
import com.leapfrogacademy.programminggetterandsetter.entity.Teacher;
import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while(true){
        Scanner input=new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the first name of the student: ");
        student.setFirstName(input.next());
        System.out.println("Enter the last name of the student: ");
        student.setLastName(input.next());
        System.out.println("The first name of the student is: "+student.getFirstName() +"and the last name of the student is: "+student.getLastName());
        Teacher teacher=new Teacher();
        System.out.println("Enter the phone number of the teacher:");
        teacher.setPhoneNumber(input.next());
        System.out.println("Enter the email id of the teacher:");
        teacher.setEmailId(input.next());
        System.out.println("The phone number of the teacher is: "+teacher.getPhoneNumber() +"and the email id of the teacher is: "+teacher.getEmailId());
        
        Course course=new Course();
        System.out.println("Enter the name of the course: ");
        course.setCourseName(input.next());
        System.out.println("Enter the name of the facilitator of the course: ");
        course.setFacilitatorName(input.next());
        System.out.println("The name of the course is: "+course.getCourseName() +"and" +course.getFacilitatorName() +"is the facilitator of the course");
        
        Room room=new Room(500.02, 211.22);
        System.out.println("The width of the room is "+room.getWidth() +"and the height of the room is "+room.getHeight());
        
        Laptop laptop=new Laptop("Lenovo",45.50, 23.23, false, 950.59);
        System.out.println("The name of the manufacturer is: "+laptop.getManufacturerName()+ "the width is "+ laptop.getWidth()+ "while the status of touch is " +laptop.getTouchScreen());
        
        Mobile mobile=new Mobile("Samsung", 200.22, 122.12, 1, true, 32, 32);
        System.out.println("The name of the mobile manufacturer is: "+mobile.getManufacturerName() +"and the number of sim that can be inserted are "+mobile.getNumberOfSim() +"while the internal memory is: "+mobile.getInternalStorageCapacity());
        
        Marker marker=new Marker();
        System.out.println("Enter the color of the marker: ");
        marker.setColor(input.next());
        System.out.println("Enter the cost of the marker: ");
        marker.setCostOfMarker(input.nextInt());
        System.out.println("The color of the marker is: "+marker.getColor() +"while the cost of the marker is: "+marker.getCostOfMarker());
        
       
        
        Table table=new Table();
        System.out.println("The width of the table is: ");
        table.setWidth((input.nextDouble()));
        System.out.println("The height of the table is: ");
        table.setHeight(input.nextDouble());
        System.out.println("The height of the table is: "+table.getHeight() + "while the height of the table is: "+table.getWidth());
        
        Book book=new Book("Ram Prasad Koirala");
        System.out.println("Which publication is the published at?");
        book.setBookPublication(input.next());
        System.out.println("The name of the writer is: " +book.getBookWriter() +"while the publication is"+book.getBookPublication());
        
        Building building=new Building();
        System.out.println("The number of floors in the building are: ");
        building.setNumberOfFloors(input.nextInt());
        System.out.println("What is the status of availability of the building? [true/false]");
        building.setAvailableForRent(input.nextBoolean());
            System.out.println("The status of availability of the building is: "+ building.isAvailableForRent()+ "while the number of floors are: "+building.getNumberOfFloors());
            System.out.println("Do you want to continue[y/n]");
            String status=input.next();
                if(status.equalsIgnoreCase("n"))
                {
                    System.exit(0);
                }
        }
        
        
    }

}

