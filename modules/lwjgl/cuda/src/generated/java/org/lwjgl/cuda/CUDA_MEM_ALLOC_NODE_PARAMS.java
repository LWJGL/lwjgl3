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
 * struct CUDA_MEM_ALLOC_NODE_PARAMS {
 *     {@link CUmemPoolProps CUmemPoolProps} poolProps;
 *     {@link CUmemAccessDesc CUmemAccessDesc} const * accessDescs;
 *     size_t accessDescCount;
 *     size_t bytesize;
 *     CUdeviceptr dptr;
 * }</code></pre>
 */
public class CUDA_MEM_ALLOC_NODE_PARAMS extends Struct<CUDA_MEM_ALLOC_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POOLPROPS,
        ACCESSDESCS,
        ACCESSDESCCOUNT,
        BYTESIZE,
        DPTR;

    static {
        Layout layout = __struct(
            __member(CUmemPoolProps.SIZEOF, CUmemPoolProps.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POOLPROPS = layout.offsetof(0);
        ACCESSDESCS = layout.offsetof(1);
        ACCESSDESCCOUNT = layout.offsetof(2);
        BYTESIZE = layout.offsetof(3);
        DPTR = layout.offsetof(4);
    }

    protected CUDA_MEM_ALLOC_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_MEM_ALLOC_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEM_ALLOC_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CUmemPoolProps} view of the {@code poolProps} field. */
    public CUmemPoolProps poolProps() { return npoolProps(address()); }
    /** @return a {@link CUmemAccessDesc.Buffer} view of the struct array pointed to by the {@code accessDescs} field. */
    @NativeType("CUmemAccessDesc const *")
    public CUmemAccessDesc.Buffer accessDescs() { return naccessDescs(address()); }
    /** @return the value of the {@code accessDescCount} field. */
    @NativeType("size_t")
    public long accessDescCount() { return naccessDescCount(address()); }
    /** @return the value of the {@code bytesize} field. */
    @NativeType("size_t")
    public long bytesize() { return nbytesize(address()); }
    /** @return the value of the {@code dptr} field. */
    @NativeType("CUdeviceptr")
    public long dptr() { return ndptr(address()); }

    /** Copies the specified {@link CUmemPoolProps} to the {@code poolProps} field. */
    public CUDA_MEM_ALLOC_NODE_PARAMS poolProps(CUmemPoolProps value) { npoolProps(address(), value); return this; }
    /** Passes the {@code poolProps} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUDA_MEM_ALLOC_NODE_PARAMS poolProps(java.util.function.Consumer<CUmemPoolProps> consumer) { consumer.accept(poolProps()); return this; }
    /** Sets the address of the specified {@link CUmemAccessDesc.Buffer} to the {@code accessDescs} field. */
    public CUDA_MEM_ALLOC_NODE_PARAMS accessDescs(@NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer value) { naccessDescs(address(), value); return this; }
    /** Sets the specified value to the {@code bytesize} field. */
    public CUDA_MEM_ALLOC_NODE_PARAMS bytesize(@NativeType("size_t") long value) { nbytesize(address(), value); return this; }
    /** Sets the specified value to the {@code dptr} field. */
    public CUDA_MEM_ALLOC_NODE_PARAMS dptr(@NativeType("CUdeviceptr") long value) { ndptr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEM_ALLOC_NODE_PARAMS set(
        CUmemPoolProps poolProps,
        CUmemAccessDesc.Buffer accessDescs,
        long bytesize,
        long dptr
    ) {
        poolProps(poolProps);
        accessDescs(accessDescs);
        bytesize(bytesize);
        dptr(dptr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_MEM_ALLOC_NODE_PARAMS set(CUDA_MEM_ALLOC_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS malloc() {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS calloc() {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_MEM_ALLOC_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS create(long address) {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_MEM_ALLOC_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_MEM_ALLOC_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_MEM_ALLOC_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_MEM_ALLOC_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEM_ALLOC_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #poolProps}. */
    public static CUmemPoolProps npoolProps(long struct) { return CUmemPoolProps.create(struct + CUDA_MEM_ALLOC_NODE_PARAMS.POOLPROPS); }
    /** Unsafe version of {@link #accessDescs}. */
    public static CUmemAccessDesc.Buffer naccessDescs(long struct) { return CUmemAccessDesc.create(memGetAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.ACCESSDESCS), (int)naccessDescCount(struct)); }
    /** Unsafe version of {@link #accessDescCount}. */
    public static long naccessDescCount(long struct) { return memGetAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.ACCESSDESCCOUNT); }
    /** Unsafe version of {@link #bytesize}. */
    public static long nbytesize(long struct) { return memGetAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.BYTESIZE); }
    /** Unsafe version of {@link #dptr}. */
    public static long ndptr(long struct) { return memGetAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.DPTR); }

    /** Unsafe version of {@link #poolProps(CUmemPoolProps) poolProps}. */
    public static void npoolProps(long struct, CUmemPoolProps value) { memCopy(value.address(), struct + CUDA_MEM_ALLOC_NODE_PARAMS.POOLPROPS, CUmemPoolProps.SIZEOF); }
    /** Unsafe version of {@link #accessDescs(CUmemAccessDesc.Buffer) accessDescs}. */
    public static void naccessDescs(long struct, CUmemAccessDesc.Buffer value) { memPutAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.ACCESSDESCS, value.address()); naccessDescCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code accessDescCount} field of the specified {@code struct}. */
    public static void naccessDescCount(long struct, long value) { memPutAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.ACCESSDESCCOUNT, value); }
    /** Unsafe version of {@link #bytesize(long) bytesize}. */
    public static void nbytesize(long struct, long value) { memPutAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.BYTESIZE, value); }
    /** Unsafe version of {@link #dptr(long) dptr}. */
    public static void ndptr(long struct, long value) { memPutAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.DPTR, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_MEM_ALLOC_NODE_PARAMS.ACCESSDESCS));
    }

    // -----------------------------------

    /** An array of {@link CUDA_MEM_ALLOC_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEM_ALLOC_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_MEM_ALLOC_NODE_PARAMS ELEMENT_FACTORY = CUDA_MEM_ALLOC_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_MEM_ALLOC_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEM_ALLOC_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_MEM_ALLOC_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CUmemPoolProps} view of the {@code poolProps} field. */
        public CUmemPoolProps poolProps() { return CUDA_MEM_ALLOC_NODE_PARAMS.npoolProps(address()); }
        /** @return a {@link CUmemAccessDesc.Buffer} view of the struct array pointed to by the {@code accessDescs} field. */
        @NativeType("CUmemAccessDesc const *")
        public CUmemAccessDesc.Buffer accessDescs() { return CUDA_MEM_ALLOC_NODE_PARAMS.naccessDescs(address()); }
        /** @return the value of the {@code accessDescCount} field. */
        @NativeType("size_t")
        public long accessDescCount() { return CUDA_MEM_ALLOC_NODE_PARAMS.naccessDescCount(address()); }
        /** @return the value of the {@code bytesize} field. */
        @NativeType("size_t")
        public long bytesize() { return CUDA_MEM_ALLOC_NODE_PARAMS.nbytesize(address()); }
        /** @return the value of the {@code dptr} field. */
        @NativeType("CUdeviceptr")
        public long dptr() { return CUDA_MEM_ALLOC_NODE_PARAMS.ndptr(address()); }

        /** Copies the specified {@link CUmemPoolProps} to the {@code poolProps} field. */
        public CUDA_MEM_ALLOC_NODE_PARAMS.Buffer poolProps(CUmemPoolProps value) { CUDA_MEM_ALLOC_NODE_PARAMS.npoolProps(address(), value); return this; }
        /** Passes the {@code poolProps} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUDA_MEM_ALLOC_NODE_PARAMS.Buffer poolProps(java.util.function.Consumer<CUmemPoolProps> consumer) { consumer.accept(poolProps()); return this; }
        /** Sets the address of the specified {@link CUmemAccessDesc.Buffer} to the {@code accessDescs} field. */
        public CUDA_MEM_ALLOC_NODE_PARAMS.Buffer accessDescs(@NativeType("CUmemAccessDesc const *") CUmemAccessDesc.Buffer value) { CUDA_MEM_ALLOC_NODE_PARAMS.naccessDescs(address(), value); return this; }
        /** Sets the specified value to the {@code bytesize} field. */
        public CUDA_MEM_ALLOC_NODE_PARAMS.Buffer bytesize(@NativeType("size_t") long value) { CUDA_MEM_ALLOC_NODE_PARAMS.nbytesize(address(), value); return this; }
        /** Sets the specified value to the {@code dptr} field. */
        public CUDA_MEM_ALLOC_NODE_PARAMS.Buffer dptr(@NativeType("CUdeviceptr") long value) { CUDA_MEM_ALLOC_NODE_PARAMS.ndptr(address(), value); return this; }

    }

}