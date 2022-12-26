package com.pancancer.service;

import com.pancancer.dao.Browse3DAO;
import com.pancancer.entity.Browse3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Browse3ServiceImpl implements Browse3Service{

    @Autowired(required = false)
    private Browse3DAO browse3DAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browse3> findAll() { return browse3DAO.findAll(); }
}
