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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Kernel launch parameters.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code function} &ndash; Kernel to launch</li>
 * <li>{@code gridDimX} &ndash; Width of grid in blocks</li>
 * <li>{@code gridDimY} &ndash; Height of grid in blocks</li>
 * <li>{@code gridDimZ} &ndash; Depth of grid in blocks</li>
 * <li>{@code blockDimX} &ndash; X dimension of each thread block</li>
 * <li>{@code blockDimY} &ndash; Y dimension of each thread block</li>
 * <li>{@code blockDimZ} &ndash; Z dimension of each thread block</li>
 * <li>{@code sharedMemBytes} &ndash; Dynamic shared-memory size per thread block in bytes</li>
 * <li>{@code hStream} &ndash; Stream identifier</li>
 * <li>{@code kernelParams} &ndash; Array of pointers to kernel parameters</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_LAUNCH_PARAMS {
 *     CUfunction function;
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     CUstream hStream;
 *     void ** kernelParams;
 * }</code></pre>
 */
public class CUDA_LAUNCH_PARAMS extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNCTION,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        HSTREAM,
        KERNELPARAMS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNCTION = layout.offsetof(0);
        GRIDDIMX = layout.offsetof(1);
        GRIDDIMY = layout.offsetof(2);
        GRIDDIMZ = layout.offsetof(3);
        BLOCKDIMX = layout.offsetof(4);
        BLOCKDIMY = layout.offsetof(5);
        BLOCKDIMZ = layout.offsetof(6);
        SHAREDMEMBYTES = layout.offsetof(7);
        HSTREAM = layout.offsetof(8);
        KERNELPARAMS = layout.offsetof(9);
    }

    /**
     * Creates a {@code CUDA_LAUNCH_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_LAUNCH_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code function} field. */
    @NativeType("CUfunction")
    public long function() { return nfunction(address()); }
    /** Returns the value of the {@code gridDimX} field. */
    @NativeType("unsigned int")
    public int gridDimX() { return ngridDimX(address()); }
    /** Returns the value of the {@code gridDimY} field. */
    @NativeType("unsigned int")
    public int gridDimY() { return ngridDimY(address()); }
    /** Returns the value of the {@code gridDimZ} field. */
    @NativeType("unsigned int")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** Returns the value of the {@code blockDimX} field. */
    @NativeType("unsigned int")
    public int blockDimX() { return nblockDimX(address()); }
    /** Returns the value of the {@code blockDimY} field. */
    @NativeType("unsigned int")
    public int blockDimY() { return nblockDimY(address()); }
    /** Returns the value of the {@code blockDimZ} field. */
    @NativeType("unsigned int")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** Returns the value of the {@code sharedMemBytes} field. */
    @NativeType("unsigned int")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** Returns the value of the {@code hStream} field. */
    @NativeType("CUstream")
    public long hStream() { return nhStream(address()); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void **")
    public PointerBuffer kernelParams(int capacity) { return nkernelParams(address(), capacity); }

    /** Sets the specified value to the {@code function} field. */
    public CUDA_LAUNCH_PARAMS function(@NativeType("CUfunction") long value) { nfunction(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public CUDA_LAUNCH_PARAMS gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUDA_LAUNCH_PARAMS gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUDA_LAUNCH_PARAMS gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUDA_LAUNCH_PARAMS blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUDA_LAUNCH_PARAMS blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUDA_LAUNCH_PARAMS blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUDA_LAUNCH_PARAMS sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the specified value to the {@code hStream} field. */
    public CUDA_LAUNCH_PARAMS hStream(@NativeType("CUstream") long value) { nhStream(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
    public CUDA_LAUNCH_PARAMS kernelParams(@NativeType("void **") PointerBuffer value) { nkernelParams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_LAUNCH_PARAMS set(
        long function,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        long hStream,
        PointerBuffer kernelParams
    ) {
        function(function);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        hStream(hStream);
        kernelParams(kernelParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_LAUNCH_PARAMS set(CUDA_LAUNCH_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_LAUNCH_PARAMS malloc() {
        return wrap(CUDA_LAUNCH_PARAMS.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_LAUNCH_PARAMS calloc() {
        return wrap(CUDA_LAUNCH_PARAMS.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_LAUNCH_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_LAUNCH_PARAMS.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance for the specified memory address. */
    public static CUDA_LAUNCH_PARAMS create(long address) {
        return wrap(CUDA_LAUNCH_PARAMS.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_LAUNCH_PARAMS createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_LAUNCH_PARAMS.class, address);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_LAUNCH_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_LAUNCH_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_LAUNCH_PARAMS mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_LAUNCH_PARAMS callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_LAUNCH_PARAMS mallocStack(MemoryStack stack) {
        return wrap(CUDA_LAUNCH_PARAMS.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_LAUNCH_PARAMS callocStack(MemoryStack stack) {
        return wrap(CUDA_LAUNCH_PARAMS.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #function}. */
    public static long nfunction(long struct) { return memGetAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + CUDA_LAUNCH_PARAMS.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #hStream}. */
    public static long nhStream(long struct) { return memGetAddress(struct + CUDA_LAUNCH_PARAMS.HSTREAM); }
    /** Unsafe version of {@link #kernelParams(int) kernelParams}. */
    public static PointerBuffer nkernelParams(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + CUDA_LAUNCH_PARAMS.KERNELPARAMS), capacity); }

    /** Unsafe version of {@link #function(long) function}. */
    public static void nfunction(long struct, long value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION, check(value)); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_LAUNCH_PARAMS.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #hStream(long) hStream}. */
    public static void nhStream(long struct, long value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.HSTREAM, check(value)); }
    /** Unsafe version of {@link #kernelParams(PointerBuffer) kernelParams}. */
    public static void nkernelParams(long struct, PointerBuffer value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.KERNELPARAMS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION));
        check(memGetAddress(struct + CUDA_LAUNCH_PARAMS.HSTREAM));
        check(memGetAddress(struct + CUDA_LAUNCH_PARAMS.KERNELPARAMS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link CUDA_LAUNCH_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_LAUNCH_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_LAUNCH_PARAMS ELEMENT_FACTORY = CUDA_LAUNCH_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_LAUNCH_PARAMS.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_LAUNCH_PARAMS#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_LAUNCH_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code function} field. */
        @NativeType("CUfunction")
        public long function() { return CUDA_LAUNCH_PARAMS.nfunction(address()); }
        /** Returns the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUDA_LAUNCH_PARAMS.ngridDimX(address()); }
        /** Returns the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUDA_LAUNCH_PARAMS.ngridDimY(address()); }
        /** Returns the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUDA_LAUNCH_PARAMS.ngridDimZ(address()); }
        /** Returns the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUDA_LAUNCH_PARAMS.nblockDimX(address()); }
        /** Returns the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUDA_LAUNCH_PARAMS.nblockDimY(address()); }
        /** Returns the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUDA_LAUNCH_PARAMS.nblockDimZ(address()); }
        /** Returns the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUDA_LAUNCH_PARAMS.nsharedMemBytes(address()); }
        /** Returns the value of the {@code hStream} field. */
        @NativeType("CUstream")
        public long hStream() { return CUDA_LAUNCH_PARAMS.nhStream(address()); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void **")
        public PointerBuffer kernelParams(int capacity) { return CUDA_LAUNCH_PARAMS.nkernelParams(address(), capacity); }

        /** Sets the specified value to the {@code function} field. */
        public CUDA_LAUNCH_PARAMS.Buffer function(@NativeType("CUfunction") long value) { CUDA_LAUNCH_PARAMS.nfunction(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimX(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimY(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimX(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimY(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUDA_LAUNCH_PARAMS.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nsharedMemBytes(address(), value); return this; }
        /** Sets the specified value to the {@code hStream} field. */
        public CUDA_LAUNCH_PARAMS.Buffer hStream(@NativeType("CUstream") long value) { CUDA_LAUNCH_PARAMS.nhStream(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
        public CUDA_LAUNCH_PARAMS.Buffer kernelParams(@NativeType("void **") PointerBuffer value) { CUDA_LAUNCH_PARAMS.nkernelParams(address(), value); return this; }

    }

}