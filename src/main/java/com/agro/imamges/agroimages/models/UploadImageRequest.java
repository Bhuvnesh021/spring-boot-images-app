package com.agro.imamges.agroimages.models;

import org.springframework.core.io.ByteArrayResource;

public class UploadImageRequest {
    private ByteArrayResource byteArrayResource;

    public ByteArrayResource getByteArrayResource() {
        return byteArrayResource;
    }

    public void setByteArrayResource(ByteArrayResource byteArrayResource) {
        this.byteArrayResource = byteArrayResource;
    }
}
