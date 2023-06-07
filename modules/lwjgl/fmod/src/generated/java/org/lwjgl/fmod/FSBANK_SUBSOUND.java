/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FSBANK_SUBSOUND {
 *     char const * const * fileNames;
 *     void const * const * fileData;
 *     unsigned int const * fileDataLengths;
 *     unsigned int numFiles;
 *     FSBANK_BUILDFLAGS overrideFlags;
 *     unsigned int overrideQuality;
 *     float desiredSampleRate;
 *     float percentOptimizedRate;
 * }</code></pre>
 */
public class FSBANK_SUBSOUND extends Struct<FSBANK_SUBSOUND> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILENAMES,
        FILEDATA,
        FILEDATALENGTHS,
        NUMFILES,
        OVERRIDEFLAGS,
        OVERRIDEQUALITY,
        DESIREDSAMPLERATE,
        PERCENTOPTIMIZEDRATE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILENAMES = layout.offsetof(0);
        FILEDATA = layout.offsetof(1);
        FILEDATALENGTHS = layout.offsetof(2);
        NUMFILES = layout.offsetof(3);
        OVERRIDEFLAGS = layout.offsetof(4);
        OVERRIDEQUALITY = layout.offsetof(5);
        DESIREDSAMPLERATE = layout.offsetof(6);
        PERCENTOPTIMIZEDRATE = layout.offsetof(7);
    }

    protected FSBANK_SUBSOUND(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FSBANK_SUBSOUND create(long address, @Nullable ByteBuffer container) {
        return new FSBANK_SUBSOUND(address, container);
    }

    /**
     * Creates a {@code FSBANK_SUBSOUND} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FSBANK_SUBSOUND(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code fileNames} field. */
    @NativeType("char const * const *")
    public PointerBuffer fileNames() { return nfileNames(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code fileData} field. */
    @NativeType("void const * const *")
    public PointerBuffer fileData() { return nfileData(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code fileDataLengths} field. */
    @NativeType("unsigned int const *")
    public IntBuffer fileDataLengths() { return nfileDataLengths(address()); }
    /** @return the value of the {@code numFiles} field. */
    @NativeType("unsigned int")
    public int numFiles() { return nnumFiles(address()); }
    /** @return the value of the {@code overrideFlags} field. */
    @NativeType("FSBANK_BUILDFLAGS")
    public int overrideFlags() { return noverrideFlags(address()); }
    /** @return the value of the {@code overrideQuality} field. */
    @NativeType("unsigned int")
    public int overrideQuality() { return noverrideQuality(address()); }
    /** @return the value of the {@code desiredSampleRate} field. */
    public float desiredSampleRate() { return ndesiredSampleRate(address()); }
    /** @return the value of the {@code percentOptimizedRate} field. */
    public float percentOptimizedRate() { return npercentOptimizedRate(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code fileNames} field. */
    public FSBANK_SUBSOUND fileNames(@NativeType("char const * const *") PointerBuffer value) { nfileNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code fileData} field. */
    public FSBANK_SUBSOUND fileData(@NativeType("void const * const *") PointerBuffer value) { nfileData(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code fileDataLengths} field. */
    public FSBANK_SUBSOUND fileDataLengths(@NativeType("unsigned int const *") IntBuffer value) { nfileDataLengths(address(), value); return this; }
    /** Sets the specified value to the {@code numFiles} field. */
    public FSBANK_SUBSOUND numFiles(@NativeType("unsigned int") int value) { nnumFiles(address(), value); return this; }
    /** Sets the specified value to the {@code overrideFlags} field. */
    public FSBANK_SUBSOUND overrideFlags(@NativeType("FSBANK_BUILDFLAGS") int value) { noverrideFlags(address(), value); return this; }
    /** Sets the specified value to the {@code overrideQuality} field. */
    public FSBANK_SUBSOUND overrideQuality(@NativeType("unsigned int") int value) { noverrideQuality(address(), value); return this; }
    /** Sets the specified value to the {@code desiredSampleRate} field. */
    public FSBANK_SUBSOUND desiredSampleRate(float value) { ndesiredSampleRate(address(), value); return this; }
    /** Sets the specified value to the {@code percentOptimizedRate} field. */
    public FSBANK_SUBSOUND percentOptimizedRate(float value) { npercentOptimizedRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FSBANK_SUBSOUND set(
        PointerBuffer fileNames,
        PointerBuffer fileData,
        IntBuffer fileDataLengths,
        int numFiles,
        int overrideFlags,
        int overrideQuality,
        float desiredSampleRate,
        float percentOptimizedRate
    ) {
        fileNames(fileNames);
        fileData(fileData);
        fileDataLengths(fileDataLengths);
        numFiles(numFiles);
        overrideFlags(overrideFlags);
        overrideQuality(overrideQuality);
        desiredSampleRate(desiredSampleRate);
        percentOptimizedRate(percentOptimizedRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FSBANK_SUBSOUND set(FSBANK_SUBSOUND src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FSBANK_SUBSOUND} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FSBANK_SUBSOUND malloc() {
        return new FSBANK_SUBSOUND(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_SUBSOUND} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FSBANK_SUBSOUND calloc() {
        return new FSBANK_SUBSOUND(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_SUBSOUND} instance allocated with {@link BufferUtils}. */
    public static FSBANK_SUBSOUND create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FSBANK_SUBSOUND(memAddress(container), container);
    }

    /** Returns a new {@code FSBANK_SUBSOUND} instance for the specified memory address. */
    public static FSBANK_SUBSOUND create(long address) {
        return new FSBANK_SUBSOUND(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_SUBSOUND createSafe(long address) {
        return address == NULL ? null : new FSBANK_SUBSOUND(address, null);
    }

    /**
     * Returns a new {@link FSBANK_SUBSOUND.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FSBANK_SUBSOUND.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_SUBSOUND.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FSBANK_SUBSOUND.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_SUBSOUND.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FSBANK_SUBSOUND} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_SUBSOUND malloc(MemoryStack stack) {
        return new FSBANK_SUBSOUND(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FSBANK_SUBSOUND} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_SUBSOUND calloc(MemoryStack stack) {
        return new FSBANK_SUBSOUND(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FSBANK_SUBSOUND.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_SUBSOUND.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_SUBSOUND.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fileNames() fileNames}. */
    public static PointerBuffer nfileNames(long struct) { return memPointerBuffer(memGetAddress(struct + FSBANK_SUBSOUND.FILENAMES), nnumFiles(struct)); }
    /** Unsafe version of {@link #fileData() fileData}. */
    public static PointerBuffer nfileData(long struct) { return memPointerBuffer(memGetAddress(struct + FSBANK_SUBSOUND.FILEDATA), nnumFiles(struct)); }
    /** Unsafe version of {@link #fileDataLengths() fileDataLengths}. */
    public static IntBuffer nfileDataLengths(long struct) { return memIntBuffer(memGetAddress(struct + FSBANK_SUBSOUND.FILEDATALENGTHS), nnumFiles(struct)); }
    /** Unsafe version of {@link #numFiles}. */
    public static int nnumFiles(long struct) { return UNSAFE.getInt(null, struct + FSBANK_SUBSOUND.NUMFILES); }
    /** Unsafe version of {@link #overrideFlags}. */
    public static int noverrideFlags(long struct) { return UNSAFE.getInt(null, struct + FSBANK_SUBSOUND.OVERRIDEFLAGS); }
    /** Unsafe version of {@link #overrideQuality}. */
    public static int noverrideQuality(long struct) { return UNSAFE.getInt(null, struct + FSBANK_SUBSOUND.OVERRIDEQUALITY); }
    /** Unsafe version of {@link #desiredSampleRate}. */
    public static float ndesiredSampleRate(long struct) { return UNSAFE.getFloat(null, struct + FSBANK_SUBSOUND.DESIREDSAMPLERATE); }
    /** Unsafe version of {@link #percentOptimizedRate}. */
    public static float npercentOptimizedRate(long struct) { return UNSAFE.getFloat(null, struct + FSBANK_SUBSOUND.PERCENTOPTIMIZEDRATE); }

    /** Unsafe version of {@link #fileNames(PointerBuffer) fileNames}. */
    public static void nfileNames(long struct, PointerBuffer value) { memPutAddress(struct + FSBANK_SUBSOUND.FILENAMES, memAddress(value)); }
    /** Unsafe version of {@link #fileData(PointerBuffer) fileData}. */
    public static void nfileData(long struct, PointerBuffer value) { memPutAddress(struct + FSBANK_SUBSOUND.FILEDATA, memAddress(value)); }
    /** Unsafe version of {@link #fileDataLengths(IntBuffer) fileDataLengths}. */
    public static void nfileDataLengths(long struct, IntBuffer value) { memPutAddress(struct + FSBANK_SUBSOUND.FILEDATALENGTHS, memAddress(value)); }
    /** Sets the specified value to the {@code numFiles} field of the specified {@code struct}. */
    public static void nnumFiles(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_SUBSOUND.NUMFILES, value); }
    /** Unsafe version of {@link #overrideFlags(int) overrideFlags}. */
    public static void noverrideFlags(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_SUBSOUND.OVERRIDEFLAGS, value); }
    /** Unsafe version of {@link #overrideQuality(int) overrideQuality}. */
    public static void noverrideQuality(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_SUBSOUND.OVERRIDEQUALITY, value); }
    /** Unsafe version of {@link #desiredSampleRate(float) desiredSampleRate}. */
    public static void ndesiredSampleRate(long struct, float value) { UNSAFE.putFloat(null, struct + FSBANK_SUBSOUND.DESIREDSAMPLERATE, value); }
    /** Unsafe version of {@link #percentOptimizedRate(float) percentOptimizedRate}. */
    public static void npercentOptimizedRate(long struct, float value) { UNSAFE.putFloat(null, struct + FSBANK_SUBSOUND.PERCENTOPTIMIZEDRATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FSBANK_SUBSOUND.FILENAMES));
        check(memGetAddress(struct + FSBANK_SUBSOUND.FILEDATA));
        check(memGetAddress(struct + FSBANK_SUBSOUND.FILEDATALENGTHS));
    }

    // -----------------------------------

    /** An array of {@link FSBANK_SUBSOUND} structs. */
    public static class Buffer extends StructBuffer<FSBANK_SUBSOUND, Buffer> implements NativeResource {

        private static final FSBANK_SUBSOUND ELEMENT_FACTORY = FSBANK_SUBSOUND.create(-1L);

        /**
         * Creates a new {@code FSBANK_SUBSOUND.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FSBANK_SUBSOUND#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected FSBANK_SUBSOUND getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code fileNames} field. */
        @NativeType("char const * const *")
        public PointerBuffer fileNames() { return FSBANK_SUBSOUND.nfileNames(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code fileData} field. */
        @NativeType("void const * const *")
        public PointerBuffer fileData() { return FSBANK_SUBSOUND.nfileData(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code fileDataLengths} field. */
        @NativeType("unsigned int const *")
        public IntBuffer fileDataLengths() { return FSBANK_SUBSOUND.nfileDataLengths(address()); }
        /** @return the value of the {@code numFiles} field. */
        @NativeType("unsigned int")
        public int numFiles() { return FSBANK_SUBSOUND.nnumFiles(address()); }
        /** @return the value of the {@code overrideFlags} field. */
        @NativeType("FSBANK_BUILDFLAGS")
        public int overrideFlags() { return FSBANK_SUBSOUND.noverrideFlags(address()); }
        /** @return the value of the {@code overrideQuality} field. */
        @NativeType("unsigned int")
        public int overrideQuality() { return FSBANK_SUBSOUND.noverrideQuality(address()); }
        /** @return the value of the {@code desiredSampleRate} field. */
        public float desiredSampleRate() { return FSBANK_SUBSOUND.ndesiredSampleRate(address()); }
        /** @return the value of the {@code percentOptimizedRate} field. */
        public float percentOptimizedRate() { return FSBANK_SUBSOUND.npercentOptimizedRate(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code fileNames} field. */
        public FSBANK_SUBSOUND.Buffer fileNames(@NativeType("char const * const *") PointerBuffer value) { FSBANK_SUBSOUND.nfileNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code fileData} field. */
        public FSBANK_SUBSOUND.Buffer fileData(@NativeType("void const * const *") PointerBuffer value) { FSBANK_SUBSOUND.nfileData(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code fileDataLengths} field. */
        public FSBANK_SUBSOUND.Buffer fileDataLengths(@NativeType("unsigned int const *") IntBuffer value) { FSBANK_SUBSOUND.nfileDataLengths(address(), value); return this; }
        /** Sets the specified value to the {@code numFiles} field. */
        public FSBANK_SUBSOUND.Buffer numFiles(@NativeType("unsigned int") int value) { FSBANK_SUBSOUND.nnumFiles(address(), value); return this; }
        /** Sets the specified value to the {@code overrideFlags} field. */
        public FSBANK_SUBSOUND.Buffer overrideFlags(@NativeType("FSBANK_BUILDFLAGS") int value) { FSBANK_SUBSOUND.noverrideFlags(address(), value); return this; }
        /** Sets the specified value to the {@code overrideQuality} field. */
        public FSBANK_SUBSOUND.Buffer overrideQuality(@NativeType("unsigned int") int value) { FSBANK_SUBSOUND.noverrideQuality(address(), value); return this; }
        /** Sets the specified value to the {@code desiredSampleRate} field. */
        public FSBANK_SUBSOUND.Buffer desiredSampleRate(float value) { FSBANK_SUBSOUND.ndesiredSampleRate(address(), value); return this; }
        /** Sets the specified value to the {@code percentOptimizedRate} field. */
        public FSBANK_SUBSOUND.Buffer percentOptimizedRate(float value) { FSBANK_SUBSOUND.npercentOptimizedRate(address(), value); return this; }

    }

}