package com.gui.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] filedData, String fileName, String contentType);

}
