package com.sjsu.hotelManagment_backend.config.bucket;

public enum BucketName {
    DROP_BUCKET("drop-bucket-primary");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
