package com.beneai.bene_ai_backend.controller;

import com.beneai.bene_ai_backend.model.Meta;
import com.beneai.bene_ai_backend.service.MetaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metas")
public class MetaController {

    private final MetaService metaService;

    public MetaController(MetaService metaService) {
        this.metaService = metaService;
    }

    @GetMapping
    public List<Meta> listarMetas() {
        return metaService.listarMetas();
    }

    @PostMapping
    public Meta salvarMeta(@RequestBody Meta meta) {
        return metaService.salvarMeta(meta);
    }
}