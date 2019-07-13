/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://github.com/syoyo/tinyexr">Tiny OpenEXR</a> image library.
 * 
 * <p>tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.</p>
 */
public class TinyEXR {

    /** Error codes. */
    public static final int
        TINYEXR_SUCCESS                    = 0,
        TINYEXR_ERROR_INVALID_MAGIC_NUMBER = -1,
        TINYEXR_ERROR_INVALID_EXR_VERSION  = -2,
        TINYEXR_ERROR_INVALID_ARGUMENT     = -3,
        TINYEXR_ERROR_INVALID_DATA         = -4,
        TINYEXR_ERROR_INVALID_FILE         = -5,
        TINYEXR_ERROR_INVALID_PARAMETER    = -5,
        TINYEXR_ERROR_CANT_OPEN_FILE       = -6,
        TINYEXR_ERROR_UNSUPPORTED_FORMAT   = -7,
        TINYEXR_ERROR_INVALID_HEADER       = -8,
        TINYEXR_ERROR_UNSUPPORTED_FEATURE  = -9,
        TINYEXR_ERROR_CANT_WRITE_FILE      = -10,
        TINYEXR_ERROR_SERIALZATION_FAILED  = -11;

    /** Pixel types. */
    public static final int
        TINYEXR_PIXELTYPE_UINT  = 0,
        TINYEXR_PIXELTYPE_HALF  = 1,
        TINYEXR_PIXELTYPE_FLOAT = 2;

    public static final int
        TINYEXR_MAX_HEADER_ATTRIBUTES = 1024,
        TINYEXR_MAX_CUSTOM_ATTRIBUTES = 128;

    /** Compression types. */
    public static final int
        TINYEXR_COMPRESSIONTYPE_NONE = 0,
        TINYEXR_COMPRESSIONTYPE_RLE  = 1,
        TINYEXR_COMPRESSIONTYPE_ZIPS = 2,
        TINYEXR_COMPRESSIONTYPE_ZIP  = 3,
        TINYEXR_COMPRESSIONTYPE_PIZ  = 4,
        TINYEXR_COMPRESSIONTYPE_ZFP  = 128;

    /** ZFP compression types. */
    public static final int
        TINYEXR_ZFP_COMPRESSIONTYPE_RATE      = 0,
        TINYEXR_ZFP_COMPRESSIONTYPE_PRECISION = 1,
        TINYEXR_ZFP_COMPRESSIONTYPE_ACCURACY  = 2;

    /** Tile level types. */
    public static final int
        TINYEXR_TILE_ONE_LEVEL     = 0,
        TINYEXR_TILE_MIPMAP_LEVELS = 1,
        TINYEXR_TILE_RIPMAP_LEVELS = 2;

    /** Tile rounding types. */
    public static final int
        TINYEXR_TILE_ROUND_DOWN = 0,
        TINYEXR_TILE_ROUND_UP   = 1;

    static { Library.loadSystem(System::load, System::loadLibrary, TinyEXR.class, "org.lwjgl.tinyexr", Platform.mapLibraryNameBundled("lwjgl_tinyexr")); }

    protected TinyEXR() {
        throw new UnsupportedOperationException();
    }

    // --- [ InitEXRHeader ] ---

    /** Unsafe version of: {@link #InitEXRHeader} */
    public static native void nInitEXRHeader(long exr_header);

    /** Initialize {@link EXRHeader} struct. */
    public static void InitEXRHeader(@NativeType("EXRHeader *") EXRHeader exr_header) {
        nInitEXRHeader(exr_header.address());
    }

    // --- [ InitEXRImage ] ---

    /** Unsafe version of: {@link #InitEXRImage} */
    public static native void nInitEXRImage(long exr_image);

    /** Initialize {@link EXRImage} struct. */
    public static void InitEXRImage(@NativeType("EXRImage *") EXRImage exr_image) {
        nInitEXRImage(exr_image.address());
    }

    // --- [ FreeEXRHeader ] ---

    /** Unsafe version of: {@link #FreeEXRHeader} */
    public static native int nFreeEXRHeader(long exr_header);

    /** Free's internal data of {@link EXRHeader} struct */
    public static int FreeEXRHeader(@NativeType("EXRHeader *") EXRHeader exr_header) {
        return nFreeEXRHeader(exr_header.address());
    }

    // --- [ FreeEXRImage ] ---

    /** Unsafe version of: {@link #FreeEXRImage} */
    public static native int nFreeEXRImage(long exr_image);

    /** Free's internal data of {@link EXRImage} struct */
    public static int FreeEXRImage(@NativeType("EXRImage *") EXRImage exr_image) {
        return nFreeEXRImage(exr_image.address());
    }

    // --- [ FreeEXRErrorMessage ] ---

    /** Unsafe version of: {@link #FreeEXRErrorMessage} */
    public static native void nFreeEXRErrorMessage(long msg);

    /** Free's error message */
    public static void FreeEXRErrorMessage(@NativeType("char const *") ByteBuffer msg) {
        nFreeEXRErrorMessage(memAddress(msg));
    }

    // --- [ ParseEXRVersionFromFile ] ---

    /** Unsafe version of: {@link #ParseEXRVersionFromFile} */
    public static native int nParseEXRVersionFromFile(long version, long filename);

    /** Parse EXR version header of a file. */
    public static int ParseEXRVersionFromFile(@NativeType("EXRVersion *") EXRVersion version, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nParseEXRVersionFromFile(version.address(), memAddress(filename));
    }

    /** Parse EXR version header of a file. */
    public static int ParseEXRVersionFromFile(@NativeType("EXRVersion *") EXRVersion version, @NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRVersionFromFile(version.address(), filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRVersionFromMemory ] ---

    /** Unsafe version of: {@link #ParseEXRVersionFromMemory} */
    public static native int nParseEXRVersionFromMemory(long version, long memory, long size);

    /** Parse EXR version header from memory-mapped EXR data. */
    public static int ParseEXRVersionFromMemory(@NativeType("EXRVersion *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory) {
        return nParseEXRVersionFromMemory(version.address(), memAddress(memory), memory.remaining());
    }

    // --- [ ParseEXRHeaderFromFile ] ---

    /** Unsafe version of: {@link #ParseEXRHeaderFromFile} */
    public static native int nParseEXRHeaderFromFile(long header, long version, long filename, long err);

    /**
     * Parse single-part OpenEXR header from a file and initialize {@link EXRHeader}.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRHeaderFromFile(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
        }
        return nParseEXRHeaderFromFile(header.address(), version.address(), memAddress(filename), memAddress(err));
    }

    /**
     * Parse single-part OpenEXR header from a file and initialize {@link EXRHeader}.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRHeaderFromFile(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRHeaderFromFile(header.address(), version.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRHeaderFromMemory ] ---

    /** Unsafe version of: {@link #ParseEXRHeaderFromMemory} */
    public static native int nParseEXRHeaderFromMemory(long header, long version, long memory, long size, long err);

    /**
     * Parse single-part OpenEXR header from a memory and initialize {@link EXRHeader}.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRHeaderFromMemory(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        return nParseEXRHeaderFromMemory(header.address(), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ ParseEXRMultipartHeaderFromFile ] ---

    /** Unsafe version of: {@link #ParseEXRMultipartHeaderFromFile} */
    public static native int nParseEXRMultipartHeaderFromFile(long headers, long num_headers, long version, long filename, long err);

    /**
     * Parse multi-part OpenEXR headers from a file and initialize {@link EXRHeader}* array.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRMultipartHeaderFromFile(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            checkNT1(filename);
            check(err, 1);
        }
        return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), memAddress(filename), memAddress(err));
    }

    /**
     * Parse multi-part OpenEXR headers from a file and initialize {@link EXRHeader}* array.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRMultipartHeaderFromFile(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRMultipartHeaderFromMemory ] ---

    /** Unsafe version of: {@link #ParseEXRMultipartHeaderFromMemory} */
    public static native int nParseEXRMultipartHeaderFromMemory(long headers, long num_headers, long version, long memory, long size, long err);

    /**
     * Parse multi-part OpenEXR headers from a memory and initialize {@link EXRHeader}* array.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     */
    public static int ParseEXRMultipartHeaderFromMemory(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            check(err, 1);
        }
        return nParseEXRMultipartHeaderFromMemory(memAddress(headers), memAddress(num_headers), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ LoadEXRImageFromFile ] ---

    /** Unsafe version of: {@link #LoadEXRImageFromFile} */
    public static native int nLoadEXRImageFromFile(long image, long header, long filename, long err);

    /**
     * Loads single-part OpenEXR image from a file.
     * 
     * <p>Application must setup {@link #ParseEXRHeaderFromFile} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRImageFromFile(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        return nLoadEXRImageFromFile(image.address(), header.address(), memAddress(filename), memAddress(err));
    }

    /**
     * Loads single-part OpenEXR image from a file.
     * 
     * <p>Application must setup {@link #ParseEXRHeaderFromFile} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRImageFromFile(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadEXRImageFromFile(image.address(), header.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadEXRImageFromMemory ] ---

    /** Unsafe version of: {@link #LoadEXRImageFromMemory} */
    public static native int nLoadEXRImageFromMemory(long image, long header, long memory, long size, long err);

    /**
     * Loads single-part OpenEXR image from a memory.
     * 
     * <p>Application must setup {@link EXRHeader} with {@link #ParseEXRHeaderFromMemory} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRImageFromMemory(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        return nLoadEXRImageFromMemory(image.address(), header.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ LoadEXRMultipartImageFromFile ] ---

    /** Unsafe version of: {@link #LoadEXRMultipartImageFromFile} */
    public static native int nLoadEXRMultipartImageFromFile(long images, long headers, int num_parts, long filename, long err);

    /**
     * Loads multi-part OpenEXR image from a file.
     * 
     * <p>Application must setup {@link #ParseEXRMultipartHeaderFromFile} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRMultipartImageFromFile(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            checkNT1(filename);
            check(err, 1);
        }
        return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), memAddress(filename), memAddress(err));
    }

    /**
     * Loads multi-part OpenEXR image from a file.
     * 
     * <p>Application must setup {@link #ParseEXRMultipartHeaderFromFile} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRMultipartImageFromFile(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadEXRMultipartImageFromMemory ] ---

    /** Unsafe version of: {@link #LoadEXRMultipartImageFromMemory} */
    public static native int nLoadEXRMultipartImageFromMemory(long images, long headers, int num_parts, long memory, long size, long err);

    /**
     * Loads multi-part OpenEXR image from a memory.
     * 
     * <p>Application must setup {@link EXRHeader}* array with {@link #ParseEXRMultipartHeaderFromMemory} before calling this function.</p>
     * 
     * <p>Application can free EXRImage using {@link #FreeEXRImage}. When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadEXRMultipartImageFromMemory(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            check(err, 1);
        }
        return nLoadEXRMultipartImageFromMemory(images.address(), memAddress(headers), images.remaining(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ SaveEXRImageToFile ] ---

    /** Unsafe version of: {@link #SaveEXRImageToFile} */
    public static native int nSaveEXRImageToFile(long image, long exr_header, long filename, long err);

    /**
     * Saves multi-channel, single-frame OpenEXR image to a file.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int SaveEXRImageToFile(@NativeType("EXRImage const *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader exr_header, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
            EXRImage.validate(image.address());
            EXRHeader.validate(exr_header.address());
        }
        return nSaveEXRImageToFile(image.address(), exr_header.address(), memAddress(filename), memAddress(err));
    }

    /**
     * Saves multi-channel, single-frame OpenEXR image to a file.
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int SaveEXRImageToFile(@NativeType("EXRImage const *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader exr_header, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRImage.validate(image.address());
            EXRHeader.validate(exr_header.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nSaveEXRImageToFile(image.address(), exr_header.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SaveEXRImageToMemory ] ---

    /** Unsafe version of: {@link #SaveEXRImageToMemory} */
    public static native long nSaveEXRImageToMemory(long image, long exr_header, long memory, long err);

    /**
     * Saves multi-channel, single-frame OpenEXR image to a memory.
     * 
     * <p>Image is compressed using {@code EXRImage.compression} value.</p>
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return the number of bytes if success or zero and may set error string in {@code err} when there's an error
     */
    @NativeType("size_t")
    public static long SaveEXRImageToMemory(@NativeType("EXRImage const *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader exr_header, @NativeType("unsigned char **") PointerBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(memory, 1);
            check(err, 1);
            EXRImage.validate(image.address());
            EXRHeader.validate(exr_header.address());
        }
        return nSaveEXRImageToMemory(image.address(), exr_header.address(), memAddress(memory), memAddress(err));
    }

    // --- [ LoadDeepEXR ] ---

    /** Unsafe version of: {@link #LoadDeepEXR} */
    public static native int nLoadDeepEXR(long out_image, long filename, long err);

    /**
     * Loads single-frame OpenEXR deep image.
     * 
     * <p>Application must free memory of variables in {@code DeepImage(image, offset_table)}.</p>
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadDeepEXR(@NativeType("DeepImage *") DeepImage out_image, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
        }
        return nLoadDeepEXR(out_image.address(), memAddress(filename), memAddress(err));
    }

    /**
     * Loads single-frame OpenEXR deep image.
     * 
     * <p>Application must free memory of variables in {@code DeepImage(image, offset_table)}.</p>
     * 
     * <p>When there was an error message, Application must free {@code err} with {@link #FreeEXRErrorMessage}.</p>
     *
     * @return negative value and may set error string in {@code err} when there's an error
     */
    public static int LoadDeepEXR(@NativeType("DeepImage *") DeepImage out_image, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadDeepEXR(out_image.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}