package com.agro.imamges.agroimages.repositories;

import com.agro.imamges.agroimages.entities.ProductImages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends CrudRepository<ProductImages, Long> {
}
