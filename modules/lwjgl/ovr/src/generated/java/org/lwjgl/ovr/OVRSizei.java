/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A 2D size with integer components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code w} &ndash; the width</li>
 * <li>{@code h} &ndash; the height</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrSizei {
 *     int w;
 *     int h;
 * }</code></pre>
 */
@NativeType("struct ovrSizei")
public class OVRSizei extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        H;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        H = layout.offsetof(1);
    }

    /**
     * Creates a {@code OVRSizei} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRSizei(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** Returns the value of the {@code h} field. */
    public int h() { return nh(address()); }

    /** Sets the specified value to the {@code w} field. */
    public OVRSizei w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public OVRSizei h(int value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRSizei set(
        int w,
        int h
    ) {
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRSizei set(OVRSizei src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRSizei} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRSizei malloc() {
        return wrap(OVRSizei.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRSizei} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRSizei calloc() {
        return wrap(OVRSizei.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRSizei} instance allocated with {@link BufferUtils}. */
    public static OVRSizei create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRSizei.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRSizei} instance for the specified memory address. */
    public static OVRSizei create(long address) {
        return wrap(OVRSizei.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRSizei createSafe(long address) {
        return address == NULL ? null : wrap(OVRSizei.class, address);
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRSizei.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRSizei.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRSizei} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRSizei mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRSizei} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRSizei callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRSizei} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRSizei mallocStack(MemoryStack stack) {
        return wrap(OVRSizei.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRSizei} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRSizei callocStack(MemoryStack stack) {
        return wrap(OVRSizei.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRSizei.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRSizei.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + OVRSizei.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return UNSAFE.getInt(null, struct + OVRSizei.H); }

    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + OVRSizei.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { UNSAFE.putInt(null, struct + OVRSizei.H, value); }

    // -----------------------------------

    /** An array of {@link OVRSizei} structs. */
    public static class Buffer extends StructBuffer<OVRSizei, Buffer> implements NativeResource {

        private static final OVRSizei ELEMENT_FACTORY = OVRSizei.create(-1L);

        /**
         * Creates a new {@code OVRSizei.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRSizei#SIZEOF}, and its mark will be undefined.
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
        protected OVRSizei getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code w} field. */
        public int w() { return OVRSizei.nw(address()); }
        /** Returns the value of the {@code h} field. */
        public int h() { return OVRSizei.nh(address()); }

        /** Sets the specified value to the {@code w} field. */
        public OVRSizei.Buffer w(int value) { OVRSizei.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public OVRSizei.Buffer h(int value) { OVRSizei.nh(address(), value); return this; }

    }

}