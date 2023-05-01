package com.agro.imamges.agroimages.services;

import com.agro.imamges.agroimages.entities.ProductImages;
import com.agro.imamges.agroimages.repositories.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    @Override
    public Optional<ProductImages> add(ProductImages productImages) {
        return Optional.of(productImageRepository.save(productImages));
    }
}
