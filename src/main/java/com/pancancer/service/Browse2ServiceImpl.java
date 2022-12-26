package com.pancancer.service;

import com.pancancer.dao.Browse2DAO;
import com.pancancer.entity.Browse2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Browse2ServiceImpl implements Browse2Service {

    @Autowired(required = false)
    private Browse2DAO browse2DAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browse2> findAll() {
        return browse2DAO.findAll();
    }
}
