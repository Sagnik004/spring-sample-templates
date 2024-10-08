package com.sagnikchakraborty.dao;

import com.sagnikchakraborty.entity.Student;

import java.util.List;

public interface IStudentDao {

    public int insert(Student student);

    public int update(Student student);

    public int delete(int studentId);

    public Student getStudent(int studentId);

    public List<Student> getAllStudents();
}
