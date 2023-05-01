package com.agro.imamges.agroimages.services;


import com.agro.imamges.agroimages.entities.ProductImages;

import java.util.Optional;

public interface ProductImageService {
    Optional<ProductImages> add(ProductImages productImages);
}
