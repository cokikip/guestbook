package com.com.visitors.service;

import com.com.visitors.domain.Visitor;
import com.com.visitors.exception.UserNotFoundException;
import com.com.visitors.repository.VisitorRepository;
import org.hibernate.type.LocalDateTimeType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public Visitor addVisitor(Visitor visitor){
        visitor.setVisitDateTime(LocalDateTime.now());
        return visitorRepository.save(visitor);
    }
    public List<Visitor> getAllVisitors(){
       return visitorRepository.findAll();
    }
    public Visitor findVisitorById(Long id){
        return visitorRepository.findById(id).orElseThrow(()->new UserNotFoundException("User by id "+id+" was not found"));
    }

    public Visitor updateVisitor(Visitor visitor){
        visitor.setCheckOutDateTime(LocalDateTime.now());
        return visitorRepository.save(visitor);
    }

    public void deleteVisitor(Long id){
        Visitor visitor =  visitorRepository.findById(id).orElseThrow(()->new UserNotFoundException("User by id "+id+" was not found"));
    }





}
