package service;

import configuration.JPAConfiguration;
import entity.StudentDetail;
import repository.StudentDetailRepository;

import java.util.List;

public class StudentDetailService {

    private StudentDetailRepository studentDetailRepository;

    public StudentDetailService() {
        this.studentDetailRepository = new StudentDetailRepository(JPAConfiguration.getEntityManager());
    }

    public StudentDetail createStudentDetail(StudentDetail studentDetail){
        return studentDetailRepository.createStudentDetail(studentDetail);
    }

    public List<StudentDetail> getAllStudentDetails() {
        return studentDetailRepository.getstudentendetails();
    }

    public int updateStudentdetailAdres(String adres, int id){return studentDetailRepository.updateStudentDetailAdres(adres, id);}

    public int updateStudentdetailTel(String telno, int id){return studentDetailRepository.updateStudentDetailTelno(telno, id);}
}

