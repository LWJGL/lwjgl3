/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ktxAstcParams {
 *     ktx_uint32_t structSize;
 *     ktx_bool_t verbose;
 *     ktx_uint32_t threadCount;
 *     ktx_uint32_t blockDimension;
 *     ktx_uint32_t mode;
 *     ktx_uint32_t qualityLevel;
 *     ktx_bool_t normalMap;
 *     ktx_bool_t perceptual;
 *     char inputSwizzle[4];
 * }}</pre>
 */
public class ktxAstcParams extends Struct<ktxAstcParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STRUCTSIZE,
        VERBOSE,
        THREADCOUNT,
        BLOCKDIMENSION,
        MODE,
        QUALITYLEVEL,
        NORMALMAP,
        PERCEPTUAL,
        INPUTSWIZZLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __array(1, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STRUCTSIZE = layout.offsetof(0);
        VERBOSE = layout.offsetof(1);
        THREADCOUNT = layout.offsetof(2);
        BLOCKDIMENSION = layout.offsetof(3);
        MODE = layout.offsetof(4);
        QUALITYLEVEL = layout.offsetof(5);
        NORMALMAP = layout.offsetof(6);
        PERCEPTUAL = layout.offsetof(7);
        INPUTSWIZZLE = layout.offsetof(8);
    }

    protected ktxAstcParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxAstcParams create(long address, @Nullable ByteBuffer container) {
        return new ktxAstcParams(address, container);
    }

    /**
     * Creates a {@code ktxAstcParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxAstcParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code structSize} field. */
    @NativeType("ktx_uint32_t")
    public int structSize() { return nstructSize(address()); }
    /** @return the value of the {@code verbose} field. */
    @NativeType("ktx_bool_t")
    public boolean verbose() { return nverbose(address()); }
    /** @return the value of the {@code threadCount} field. */
    @NativeType("ktx_uint32_t")
    public int threadCount() { return nthreadCount(address()); }
    /** @return the value of the {@code blockDimension} field. */
    @NativeType("ktx_uint32_t")
    public int blockDimension() { return nblockDimension(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("ktx_uint32_t")
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code qualityLevel} field. */
    @NativeType("ktx_uint32_t")
    public int qualityLevel() { return nqualityLevel(address()); }
    /** @return the value of the {@code normalMap} field. */
    @NativeType("ktx_bool_t")
    public boolean normalMap() { return nnormalMap(address()); }
    /** @return the value of the {@code perceptual} field. */
    @NativeType("ktx_bool_t")
    public boolean perceptual() { return nperceptual(address()); }
    /** @return a {@link ByteBuffer} view of the {@code inputSwizzle} field. */
    @NativeType("char[4]")
    public ByteBuffer inputSwizzle() { return ninputSwizzle(address()); }
    /** @return the value at the specified index of the {@code inputSwizzle} field. */
    @NativeType("char")
    public byte inputSwizzle(int index) { return ninputSwizzle(address(), index); }

    /** Sets the specified value to the {@code structSize} field. */
    public ktxAstcParams structSize(@NativeType("ktx_uint32_t") int value) { nstructSize(address(), value); return this; }
    /** Sets the specified value to the {@code verbose} field. */
    public ktxAstcParams verbose(@NativeType("ktx_bool_t") boolean value) { nverbose(address(), value); return this; }
    /** Sets the specified value to the {@code threadCount} field. */
    public ktxAstcParams threadCount(@NativeType("ktx_uint32_t") int value) { nthreadCount(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimension} field. */
    public ktxAstcParams blockDimension(@NativeType("ktx_uint32_t") int value) { nblockDimension(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public ktxAstcParams mode(@NativeType("ktx_uint32_t") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code qualityLevel} field. */
    public ktxAstcParams qualityLevel(@NativeType("ktx_uint32_t") int value) { nqualityLevel(address(), value); return this; }
    /** Sets the specified value to the {@code normalMap} field. */
    public ktxAstcParams normalMap(@NativeType("ktx_bool_t") boolean value) { nnormalMap(address(), value); return this; }
    /** Sets the specified value to the {@code perceptual} field. */
    public ktxAstcParams perceptual(@NativeType("ktx_bool_t") boolean value) { nperceptual(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code inputSwizzle} field. */
    public ktxAstcParams inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ninputSwizzle(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code inputSwizzle} field. */
    public ktxAstcParams inputSwizzle(int index, @NativeType("char") byte value) { ninputSwizzle(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxAstcParams set(
        int structSize,
        boolean verbose,
        int threadCount,
        int blockDimension,
        int mode,
        int qualityLevel,
        boolean normalMap,
        boolean perceptual,
        ByteBuffer inputSwizzle
    ) {
        structSize(structSize);
        verbose(verbose);
        threadCount(threadCount);
        blockDimension(blockDimension);
        mode(mode);
        qualityLevel(qualityLevel);
        normalMap(normalMap);
        perceptual(perceptual);
        inputSwizzle(inputSwizzle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxAstcParams set(ktxAstcParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxAstcParams malloc() {
        return new ktxAstcParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxAstcParams calloc() {
        return new ktxAstcParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxAstcParams} instance allocated with {@link BufferUtils}. */
    public static ktxAstcParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxAstcParams(memAddress(container), container);
    }

    /** Returns a new {@code ktxAstcParams} instance for the specified memory address. */
    public static ktxAstcParams create(long address) {
        return new ktxAstcParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ktxAstcParams createSafe(long address) {
        return address == NULL ? null : new ktxAstcParams(address, null);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxAstcParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ktxAstcParams.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxAstcParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxAstcParams malloc(MemoryStack stack) {
        return new ktxAstcParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxAstcParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxAstcParams calloc(MemoryStack stack) {
        return new ktxAstcParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxAstcParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxAstcParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #structSize}. */
    public static int nstructSize(long struct) { return memGetInt(struct + ktxAstcParams.STRUCTSIZE); }
    /** Unsafe version of {@link #verbose}. */
    public static boolean nverbose(long struct) { return memGetByte(struct + ktxAstcParams.VERBOSE) != 0; }
    /** Unsafe version of {@link #threadCount}. */
    public static int nthreadCount(long struct) { return memGetInt(struct + ktxAstcParams.THREADCOUNT); }
    /** Unsafe version of {@link #blockDimension}. */
    public static int nblockDimension(long struct) { return memGetInt(struct + ktxAstcParams.BLOCKDIMENSION); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + ktxAstcParams.MODE); }
    /** Unsafe version of {@link #qualityLevel}. */
    public static int nqualityLevel(long struct) { return memGetInt(struct + ktxAstcParams.QUALITYLEVEL); }
    /** Unsafe version of {@link #normalMap}. */
    public static boolean nnormalMap(long struct) { return memGetByte(struct + ktxAstcParams.NORMALMAP) != 0; }
    /** Unsafe version of {@link #perceptual}. */
    public static boolean nperceptual(long struct) { return memGetByte(struct + ktxAstcParams.PERCEPTUAL) != 0; }
    /** Unsafe version of {@link #inputSwizzle}. */
    public static ByteBuffer ninputSwizzle(long struct) { return memByteBuffer(struct + ktxAstcParams.INPUTSWIZZLE, 4); }
    /** Unsafe version of {@link #inputSwizzle(int) inputSwizzle}. */
    public static byte ninputSwizzle(long struct, int index) {
        return memGetByte(struct + ktxAstcParams.INPUTSWIZZLE + check(index, 4) * 1);
    }

    /** Unsafe version of {@link #structSize(int) structSize}. */
    public static void nstructSize(long struct, int value) { memPutInt(struct + ktxAstcParams.STRUCTSIZE, value); }
    /** Unsafe version of {@link #verbose(boolean) verbose}. */
    public static void nverbose(long struct, boolean value) { memPutByte(struct + ktxAstcParams.VERBOSE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #threadCount(int) threadCount}. */
    public static void nthreadCount(long struct, int value) { memPutInt(struct + ktxAstcParams.THREADCOUNT, value); }
    /** Unsafe version of {@link #blockDimension(int) blockDimension}. */
    public static void nblockDimension(long struct, int value) { memPutInt(struct + ktxAstcParams.BLOCKDIMENSION, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + ktxAstcParams.MODE, value); }
    /** Unsafe version of {@link #qualityLevel(int) qualityLevel}. */
    public static void nqualityLevel(long struct, int value) { memPutInt(struct + ktxAstcParams.QUALITYLEVEL, value); }
    /** Unsafe version of {@link #normalMap(boolean) normalMap}. */
    public static void nnormalMap(long struct, boolean value) { memPutByte(struct + ktxAstcParams.NORMALMAP, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #perceptual(boolean) perceptual}. */
    public static void nperceptual(long struct, boolean value) { memPutByte(struct + ktxAstcParams.PERCEPTUAL, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #inputSwizzle(ByteBuffer) inputSwizzle}. */
    public static void ninputSwizzle(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ktxAstcParams.INPUTSWIZZLE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #inputSwizzle(int, byte) inputSwizzle}. */
    public static void ninputSwizzle(long struct, int index, byte value) {
        memPutByte(struct + ktxAstcParams.INPUTSWIZZLE + check(index, 4) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link ktxAstcParams} structs. */
    public static class Buffer extends StructBuffer<ktxAstcParams, Buffer> implements NativeResource {

        private static final ktxAstcParams ELEMENT_FACTORY = ktxAstcParams.create(-1L);

        /**
         * Creates a new {@code ktxAstcParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxAstcParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected ktxAstcParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code structSize} field. */
        @NativeType("ktx_uint32_t")
        public int structSize() { return ktxAstcParams.nstructSize(address()); }
        /** @return the value of the {@code verbose} field. */
        @NativeType("ktx_bool_t")
        public boolean verbose() { return ktxAstcParams.nverbose(address()); }
        /** @return the value of the {@code threadCount} field. */
        @NativeType("ktx_uint32_t")
        public int threadCount() { return ktxAstcParams.nthreadCount(address()); }
        /** @return the value of the {@code blockDimension} field. */
        @NativeType("ktx_uint32_t")
        public int blockDimension() { return ktxAstcParams.nblockDimension(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("ktx_uint32_t")
        public int mode() { return ktxAstcParams.nmode(address()); }
        /** @return the value of the {@code qualityLevel} field. */
        @NativeType("ktx_uint32_t")
        public int qualityLevel() { return ktxAstcParams.nqualityLevel(address()); }
        /** @return the value of the {@code normalMap} field. */
        @NativeType("ktx_bool_t")
        public boolean normalMap() { return ktxAstcParams.nnormalMap(address()); }
        /** @return the value of the {@code perceptual} field. */
        @NativeType("ktx_bool_t")
        public boolean perceptual() { return ktxAstcParams.nperceptual(address()); }
        /** @return a {@link ByteBuffer} view of the {@code inputSwizzle} field. */
        @NativeType("char[4]")
        public ByteBuffer inputSwizzle() { return ktxAstcParams.ninputSwizzle(address()); }
        /** @return the value at the specified index of the {@code inputSwizzle} field. */
        @NativeType("char")
        public byte inputSwizzle(int index) { return ktxAstcParams.ninputSwizzle(address(), index); }

        /** Sets the specified value to the {@code structSize} field. */
        public ktxAstcParams.Buffer structSize(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nstructSize(address(), value); return this; }
        /** Sets the specified value to the {@code verbose} field. */
        public ktxAstcParams.Buffer verbose(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nverbose(address(), value); return this; }
        /** Sets the specified value to the {@code threadCount} field. */
        public ktxAstcParams.Buffer threadCount(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nthreadCount(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimension} field. */
        public ktxAstcParams.Buffer blockDimension(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nblockDimension(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public ktxAstcParams.Buffer mode(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code qualityLevel} field. */
        public ktxAstcParams.Buffer qualityLevel(@NativeType("ktx_uint32_t") int value) { ktxAstcParams.nqualityLevel(address(), value); return this; }
        /** Sets the specified value to the {@code normalMap} field. */
        public ktxAstcParams.Buffer normalMap(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nnormalMap(address(), value); return this; }
        /** Sets the specified value to the {@code perceptual} field. */
        public ktxAstcParams.Buffer perceptual(@NativeType("ktx_bool_t") boolean value) { ktxAstcParams.nperceptual(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code inputSwizzle} field. */
        public ktxAstcParams.Buffer inputSwizzle(@NativeType("char[4]") ByteBuffer value) { ktxAstcParams.ninputSwizzle(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code inputSwizzle} field. */
        public ktxAstcParams.Buffer inputSwizzle(int index, @NativeType("char") byte value) { ktxAstcParams.ninputSwizzle(address(), index, value); return this; }

    }

}