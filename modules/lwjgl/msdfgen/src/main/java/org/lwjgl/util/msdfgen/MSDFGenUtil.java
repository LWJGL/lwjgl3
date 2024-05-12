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
 *
 * @author Alexander Hinze
 */
public final class MSDFGenUtil {
    // @formatter:off
    private MSDFGenUtil() {}
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
    public static int bitmapToImageType(int type) {
        switch (type) {
            case MSDFGen.MSDF_BITMAP_TYPE_MSDF:
                return BufferedImage.TYPE_INT_RGB;
            case MSDFGen.MSDF_BITMAP_TYPE_MTSDF:
                return BufferedImage.TYPE_INT_ARGB;
            default:
                return BufferedImage.TYPE_BYTE_GRAY;
        }
    }

    /**
     * See {@link #bitmapToImageType(int)}.
     */
    public static int bitmapToImageType(MSDFGenBitmap.Buffer bitmap) {
        return bitmapToImageType(bitmap.type());
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
     * @param src  The source bitmap to blit to an image.
     * @param dst  The destination image which the bitmap is blitted to.
     * @param dstX The x-coordinate at which to blit the given bitmap to the image.
     * @param dstY The y-coordinate at which to blit the given bitmap to the image.
     */
    public static void blitBitmapToImage(MSDFGenBitmap.Buffer src, BufferedImage dst, int dstX, int dstY) {
        MemoryStack   stack         = MemoryStack.stackGet();
        int           previousSP    = stack.getPointer();
        PointerBuffer addressBuffer = stack.mallocPointer(1);
        throwIfError(MSDFGen.msdf_bitmap_get_pixels(src, addressBuffer));
        long address = Checks.check(addressBuffer.get());

        int         width  = src.width();
        int         height = src.height();
        PixelGetter pixelGetter;
        switch (src.type()) {
            case MSDFGen.MSDF_BITMAP_TYPE_MSDF:
                pixelGetter = MSDFGenUtil::getBitmapPixel3;
                break;
            case MSDFGen.MSDF_BITMAP_TYPE_MTSDF:
                pixelGetter = MSDFGenUtil::getBitmapPixel4;
                break;
            default:
                pixelGetter = MSDFGenUtil::getBitmapPixel1;
                break;
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                dst.setRGB(dstX + x, dstY + y, pixelGetter.get(address, x, y, width));
            }
        }

        stack.setPointer(previousSP);
    }

    /**
     * See {@link #blitBitmapToImage(MSDFGenBitmap.Buffer, BufferedImage, int, int)}.
     */
    public static BufferedImage bitmapToImage(MSDFGenBitmap.Buffer bitmap) {
        BufferedImage image = new BufferedImage(bitmap.width(), bitmap.height(), bitmapToImageType(bitmap));
        blitBitmapToImage(bitmap, image, 0, 0);
        return image;
    }

    /**
     * Renders the given shape to the given image, at the given pixel coordinates.
     *
     * @param type    The type of image to render into.
     * @param width   The width of the shape to render in pixels.
     * @param height  The height of the shape to render in pixels.
     * @param shape   The shape to render into the given image.
     * @param xScale  The x-scaling factor applied to the render transform.
     * @param yScale  The y-scaling factor applied to the render transform.
     * @param xOffset The x-offset applied to the render transform.
     * @param yOffset The y-offset applied to the render transform.
     * @param range   The distance mapping range.
     * @param dst     The destination image to render into.
     * @param dstX    The destination x-coordinate in the destination image in pixels.
     * @param dstY    The destination y-coordinate in the destination image in pixels.
     */
    public static void renderShapeToImage(int type, int width, int height, long shape, double xScale, double yScale, double xOffset, double yOffset, double range, BufferedImage dst, int dstX, int dstY) {
        MemoryStack          stack      = MemoryStack.stackGet();
        int                  previousSP = stack.getPointer();
        MSDFGenBitmap.Buffer bitmap     = MSDFGenBitmap.malloc(1, stack);
        throwIfError(MSDFGen.msdf_bitmap_alloc(type, width, height, bitmap));
        MSDFGenTransform.Buffer transform = MSDFGenTransform.malloc(1, stack);
        transform.scale().set(xScale, yScale);
        transform.translation().set(xOffset, yOffset);
        transform.distance_mapping().set(-0.5 * range, 0.5 * range);
        switch (type) {
            case MSDFGen.MSDF_BITMAP_TYPE_SDF:
                throwIfError(MSDFGen.msdf_generate_sdf(bitmap, shape, transform));
                break;
            case MSDFGen.MSDF_BITMAP_TYPE_PSDF:
                throwIfError(MSDFGen.msdf_generate_psdf(bitmap, shape, transform));
                break;
            case MSDFGen.MSDF_BITMAP_TYPE_MSDF:
                throwIfError(MSDFGen.msdf_generate_msdf(bitmap, shape, transform));
                break;
            case MSDFGen.MSDF_BITMAP_TYPE_MTSDF:
                throwIfError(MSDFGen.msdf_generate_mtsdf(bitmap, shape, transform));
                break;
        }
        blitBitmapToImage(bitmap, dst, dstX, dstY);
        MSDFGen.msdf_bitmap_free(bitmap);
        stack.setPointer(previousSP);
    }

    /**
     * See {@link #renderShapeToImage(int, int, int, long, double, double, double, double, double, BufferedImage, int, int)}.
     */
    public static BufferedImage renderShapeToImage(int type, int width, int height, long shape, double xScale, double yScale, double xOffset, double yOffset, double range) {
        BufferedImage image = new BufferedImage(width, height, bitmapToImageType(type));
        renderShapeToImage(type, width, height, shape, xScale, yScale, xOffset, yOffset, range, image, 0, 0);
        return image;
    }

    @FunctionalInterface
    private interface PixelGetter {
        int get(long address, int x, int y, int width);
    }
}