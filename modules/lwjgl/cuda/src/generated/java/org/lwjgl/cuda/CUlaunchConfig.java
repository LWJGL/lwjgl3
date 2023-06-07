/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUlaunchConfig {
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     CUstream hStream;
 *     {@link CUlaunchAttribute CUlaunchAttribute} * attrs;
 *     unsigned int numAttrs;
 * }</code></pre>
 */
public class CUlaunchConfig extends Struct<CUlaunchConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        HSTREAM,
        ATTRS,
        NUMATTRS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GRIDDIMX = layout.offsetof(0);
        GRIDDIMY = layout.offsetof(1);
        GRIDDIMZ = layout.offsetof(2);
        BLOCKDIMX = layout.offsetof(3);
        BLOCKDIMY = layout.offsetof(4);
        BLOCKDIMZ = layout.offsetof(5);
        SHAREDMEMBYTES = layout.offsetof(6);
        HSTREAM = layout.offsetof(7);
        ATTRS = layout.offsetof(8);
        NUMATTRS = layout.offsetof(9);
    }

    protected CUlaunchConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUlaunchConfig create(long address, @Nullable ByteBuffer container) {
        return new CUlaunchConfig(address, container);
    }

    /**
     * Creates a {@code CUlaunchConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUlaunchConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code gridDimX} field. */
    @NativeType("unsigned int")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("unsigned int")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("unsigned int")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("unsigned int")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("unsigned int")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("unsigned int")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("unsigned int")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** @return the value of the {@code hStream} field. */
    @NativeType("CUstream")
    public long hStream() { return nhStream(address()); }
    /** @return a {@link CUlaunchAttribute.Buffer} view of the struct array pointed to by the {@code attrs} field. */
    @Nullable
    @NativeType("CUlaunchAttribute *")
    public CUlaunchAttribute.Buffer attrs() { return nattrs(address()); }
    /** @return the value of the {@code numAttrs} field. */
    @NativeType("unsigned int")
    public int numAttrs() { return nnumAttrs(address()); }

    /** Sets the specified value to the {@code gridDimX} field. */
    public CUlaunchConfig gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUlaunchConfig gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUlaunchConfig gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUlaunchConfig blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUlaunchConfig blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUlaunchConfig blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUlaunchConfig sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the specified value to the {@code hStream} field. */
    public CUlaunchConfig hStream(@NativeType("CUstream") long value) { nhStream(address(), value); return this; }
    /** Sets the address of the specified {@link CUlaunchAttribute.Buffer} to the {@code attrs} field. */
    public CUlaunchConfig attrs(@Nullable @NativeType("CUlaunchAttribute *") CUlaunchAttribute.Buffer value) { nattrs(address(), value); return this; }
    /** Sets the specified value to the {@code numAttrs} field. */
    public CUlaunchConfig numAttrs(@NativeType("unsigned int") int value) { nnumAttrs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUlaunchConfig set(
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        long hStream,
        @Nullable CUlaunchAttribute.Buffer attrs,
        int numAttrs
    ) {
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        hStream(hStream);
        attrs(attrs);
        numAttrs(numAttrs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUlaunchConfig set(CUlaunchConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUlaunchConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUlaunchConfig malloc() {
        return new CUlaunchConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUlaunchConfig calloc() {
        return new CUlaunchConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchConfig} instance allocated with {@link BufferUtils}. */
    public static CUlaunchConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUlaunchConfig(memAddress(container), container);
    }

    /** Returns a new {@code CUlaunchConfig} instance for the specified memory address. */
    public static CUlaunchConfig create(long address) {
        return new CUlaunchConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchConfig createSafe(long address) {
        return address == NULL ? null : new CUlaunchConfig(address, null);
    }

    /**
     * Returns a new {@link CUlaunchConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUlaunchConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUlaunchConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUlaunchConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchConfig malloc(MemoryStack stack) {
        return new CUlaunchConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUlaunchConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchConfig calloc(MemoryStack stack) {
        return new CUlaunchConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUlaunchConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #hStream}. */
    public static long nhStream(long struct) { return memGetAddress(struct + CUlaunchConfig.HSTREAM); }
    /** Unsafe version of {@link #attrs}. */
    @Nullable public static CUlaunchAttribute.Buffer nattrs(long struct) { return CUlaunchAttribute.createSafe(memGetAddress(struct + CUlaunchConfig.ATTRS), nnumAttrs(struct)); }
    /** Unsafe version of {@link #numAttrs}. */
    public static int nnumAttrs(long struct) { return UNSAFE.getInt(null, struct + CUlaunchConfig.NUMATTRS); }

    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #hStream(long) hStream}. */
    public static void nhStream(long struct, long value) { memPutAddress(struct + CUlaunchConfig.HSTREAM, value); }
    /** Unsafe version of {@link #attrs(CUlaunchAttribute.Buffer) attrs}. */
    public static void nattrs(long struct, @Nullable CUlaunchAttribute.Buffer value) { memPutAddress(struct + CUlaunchConfig.ATTRS, memAddressSafe(value)); nnumAttrs(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code numAttrs} field of the specified {@code struct}. */
    public static void nnumAttrs(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchConfig.NUMATTRS, value); }

    // -----------------------------------

    /** An array of {@link CUlaunchConfig} structs. */
    public static class Buffer extends StructBuffer<CUlaunchConfig, Buffer> implements NativeResource {

        private static final CUlaunchConfig ELEMENT_FACTORY = CUlaunchConfig.create(-1L);

        /**
         * Creates a new {@code CUlaunchConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUlaunchConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUlaunchConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUlaunchConfig.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUlaunchConfig.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUlaunchConfig.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUlaunchConfig.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUlaunchConfig.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUlaunchConfig.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUlaunchConfig.nsharedMemBytes(address()); }
        /** @return the value of the {@code hStream} field. */
        @NativeType("CUstream")
        public long hStream() { return CUlaunchConfig.nhStream(address()); }
        /** @return a {@link CUlaunchAttribute.Buffer} view of the struct array pointed to by the {@code attrs} field. */
        @Nullable
        @NativeType("CUlaunchAttribute *")
        public CUlaunchAttribute.Buffer attrs() { return CUlaunchConfig.nattrs(address()); }
        /** @return the value of the {@code numAttrs} field. */
        @NativeType("unsigned int")
        public int numAttrs() { return CUlaunchConfig.nnumAttrs(address()); }

        /** Sets the specified value to the {@code gridDimX} field. */
        public CUlaunchConfig.Buffer gridDimX(@NativeType("unsigned int") int value) { CUlaunchConfig.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUlaunchConfig.Buffer gridDimY(@NativeType("unsigned int") int value) { CUlaunchConfig.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUlaunchConfig.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUlaunchConfig.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUlaunchConfig.Buffer blockDimX(@NativeType("unsigned int") int value) { CUlaunchConfig.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUlaunchConfig.Buffer blockDimY(@NativeType("unsigned int") int value) { CUlaunchConfig.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUlaunchConfig.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUlaunchConfig.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUlaunchConfig.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUlaunchConfig.nsharedMemBytes(address(), value); return this; }
        /** Sets the specified value to the {@code hStream} field. */
        public CUlaunchConfig.Buffer hStream(@NativeType("CUstream") long value) { CUlaunchConfig.nhStream(address(), value); return this; }
        /** Sets the address of the specified {@link CUlaunchAttribute.Buffer} to the {@code attrs} field. */
        public CUlaunchConfig.Buffer attrs(@Nullable @NativeType("CUlaunchAttribute *") CUlaunchAttribute.Buffer value) { CUlaunchConfig.nattrs(address(), value); return this; }
        /** Sets the specified value to the {@code numAttrs} field. */
        public CUlaunchConfig.Buffer numAttrs(@NativeType("unsigned int") int value) { CUlaunchConfig.nnumAttrs(address(), value); return this; }

    }

}