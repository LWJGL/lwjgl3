/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrLoaderInitPropertyValueEXT {
 *     char const * name;
 *     char const * value;
 * }}</pre>
 */
public class XrLoaderInitPropertyValueEXT extends Struct<XrLoaderInitPropertyValueEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected XrLoaderInitPropertyValueEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLoaderInitPropertyValueEXT create(long address, @Nullable ByteBuffer container) {
        return new XrLoaderInitPropertyValueEXT(address, container);
    }

    /**
     * Creates a {@code XrLoaderInitPropertyValueEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLoaderInitPropertyValueEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char const *")
    public ByteBuffer value() { return nvalue(address()); }
    /** @return the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char const *")
    public String valueString() { return nvalueString(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public XrLoaderInitPropertyValueEXT name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code value} field. */
    public XrLoaderInitPropertyValueEXT value(@NativeType("char const *") ByteBuffer value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLoaderInitPropertyValueEXT set(
        ByteBuffer name,
        ByteBuffer value
    ) {
        name(name);
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
    public XrLoaderInitPropertyValueEXT set(XrLoaderInitPropertyValueEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitPropertyValueEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLoaderInitPropertyValueEXT malloc() {
        return new XrLoaderInitPropertyValueEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLoaderInitPropertyValueEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLoaderInitPropertyValueEXT calloc() {
        return new XrLoaderInitPropertyValueEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLoaderInitPropertyValueEXT} instance allocated with {@link BufferUtils}. */
    public static XrLoaderInitPropertyValueEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLoaderInitPropertyValueEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrLoaderInitPropertyValueEXT} instance for the specified memory address. */
    public static XrLoaderInitPropertyValueEXT create(long address) {
        return new XrLoaderInitPropertyValueEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLoaderInitPropertyValueEXT createSafe(long address) {
        return address == NULL ? null : new XrLoaderInitPropertyValueEXT(address, null);
    }

    /**
     * Returns a new {@link XrLoaderInitPropertyValueEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitPropertyValueEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitPropertyValueEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLoaderInitPropertyValueEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLoaderInitPropertyValueEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLoaderInitPropertyValueEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitPropertyValueEXT malloc(MemoryStack stack) {
        return new XrLoaderInitPropertyValueEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLoaderInitPropertyValueEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitPropertyValueEXT calloc(MemoryStack stack) {
        return new XrLoaderInitPropertyValueEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLoaderInitPropertyValueEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitPropertyValueEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitPropertyValueEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + XrLoaderInitPropertyValueEXT.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + XrLoaderInitPropertyValueEXT.NAME)); }
    /** Unsafe version of {@link #value}. */
    public static ByteBuffer nvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + XrLoaderInitPropertyValueEXT.VALUE)); }
    /** Unsafe version of {@link #valueString}. */
    public static String nvalueString(long struct) { return memUTF8(memGetAddress(struct + XrLoaderInitPropertyValueEXT.VALUE)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrLoaderInitPropertyValueEXT.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #value(ByteBuffer) value}. */
    public static void nvalue(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrLoaderInitPropertyValueEXT.VALUE, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLoaderInitPropertyValueEXT.NAME));
        check(memGetAddress(struct + XrLoaderInitPropertyValueEXT.VALUE));
    }

    // -----------------------------------

    /** An array of {@link XrLoaderInitPropertyValueEXT} structs. */
    public static class Buffer extends StructBuffer<XrLoaderInitPropertyValueEXT, Buffer> implements NativeResource {

        private static final XrLoaderInitPropertyValueEXT ELEMENT_FACTORY = XrLoaderInitPropertyValueEXT.create(-1L);

        /**
         * Creates a new {@code XrLoaderInitPropertyValueEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLoaderInitPropertyValueEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLoaderInitPropertyValueEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return XrLoaderInitPropertyValueEXT.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return XrLoaderInitPropertyValueEXT.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char const *")
        public ByteBuffer value() { return XrLoaderInitPropertyValueEXT.nvalue(address()); }
        /** @return the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char const *")
        public String valueString() { return XrLoaderInitPropertyValueEXT.nvalueString(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public XrLoaderInitPropertyValueEXT.Buffer name(@NativeType("char const *") ByteBuffer value) { XrLoaderInitPropertyValueEXT.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code value} field. */
        public XrLoaderInitPropertyValueEXT.Buffer value(@NativeType("char const *") ByteBuffer value) { XrLoaderInitPropertyValueEXT.nvalue(address(), value); return this; }

    }

}