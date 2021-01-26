package com.dtol.platform.es.repository;

import com.dtol.platform.es.mapping.Organism;
import com.dtol.platform.es.mapping.RootSample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RootSampleRepository extends PagingAndSortingRepository<RootSample, String> {

    Page<RootSample> findAll(Pageable pageable);

    RootSample findRootSampleByAccession(String accession);

    List<RootSample> findRootSampleByOrganism(String organism);

    RootSample save(RootSample rootSample);
}
