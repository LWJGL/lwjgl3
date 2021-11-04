/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

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
 * struct EXRAttribute {
 *     char name[256];
 *     char type[256];
 *     unsigned char * value;
 *     int size;
 *     char[4];
 * }</code></pre>
 */
public class EXRAttribute extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE,
        VALUE,
        SIZE;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __array(1, 256),
            __member(POINTER_SIZE),
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        VALUE = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code EXRAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRAttribute(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code type} field. */
    @NativeType("char[256]")
    public ByteBuffer type() { return ntype(address()); }
    /** @return the null-terminated string stored in the {@code type} field. */
    @NativeType("char[256]")
    public String typeString() { return ntypeString(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
    @Nullable
    @NativeType("unsigned char *")
    public ByteBuffer value() { return nvalue(address()); }
    /** @return the value of the {@code size} field. */
    public int size() { return nsize(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public EXRAttribute name(@NativeType("char[256]") ByteBuffer value) { nname(address(), value); return this; }
    /** Copies the specified encoded string to the {@code type} field. */
    public EXRAttribute type(@NativeType("char[256]") ByteBuffer value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
    public EXRAttribute value(@Nullable @NativeType("unsigned char *") ByteBuffer value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRAttribute set(
        ByteBuffer name,
        ByteBuffer type,
        @Nullable ByteBuffer value
    ) {
        name(name);
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
    public EXRAttribute set(EXRAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRAttribute malloc() {
        return wrap(EXRAttribute.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRAttribute calloc() {
        return wrap(EXRAttribute.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRAttribute} instance allocated with {@link BufferUtils}. */
    public static EXRAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRAttribute.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRAttribute} instance for the specified memory address. */
    public static EXRAttribute create(long address) {
        return wrap(EXRAttribute.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRAttribute createSafe(long address) {
        return address == NULL ? null : wrap(EXRAttribute.class, address);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRAttribute.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRAttribute mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRAttribute callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRAttribute mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRAttribute callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRAttribute.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRAttribute.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRAttribute.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRAttribute.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code EXRAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRAttribute malloc(MemoryStack stack) {
        return wrap(EXRAttribute.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRAttribute calloc(MemoryStack stack) {
        return wrap(EXRAttribute.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRAttribute.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + EXRAttribute.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + EXRAttribute.NAME); }
    /** Unsafe version of {@link #type}. */
    public static ByteBuffer ntype(long struct) { return memByteBuffer(struct + EXRAttribute.TYPE, 256); }
    /** Unsafe version of {@link #typeString}. */
    public static String ntypeString(long struct) { return memASCII(struct + EXRAttribute.TYPE); }
    /** Unsafe version of {@link #value() value}. */
    @Nullable public static ByteBuffer nvalue(long struct) { return memByteBufferSafe(memGetAddress(struct + EXRAttribute.VALUE), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + EXRAttribute.SIZE); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + EXRAttribute.NAME, value.remaining());
    }
    /** Unsafe version of {@link #type(ByteBuffer) type}. */
    public static void ntype(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + EXRAttribute.TYPE, value.remaining());
    }
    /** Unsafe version of {@link #value(ByteBuffer) value}. */
    public static void nvalue(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + EXRAttribute.VALUE, memAddressSafe(value)); nsize(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + EXRAttribute.SIZE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsize(struct) != 0) {
            check(memGetAddress(struct + EXRAttribute.VALUE));
        }
    }

    // -----------------------------------

    /** An array of {@link EXRAttribute} structs. */
    public static class Buffer extends StructBuffer<EXRAttribute, Buffer> implements NativeResource {

        private static final EXRAttribute ELEMENT_FACTORY = EXRAttribute.create(-1L);

        /**
         * Creates a new {@code EXRAttribute.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRAttribute#SIZEOF}, and its mark will be undefined.
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
        protected EXRAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return EXRAttribute.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[256]")
        public String nameString() { return EXRAttribute.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code type} field. */
        @NativeType("char[256]")
        public ByteBuffer type() { return EXRAttribute.ntype(address()); }
        /** @return the null-terminated string stored in the {@code type} field. */
        @NativeType("char[256]")
        public String typeString() { return EXRAttribute.ntypeString(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
        @Nullable
        @NativeType("unsigned char *")
        public ByteBuffer value() { return EXRAttribute.nvalue(address()); }
        /** @return the value of the {@code size} field. */
        public int size() { return EXRAttribute.nsize(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public EXRAttribute.Buffer name(@NativeType("char[256]") ByteBuffer value) { EXRAttribute.nname(address(), value); return this; }
        /** Copies the specified encoded string to the {@code type} field. */
        public EXRAttribute.Buffer type(@NativeType("char[256]") ByteBuffer value) { EXRAttribute.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
        public EXRAttribute.Buffer value(@Nullable @NativeType("unsigned char *") ByteBuffer value) { EXRAttribute.nvalue(address(), value); return this; }

    }

}