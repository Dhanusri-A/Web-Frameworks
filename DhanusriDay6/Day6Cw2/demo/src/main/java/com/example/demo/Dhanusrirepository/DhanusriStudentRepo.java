package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriStudent;


@Repository
public interface DhanusriStudentRepo extends JpaRepository<DhanusriStudent, Integer> {

}
