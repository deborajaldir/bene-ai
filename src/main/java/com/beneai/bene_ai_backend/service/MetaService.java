package com.beneai.bene_ai_backend.service;

import com.beneai.bene_ai_backend.model.Meta;
import com.beneai.bene_ai_backend.repository.MetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {

    private final MetaRepository metaRepository;

    public MetaService(MetaRepository metaRepository) {
        this.metaRepository = metaRepository;
    }

    public List<Meta> listarMetas() {
        return metaRepository.findAll();
    }

    public Meta salvarMeta(Meta meta) {
        return metaRepository.save(meta);
    }
}