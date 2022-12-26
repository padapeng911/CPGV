package com.pancancer.service;


import com.pancancer.dao.BrowsePathwayDAO;
import com.pancancer.entity.Browse;
import com.pancancer.entity.BrowsePathway;
import com.pancancer.entity.BrowseSomatic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrowsePathwayServiceImpl implements BrowsePathwayService{

    @Autowired(required = false)
    private BrowsePathwayDAO browsePathwayDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowsePathway> findGeneByPathway(String pathway){
        return browsePathwayDAO.findGeneByPathway(pathway);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<BrowseSomatic> findByGene(String gene){
        return browsePathwayDAO.findByGene(gene);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Browse> findByGene2(String gene){
        return browsePathwayDAO.findByGene2(gene);
    }
}
