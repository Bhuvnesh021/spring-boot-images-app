package com.agro.imamges.agroimages.controllers;

import com.agro.imamges.agroimages.entities.ProductImages;
import com.agro.imamges.agroimages.models.SaveImageResponse;
import com.agro.imamges.agroimages.models.UploadImageRequest;
import com.agro.imamges.agroimages.services.ProductImageService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
public class ImageController {
    @Autowired
    private ProductImageService productImageService;
    @Autowired
    private Gson gson;
    private static Logger logger = LoggerFactory.getLogger(ImageController.class);
    @PostMapping(value = "/uploadProductImage", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String uploadProductImage(@RequestBody UploadImageRequest request) throws IOException {
        logger.debug("uploadProductImage called..");
        // Get the file and save it somewhere
        byte[] bytes = request.getByteArrayResource().getByteArray();
        ProductImages images = new ProductImages();
        images.setContent(bytes);
        images.setProductName("pName");
        Optional<ProductImages> add = productImageService.add(images);
        SaveImageResponse response = new SaveImageResponse();
        if(add.isPresent()){
            response.setCode(0);
            response.setProductCode("Product_" + add.get().getId());
            response.setStatus("SUCCESS");
            return gson.toJson(response);
        }
        response.setCode(1);
        response.setStatus("FAILED");
        return gson.toJson(response);
    }
}
