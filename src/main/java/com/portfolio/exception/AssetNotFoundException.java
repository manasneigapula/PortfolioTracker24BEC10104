package com.portfolio.exception;

public class AssetNotFoundException extends Exception {
    private int assetId;

    public AssetNotFoundException(String message) {
        super(message);
    }

    public AssetNotFoundException(int assetId) {
        super("Asset with ID " + assetId + " not found in portfolio.");
        this.assetId = assetId;
    }

    public int getAssetId() {
        return assetId;
    }
}
