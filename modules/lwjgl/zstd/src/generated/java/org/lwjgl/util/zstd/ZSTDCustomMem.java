/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

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
 * struct ZSTD_customMem {
 *     {@link ZSTDAllocFunctionI ZSTD_allocFunction} customAlloc;
 *     {@link ZSTDFreeFunctionI ZSTD_freeFunction} customFree;
 *     void * opaque;
 * }</code></pre>
 */
@NativeType("struct ZSTD_customMem")
public class ZSTDCustomMem extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CUSTOMALLOC,
        CUSTOMFREE,
        OPAQUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CUSTOMALLOC = layout.offsetof(0);
        CUSTOMFREE = layout.offsetof(1);
        OPAQUE = layout.offsetof(2);
    }

    /**
     * Creates a {@code ZSTDCustomMem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDCustomMem(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code customAlloc} field. */
    @NativeType("ZSTD_allocFunction")
    public ZSTDAllocFunction customAlloc() { return ncustomAlloc(address()); }
    /** @return the value of the {@code customFree} field. */
    @NativeType("ZSTD_freeFunction")
    public ZSTDFreeFunction customFree() { return ncustomFree(address()); }
    /** @return the value of the {@code opaque} field. */
    @NativeType("void *")
    public long opaque() { return nopaque(address()); }

    /** Sets the specified value to the {@code customAlloc} field. */
    public ZSTDCustomMem customAlloc(@NativeType("ZSTD_allocFunction") ZSTDAllocFunctionI value) { ncustomAlloc(address(), value); return this; }
    /** Sets the specified value to the {@code customFree} field. */
    public ZSTDCustomMem customFree(@NativeType("ZSTD_freeFunction") ZSTDFreeFunctionI value) { ncustomFree(address(), value); return this; }
    /** Sets the specified value to the {@code opaque} field. */
    public ZSTDCustomMem opaque(@NativeType("void *") long value) { nopaque(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDCustomMem set(
        ZSTDAllocFunctionI customAlloc,
        ZSTDFreeFunctionI customFree,
        long opaque
    ) {
        customAlloc(customAlloc);
        customFree(customFree);
        opaque(opaque);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDCustomMem set(ZSTDCustomMem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDCustomMem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDCustomMem malloc() {
        return wrap(ZSTDCustomMem.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDCustomMem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDCustomMem calloc() {
        return wrap(ZSTDCustomMem.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDCustomMem} instance allocated with {@link BufferUtils}. */
    public static ZSTDCustomMem create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDCustomMem.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDCustomMem} instance for the specified memory address. */
    public static ZSTDCustomMem create(long address) {
        return wrap(ZSTDCustomMem.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCustomMem createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDCustomMem.class, address);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDCustomMem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCustomMem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCustomMem.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDCustomMem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCustomMem malloc(MemoryStack stack) {
        return wrap(ZSTDCustomMem.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDCustomMem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCustomMem calloc(MemoryStack stack) {
        return wrap(ZSTDCustomMem.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCustomMem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCustomMem.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #customAlloc}. */
    public static ZSTDAllocFunction ncustomAlloc(long struct) { return ZSTDAllocFunction.create(memGetAddress(struct + ZSTDCustomMem.CUSTOMALLOC)); }
    /** Unsafe version of {@link #customFree}. */
    public static ZSTDFreeFunction ncustomFree(long struct) { return ZSTDFreeFunction.create(memGetAddress(struct + ZSTDCustomMem.CUSTOMFREE)); }
    /** Unsafe version of {@link #opaque}. */
    public static long nopaque(long struct) { return memGetAddress(struct + ZSTDCustomMem.OPAQUE); }

    /** Unsafe version of {@link #customAlloc(ZSTDAllocFunctionI) customAlloc}. */
    public static void ncustomAlloc(long struct, ZSTDAllocFunctionI value) { memPutAddress(struct + ZSTDCustomMem.CUSTOMALLOC, value.address()); }
    /** Unsafe version of {@link #customFree(ZSTDFreeFunctionI) customFree}. */
    public static void ncustomFree(long struct, ZSTDFreeFunctionI value) { memPutAddress(struct + ZSTDCustomMem.CUSTOMFREE, value.address()); }
    /** Unsafe version of {@link #opaque(long) opaque}. */
    public static void nopaque(long struct, long value) { memPutAddress(struct + ZSTDCustomMem.OPAQUE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ZSTDCustomMem.CUSTOMALLOC));
        check(memGetAddress(struct + ZSTDCustomMem.CUSTOMFREE));
        check(memGetAddress(struct + ZSTDCustomMem.OPAQUE));
    }

    // -----------------------------------

    /** An array of {@link ZSTDCustomMem} structs. */
    public static class Buffer extends StructBuffer<ZSTDCustomMem, Buffer> implements NativeResource {

        private static final ZSTDCustomMem ELEMENT_FACTORY = ZSTDCustomMem.create(-1L);

        /**
         * Creates a new {@code ZSTDCustomMem.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDCustomMem#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDCustomMem getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code customAlloc} field. */
        @NativeType("ZSTD_allocFunction")
        public ZSTDAllocFunction customAlloc() { return ZSTDCustomMem.ncustomAlloc(address()); }
        /** @return the value of the {@code customFree} field. */
        @NativeType("ZSTD_freeFunction")
        public ZSTDFreeFunction customFree() { return ZSTDCustomMem.ncustomFree(address()); }
        /** @return the value of the {@code opaque} field. */
        @NativeType("void *")
        public long opaque() { return ZSTDCustomMem.nopaque(address()); }

        /** Sets the specified value to the {@code customAlloc} field. */
        public ZSTDCustomMem.Buffer customAlloc(@NativeType("ZSTD_allocFunction") ZSTDAllocFunctionI value) { ZSTDCustomMem.ncustomAlloc(address(), value); return this; }
        /** Sets the specified value to the {@code customFree} field. */
        public ZSTDCustomMem.Buffer customFree(@NativeType("ZSTD_freeFunction") ZSTDFreeFunctionI value) { ZSTDCustomMem.ncustomFree(address(), value); return this; }
        /** Sets the specified value to the {@code opaque} field. */
        public ZSTDCustomMem.Buffer opaque(@NativeType("void *") long value) { ZSTDCustomMem.nopaque(address(), value); return this; }

    }

}