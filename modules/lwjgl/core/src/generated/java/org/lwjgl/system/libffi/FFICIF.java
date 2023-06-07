/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains information about a libffi call interface.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ffi_cif {
 *     ffi_abi abi;
 *     unsigned nargs;
 *     {@link FFIType ffi_type} ** arg_types;
 *     {@link FFIType ffi_type} * rtype;
 *     unsigned bytes;
 *     unsigned flags;
 * }</code></pre>
 */
@NativeType("struct ffi_cif")
public class FFICIF extends Struct<FFICIF> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ABI,
        NARGS,
        ARG_TYPES,
        RTYPE,
        BYTES,
        FLAGS;

    static {
        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(7);
            SIZEOF = offsets(memAddress(offsets));

            ABI = offsets.get(0);
            NARGS = offsets.get(1);
            ARG_TYPES = offsets.get(2);
            RTYPE = offsets.get(3);
            BYTES = offsets.get(4);
            FLAGS = offsets.get(5);

            ALIGNOF = offsets.get(6);
        }
    }

    private static native int offsets(long buffer);

    protected FFICIF(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FFICIF create(long address, @Nullable ByteBuffer container) {
        return new FFICIF(address, container);
    }

    /**
     * Creates a {@code FFICIF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FFICIF(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code abi} field. */
    @NativeType("ffi_abi")
    public int abi() { return nabi(address()); }
    /** @return the value of the {@code nargs} field. */
    @NativeType("unsigned")
    public int nargs() { return nnargs(address()); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("ffi_type **")
    public PointerBuffer arg_types(int capacity) { return narg_types(address(), capacity); }
    /** @return a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
    @NativeType("ffi_type *")
    public FFIType rtype() { return nrtype(address()); }
    /** @return the value of the {@code bytes} field. */
    @NativeType("unsigned")
    public int bytes() { return nbytes(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code FFICIF} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FFICIF malloc() {
        return new FFICIF(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FFICIF} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FFICIF calloc() {
        return new FFICIF(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FFICIF} instance allocated with {@link BufferUtils}. */
    public static FFICIF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FFICIF(memAddress(container), container);
    }

    /** Returns a new {@code FFICIF} instance for the specified memory address. */
    public static FFICIF create(long address) {
        return new FFICIF(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FFICIF createSafe(long address) {
        return address == NULL ? null : new FFICIF(address, null);
    }

    /**
     * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FFICIF.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFICIF.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FFICIF.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FFICIF.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FFICIF} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FFICIF malloc(MemoryStack stack) {
        return new FFICIF(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FFICIF} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FFICIF calloc(MemoryStack stack) {
        return new FFICIF(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FFICIF.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFICIF.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFICIF.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #abi}. */
    public static int nabi(long struct) { return UNSAFE.getInt(null, struct + FFICIF.ABI); }
    /** Unsafe version of {@link #nargs}. */
    public static int nnargs(long struct) { return UNSAFE.getInt(null, struct + FFICIF.NARGS); }
    /** Unsafe version of {@link #arg_types(int) arg_types}. */
    public static PointerBuffer narg_types(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + FFICIF.ARG_TYPES), capacity); }
    /** Unsafe version of {@link #rtype}. */
    public static FFIType nrtype(long struct) { return FFIType.create(memGetAddress(struct + FFICIF.RTYPE)); }
    /** Unsafe version of {@link #bytes}. */
    public static int nbytes(long struct) { return UNSAFE.getInt(null, struct + FFICIF.BYTES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FFICIF.FLAGS); }

    // -----------------------------------

    /** An array of {@link FFICIF} structs. */
    public static class Buffer extends StructBuffer<FFICIF, Buffer> implements NativeResource {

        private static final FFICIF ELEMENT_FACTORY = FFICIF.create(-1L);

        /**
         * Creates a new {@code FFICIF.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FFICIF#SIZEOF}, and its mark will be undefined.</p>
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
        protected FFICIF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code abi} field. */
        @NativeType("ffi_abi")
        public int abi() { return FFICIF.nabi(address()); }
        /** @return the value of the {@code nargs} field. */
        @NativeType("unsigned")
        public int nargs() { return FFICIF.nnargs(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code arg_types} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("ffi_type **")
        public PointerBuffer arg_types(int capacity) { return FFICIF.narg_types(address(), capacity); }
        /** @return a {@link FFIType} view of the struct pointed to by the {@code rtype} field. */
        @NativeType("ffi_type *")
        public FFIType rtype() { return FFICIF.nrtype(address()); }
        /** @return the value of the {@code bytes} field. */
        @NativeType("unsigned")
        public int bytes() { return FFICIF.nbytes(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned")
        public int flags() { return FFICIF.nflags(address()); }

    }

}