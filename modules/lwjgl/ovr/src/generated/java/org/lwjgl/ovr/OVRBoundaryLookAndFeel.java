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
 * Boundary system look and feel.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrBoundaryLookAndFeel {
 *     {@link OVRColorf ovrColorf} {@link #Color};
 * }</code></pre>
 */
@NativeType("struct ovrBoundaryLookAndFeel")
public class OVRBoundaryLookAndFeel extends Struct<OVRBoundaryLookAndFeel> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR;

    static {
        Layout layout = __struct(
            __member(OVRColorf.SIZEOF, OVRColorf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
    }

    protected OVRBoundaryLookAndFeel(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRBoundaryLookAndFeel create(long address, @Nullable ByteBuffer container) {
        return new OVRBoundaryLookAndFeel(address, container);
    }

    /**
     * Creates a {@code OVRBoundaryLookAndFeel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRBoundaryLookAndFeel(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Boundary color (alpha channel is ignored) */
    @NativeType("ovrColorf")
    public OVRColorf Color() { return nColor(address()); }

    /** Copies the specified {@link OVRColorf} to the {@link #Color} field. */
    public OVRBoundaryLookAndFeel Color(@NativeType("ovrColorf") OVRColorf value) { nColor(address(), value); return this; }
    /** Passes the {@link #Color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRBoundaryLookAndFeel Color(java.util.function.Consumer<OVRColorf> consumer) { consumer.accept(Color()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRBoundaryLookAndFeel set(OVRBoundaryLookAndFeel src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRBoundaryLookAndFeel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRBoundaryLookAndFeel malloc() {
        return new OVRBoundaryLookAndFeel(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRBoundaryLookAndFeel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRBoundaryLookAndFeel calloc() {
        return new OVRBoundaryLookAndFeel(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRBoundaryLookAndFeel} instance allocated with {@link BufferUtils}. */
    public static OVRBoundaryLookAndFeel create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRBoundaryLookAndFeel(memAddress(container), container);
    }

    /** Returns a new {@code OVRBoundaryLookAndFeel} instance for the specified memory address. */
    public static OVRBoundaryLookAndFeel create(long address) {
        return new OVRBoundaryLookAndFeel(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryLookAndFeel createSafe(long address) {
        return address == NULL ? null : new OVRBoundaryLookAndFeel(address, null);
    }

    /**
     * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRBoundaryLookAndFeel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryLookAndFeel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryLookAndFeel.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRBoundaryLookAndFeel} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryLookAndFeel malloc(MemoryStack stack) {
        return new OVRBoundaryLookAndFeel(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRBoundaryLookAndFeel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryLookAndFeel calloc(MemoryStack stack) {
        return new OVRBoundaryLookAndFeel(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryLookAndFeel.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Color}. */
    public static OVRColorf nColor(long struct) { return OVRColorf.create(struct + OVRBoundaryLookAndFeel.COLOR); }

    /** Unsafe version of {@link #Color(OVRColorf) Color}. */
    public static void nColor(long struct, OVRColorf value) { memCopy(value.address(), struct + OVRBoundaryLookAndFeel.COLOR, OVRColorf.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRBoundaryLookAndFeel} structs. */
    public static class Buffer extends StructBuffer<OVRBoundaryLookAndFeel, Buffer> implements NativeResource {

        private static final OVRBoundaryLookAndFeel ELEMENT_FACTORY = OVRBoundaryLookAndFeel.create(-1L);

        /**
         * Creates a new {@code OVRBoundaryLookAndFeel.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRBoundaryLookAndFeel#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRBoundaryLookAndFeel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRColorf} view of the {@link OVRBoundaryLookAndFeel#Color} field. */
        @NativeType("ovrColorf")
        public OVRColorf Color() { return OVRBoundaryLookAndFeel.nColor(address()); }

        /** Copies the specified {@link OVRColorf} to the {@link OVRBoundaryLookAndFeel#Color} field. */
        public OVRBoundaryLookAndFeel.Buffer Color(@NativeType("ovrColorf") OVRColorf value) { OVRBoundaryLookAndFeel.nColor(address(), value); return this; }
        /** Passes the {@link OVRBoundaryLookAndFeel#Color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRBoundaryLookAndFeel.Buffer Color(java.util.function.Consumer<OVRColorf> consumer) { consumer.accept(Color()); return this; }

    }

}