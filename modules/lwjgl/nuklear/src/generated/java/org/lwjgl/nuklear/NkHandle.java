/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

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
 * union nk_handle {
 *     void * ptr;
 *     int id;
 * }</code></pre>
 */
@NativeType("union nk_handle")
public class NkHandle extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTR,
        ID;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTR = layout.offsetof(0);
        ID = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkHandle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkHandle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ptr} field. */
    @NativeType("void *")
    public long ptr() { return nptr(address()); }
    /** Returns the value of the {@code id} field. */
    public int id() { return nid(address()); }

    /** Sets the specified value to the {@code ptr} field. */
    public NkHandle ptr(@NativeType("void *") long value) { nptr(address(), value); return this; }
    /** Sets the specified value to the {@code id} field. */
    public NkHandle id(int value) { nid(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkHandle set(NkHandle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkHandle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkHandle malloc() {
        return wrap(NkHandle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkHandle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkHandle calloc() {
        return wrap(NkHandle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkHandle} instance allocated with {@link BufferUtils}. */
    public static NkHandle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkHandle.class, memAddress(container), container);
    }

    /** Returns a new {@code NkHandle} instance for the specified memory address. */
    public static NkHandle create(long address) {
        return wrap(NkHandle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkHandle createSafe(long address) {
        return address == NULL ? null : wrap(NkHandle.class, address);
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkHandle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkHandle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkHandle} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkHandle mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkHandle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkHandle callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkHandle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkHandle mallocStack(MemoryStack stack) {
        return wrap(NkHandle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkHandle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkHandle callocStack(MemoryStack stack) {
        return wrap(NkHandle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkHandle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkHandle.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ptr}. */
    public static long nptr(long struct) { return memGetAddress(struct + NkHandle.PTR); }
    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + NkHandle.ID); }

    /** Unsafe version of {@link #ptr(long) ptr}. */
    public static void nptr(long struct, long value) { memPutAddress(struct + NkHandle.PTR, value); }
    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + NkHandle.ID, value); }

    // -----------------------------------

    /** An array of {@link NkHandle} structs. */
    public static class Buffer extends StructBuffer<NkHandle, Buffer> implements NativeResource {

        private static final NkHandle ELEMENT_FACTORY = NkHandle.create(-1L);

        /**
         * Creates a new {@code NkHandle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkHandle#SIZEOF}, and its mark will be undefined.
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
        protected NkHandle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code ptr} field. */
        @NativeType("void *")
        public long ptr() { return NkHandle.nptr(address()); }
        /** Returns the value of the {@code id} field. */
        public int id() { return NkHandle.nid(address()); }

        /** Sets the specified value to the {@code ptr} field. */
        public NkHandle.Buffer ptr(@NativeType("void *") long value) { NkHandle.nptr(address(), value); return this; }
        /** Sets the specified value to the {@code id} field. */
        public NkHandle.Buffer id(int value) { NkHandle.nid(address(), value); return this; }

    }

}