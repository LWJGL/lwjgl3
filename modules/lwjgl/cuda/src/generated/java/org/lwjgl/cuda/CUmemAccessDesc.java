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
 * Memory access descriptor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmemAccessDesc {
 *     {@link CUmemLocation CUmemLocation} {@link #location};
 *     CUmemAccess_flags {@link #flags};
 * }</code></pre>
 */
public class CUmemAccessDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(CUmemLocation.SIZEOF, CUmemLocation.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    /**
     * Creates a {@code CUmemAccessDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmemAccessDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** location on which the request is to change it's accessibility */
    public CUmemLocation location() { return nlocation(address()); }
    /** {@code CUmemProt} accessibility flags to set on the request */
    @NativeType("CUmemAccess_flags")
    public int flags() { return nflags(address()); }

    /** Copies the specified {@link CUmemLocation} to the {@link #location} field. */
    public CUmemAccessDesc location(CUmemLocation value) { nlocation(address(), value); return this; }
    /** Passes the {@link #location} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUmemAccessDesc location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public CUmemAccessDesc flags(@NativeType("CUmemAccess_flags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUmemAccessDesc set(
        CUmemLocation location,
        int flags
    ) {
        location(location);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmemAccessDesc set(CUmemAccessDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmemAccessDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmemAccessDesc malloc() {
        return wrap(CUmemAccessDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUmemAccessDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmemAccessDesc calloc() {
        return wrap(CUmemAccessDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUmemAccessDesc} instance allocated with {@link BufferUtils}. */
    public static CUmemAccessDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUmemAccessDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code CUmemAccessDesc} instance for the specified memory address. */
    public static CUmemAccessDesc create(long address) {
        return wrap(CUmemAccessDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemAccessDesc createSafe(long address) {
        return address == NULL ? null : wrap(CUmemAccessDesc.class, address);
    }

    /**
     * Returns a new {@link CUmemAccessDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmemAccessDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemAccessDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUmemAccessDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemAccessDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUmemAccessDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemAccessDesc malloc(MemoryStack stack) {
        return wrap(CUmemAccessDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUmemAccessDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemAccessDesc calloc(MemoryStack stack) {
        return wrap(CUmemAccessDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUmemAccessDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemAccessDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemAccessDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static CUmemLocation nlocation(long struct) { return CUmemLocation.create(struct + CUmemAccessDesc.LOCATION); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUmemAccessDesc.FLAGS); }

    /** Unsafe version of {@link #location(CUmemLocation) location}. */
    public static void nlocation(long struct, CUmemLocation value) { memCopy(value.address(), struct + CUmemAccessDesc.LOCATION, CUmemLocation.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUmemAccessDesc.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link CUmemAccessDesc} structs. */
    public static class Buffer extends StructBuffer<CUmemAccessDesc, Buffer> implements NativeResource {

        private static final CUmemAccessDesc ELEMENT_FACTORY = CUmemAccessDesc.create(-1L);

        /**
         * Creates a new {@code CUmemAccessDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmemAccessDesc#SIZEOF}, and its mark will be undefined.
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
        protected CUmemAccessDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CUmemLocation} view of the {@link CUmemAccessDesc#location} field. */
        public CUmemLocation location() { return CUmemAccessDesc.nlocation(address()); }
        /** @return the value of the {@link CUmemAccessDesc#flags} field. */
        @NativeType("CUmemAccess_flags")
        public int flags() { return CUmemAccessDesc.nflags(address()); }

        /** Copies the specified {@link CUmemLocation} to the {@link CUmemAccessDesc#location} field. */
        public CUmemAccessDesc.Buffer location(CUmemLocation value) { CUmemAccessDesc.nlocation(address(), value); return this; }
        /** Passes the {@link CUmemAccessDesc#location} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUmemAccessDesc.Buffer location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
        /** Sets the specified value to the {@link CUmemAccessDesc#flags} field. */
        public CUmemAccessDesc.Buffer flags(@NativeType("CUmemAccess_flags") int value) { CUmemAccessDesc.nflags(address(), value); return this; }

    }

}