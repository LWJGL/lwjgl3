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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUlaunchAttribute {
 *     CUlaunchAttributeID id;
 *     char pad[4];
 *     {@link CUlaunchAttributeValue CUlaunchAttributeValue} value;
 * }</code></pre>
 */
public class CUlaunchAttribute extends Struct<CUlaunchAttribute> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        PAD,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 4),
            __member(CUlaunchAttributeValue.SIZEOF, CUlaunchAttributeValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        PAD = layout.offsetof(1);
        VALUE = layout.offsetof(2);
    }

    protected CUlaunchAttribute(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUlaunchAttribute create(long address, @Nullable ByteBuffer container) {
        return new CUlaunchAttribute(address, container);
    }

    /**
     * Creates a {@code CUlaunchAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUlaunchAttribute(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code id} field. */
    @NativeType("CUlaunchAttributeID")
    public int id() { return nid(address()); }
    /** @return a {@link ByteBuffer} view of the {@code pad} field. */
    @NativeType("char[4]")
    public ByteBuffer pad() { return npad(address()); }
    /** @return the value at the specified index of the {@code pad} field. */
    @NativeType("char")
    public byte pad(int index) { return npad(address(), index); }
    /** @return a {@link CUlaunchAttributeValue} view of the {@code value} field. */
    public CUlaunchAttributeValue value() { return nvalue(address()); }

    /** Sets the specified value to the {@code id} field. */
    public CUlaunchAttribute id(@NativeType("CUlaunchAttributeID") int value) { nid(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code pad} field. */
    public CUlaunchAttribute pad(@NativeType("char[4]") ByteBuffer value) { npad(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pad} field. */
    public CUlaunchAttribute pad(int index, @NativeType("char") byte value) { npad(address(), index, value); return this; }
    /** Copies the specified {@link CUlaunchAttributeValue} to the {@code value} field. */
    public CUlaunchAttribute value(CUlaunchAttributeValue value) { nvalue(address(), value); return this; }
    /** Passes the {@code value} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUlaunchAttribute value(java.util.function.Consumer<CUlaunchAttributeValue> consumer) { consumer.accept(value()); return this; }

    /** Initializes this struct with the specified values. */
    public CUlaunchAttribute set(
        int id,
        ByteBuffer pad,
        CUlaunchAttributeValue value
    ) {
        id(id);
        pad(pad);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUlaunchAttribute set(CUlaunchAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUlaunchAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUlaunchAttribute malloc() {
        return new CUlaunchAttribute(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUlaunchAttribute calloc() {
        return new CUlaunchAttribute(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchAttribute} instance allocated with {@link BufferUtils}. */
    public static CUlaunchAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUlaunchAttribute(memAddress(container), container);
    }

    /** Returns a new {@code CUlaunchAttribute} instance for the specified memory address. */
    public static CUlaunchAttribute create(long address) {
        return new CUlaunchAttribute(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchAttribute createSafe(long address) {
        return address == NULL ? null : new CUlaunchAttribute(address, null);
    }

    /**
     * Returns a new {@link CUlaunchAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUlaunchAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchAttribute.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUlaunchAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchAttribute malloc(MemoryStack stack) {
        return new CUlaunchAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUlaunchAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchAttribute calloc(MemoryStack stack) {
        return new CUlaunchAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUlaunchAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttribute.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttribute.ID); }
    /** Unsafe version of {@link #pad}. */
    public static ByteBuffer npad(long struct) { return memByteBuffer(struct + CUlaunchAttribute.PAD, 4); }
    /** Unsafe version of {@link #pad(int) pad}. */
    public static byte npad(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUlaunchAttribute.PAD + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #value}. */
    public static CUlaunchAttributeValue nvalue(long struct) { return CUlaunchAttributeValue.create(struct + CUlaunchAttribute.VALUE); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttribute.ID, value); }
    /** Unsafe version of {@link #pad(ByteBuffer) pad}. */
    public static void npad(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + CUlaunchAttribute.PAD, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pad(int, byte) pad}. */
    public static void npad(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUlaunchAttribute.PAD + check(index, 4) * 1, value);
    }
    /** Unsafe version of {@link #value(CUlaunchAttributeValue) value}. */
    public static void nvalue(long struct, CUlaunchAttributeValue value) { memCopy(value.address(), struct + CUlaunchAttribute.VALUE, CUlaunchAttributeValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link CUlaunchAttribute} structs. */
    public static class Buffer extends StructBuffer<CUlaunchAttribute, Buffer> implements NativeResource {

        private static final CUlaunchAttribute ELEMENT_FACTORY = CUlaunchAttribute.create(-1L);

        /**
         * Creates a new {@code CUlaunchAttribute.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUlaunchAttribute#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUlaunchAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code id} field. */
        @NativeType("CUlaunchAttributeID")
        public int id() { return CUlaunchAttribute.nid(address()); }
        /** @return a {@link ByteBuffer} view of the {@code pad} field. */
        @NativeType("char[4]")
        public ByteBuffer pad() { return CUlaunchAttribute.npad(address()); }
        /** @return the value at the specified index of the {@code pad} field. */
        @NativeType("char")
        public byte pad(int index) { return CUlaunchAttribute.npad(address(), index); }
        /** @return a {@link CUlaunchAttributeValue} view of the {@code value} field. */
        public CUlaunchAttributeValue value() { return CUlaunchAttribute.nvalue(address()); }

        /** Sets the specified value to the {@code id} field. */
        public CUlaunchAttribute.Buffer id(@NativeType("CUlaunchAttributeID") int value) { CUlaunchAttribute.nid(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code pad} field. */
        public CUlaunchAttribute.Buffer pad(@NativeType("char[4]") ByteBuffer value) { CUlaunchAttribute.npad(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pad} field. */
        public CUlaunchAttribute.Buffer pad(int index, @NativeType("char") byte value) { CUlaunchAttribute.npad(address(), index, value); return this; }
        /** Copies the specified {@link CUlaunchAttributeValue} to the {@code value} field. */
        public CUlaunchAttribute.Buffer value(CUlaunchAttributeValue value) { CUlaunchAttribute.nvalue(address(), value); return this; }
        /** Passes the {@code value} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUlaunchAttribute.Buffer value(java.util.function.Consumer<CUlaunchAttributeValue> consumer) { consumer.accept(value()); return this; }

    }

}