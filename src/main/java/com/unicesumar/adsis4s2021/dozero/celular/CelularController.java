package com.unicesumar.adsis4s2021.dozero.celular;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicesumar.adsis4s2021.dozero.base.BaseCrudController;

@RestController
@RequestMapping
public class CelularController extends BaseCrudController<Celular, CelularRepository, CelularService> {

}
