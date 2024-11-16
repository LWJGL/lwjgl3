/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGValue {
 *     float value;
 *     YGUnit unit;
 * }</code></pre>
 */
public class YGValue extends Struct<YGValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE,
        UNIT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(0);
        UNIT = layout.offsetof(1);
    }

    protected YGValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected YGValue create(long address, @Nullable ByteBuffer container) {
        return new YGValue(address, container);
    }

    /**
     * Creates a {@code YGValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code value} field. */
    public float value() { return nvalue(address()); }
    /** @return the value of the {@code unit} field. */
    @NativeType("YGUnit")
    public int unit() { return nunit(address()); }

    /** Sets the specified value to the {@code value} field. */
    public YGValue value(float value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code unit} field. */
    public YGValue unit(@NativeType("YGUnit") int value) { nunit(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public YGValue set(
        float value,
        int unit
    ) {
        value(value);
        unit(unit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public YGValue set(YGValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code YGValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGValue malloc() {
        return new YGValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code YGValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGValue calloc() {
        return new YGValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code YGValue} instance allocated with {@link BufferUtils}. */
    public static YGValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new YGValue(memAddress(container), container);
    }

    /** Returns a new {@code YGValue} instance for the specified memory address. */
    public static YGValue create(long address) {
        return new YGValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable YGValue createSafe(long address) {
        return address == NULL ? null : new YGValue(address, null);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link YGValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static YGValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static YGValue mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static YGValue callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static YGValue mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static YGValue callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static YGValue.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static YGValue.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static YGValue.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static YGValue.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code YGValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGValue malloc(MemoryStack stack) {
        return new YGValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code YGValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGValue calloc(MemoryStack stack) {
        return new YGValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return memGetFloat(struct + YGValue.VALUE); }
    /** Unsafe version of {@link #unit}. */
    public static int nunit(long struct) { return memGetInt(struct + YGValue.UNIT); }

    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { memPutFloat(struct + YGValue.VALUE, value); }
    /** Unsafe version of {@link #unit(int) unit}. */
    public static void nunit(long struct, int value) { memPutInt(struct + YGValue.UNIT, value); }

    // -----------------------------------

    /** An array of {@link YGValue} structs. */
    public static class Buffer extends StructBuffer<YGValue, Buffer> implements NativeResource {

        private static final YGValue ELEMENT_FACTORY = YGValue.create(-1L);

        /**
         * Creates a new {@code YGValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected YGValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code value} field. */
        public float value() { return YGValue.nvalue(address()); }
        /** @return the value of the {@code unit} field. */
        @NativeType("YGUnit")
        public int unit() { return YGValue.nunit(address()); }

        /** Sets the specified value to the {@code value} field. */
        public YGValue.Buffer value(float value) { YGValue.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code unit} field. */
        public YGValue.Buffer unit(@NativeType("YGUnit") int value) { YGValue.nunit(address(), value); return this; }

    }

}