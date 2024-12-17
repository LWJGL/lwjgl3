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

public class TinyEXR {

    static { LibTinyEXR.initialize(); }

    public static final int
        TINYEXR_SUCCESS                    = 0,
        TINYEXR_ERROR_INVALID_MAGIC_NUMBER = -1,
        TINYEXR_ERROR_INVALID_EXR_VERSION  = -2,
        TINYEXR_ERROR_INVALID_ARGUMENT     = -3,
        TINYEXR_ERROR_INVALID_DATA         = -4,
        TINYEXR_ERROR_INVALID_FILE         = -5,
        TINYEXR_ERROR_INVALID_PARAMETER    = -6,
        TINYEXR_ERROR_CANT_OPEN_FILE       = -7,
        TINYEXR_ERROR_UNSUPPORTED_FORMAT   = -8,
        TINYEXR_ERROR_INVALID_HEADER       = -9,
        TINYEXR_ERROR_UNSUPPORTED_FEATURE  = -10,
        TINYEXR_ERROR_CANT_WRITE_FILE      = -11,
        TINYEXR_ERROR_SERIALIZATION_FAILED = -12,
        TINYEXR_ERROR_LAYER_NOT_FOUND      = -13,
        TINYEXR_ERROR_DATA_TOO_LARGE       = -14;

    public static final int
        TINYEXR_PIXELTYPE_UINT  = 0,
        TINYEXR_PIXELTYPE_HALF  = 1,
        TINYEXR_PIXELTYPE_FLOAT = 2;

    public static final int
        TINYEXR_MAX_HEADER_ATTRIBUTES = 1024,
        TINYEXR_MAX_CUSTOM_ATTRIBUTES = 128;

    public static final int
        TINYEXR_COMPRESSIONTYPE_NONE = 0,
        TINYEXR_COMPRESSIONTYPE_RLE  = 1,
        TINYEXR_COMPRESSIONTYPE_ZIPS = 2,
        TINYEXR_COMPRESSIONTYPE_ZIP  = 3,
        TINYEXR_COMPRESSIONTYPE_PIZ  = 4,
        TINYEXR_COMPRESSIONTYPE_ZFP  = 128;

    public static final int
        TINYEXR_ZFP_COMPRESSIONTYPE_RATE      = 0,
        TINYEXR_ZFP_COMPRESSIONTYPE_PRECISION = 1,
        TINYEXR_ZFP_COMPRESSIONTYPE_ACCURACY  = 2;

    public static final int
        TINYEXR_TILE_ONE_LEVEL     = 0,
        TINYEXR_TILE_MIPMAP_LEVELS = 1,
        TINYEXR_TILE_RIPMAP_LEVELS = 2;

    public static final int
        TINYEXR_TILE_ROUND_DOWN = 0,
        TINYEXR_TILE_ROUND_UP   = 1;

    protected TinyEXR() {
        throw new UnsupportedOperationException();
    }

    // --- [ LoadEXRWithLayer ] ---

    /** {@code int LoadEXRWithLayer(float ** out_rgba, int * width, int * height, char const * filename, char const * layer_name, char const ** err)} */
    public static native int nLoadEXRWithLayer(long out_rgba, long width, long height, long filename, long layer_name, long err);

    /** {@code int LoadEXRWithLayer(float ** out_rgba, int * width, int * height, char const * filename, char const * layer_name, char const ** err)} */
    public static int LoadEXRWithLayer(@NativeType("float **") PointerBuffer out_rgba, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("char const *") ByteBuffer filename, @NativeType("char const *") ByteBuffer layer_name, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(out_rgba, 1);
            check(width, 1);
            check(height, 1);
            checkNT1(filename);
            checkNT1(layer_name);
            check(err, 1);
        }
        return nLoadEXRWithLayer(memAddress(out_rgba), memAddress(width), memAddress(height), memAddress(filename), memAddress(layer_name), memAddress(err));
    }

    /** {@code int LoadEXRWithLayer(float ** out_rgba, int * width, int * height, char const * filename, char const * layer_name, char const ** err)} */
    public static int LoadEXRWithLayer(@NativeType("float **") PointerBuffer out_rgba, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("char const *") CharSequence filename, @NativeType("char const *") CharSequence layer_name, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(out_rgba, 1);
            check(width, 1);
            check(height, 1);
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            stack.nUTF8(layer_name, true);
            long layer_nameEncoded = stack.getPointerAddress();
            return nLoadEXRWithLayer(memAddress(out_rgba), memAddress(width), memAddress(height), filenameEncoded, layer_nameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ EXRLayers ] ---

    /** {@code int EXRLayers(char const * filename, char const *** layer_names, int * num_layers, char const ** err)} */
    public static native int nEXRLayers(long filename, long layer_names, long num_layers, long err);

    /** {@code int EXRLayers(char const * filename, char const *** layer_names, int * num_layers, char const ** err)} */
    public static int EXRLayers(@NativeType("char const *") ByteBuffer filename, @NativeType("char const ***") PointerBuffer layer_names, @NativeType("int *") IntBuffer num_layers, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(layer_names, 1);
            check(num_layers, 1);
            check(err, 1);
        }
        return nEXRLayers(memAddress(filename), memAddress(layer_names), memAddress(num_layers), memAddress(err));
    }

    /** {@code int EXRLayers(char const * filename, char const *** layer_names, int * num_layers, char const ** err)} */
    public static int EXRLayers(@NativeType("char const *") CharSequence filename, @NativeType("char const ***") PointerBuffer layer_names, @NativeType("int *") IntBuffer num_layers, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(layer_names, 1);
            check(num_layers, 1);
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nEXRLayers(filenameEncoded, memAddress(layer_names), memAddress(num_layers), memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ IsEXRFromMemory ] ---

    /** {@code int IsEXRFromMemory(unsigned char const * memory, size_t size)} */
    public static native int nIsEXRFromMemory(long memory, long size);

    /** {@code int IsEXRFromMemory(unsigned char const * memory, size_t size)} */
    public static int IsEXRFromMemory(@NativeType("unsigned char const *") ByteBuffer memory) {
        return nIsEXRFromMemory(memAddress(memory), memory.remaining());
    }

    // --- [ EXRNumLevels ] ---

    /** {@code int EXRNumLevels(EXRImage const * exr_image)} */
    public static native int nEXRNumLevels(long exr_image);

    /** {@code int EXRNumLevels(EXRImage const * exr_image)} */
    public static int EXRNumLevels(@NativeType("EXRImage const *") EXRImage exr_image) {
        if (CHECKS) {
            EXRImage.validate(exr_image.address());
        }
        return nEXRNumLevels(exr_image.address());
    }

    // --- [ InitEXRHeader ] ---

    /** {@code void InitEXRHeader(EXRHeader * exr_header)} */
    public static native void nInitEXRHeader(long exr_header);

    /** {@code void InitEXRHeader(EXRHeader * exr_header)} */
    public static void InitEXRHeader(@NativeType("EXRHeader *") EXRHeader exr_header) {
        nInitEXRHeader(exr_header.address());
    }

    // --- [ EXRSetNameAttr ] ---

    /** {@code void EXRSetNameAttr(EXRHeader * exr_header, char const * name)} */
    public static native void nEXRSetNameAttr(long exr_header, long name);

    /** {@code void EXRSetNameAttr(EXRHeader * exr_header, char const * name)} */
    public static void EXRSetNameAttr(@NativeType("EXRHeader *") EXRHeader exr_header, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nEXRSetNameAttr(exr_header.address(), memAddress(name));
    }

    /** {@code void EXRSetNameAttr(EXRHeader * exr_header, char const * name)} */
    public static void EXRSetNameAttr(@NativeType("EXRHeader *") EXRHeader exr_header, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nEXRSetNameAttr(exr_header.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ InitEXRImage ] ---

    /** {@code void InitEXRImage(EXRImage * exr_image)} */
    public static native void nInitEXRImage(long exr_image);

    /** {@code void InitEXRImage(EXRImage * exr_image)} */
    public static void InitEXRImage(@NativeType("EXRImage *") EXRImage exr_image) {
        nInitEXRImage(exr_image.address());
    }

    // --- [ FreeEXRHeader ] ---

    /** {@code int FreeEXRHeader(EXRHeader * exr_header)} */
    public static native int nFreeEXRHeader(long exr_header);

    /** {@code int FreeEXRHeader(EXRHeader * exr_header)} */
    public static int FreeEXRHeader(@NativeType("EXRHeader *") EXRHeader exr_header) {
        return nFreeEXRHeader(exr_header.address());
    }

    // --- [ FreeEXRImage ] ---

    /** {@code int FreeEXRImage(EXRImage * exr_image)} */
    public static native int nFreeEXRImage(long exr_image);

    /** {@code int FreeEXRImage(EXRImage * exr_image)} */
    public static int FreeEXRImage(@NativeType("EXRImage *") EXRImage exr_image) {
        return nFreeEXRImage(exr_image.address());
    }

    // --- [ FreeEXRErrorMessage ] ---

    /** {@code void FreeEXRErrorMessage(char const * msg)} */
    public static native void nFreeEXRErrorMessage(long msg);

    /** {@code void FreeEXRErrorMessage(char const * msg)} */
    public static void FreeEXRErrorMessage(@NativeType("char const *") ByteBuffer msg) {
        nFreeEXRErrorMessage(memAddress(msg));
    }

    // --- [ ParseEXRVersionFromFile ] ---

    /** {@code int ParseEXRVersionFromFile(EXRVersion * version, char const * filename)} */
    public static native int nParseEXRVersionFromFile(long version, long filename);

    /** {@code int ParseEXRVersionFromFile(EXRVersion * version, char const * filename)} */
    public static int ParseEXRVersionFromFile(@NativeType("EXRVersion *") EXRVersion version, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nParseEXRVersionFromFile(version.address(), memAddress(filename));
    }

    /** {@code int ParseEXRVersionFromFile(EXRVersion * version, char const * filename)} */
    public static int ParseEXRVersionFromFile(@NativeType("EXRVersion *") EXRVersion version, @NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRVersionFromFile(version.address(), filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRVersionFromMemory ] ---

    /** {@code int ParseEXRVersionFromMemory(EXRVersion * version, unsigned char const * memory, size_t size)} */
    public static native int nParseEXRVersionFromMemory(long version, long memory, long size);

    /** {@code int ParseEXRVersionFromMemory(EXRVersion * version, unsigned char const * memory, size_t size)} */
    public static int ParseEXRVersionFromMemory(@NativeType("EXRVersion *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory) {
        return nParseEXRVersionFromMemory(version.address(), memAddress(memory), memory.remaining());
    }

    // --- [ ParseEXRHeaderFromFile ] ---

    /** {@code int ParseEXRHeaderFromFile(EXRHeader * header, EXRVersion const * version, char const * filename, char const ** err)} */
    public static native int nParseEXRHeaderFromFile(long header, long version, long filename, long err);

    /** {@code int ParseEXRHeaderFromFile(EXRHeader * header, EXRVersion const * version, char const * filename, char const ** err)} */
    public static int ParseEXRHeaderFromFile(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
        }
        return nParseEXRHeaderFromFile(header.address(), version.address(), memAddress(filename), memAddress(err));
    }

    /** {@code int ParseEXRHeaderFromFile(EXRHeader * header, EXRVersion const * version, char const * filename, char const ** err)} */
    public static int ParseEXRHeaderFromFile(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRHeaderFromFile(header.address(), version.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRHeaderFromMemory ] ---

    /** {@code int ParseEXRHeaderFromMemory(EXRHeader * header, EXRVersion const * version, unsigned char const * memory, size_t size, char const ** err)} */
    public static native int nParseEXRHeaderFromMemory(long header, long version, long memory, long size, long err);

    /** {@code int ParseEXRHeaderFromMemory(EXRHeader * header, EXRVersion const * version, unsigned char const * memory, size_t size, char const ** err)} */
    public static int ParseEXRHeaderFromMemory(@NativeType("EXRHeader *") EXRHeader header, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        return nParseEXRHeaderFromMemory(header.address(), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ ParseEXRMultipartHeaderFromFile ] ---

    /** {@code int ParseEXRMultipartHeaderFromFile(EXRHeader *** headers, int * num_headers, EXRVersion const * version, char const * filename, char const ** err)} */
    public static native int nParseEXRMultipartHeaderFromFile(long headers, long num_headers, long version, long filename, long err);

    /** {@code int ParseEXRMultipartHeaderFromFile(EXRHeader *** headers, int * num_headers, EXRVersion const * version, char const * filename, char const ** err)} */
    public static int ParseEXRMultipartHeaderFromFile(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            checkNT1(filename);
            check(err, 1);
        }
        return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), memAddress(filename), memAddress(err));
    }

    /** {@code int ParseEXRMultipartHeaderFromFile(EXRHeader *** headers, int * num_headers, EXRVersion const * version, char const * filename, char const ** err)} */
    public static int ParseEXRMultipartHeaderFromFile(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ParseEXRMultipartHeaderFromMemory ] ---

    /** {@code int ParseEXRMultipartHeaderFromMemory(EXRHeader *** headers, int * num_headers, EXRVersion const * version, unsigned char const * memory, size_t size, char const ** err)} */
    public static native int nParseEXRMultipartHeaderFromMemory(long headers, long num_headers, long version, long memory, long size, long err);

    /** {@code int ParseEXRMultipartHeaderFromMemory(EXRHeader *** headers, int * num_headers, EXRVersion const * version, unsigned char const * memory, size_t size, char const ** err)} */
    public static int ParseEXRMultipartHeaderFromMemory(@NativeType("EXRHeader ***") PointerBuffer headers, @NativeType("int *") IntBuffer num_headers, @NativeType("EXRVersion const *") EXRVersion version, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, 1);
            check(num_headers, 1);
            check(err, 1);
        }
        return nParseEXRMultipartHeaderFromMemory(memAddress(headers), memAddress(num_headers), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ LoadEXRImageFromFile ] ---

    /** {@code int LoadEXRImageFromFile(EXRImage * image, EXRHeader const * header, char const * filename, char const ** err)} */
    public static native int nLoadEXRImageFromFile(long image, long header, long filename, long err);

    /** {@code int LoadEXRImageFromFile(EXRImage * image, EXRHeader const * header, char const * filename, char const ** err)} */
    public static int LoadEXRImageFromFile(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        return nLoadEXRImageFromFile(image.address(), header.address(), memAddress(filename), memAddress(err));
    }

    /** {@code int LoadEXRImageFromFile(EXRImage * image, EXRHeader const * header, char const * filename, char const ** err)} */
    public static int LoadEXRImageFromFile(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadEXRImageFromFile(image.address(), header.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadEXRImageFromMemory ] ---

    /** {@code int LoadEXRImageFromMemory(EXRImage * image, EXRHeader const * header, unsigned char const * memory, size_t size, char const ** err)} */
    public static native int nLoadEXRImageFromMemory(long image, long header, long memory, long size, long err);

    /** {@code int LoadEXRImageFromMemory(EXRImage * image, EXRHeader const * header, unsigned char const * memory, size_t size, char const ** err)} */
    public static int LoadEXRImageFromMemory(@NativeType("EXRImage *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader header, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRHeader.validate(header.address());
        }
        return nLoadEXRImageFromMemory(image.address(), header.address(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ LoadEXRMultipartImageFromFile ] ---

    /** {@code int LoadEXRMultipartImageFromFile(EXRImage * images, EXRHeader const ** headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static native int nLoadEXRMultipartImageFromFile(long images, long headers, int num_parts, long filename, long err);

    /** {@code int LoadEXRMultipartImageFromFile(EXRImage * images, EXRHeader const ** headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static int LoadEXRMultipartImageFromFile(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            checkNT1(filename);
            check(err, 1);
        }
        return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), memAddress(filename), memAddress(err));
    }

    /** {@code int LoadEXRMultipartImageFromFile(EXRImage * images, EXRHeader const ** headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static int LoadEXRMultipartImageFromFile(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadEXRMultipartImageFromMemory ] ---

    /** {@code int LoadEXRMultipartImageFromMemory(EXRImage * images, EXRHeader const ** headers, unsigned int num_parts, unsigned char const * memory, size_t size, char const ** err)} */
    public static native int nLoadEXRMultipartImageFromMemory(long images, long headers, int num_parts, long memory, long size, long err);

    /** {@code int LoadEXRMultipartImageFromMemory(EXRImage * images, EXRHeader const ** headers, unsigned int num_parts, unsigned char const * memory, size_t size, char const ** err)} */
    public static int LoadEXRMultipartImageFromMemory(@NativeType("EXRImage *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer headers, @NativeType("unsigned char const *") ByteBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(headers, images.remaining());
            check(err, 1);
        }
        return nLoadEXRMultipartImageFromMemory(images.address(), memAddress(headers), images.remaining(), memAddress(memory), memory.remaining(), memAddress(err));
    }

    // --- [ SaveEXRImageToFile ] ---

    /** {@code int SaveEXRImageToFile(EXRImage const * image, EXRHeader const * exr_header, char const * filename, char const ** err)} */
    public static native int nSaveEXRImageToFile(long image, long exr_header, long filename, long err);

    /** {@code int SaveEXRImageToFile(EXRImage const * image, EXRHeader const * exr_header, char const * filename, char const ** err)} */
    public static int SaveEXRImageToFile(@NativeType("EXRImage const *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader exr_header, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
            EXRImage.validate(image.address());
            EXRHeader.validate(exr_header.address());
        }
        return nSaveEXRImageToFile(image.address(), exr_header.address(), memAddress(filename), memAddress(err));
    }

    /** {@code int SaveEXRImageToFile(EXRImage const * image, EXRHeader const * exr_header, char const * filename, char const ** err)} */
    public static int SaveEXRImageToFile(@NativeType("EXRImage const *") EXRImage image, @NativeType("EXRHeader const *") EXRHeader exr_header, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
            EXRImage.validate(image.address());
            EXRHeader.validate(exr_header.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nSaveEXRImageToFile(image.address(), exr_header.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SaveEXRImageToMemory ] ---

    /** {@code size_t SaveEXRImageToMemory(EXRImage const * image, EXRHeader const * exr_header, unsigned char ** memory, char const ** err)} */
    public static native long nSaveEXRImageToMemory(long image, long exr_header, long memory, long err);

    /** {@code size_t SaveEXRImageToMemory(EXRImage const * image, EXRHeader const * exr_header, unsigned char ** memory, char const ** err)} */
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

    // --- [ SaveEXRMultipartImageToFile ] ---

    /** {@code int SaveEXRMultipartImageToFile(EXRImage const * images, EXRHeader const ** exr_headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static native int nSaveEXRMultipartImageToFile(long images, long exr_headers, int num_parts, long filename, long err);

    /** {@code int SaveEXRMultipartImageToFile(EXRImage const * images, EXRHeader const ** exr_headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static int SaveEXRMultipartImageToFile(@NativeType("EXRImage const *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer exr_headers, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(exr_headers, images.remaining());
            checkNT1(filename);
            check(err, 1);
            Struct.validate(images.address(), images.remaining(), EXRImage.SIZEOF, EXRImage::validate);
        }
        return nSaveEXRMultipartImageToFile(images.address(), memAddress(exr_headers), images.remaining(), memAddress(filename), memAddress(err));
    }

    /** {@code int SaveEXRMultipartImageToFile(EXRImage const * images, EXRHeader const ** exr_headers, unsigned int num_parts, char const * filename, char const ** err)} */
    public static int SaveEXRMultipartImageToFile(@NativeType("EXRImage const *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer exr_headers, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(exr_headers, images.remaining());
            check(err, 1);
            Struct.validate(images.address(), images.remaining(), EXRImage.SIZEOF, EXRImage::validate);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nSaveEXRMultipartImageToFile(images.address(), memAddress(exr_headers), images.remaining(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SaveEXRMultipartImageToMemory ] ---

    /** {@code size_t SaveEXRMultipartImageToMemory(EXRImage const * images, EXRHeader const ** exr_headers, unsigned int num_parts, unsigned char ** memory, char const ** err)} */
    public static native long nSaveEXRMultipartImageToMemory(long images, long exr_headers, int num_parts, long memory, long err);

    /** {@code size_t SaveEXRMultipartImageToMemory(EXRImage const * images, EXRHeader const ** exr_headers, unsigned int num_parts, unsigned char ** memory, char const ** err)} */
    @NativeType("size_t")
    public static long SaveEXRMultipartImageToMemory(@NativeType("EXRImage const *") EXRImage.Buffer images, @NativeType("EXRHeader const **") PointerBuffer exr_headers, @NativeType("unsigned char **") PointerBuffer memory, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(exr_headers, images.remaining());
            check(memory, 1);
            check(err, 1);
            Struct.validate(images.address(), images.remaining(), EXRImage.SIZEOF, EXRImage::validate);
        }
        return nSaveEXRMultipartImageToMemory(images.address(), memAddress(exr_headers), images.remaining(), memAddress(memory), memAddress(err));
    }

    // --- [ LoadDeepEXR ] ---

    /** {@code int LoadDeepEXR(DeepImage * out_image, char const * filename, char const ** err)} */
    public static native int nLoadDeepEXR(long out_image, long filename, long err);

    /** {@code int LoadDeepEXR(DeepImage * out_image, char const * filename, char const ** err)} */
    public static int LoadDeepEXR(@NativeType("DeepImage *") DeepImage out_image, @NativeType("char const *") ByteBuffer filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            checkNT1(filename);
            check(err, 1);
        }
        return nLoadDeepEXR(out_image.address(), memAddress(filename), memAddress(err));
    }

    /** {@code int LoadDeepEXR(DeepImage * out_image, char const * filename, char const ** err)} */
    public static int LoadDeepEXR(@NativeType("DeepImage *") DeepImage out_image, @NativeType("char const *") CharSequence filename, @NativeType("char const **") PointerBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nLoadDeepEXR(out_image.address(), filenameEncoded, memAddress(err));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}