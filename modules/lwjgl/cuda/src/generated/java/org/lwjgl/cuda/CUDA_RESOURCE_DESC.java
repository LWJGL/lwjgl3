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
 * struct CUDA_RESOURCE_DESC {
 *     CUresourcetype resType;
 *     union {
 *         struct {
 *             CUarray hArray;
 *         } array;
 *         struct {
 *             CUmipmappedArray hMipmappedArray;
 *         } mipmap;
 *         struct {
 *             CUdeviceptr devPtr;
 *             CUarray_format format;
 *             unsigned int numChannels;
 *             size_t sizeInBytes;
 *         } linear;
 *         struct {
 *             CUdeviceptr devPtr;
 *             CUarray_format format;
 *             unsigned int numChannels;
 *             size_t width;
 *             size_t height;
 *             size_t pitchInBytes;
 *         } pitch2D;
 *         struct {
 *             int reserved[32];
 *         } reserved;
 *     } res;
 *     unsigned int flags;
 * }</code></pre>
 */
public class CUDA_RESOURCE_DESC extends Struct<CUDA_RESOURCE_DESC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESTYPE,
        RES,
            RES_ARRAY,
                RES_ARRAY_HARRAY,
            RES_MIPMAP,
                RES_MIPMAP_HMIPMAPPEDARRAY,
            RES_LINEAR,
                RES_LINEAR_DEVPTR,
                RES_LINEAR_FORMAT,
                RES_LINEAR_NUMCHANNELS,
                RES_LINEAR_SIZEINBYTES,
            RES_PITCH2D,
                RES_PITCH2D_DEVPTR,
                RES_PITCH2D_FORMAT,
                RES_PITCH2D_NUMCHANNELS,
                RES_PITCH2D_WIDTH,
                RES_PITCH2D_HEIGHT,
                RES_PITCH2D_PITCHINBYTES,
            RES_RESERVED,
                RES_RESERVED_RESERVED,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __struct(
                    __member(POINTER_SIZE)
                ),
                __struct(
                    __member(POINTER_SIZE)
                ),
                __struct(
                    __member(POINTER_SIZE),
                    __member(4),
                    __member(4),
                    __member(POINTER_SIZE)
                ),
                __struct(
                    __member(POINTER_SIZE),
                    __member(4),
                    __member(4),
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE)
                ),
                __struct(
                    __array(4, 32)
                )
            ),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESTYPE = layout.offsetof(0);
        RES = layout.offsetof(1);
            RES_ARRAY = layout.offsetof(2);
                RES_ARRAY_HARRAY = layout.offsetof(3);
            RES_MIPMAP = layout.offsetof(4);
                RES_MIPMAP_HMIPMAPPEDARRAY = layout.offsetof(5);
            RES_LINEAR = layout.offsetof(6);
                RES_LINEAR_DEVPTR = layout.offsetof(7);
                RES_LINEAR_FORMAT = layout.offsetof(8);
                RES_LINEAR_NUMCHANNELS = layout.offsetof(9);
                RES_LINEAR_SIZEINBYTES = layout.offsetof(10);
            RES_PITCH2D = layout.offsetof(11);
                RES_PITCH2D_DEVPTR = layout.offsetof(12);
                RES_PITCH2D_FORMAT = layout.offsetof(13);
                RES_PITCH2D_NUMCHANNELS = layout.offsetof(14);
                RES_PITCH2D_WIDTH = layout.offsetof(15);
                RES_PITCH2D_HEIGHT = layout.offsetof(16);
                RES_PITCH2D_PITCHINBYTES = layout.offsetof(17);
            RES_RESERVED = layout.offsetof(18);
                RES_RESERVED_RESERVED = layout.offsetof(19);
        FLAGS = layout.offsetof(20);
    }

    protected CUDA_RESOURCE_DESC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_RESOURCE_DESC create(long address, @Nullable ByteBuffer container) {
        return new CUDA_RESOURCE_DESC(address, container);
    }

    /**
     * Creates a {@code CUDA_RESOURCE_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_RESOURCE_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code resType} field. */
    @NativeType("CUresourcetype")
    public int resType() { return nresType(address()); }
    /** @return the value of the {@code res.array.hArray} field. */
    @NativeType("CUarray")
    public long res_array_hArray() { return nres_array_hArray(address()); }
    /** @return the value of the {@code res.mipmap.hMipmappedArray} field. */
    @NativeType("CUmipmappedArray")
    public long res_mipmap_hMipmappedArray() { return nres_mipmap_hMipmappedArray(address()); }
    /** @return the value of the {@code res.linear.devPtr} field. */
    @NativeType("CUdeviceptr")
    public long res_linear_devPtr() { return nres_linear_devPtr(address()); }
    /** @return the value of the {@code res.linear.format} field. */
    @NativeType("CUarray_format")
    public int res_linear_format() { return nres_linear_format(address()); }
    /** @return the value of the {@code res.linear.numChannels} field. */
    @NativeType("unsigned int")
    public int res_linear_numChannels() { return nres_linear_numChannels(address()); }
    /** @return the value of the {@code res.linear.sizeInBytes} field. */
    @NativeType("size_t")
    public long res_linear_sizeInBytes() { return nres_linear_sizeInBytes(address()); }
    /** @return the value of the {@code res.pitch2D.devPtr} field. */
    @NativeType("CUdeviceptr")
    public long res_pitch2D_devPtr() { return nres_pitch2D_devPtr(address()); }
    /** @return the value of the {@code res.pitch2D.format} field. */
    @NativeType("CUarray_format")
    public int res_pitch2D_format() { return nres_pitch2D_format(address()); }
    /** @return the value of the {@code res.pitch2D.numChannels} field. */
    @NativeType("unsigned int")
    public int res_pitch2D_numChannels() { return nres_pitch2D_numChannels(address()); }
    /** @return the value of the {@code res.pitch2D.width} field. */
    @NativeType("size_t")
    public long res_pitch2D_width() { return nres_pitch2D_width(address()); }
    /** @return the value of the {@code res.pitch2D.height} field. */
    @NativeType("size_t")
    public long res_pitch2D_height() { return nres_pitch2D_height(address()); }
    /** @return the value of the {@code res.pitch2D.pitchInBytes} field. */
    @NativeType("size_t")
    public long res_pitch2D_pitchInBytes() { return nres_pitch2D_pitchInBytes(address()); }
    /** @return a {@link IntBuffer} view of the {@code res.reserved.reserved} field. */
    @NativeType("int[32]")
    public IntBuffer res_reserved_reserved() { return nres_reserved_reserved(address()); }
    /** @return the value at the specified index of the {@code res.reserved.reserved} field. */
    public int res_reserved_reserved(int index) { return nres_reserved_reserved(address(), index); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code resType} field. */
    public CUDA_RESOURCE_DESC resType(@NativeType("CUresourcetype") int value) { nresType(address(), value); return this; }
    /** Sets the specified value to the {@code hArray} field. */
    public CUDA_RESOURCE_DESC res_array_hArray(@NativeType("CUarray") long value) { nres_array_hArray(address(), value); return this; }
    /** Sets the specified value to the {@code hMipmappedArray} field. */
    public CUDA_RESOURCE_DESC res_mipmap_hMipmappedArray(@NativeType("CUmipmappedArray") long value) { nres_mipmap_hMipmappedArray(address(), value); return this; }
    /** Sets the specified value to the {@code devPtr} field. */
    public CUDA_RESOURCE_DESC res_linear_devPtr(@NativeType("CUdeviceptr") long value) { nres_linear_devPtr(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public CUDA_RESOURCE_DESC res_linear_format(@NativeType("CUarray_format") int value) { nres_linear_format(address(), value); return this; }
    /** Sets the specified value to the {@code numChannels} field. */
    public CUDA_RESOURCE_DESC res_linear_numChannels(@NativeType("unsigned int") int value) { nres_linear_numChannels(address(), value); return this; }
    /** Sets the specified value to the {@code sizeInBytes} field. */
    public CUDA_RESOURCE_DESC res_linear_sizeInBytes(@NativeType("size_t") long value) { nres_linear_sizeInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code devPtr} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_devPtr(@NativeType("CUdeviceptr") long value) { nres_pitch2D_devPtr(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_format(@NativeType("CUarray_format") int value) { nres_pitch2D_format(address(), value); return this; }
    /** Sets the specified value to the {@code numChannels} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_numChannels(@NativeType("unsigned int") int value) { nres_pitch2D_numChannels(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_width(@NativeType("size_t") long value) { nres_pitch2D_width(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_height(@NativeType("size_t") long value) { nres_pitch2D_height(address(), value); return this; }
    /** Sets the specified value to the {@code pitchInBytes} field. */
    public CUDA_RESOURCE_DESC res_pitch2D_pitchInBytes(@NativeType("size_t") long value) { nres_pitch2D_pitchInBytes(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_RESOURCE_DESC res_reserved_reserved(@NativeType("int[32]") IntBuffer value) { nres_reserved_reserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_RESOURCE_DESC res_reserved_reserved(int index, int value) { nres_reserved_reserved(address(), index, value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUDA_RESOURCE_DESC flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_RESOURCE_DESC set(CUDA_RESOURCE_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_RESOURCE_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_RESOURCE_DESC malloc() {
        return new CUDA_RESOURCE_DESC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_RESOURCE_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_RESOURCE_DESC calloc() {
        return new CUDA_RESOURCE_DESC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_RESOURCE_DESC} instance allocated with {@link BufferUtils}. */
    public static CUDA_RESOURCE_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_RESOURCE_DESC(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_RESOURCE_DESC} instance for the specified memory address. */
    public static CUDA_RESOURCE_DESC create(long address) {
        return new CUDA_RESOURCE_DESC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_RESOURCE_DESC createSafe(long address) {
        return address == NULL ? null : new CUDA_RESOURCE_DESC(address, null);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_RESOURCE_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_RESOURCE_DESC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_RESOURCE_DESC.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_RESOURCE_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_RESOURCE_DESC malloc(MemoryStack stack) {
        return new CUDA_RESOURCE_DESC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_RESOURCE_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_RESOURCE_DESC calloc(MemoryStack stack) {
        return new CUDA_RESOURCE_DESC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_RESOURCE_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_RESOURCE_DESC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resType}. */
    public static int nresType(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.RESTYPE); }
    /** Unsafe version of {@link #res_array_hArray}. */
    public static long nres_array_hArray(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_ARRAY_HARRAY); }
    /** Unsafe version of {@link #res_mipmap_hMipmappedArray}. */
    public static long nres_mipmap_hMipmappedArray(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_MIPMAP_HMIPMAPPEDARRAY); }
    /** Unsafe version of {@link #res_linear_devPtr}. */
    public static long nres_linear_devPtr(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_LINEAR_DEVPTR); }
    /** Unsafe version of {@link #res_linear_format}. */
    public static int nres_linear_format(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.RES_LINEAR_FORMAT); }
    /** Unsafe version of {@link #res_linear_numChannels}. */
    public static int nres_linear_numChannels(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.RES_LINEAR_NUMCHANNELS); }
    /** Unsafe version of {@link #res_linear_sizeInBytes}. */
    public static long nres_linear_sizeInBytes(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_LINEAR_SIZEINBYTES); }
    /** Unsafe version of {@link #res_pitch2D_devPtr}. */
    public static long nres_pitch2D_devPtr(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_DEVPTR); }
    /** Unsafe version of {@link #res_pitch2D_format}. */
    public static int nres_pitch2D_format(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_FORMAT); }
    /** Unsafe version of {@link #res_pitch2D_numChannels}. */
    public static int nres_pitch2D_numChannels(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_NUMCHANNELS); }
    /** Unsafe version of {@link #res_pitch2D_width}. */
    public static long nres_pitch2D_width(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_WIDTH); }
    /** Unsafe version of {@link #res_pitch2D_height}. */
    public static long nres_pitch2D_height(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_HEIGHT); }
    /** Unsafe version of {@link #res_pitch2D_pitchInBytes}. */
    public static long nres_pitch2D_pitchInBytes(long struct) { return memGetAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_PITCHINBYTES); }
    /** Unsafe version of {@link #res_reserved_reserved}. */
    public static IntBuffer nres_reserved_reserved(long struct) { return memIntBuffer(struct + CUDA_RESOURCE_DESC.RES_RESERVED_RESERVED, 32); }
    /** Unsafe version of {@link #res_reserved_reserved(int) res_reserved_reserved}. */
    public static int nres_reserved_reserved(long struct, int index) {
        return memGetInt(struct + CUDA_RESOURCE_DESC.RES_RESERVED_RESERVED + check(index, 32) * 4);
    }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + CUDA_RESOURCE_DESC.FLAGS); }

    /** Unsafe version of {@link #resType(int) resType}. */
    public static void nresType(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.RESTYPE, value); }
    /** Unsafe version of {@link #res_array_hArray(long) res_array_hArray}. */
    public static void nres_array_hArray(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_ARRAY_HARRAY, value); }
    /** Unsafe version of {@link #res_mipmap_hMipmappedArray(long) res_mipmap_hMipmappedArray}. */
    public static void nres_mipmap_hMipmappedArray(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_MIPMAP_HMIPMAPPEDARRAY, value); }
    /** Unsafe version of {@link #res_linear_devPtr(long) res_linear_devPtr}. */
    public static void nres_linear_devPtr(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_LINEAR_DEVPTR, value); }
    /** Unsafe version of {@link #res_linear_format(int) res_linear_format}. */
    public static void nres_linear_format(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.RES_LINEAR_FORMAT, value); }
    /** Unsafe version of {@link #res_linear_numChannels(int) res_linear_numChannels}. */
    public static void nres_linear_numChannels(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.RES_LINEAR_NUMCHANNELS, value); }
    /** Unsafe version of {@link #res_linear_sizeInBytes(long) res_linear_sizeInBytes}. */
    public static void nres_linear_sizeInBytes(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_LINEAR_SIZEINBYTES, value); }
    /** Unsafe version of {@link #res_pitch2D_devPtr(long) res_pitch2D_devPtr}. */
    public static void nres_pitch2D_devPtr(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_DEVPTR, value); }
    /** Unsafe version of {@link #res_pitch2D_format(int) res_pitch2D_format}. */
    public static void nres_pitch2D_format(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_FORMAT, value); }
    /** Unsafe version of {@link #res_pitch2D_numChannels(int) res_pitch2D_numChannels}. */
    public static void nres_pitch2D_numChannels(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_NUMCHANNELS, value); }
    /** Unsafe version of {@link #res_pitch2D_width(long) res_pitch2D_width}. */
    public static void nres_pitch2D_width(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_WIDTH, value); }
    /** Unsafe version of {@link #res_pitch2D_height(long) res_pitch2D_height}. */
    public static void nres_pitch2D_height(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_HEIGHT, value); }
    /** Unsafe version of {@link #res_pitch2D_pitchInBytes(long) res_pitch2D_pitchInBytes}. */
    public static void nres_pitch2D_pitchInBytes(long struct, long value) { memPutAddress(struct + CUDA_RESOURCE_DESC.RES_PITCH2D_PITCHINBYTES, value); }
    /** Unsafe version of {@link #res_reserved_reserved(IntBuffer) res_reserved_reserved}. */
    public static void nres_reserved_reserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + CUDA_RESOURCE_DESC.RES_RESERVED_RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #res_reserved_reserved(int, int) res_reserved_reserved}. */
    public static void nres_reserved_reserved(long struct, int index, int value) {
        memPutInt(struct + CUDA_RESOURCE_DESC.RES_RESERVED_RESERVED + check(index, 32) * 4, value);
    }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + CUDA_RESOURCE_DESC.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link CUDA_RESOURCE_DESC} structs. */
    public static class Buffer extends StructBuffer<CUDA_RESOURCE_DESC, Buffer> implements NativeResource {

        private static final CUDA_RESOURCE_DESC ELEMENT_FACTORY = CUDA_RESOURCE_DESC.create(-1L);

        /**
         * Creates a new {@code CUDA_RESOURCE_DESC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_RESOURCE_DESC#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_RESOURCE_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code resType} field. */
        @NativeType("CUresourcetype")
        public int resType() { return CUDA_RESOURCE_DESC.nresType(address()); }
        /** @return the value of the {@code res.array.hArray} field. */
        @NativeType("CUarray")
        public long res_array_hArray() { return CUDA_RESOURCE_DESC.nres_array_hArray(address()); }
        /** @return the value of the {@code res.mipmap.hMipmappedArray} field. */
        @NativeType("CUmipmappedArray")
        public long res_mipmap_hMipmappedArray() { return CUDA_RESOURCE_DESC.nres_mipmap_hMipmappedArray(address()); }
        /** @return the value of the {@code res.linear.devPtr} field. */
        @NativeType("CUdeviceptr")
        public long res_linear_devPtr() { return CUDA_RESOURCE_DESC.nres_linear_devPtr(address()); }
        /** @return the value of the {@code res.linear.format} field. */
        @NativeType("CUarray_format")
        public int res_linear_format() { return CUDA_RESOURCE_DESC.nres_linear_format(address()); }
        /** @return the value of the {@code res.linear.numChannels} field. */
        @NativeType("unsigned int")
        public int res_linear_numChannels() { return CUDA_RESOURCE_DESC.nres_linear_numChannels(address()); }
        /** @return the value of the {@code res.linear.sizeInBytes} field. */
        @NativeType("size_t")
        public long res_linear_sizeInBytes() { return CUDA_RESOURCE_DESC.nres_linear_sizeInBytes(address()); }
        /** @return the value of the {@code res.pitch2D.devPtr} field. */
        @NativeType("CUdeviceptr")
        public long res_pitch2D_devPtr() { return CUDA_RESOURCE_DESC.nres_pitch2D_devPtr(address()); }
        /** @return the value of the {@code res.pitch2D.format} field. */
        @NativeType("CUarray_format")
        public int res_pitch2D_format() { return CUDA_RESOURCE_DESC.nres_pitch2D_format(address()); }
        /** @return the value of the {@code res.pitch2D.numChannels} field. */
        @NativeType("unsigned int")
        public int res_pitch2D_numChannels() { return CUDA_RESOURCE_DESC.nres_pitch2D_numChannels(address()); }
        /** @return the value of the {@code res.pitch2D.width} field. */
        @NativeType("size_t")
        public long res_pitch2D_width() { return CUDA_RESOURCE_DESC.nres_pitch2D_width(address()); }
        /** @return the value of the {@code res.pitch2D.height} field. */
        @NativeType("size_t")
        public long res_pitch2D_height() { return CUDA_RESOURCE_DESC.nres_pitch2D_height(address()); }
        /** @return the value of the {@code res.pitch2D.pitchInBytes} field. */
        @NativeType("size_t")
        public long res_pitch2D_pitchInBytes() { return CUDA_RESOURCE_DESC.nres_pitch2D_pitchInBytes(address()); }
        /** @return a {@link IntBuffer} view of the {@code res.reserved.reserved} field. */
        @NativeType("int[32]")
        public IntBuffer res_reserved_reserved() { return CUDA_RESOURCE_DESC.nres_reserved_reserved(address()); }
        /** @return the value at the specified index of the {@code res.reserved.reserved} field. */
        public int res_reserved_reserved(int index) { return CUDA_RESOURCE_DESC.nres_reserved_reserved(address(), index); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_RESOURCE_DESC.nflags(address()); }

        /** Sets the specified value to the {@code resType} field. */
        public CUDA_RESOURCE_DESC.Buffer resType(@NativeType("CUresourcetype") int value) { CUDA_RESOURCE_DESC.nresType(address(), value); return this; }
        /** Sets the specified value to the {@code hArray} field. */
        public CUDA_RESOURCE_DESC.Buffer res_array_hArray(@NativeType("CUarray") long value) { CUDA_RESOURCE_DESC.nres_array_hArray(address(), value); return this; }
        /** Sets the specified value to the {@code hMipmappedArray} field. */
        public CUDA_RESOURCE_DESC.Buffer res_mipmap_hMipmappedArray(@NativeType("CUmipmappedArray") long value) { CUDA_RESOURCE_DESC.nres_mipmap_hMipmappedArray(address(), value); return this; }
        /** Sets the specified value to the {@code devPtr} field. */
        public CUDA_RESOURCE_DESC.Buffer res_linear_devPtr(@NativeType("CUdeviceptr") long value) { CUDA_RESOURCE_DESC.nres_linear_devPtr(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public CUDA_RESOURCE_DESC.Buffer res_linear_format(@NativeType("CUarray_format") int value) { CUDA_RESOURCE_DESC.nres_linear_format(address(), value); return this; }
        /** Sets the specified value to the {@code numChannels} field. */
        public CUDA_RESOURCE_DESC.Buffer res_linear_numChannels(@NativeType("unsigned int") int value) { CUDA_RESOURCE_DESC.nres_linear_numChannels(address(), value); return this; }
        /** Sets the specified value to the {@code sizeInBytes} field. */
        public CUDA_RESOURCE_DESC.Buffer res_linear_sizeInBytes(@NativeType("size_t") long value) { CUDA_RESOURCE_DESC.nres_linear_sizeInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code devPtr} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_devPtr(@NativeType("CUdeviceptr") long value) { CUDA_RESOURCE_DESC.nres_pitch2D_devPtr(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_format(@NativeType("CUarray_format") int value) { CUDA_RESOURCE_DESC.nres_pitch2D_format(address(), value); return this; }
        /** Sets the specified value to the {@code numChannels} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_numChannels(@NativeType("unsigned int") int value) { CUDA_RESOURCE_DESC.nres_pitch2D_numChannels(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_width(@NativeType("size_t") long value) { CUDA_RESOURCE_DESC.nres_pitch2D_width(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_height(@NativeType("size_t") long value) { CUDA_RESOURCE_DESC.nres_pitch2D_height(address(), value); return this; }
        /** Sets the specified value to the {@code pitchInBytes} field. */
        public CUDA_RESOURCE_DESC.Buffer res_pitch2D_pitchInBytes(@NativeType("size_t") long value) { CUDA_RESOURCE_DESC.nres_pitch2D_pitchInBytes(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_RESOURCE_DESC.Buffer res_reserved_reserved(@NativeType("int[32]") IntBuffer value) { CUDA_RESOURCE_DESC.nres_reserved_reserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_RESOURCE_DESC.Buffer res_reserved_reserved(int index, int value) { CUDA_RESOURCE_DESC.nres_reserved_reserved(address(), index, value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUDA_RESOURCE_DESC.Buffer flags(@NativeType("unsigned int") int value) { CUDA_RESOURCE_DESC.nflags(address(), value); return this; }

    }

}