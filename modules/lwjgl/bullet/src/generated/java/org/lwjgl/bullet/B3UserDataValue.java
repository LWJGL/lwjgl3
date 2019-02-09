/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

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
 * struct b3UserDataValue {
 *     int m_type;
 *     int m_length;
 *     char * m_data1;
 * }</code></pre>
 */
@NativeType("struct b3UserDataValue")
public class B3UserDataValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_TYPE,
        M_LENGTH,
        M_DATA1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_TYPE = layout.offsetof(0);
        M_LENGTH = layout.offsetof(1);
        M_DATA1 = layout.offsetof(2);
    }

    /**
     * Creates a {@code B3UserDataValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3UserDataValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_type} field. */
    public int m_type() { return nm_type(address()); }
    /** Returns the value of the {@code m_length} field. */
    public int m_length() { return nm_length(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_data1} field. */
    @NativeType("char *")
    public ByteBuffer m_data1() { return nm_data1(address()); }

    /** Sets the specified value to the {@code m_type} field. */
    public B3UserDataValue m_type(int value) { nm_type(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code m_data1} field. */
    public B3UserDataValue m_data1(@NativeType("char *") ByteBuffer value) { nm_data1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3UserDataValue set(
        int m_type,
        ByteBuffer m_data1
    ) {
        m_type(m_type);
        m_data1(m_data1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3UserDataValue set(B3UserDataValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3UserDataValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3UserDataValue malloc() {
        return wrap(B3UserDataValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3UserDataValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3UserDataValue calloc() {
        return wrap(B3UserDataValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3UserDataValue} instance allocated with {@link BufferUtils}. */
    public static B3UserDataValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3UserDataValue.class, memAddress(container), container);
    }

    /** Returns a new {@code B3UserDataValue} instance for the specified memory address. */
    public static B3UserDataValue create(long address) {
        return wrap(B3UserDataValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserDataValue createSafe(long address) {
        return address == NULL ? null : wrap(B3UserDataValue.class, address);
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3UserDataValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3UserDataValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3UserDataValue} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3UserDataValue mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3UserDataValue} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3UserDataValue callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3UserDataValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserDataValue mallocStack(MemoryStack stack) {
        return wrap(B3UserDataValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3UserDataValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3UserDataValue callocStack(MemoryStack stack) {
        return wrap(B3UserDataValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3UserDataValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3UserDataValue.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_type}. */
    public static int nm_type(long struct) { return UNSAFE.getInt(null, struct + B3UserDataValue.M_TYPE); }
    /** Unsafe version of {@link #m_length}. */
    public static int nm_length(long struct) { return UNSAFE.getInt(null, struct + B3UserDataValue.M_LENGTH); }
    /** Unsafe version of {@link #m_data1() m_data1}. */
    public static ByteBuffer nm_data1(long struct) { return memByteBuffer(memGetAddress(struct + B3UserDataValue.M_DATA1), nm_length(struct)); }

    /** Unsafe version of {@link #m_type(int) m_type}. */
    public static void nm_type(long struct, int value) { UNSAFE.putInt(null, struct + B3UserDataValue.M_TYPE, value); }
    /** Sets the specified value to the {@code m_length} field of the specified {@code struct}. */
    public static void nm_length(long struct, int value) { UNSAFE.putInt(null, struct + B3UserDataValue.M_LENGTH, value); }
    /** Unsafe version of {@link #m_data1(ByteBuffer) m_data1}. */
    public static void nm_data1(long struct, ByteBuffer value) { memPutAddress(struct + B3UserDataValue.M_DATA1, memAddress(value)); nm_length(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3UserDataValue.M_DATA1));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link B3UserDataValue} structs. */
    public static class Buffer extends StructBuffer<B3UserDataValue, Buffer> implements NativeResource {

        private static final B3UserDataValue ELEMENT_FACTORY = B3UserDataValue.create(-1L);

        /**
         * Creates a new {@code B3UserDataValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3UserDataValue#SIZEOF}, and its mark will be undefined.
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
        protected B3UserDataValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_type} field. */
        public int m_type() { return B3UserDataValue.nm_type(address()); }
        /** Returns the value of the {@code m_length} field. */
        public int m_length() { return B3UserDataValue.nm_length(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_data1} field. */
        @NativeType("char *")
        public ByteBuffer m_data1() { return B3UserDataValue.nm_data1(address()); }

        /** Sets the specified value to the {@code m_type} field. */
        public B3UserDataValue.Buffer m_type(int value) { B3UserDataValue.nm_type(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code m_data1} field. */
        public B3UserDataValue.Buffer m_data1(@NativeType("char *") ByteBuffer value) { B3UserDataValue.nm_data1(address(), value); return this; }

    }

}