/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

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
 * struct f_owner_ex {
 *     int type;
 *     pid_t pid;
 * }</code></pre>
 */
@NativeType("struct f_owner_ex")
public class FOwnerEx extends Struct<FOwnerEx> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        PID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        PID = layout.offsetof(1);
    }

    protected FOwnerEx(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FOwnerEx create(long address, @Nullable ByteBuffer container) {
        return new FOwnerEx(address, container);
    }

    /**
     * Creates a {@code FOwnerEx} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FOwnerEx(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** @return the value of the {@code pid} field. */
    @NativeType("pid_t")
    public int pid() { return npid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FOwnerEx type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code pid} field. */
    public FOwnerEx pid(@NativeType("pid_t") int value) { npid(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FOwnerEx set(
        int type,
        int pid
    ) {
        type(type);
        pid(pid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FOwnerEx set(FOwnerEx src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FOwnerEx} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FOwnerEx malloc() {
        return new FOwnerEx(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FOwnerEx} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FOwnerEx calloc() {
        return new FOwnerEx(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FOwnerEx} instance allocated with {@link BufferUtils}. */
    public static FOwnerEx create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FOwnerEx(memAddress(container), container);
    }

    /** Returns a new {@code FOwnerEx} instance for the specified memory address. */
    public static FOwnerEx create(long address) {
        return new FOwnerEx(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FOwnerEx createSafe(long address) {
        return address == NULL ? null : new FOwnerEx(address, null);
    }

    /**
     * Returns a new {@link FOwnerEx.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FOwnerEx.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FOwnerEx.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FOwnerEx.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FOwnerEx.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FOwnerEx} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FOwnerEx malloc(MemoryStack stack) {
        return new FOwnerEx(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FOwnerEx} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FOwnerEx calloc(MemoryStack stack) {
        return new FOwnerEx(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FOwnerEx.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FOwnerEx.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FOwnerEx.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FOwnerEx.TYPE); }
    /** Unsafe version of {@link #pid}. */
    public static int npid(long struct) { return UNSAFE.getInt(null, struct + FOwnerEx.PID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FOwnerEx.TYPE, value); }
    /** Unsafe version of {@link #pid(int) pid}. */
    public static void npid(long struct, int value) { UNSAFE.putInt(null, struct + FOwnerEx.PID, value); }

    // -----------------------------------

    /** An array of {@link FOwnerEx} structs. */
    public static class Buffer extends StructBuffer<FOwnerEx, Buffer> implements NativeResource {

        private static final FOwnerEx ELEMENT_FACTORY = FOwnerEx.create(-1L);

        /**
         * Creates a new {@code FOwnerEx.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FOwnerEx#SIZEOF}, and its mark will be undefined.</p>
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
        protected FOwnerEx getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return FOwnerEx.ntype(address()); }
        /** @return the value of the {@code pid} field. */
        @NativeType("pid_t")
        public int pid() { return FOwnerEx.npid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FOwnerEx.Buffer type(int value) { FOwnerEx.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code pid} field. */
        public FOwnerEx.Buffer pid(@NativeType("pid_t") int value) { FOwnerEx.npid(address(), value); return this; }

    }

}