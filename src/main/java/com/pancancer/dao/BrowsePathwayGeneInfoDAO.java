package com.pancancer.dao;

import com.pancancer.entity.BrowsePathwayGeneInfo;

import java.util.List;

public interface BrowsePathwayGeneInfoDAO {

    List<BrowsePathwayGeneInfo> getAll(BrowsePathwayGeneInfo browsePathwayGeneInfo);

    int getTatlo();
}
