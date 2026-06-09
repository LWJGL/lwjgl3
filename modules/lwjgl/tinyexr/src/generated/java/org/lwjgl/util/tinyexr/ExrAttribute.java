/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ExrAttribute {
 *     char const * name;
 *     char const * type_name;
 *     ExrAttributeType type;
 *     void const * value;
 *     uint32_t size;
 * }}</pre>
 */
public class ExrAttribute extends Struct<ExrAttribute> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE_NAME,
        TYPE,
        VALUE,
        SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE_NAME = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
        SIZE = layout.offsetof(4);
    }

    protected ExrAttribute(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrAttribute create(long address, @Nullable ByteBuffer container) {
        return new ExrAttribute(address, container);
    }

    /**
     * Creates a {@code ExrAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrAttribute(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code type_name} field. */
    @NativeType("char const *")
    public ByteBuffer type_name() { return ntype_name(address()); }
    /** @return the null-terminated string pointed to by the {@code type_name} field. */
    @NativeType("char const *")
    public String type_nameString() { return ntype_nameString(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("ExrAttributeType")
    public int type() { return ntype(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
    @NativeType("void const *")
    public ByteBuffer value() { return nvalue(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public ExrAttribute name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code type_name} field. */
    public ExrAttribute type_name(@NativeType("char const *") ByteBuffer value) { ntype_name(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public ExrAttribute type(@NativeType("ExrAttributeType") int value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
    public ExrAttribute value(@NativeType("void const *") ByteBuffer value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrAttribute set(
        ByteBuffer name,
        ByteBuffer type_name,
        int type,
        ByteBuffer value
    ) {
        name(name);
        type_name(type_name);
        type(type);
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
    public ExrAttribute set(ExrAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrAttribute malloc() {
        return new ExrAttribute(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrAttribute calloc() {
        return new ExrAttribute(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrAttribute} instance allocated with {@link BufferUtils}. */
    public static ExrAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrAttribute(memAddress(container), container);
    }

    /** Returns a new {@code ExrAttribute} instance for the specified memory address. */
    public static ExrAttribute create(long address) {
        return new ExrAttribute(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrAttribute createSafe(long address) {
        return address == NULL ? null : new ExrAttribute(address, null);
    }

    /**
     * Returns a new {@link ExrAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrAttribute.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrAttribute malloc(MemoryStack stack) {
        return new ExrAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrAttribute calloc(MemoryStack stack) {
        return new ExrAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrAttribute.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrAttribute.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + ExrAttribute.NAME)); }
    /** Unsafe version of {@link #type_name}. */
    public static ByteBuffer ntype_name(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrAttribute.TYPE_NAME)); }
    /** Unsafe version of {@link #type_nameString}. */
    public static String ntype_nameString(long struct) { return memASCII(memGetAddress(struct + ExrAttribute.TYPE_NAME)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + ExrAttribute.TYPE); }
    /** Unsafe version of {@link #value() value}. */
    public static ByteBuffer nvalue(long struct) { return memByteBuffer(memGetAddress(struct + ExrAttribute.VALUE), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + ExrAttribute.SIZE); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrAttribute.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #type_name(ByteBuffer) type_name}. */
    public static void ntype_name(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrAttribute.TYPE_NAME, memAddress(value));
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + ExrAttribute.TYPE, value); }
    /** Unsafe version of {@link #value(ByteBuffer) value}. */
    public static void nvalue(long struct, ByteBuffer value) { memPutAddress(struct + ExrAttribute.VALUE, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + ExrAttribute.SIZE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrAttribute.NAME));
        check(memGetAddress(struct + ExrAttribute.TYPE_NAME));
        check(memGetAddress(struct + ExrAttribute.VALUE));
    }

    // -----------------------------------

    /** An array of {@link ExrAttribute} structs. */
    public static class Buffer extends StructBuffer<ExrAttribute, Buffer> implements NativeResource {

        private static final ExrAttribute ELEMENT_FACTORY = ExrAttribute.create(-1L);

        /**
         * Creates a new {@code ExrAttribute.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrAttribute#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return ExrAttribute.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return ExrAttribute.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code type_name} field. */
        @NativeType("char const *")
        public ByteBuffer type_name() { return ExrAttribute.ntype_name(address()); }
        /** @return the null-terminated string pointed to by the {@code type_name} field. */
        @NativeType("char const *")
        public String type_nameString() { return ExrAttribute.ntype_nameString(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("ExrAttributeType")
        public int type() { return ExrAttribute.ntype(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
        @NativeType("void const *")
        public ByteBuffer value() { return ExrAttribute.nvalue(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return ExrAttribute.nsize(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public ExrAttribute.Buffer name(@NativeType("char const *") ByteBuffer value) { ExrAttribute.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code type_name} field. */
        public ExrAttribute.Buffer type_name(@NativeType("char const *") ByteBuffer value) { ExrAttribute.ntype_name(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public ExrAttribute.Buffer type(@NativeType("ExrAttributeType") int value) { ExrAttribute.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
        public ExrAttribute.Buffer value(@NativeType("void const *") ByteBuffer value) { ExrAttribute.nvalue(address(), value); return this; }

    }

}