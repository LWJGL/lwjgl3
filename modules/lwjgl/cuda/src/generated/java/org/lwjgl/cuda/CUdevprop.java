/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

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
 * struct CUdevprop {
 *     int maxThreadsPerBlock;
 *     int maxThreadsDim[3];
 *     int maxGridSize[3];
 *     int sharedMemPerBlock;
 *     int totalConstantMemory;
 *     int SIMDWidth;
 *     int memPitch;
 *     int regsPerBlock;
 *     int clockRate;
 *     int textureAlign;
 * }</code></pre>
 */
public class CUdevprop extends Struct<CUdevprop> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXTHREADSPERBLOCK,
        MAXTHREADSDIM,
        MAXGRIDSIZE,
        SHAREDMEMPERBLOCK,
        TOTALCONSTANTMEMORY,
        SIMDWIDTH,
        MEMPITCH,
        REGSPERBLOCK,
        CLOCKRATE,
        TEXTUREALIGN;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXTHREADSPERBLOCK = layout.offsetof(0);
        MAXTHREADSDIM = layout.offsetof(1);
        MAXGRIDSIZE = layout.offsetof(2);
        SHAREDMEMPERBLOCK = layout.offsetof(3);
        TOTALCONSTANTMEMORY = layout.offsetof(4);
        SIMDWIDTH = layout.offsetof(5);
        MEMPITCH = layout.offsetof(6);
        REGSPERBLOCK = layout.offsetof(7);
        CLOCKRATE = layout.offsetof(8);
        TEXTUREALIGN = layout.offsetof(9);
    }

    protected CUdevprop(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUdevprop create(long address, @Nullable ByteBuffer container) {
        return new CUdevprop(address, container);
    }

    /**
     * Creates a {@code CUdevprop} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUdevprop(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code maxThreadsPerBlock} field. */
    public int maxThreadsPerBlock() { return nmaxThreadsPerBlock(address()); }
    /** @return a {@link IntBuffer} view of the {@code maxThreadsDim} field. */
    @NativeType("int[3]")
    public IntBuffer maxThreadsDim() { return nmaxThreadsDim(address()); }
    /** @return the value at the specified index of the {@code maxThreadsDim} field. */
    public int maxThreadsDim(int index) { return nmaxThreadsDim(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code maxGridSize} field. */
    @NativeType("int[3]")
    public IntBuffer maxGridSize() { return nmaxGridSize(address()); }
    /** @return the value at the specified index of the {@code maxGridSize} field. */
    public int maxGridSize(int index) { return nmaxGridSize(address(), index); }
    /** @return the value of the {@code sharedMemPerBlock} field. */
    public int sharedMemPerBlock() { return nsharedMemPerBlock(address()); }
    /** @return the value of the {@code totalConstantMemory} field. */
    public int totalConstantMemory() { return ntotalConstantMemory(address()); }
    /** @return the value of the {@code SIMDWidth} field. */
    public int SIMDWidth() { return nSIMDWidth(address()); }
    /** @return the value of the {@code memPitch} field. */
    public int memPitch() { return nmemPitch(address()); }
    /** @return the value of the {@code regsPerBlock} field. */
    public int regsPerBlock() { return nregsPerBlock(address()); }
    /** @return the value of the {@code clockRate} field. */
    public int clockRate() { return nclockRate(address()); }
    /** @return the value of the {@code textureAlign} field. */
    public int textureAlign() { return ntextureAlign(address()); }

    /** Sets the specified value to the {@code maxThreadsPerBlock} field. */
    public CUdevprop maxThreadsPerBlock(int value) { nmaxThreadsPerBlock(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code maxThreadsDim} field. */
    public CUdevprop maxThreadsDim(@NativeType("int[3]") IntBuffer value) { nmaxThreadsDim(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code maxThreadsDim} field. */
    public CUdevprop maxThreadsDim(int index, int value) { nmaxThreadsDim(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code maxGridSize} field. */
    public CUdevprop maxGridSize(@NativeType("int[3]") IntBuffer value) { nmaxGridSize(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code maxGridSize} field. */
    public CUdevprop maxGridSize(int index, int value) { nmaxGridSize(address(), index, value); return this; }
    /** Sets the specified value to the {@code sharedMemPerBlock} field. */
    public CUdevprop sharedMemPerBlock(int value) { nsharedMemPerBlock(address(), value); return this; }
    /** Sets the specified value to the {@code totalConstantMemory} field. */
    public CUdevprop totalConstantMemory(int value) { ntotalConstantMemory(address(), value); return this; }
    /** Sets the specified value to the {@code SIMDWidth} field. */
    public CUdevprop SIMDWidth(int value) { nSIMDWidth(address(), value); return this; }
    /** Sets the specified value to the {@code memPitch} field. */
    public CUdevprop memPitch(int value) { nmemPitch(address(), value); return this; }
    /** Sets the specified value to the {@code regsPerBlock} field. */
    public CUdevprop regsPerBlock(int value) { nregsPerBlock(address(), value); return this; }
    /** Sets the specified value to the {@code clockRate} field. */
    public CUdevprop clockRate(int value) { nclockRate(address(), value); return this; }
    /** Sets the specified value to the {@code textureAlign} field. */
    public CUdevprop textureAlign(int value) { ntextureAlign(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUdevprop set(
        int maxThreadsPerBlock,
        IntBuffer maxThreadsDim,
        IntBuffer maxGridSize,
        int sharedMemPerBlock,
        int totalConstantMemory,
        int SIMDWidth,
        int memPitch,
        int regsPerBlock,
        int clockRate,
        int textureAlign
    ) {
        maxThreadsPerBlock(maxThreadsPerBlock);
        maxThreadsDim(maxThreadsDim);
        maxGridSize(maxGridSize);
        sharedMemPerBlock(sharedMemPerBlock);
        totalConstantMemory(totalConstantMemory);
        SIMDWidth(SIMDWidth);
        memPitch(memPitch);
        regsPerBlock(regsPerBlock);
        clockRate(clockRate);
        textureAlign(textureAlign);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUdevprop set(CUdevprop src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUdevprop} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUdevprop malloc() {
        return new CUdevprop(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUdevprop} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUdevprop calloc() {
        return new CUdevprop(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUdevprop} instance allocated with {@link BufferUtils}. */
    public static CUdevprop create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUdevprop(memAddress(container), container);
    }

    /** Returns a new {@code CUdevprop} instance for the specified memory address. */
    public static CUdevprop create(long address) {
        return new CUdevprop(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUdevprop createSafe(long address) {
        return address == NULL ? null : new CUdevprop(address, null);
    }

    /**
     * Returns a new {@link CUdevprop.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUdevprop.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUdevprop.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUdevprop.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUdevprop.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUdevprop mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUdevprop callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUdevprop mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUdevprop callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUdevprop.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUdevprop.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUdevprop.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUdevprop.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUdevprop} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUdevprop malloc(MemoryStack stack) {
        return new CUdevprop(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUdevprop} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUdevprop calloc(MemoryStack stack) {
        return new CUdevprop(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUdevprop.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUdevprop.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUdevprop.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxThreadsPerBlock}. */
    public static int nmaxThreadsPerBlock(long struct) { return memGetInt(struct + CUdevprop.MAXTHREADSPERBLOCK); }
    /** Unsafe version of {@link #maxThreadsDim}. */
    public static IntBuffer nmaxThreadsDim(long struct) { return memIntBuffer(struct + CUdevprop.MAXTHREADSDIM, 3); }
    /** Unsafe version of {@link #maxThreadsDim(int) maxThreadsDim}. */
    public static int nmaxThreadsDim(long struct, int index) {
        return memGetInt(struct + CUdevprop.MAXTHREADSDIM + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxGridSize}. */
    public static IntBuffer nmaxGridSize(long struct) { return memIntBuffer(struct + CUdevprop.MAXGRIDSIZE, 3); }
    /** Unsafe version of {@link #maxGridSize(int) maxGridSize}. */
    public static int nmaxGridSize(long struct, int index) {
        return memGetInt(struct + CUdevprop.MAXGRIDSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #sharedMemPerBlock}. */
    public static int nsharedMemPerBlock(long struct) { return memGetInt(struct + CUdevprop.SHAREDMEMPERBLOCK); }
    /** Unsafe version of {@link #totalConstantMemory}. */
    public static int ntotalConstantMemory(long struct) { return memGetInt(struct + CUdevprop.TOTALCONSTANTMEMORY); }
    /** Unsafe version of {@link #SIMDWidth}. */
    public static int nSIMDWidth(long struct) { return memGetInt(struct + CUdevprop.SIMDWIDTH); }
    /** Unsafe version of {@link #memPitch}. */
    public static int nmemPitch(long struct) { return memGetInt(struct + CUdevprop.MEMPITCH); }
    /** Unsafe version of {@link #regsPerBlock}. */
    public static int nregsPerBlock(long struct) { return memGetInt(struct + CUdevprop.REGSPERBLOCK); }
    /** Unsafe version of {@link #clockRate}. */
    public static int nclockRate(long struct) { return memGetInt(struct + CUdevprop.CLOCKRATE); }
    /** Unsafe version of {@link #textureAlign}. */
    public static int ntextureAlign(long struct) { return memGetInt(struct + CUdevprop.TEXTUREALIGN); }

    /** Unsafe version of {@link #maxThreadsPerBlock(int) maxThreadsPerBlock}. */
    public static void nmaxThreadsPerBlock(long struct, int value) { memPutInt(struct + CUdevprop.MAXTHREADSPERBLOCK, value); }
    /** Unsafe version of {@link #maxThreadsDim(IntBuffer) maxThreadsDim}. */
    public static void nmaxThreadsDim(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + CUdevprop.MAXTHREADSDIM, value.remaining() * 4);
    }
    /** Unsafe version of {@link #maxThreadsDim(int, int) maxThreadsDim}. */
    public static void nmaxThreadsDim(long struct, int index, int value) {
        memPutInt(struct + CUdevprop.MAXTHREADSDIM + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #maxGridSize(IntBuffer) maxGridSize}. */
    public static void nmaxGridSize(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + CUdevprop.MAXGRIDSIZE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #maxGridSize(int, int) maxGridSize}. */
    public static void nmaxGridSize(long struct, int index, int value) {
        memPutInt(struct + CUdevprop.MAXGRIDSIZE + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #sharedMemPerBlock(int) sharedMemPerBlock}. */
    public static void nsharedMemPerBlock(long struct, int value) { memPutInt(struct + CUdevprop.SHAREDMEMPERBLOCK, value); }
    /** Unsafe version of {@link #totalConstantMemory(int) totalConstantMemory}. */
    public static void ntotalConstantMemory(long struct, int value) { memPutInt(struct + CUdevprop.TOTALCONSTANTMEMORY, value); }
    /** Unsafe version of {@link #SIMDWidth(int) SIMDWidth}. */
    public static void nSIMDWidth(long struct, int value) { memPutInt(struct + CUdevprop.SIMDWIDTH, value); }
    /** Unsafe version of {@link #memPitch(int) memPitch}. */
    public static void nmemPitch(long struct, int value) { memPutInt(struct + CUdevprop.MEMPITCH, value); }
    /** Unsafe version of {@link #regsPerBlock(int) regsPerBlock}. */
    public static void nregsPerBlock(long struct, int value) { memPutInt(struct + CUdevprop.REGSPERBLOCK, value); }
    /** Unsafe version of {@link #clockRate(int) clockRate}. */
    public static void nclockRate(long struct, int value) { memPutInt(struct + CUdevprop.CLOCKRATE, value); }
    /** Unsafe version of {@link #textureAlign(int) textureAlign}. */
    public static void ntextureAlign(long struct, int value) { memPutInt(struct + CUdevprop.TEXTUREALIGN, value); }

    // -----------------------------------

    /** An array of {@link CUdevprop} structs. */
    public static class Buffer extends StructBuffer<CUdevprop, Buffer> implements NativeResource {

        private static final CUdevprop ELEMENT_FACTORY = CUdevprop.create(-1L);

        /**
         * Creates a new {@code CUdevprop.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUdevprop#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUdevprop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code maxThreadsPerBlock} field. */
        public int maxThreadsPerBlock() { return CUdevprop.nmaxThreadsPerBlock(address()); }
        /** @return a {@link IntBuffer} view of the {@code maxThreadsDim} field. */
        @NativeType("int[3]")
        public IntBuffer maxThreadsDim() { return CUdevprop.nmaxThreadsDim(address()); }
        /** @return the value at the specified index of the {@code maxThreadsDim} field. */
        public int maxThreadsDim(int index) { return CUdevprop.nmaxThreadsDim(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code maxGridSize} field. */
        @NativeType("int[3]")
        public IntBuffer maxGridSize() { return CUdevprop.nmaxGridSize(address()); }
        /** @return the value at the specified index of the {@code maxGridSize} field. */
        public int maxGridSize(int index) { return CUdevprop.nmaxGridSize(address(), index); }
        /** @return the value of the {@code sharedMemPerBlock} field. */
        public int sharedMemPerBlock() { return CUdevprop.nsharedMemPerBlock(address()); }
        /** @return the value of the {@code totalConstantMemory} field. */
        public int totalConstantMemory() { return CUdevprop.ntotalConstantMemory(address()); }
        /** @return the value of the {@code SIMDWidth} field. */
        public int SIMDWidth() { return CUdevprop.nSIMDWidth(address()); }
        /** @return the value of the {@code memPitch} field. */
        public int memPitch() { return CUdevprop.nmemPitch(address()); }
        /** @return the value of the {@code regsPerBlock} field. */
        public int regsPerBlock() { return CUdevprop.nregsPerBlock(address()); }
        /** @return the value of the {@code clockRate} field. */
        public int clockRate() { return CUdevprop.nclockRate(address()); }
        /** @return the value of the {@code textureAlign} field. */
        public int textureAlign() { return CUdevprop.ntextureAlign(address()); }

        /** Sets the specified value to the {@code maxThreadsPerBlock} field. */
        public CUdevprop.Buffer maxThreadsPerBlock(int value) { CUdevprop.nmaxThreadsPerBlock(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code maxThreadsDim} field. */
        public CUdevprop.Buffer maxThreadsDim(@NativeType("int[3]") IntBuffer value) { CUdevprop.nmaxThreadsDim(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code maxThreadsDim} field. */
        public CUdevprop.Buffer maxThreadsDim(int index, int value) { CUdevprop.nmaxThreadsDim(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code maxGridSize} field. */
        public CUdevprop.Buffer maxGridSize(@NativeType("int[3]") IntBuffer value) { CUdevprop.nmaxGridSize(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code maxGridSize} field. */
        public CUdevprop.Buffer maxGridSize(int index, int value) { CUdevprop.nmaxGridSize(address(), index, value); return this; }
        /** Sets the specified value to the {@code sharedMemPerBlock} field. */
        public CUdevprop.Buffer sharedMemPerBlock(int value) { CUdevprop.nsharedMemPerBlock(address(), value); return this; }
        /** Sets the specified value to the {@code totalConstantMemory} field. */
        public CUdevprop.Buffer totalConstantMemory(int value) { CUdevprop.ntotalConstantMemory(address(), value); return this; }
        /** Sets the specified value to the {@code SIMDWidth} field. */
        public CUdevprop.Buffer SIMDWidth(int value) { CUdevprop.nSIMDWidth(address(), value); return this; }
        /** Sets the specified value to the {@code memPitch} field. */
        public CUdevprop.Buffer memPitch(int value) { CUdevprop.nmemPitch(address(), value); return this; }
        /** Sets the specified value to the {@code regsPerBlock} field. */
        public CUdevprop.Buffer regsPerBlock(int value) { CUdevprop.nregsPerBlock(address(), value); return this; }
        /** Sets the specified value to the {@code clockRate} field. */
        public CUdevprop.Buffer clockRate(int value) { CUdevprop.nclockRate(address(), value); return this; }
        /** Sets the specified value to the {@code textureAlign} field. */
        public CUdevprop.Buffer textureAlign(int value) { CUdevprop.ntextureAlign(address(), value); return this; }

    }

}