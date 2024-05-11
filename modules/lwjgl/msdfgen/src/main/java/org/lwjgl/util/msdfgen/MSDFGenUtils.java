/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.msdfgen;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.awt.image.*;

/**
 * This class provides general utilities for working with msdfgen bitmaps
 * and transforming them into more workable formats.
 */
public final class MSDFGenUtils {
    // @formatter:off
    private MSDFGenUtils() {}
    // @formatter:on

    /**
     * Throws an {@link MSDFGenException} if the given result is not
     * {@link MSDFGen#MSDF_SUCCESS} with a fitting message.
     *
     * @param result The result to validate.
     */
    public static void throwIfError(final int result) {
        if (result != MSDFGen.MSDF_SUCCESS) {
            switch (result) {
                case MSDFGen.MSDF_ERR_FAILED:
                    throw new MSDFGenException("Operation failed");
                case MSDFGen.MSDF_ERR_INVALID_ARG:
                    throw new MSDFGenException("Invalid argument");
                case MSDFGen.MSDF_ERR_INVALID_TYPE:
                    throw new MSDFGenException("Invalid type");
                case MSDFGen.MSDF_ERR_INVALID_SIZE:
                    throw new MSDFGenException("Invalid size");
                case MSDFGen.MSDF_ERR_INVALID_INDEX:
                    throw new MSDFGenException("Invalid index");
                default:
                    throw new MSDFGenException("Unknown error");
            }
        }
    }

    /**
     * Determines the corresponding image type for use with
     * types like {@link BufferedImage} from the given bitmap instance.
     *
     * @param bitmap The bitmap from which to derive the image type.
     *
     * @return The image type which best maps to the given bitmap.
     */
    public static int bitmapToImageType(MSDFGenBitmap.Buffer bitmap) {
        switch (bitmap.type()) {
            case MSDFGen.MSDF_BITMAP_TYPE_MSDF:
                return BufferedImage.TYPE_INT_RGB;
            case MSDFGen.MSDF_BITMAP_TYPE_MTSDF:
                return BufferedImage.TYPE_INT_ARGB;
            default:
                return BufferedImage.TYPE_BYTE_GRAY;
        }
    }

    private static int getBitmapPixel1(long address, int x, int y, int width) {
        int  pixelIndex   = y * width + x;
        long pixelAddress = address + (Float.BYTES * pixelIndex);
        return (int)(MemoryUtil.memGetFloat(pixelAddress) * 255F);
    }

    private static int getBitmapPixel3(long address, int x, int y, int width) {
        int  pixelIndex   = y * width + x;
        long pixelAddress = address + (Float.BYTES * 3 * pixelIndex);
        byte r            = (byte)(MemoryUtil.memGetFloat(pixelAddress) * 255F);
        byte g            = (byte)(MemoryUtil.memGetFloat(pixelAddress + Float.BYTES) * 255F);
        byte b            = (byte)(MemoryUtil.memGetFloat(pixelAddress + Float.BYTES << 1) * 255F);
        return (r << 16) | (g << 8) | b;
    }

    private static int getBitmapPixel4(long address, int x, int y, int width) {
        int  pixelIndex   = y * width + x;
        long pixelAddress = address + (Float.BYTES << 2 * pixelIndex);
        byte r            = (byte)(MemoryUtil.memGetFloat(pixelAddress) * 255F);
        byte g            = (byte)(MemoryUtil.memGetFloat(pixelAddress + Float.BYTES) * 255F);
        byte b            = (byte)(MemoryUtil.memGetFloat(pixelAddress + Float.BYTES << 1) * 255F);
        byte a            = (byte)(MemoryUtil.memGetFloat(pixelAddress + Float.BYTES * 3) * 255F);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    /**
     * Creates a new buffered image with the same size and channel count
     * as the given bitmap, and blits the bitmaps contents to the newly created image.
     *
     * @param bitmap The bitmap to convert to an image.
     *
     * @return A new {@link BufferedImage} instance which contains
     * the contents of the given bitmap.
     */
    public static BufferedImage bitmapToImage(MSDFGenBitmap.Buffer bitmap) {
        MemoryStack   stack         = MemoryStack.stackGet();
        int           previousSP    = stack.getPointer();
        PointerBuffer addressBuffer = stack.mallocPointer(1);
        throwIfError(MSDFGen.msdf_bitmap_get_pixels(bitmap, addressBuffer));
        long address = Checks.check(addressBuffer.get());

        int           width  = bitmap.width();
        int           height = bitmap.height();
        BufferedImage image  = new BufferedImage(width, height, bitmapToImageType(bitmap));
        PixelGetter   pixelGetter;
        switch (bitmap.type()) {
            case MSDFGen.MSDF_BITMAP_TYPE_MSDF:
                pixelGetter = MSDFGenUtils::getBitmapPixel3;
                break;
            case MSDFGen.MSDF_BITMAP_TYPE_MTSDF:
                pixelGetter = MSDFGenUtils::getBitmapPixel4;
                break;
            default:
                pixelGetter = MSDFGenUtils::getBitmapPixel1;
                break;
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, pixelGetter.get(address, x, y, width));
            }
        }

        stack.setPointer(previousSP);
        return image;
    }

    @FunctionalInterface
    private interface PixelGetter {
        int get(long address, int x, int y, int width);
    }
}