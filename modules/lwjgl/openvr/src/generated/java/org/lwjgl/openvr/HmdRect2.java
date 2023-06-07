/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct HmdRect2_t {
 *     {@link HmdVector2 HmdVector2_t} vTopLeft;
 *     {@link HmdVector2 HmdVector2_t} vBottomRight;
 * }</code></pre>
 */
@NativeType("struct HmdRect2_t")
public class HmdRect2 extends Struct<HmdRect2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VTOPLEFT,
        VBOTTOMRIGHT;

    static {
        Layout layout = __struct(
            __member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF),
            __member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VTOPLEFT = layout.offsetof(0);
        VBOTTOMRIGHT = layout.offsetof(1);
    }

    protected HmdRect2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdRect2 create(long address, @Nullable ByteBuffer container) {
        return new HmdRect2(address, container);
    }

    /**
     * Creates a {@code HmdRect2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdRect2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdVector2} view of the {@code vTopLeft} field. */
    @NativeType("HmdVector2_t")
    public HmdVector2 vTopLeft() { return nvTopLeft(address()); }
    /** @return a {@link HmdVector2} view of the {@code vBottomRight} field. */
    @NativeType("HmdVector2_t")
    public HmdVector2 vBottomRight() { return nvBottomRight(address()); }

    /** Copies the specified {@link HmdVector2} to the {@code vTopLeft} field. */
    public HmdRect2 vTopLeft(@NativeType("HmdVector2_t") HmdVector2 value) { nvTopLeft(address(), value); return this; }
    /** Passes the {@code vTopLeft} field to the specified {@link java.util.function.Consumer Consumer}. */
    public HmdRect2 vTopLeft(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vTopLeft()); return this; }
    /** Copies the specified {@link HmdVector2} to the {@code vBottomRight} field. */
    public HmdRect2 vBottomRight(@NativeType("HmdVector2_t") HmdVector2 value) { nvBottomRight(address(), value); return this; }
    /** Passes the {@code vBottomRight} field to the specified {@link java.util.function.Consumer Consumer}. */
    public HmdRect2 vBottomRight(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vBottomRight()); return this; }

    /** Initializes this struct with the specified values. */
    public HmdRect2 set(
        HmdVector2 vTopLeft,
        HmdVector2 vBottomRight
    ) {
        vTopLeft(vTopLeft);
        vBottomRight(vBottomRight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdRect2 set(HmdRect2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdRect2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdRect2 malloc() {
        return new HmdRect2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdRect2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdRect2 calloc() {
        return new HmdRect2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdRect2} instance allocated with {@link BufferUtils}. */
    public static HmdRect2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdRect2(memAddress(container), container);
    }

    /** Returns a new {@code HmdRect2} instance for the specified memory address. */
    public static HmdRect2 create(long address) {
        return new HmdRect2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdRect2 createSafe(long address) {
        return address == NULL ? null : new HmdRect2(address, null);
    }

    /**
     * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdRect2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdRect2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdRect2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdRect2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdRect2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdRect2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdRect2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdRect2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdRect2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdRect2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdRect2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdRect2 malloc(MemoryStack stack) {
        return new HmdRect2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdRect2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdRect2 calloc(MemoryStack stack) {
        return new HmdRect2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdRect2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdRect2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdRect2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vTopLeft}. */
    public static HmdVector2 nvTopLeft(long struct) { return HmdVector2.create(struct + HmdRect2.VTOPLEFT); }
    /** Unsafe version of {@link #vBottomRight}. */
    public static HmdVector2 nvBottomRight(long struct) { return HmdVector2.create(struct + HmdRect2.VBOTTOMRIGHT); }

    /** Unsafe version of {@link #vTopLeft(HmdVector2) vTopLeft}. */
    public static void nvTopLeft(long struct, HmdVector2 value) { memCopy(value.address(), struct + HmdRect2.VTOPLEFT, HmdVector2.SIZEOF); }
    /** Unsafe version of {@link #vBottomRight(HmdVector2) vBottomRight}. */
    public static void nvBottomRight(long struct, HmdVector2 value) { memCopy(value.address(), struct + HmdRect2.VBOTTOMRIGHT, HmdVector2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link HmdRect2} structs. */
    public static class Buffer extends StructBuffer<HmdRect2, Buffer> implements NativeResource {

        private static final HmdRect2 ELEMENT_FACTORY = HmdRect2.create(-1L);

        /**
         * Creates a new {@code HmdRect2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdRect2#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdRect2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdVector2} view of the {@code vTopLeft} field. */
        @NativeType("HmdVector2_t")
        public HmdVector2 vTopLeft() { return HmdRect2.nvTopLeft(address()); }
        /** @return a {@link HmdVector2} view of the {@code vBottomRight} field. */
        @NativeType("HmdVector2_t")
        public HmdVector2 vBottomRight() { return HmdRect2.nvBottomRight(address()); }

        /** Copies the specified {@link HmdVector2} to the {@code vTopLeft} field. */
        public HmdRect2.Buffer vTopLeft(@NativeType("HmdVector2_t") HmdVector2 value) { HmdRect2.nvTopLeft(address(), value); return this; }
        /** Passes the {@code vTopLeft} field to the specified {@link java.util.function.Consumer Consumer}. */
        public HmdRect2.Buffer vTopLeft(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vTopLeft()); return this; }
        /** Copies the specified {@link HmdVector2} to the {@code vBottomRight} field. */
        public HmdRect2.Buffer vBottomRight(@NativeType("HmdVector2_t") HmdVector2 value) { HmdRect2.nvBottomRight(address(), value); return this; }
        /** Passes the {@code vBottomRight} field to the specified {@link java.util.function.Consumer Consumer}. */
        public HmdRect2.Buffer vBottomRight(java.util.function.Consumer<HmdVector2> consumer) { consumer.accept(vBottomRight()); return this; }

    }

}