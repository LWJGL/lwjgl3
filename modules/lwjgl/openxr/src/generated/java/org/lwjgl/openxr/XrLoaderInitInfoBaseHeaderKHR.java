/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

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
 * struct XrLoaderInitInfoBaseHeaderKHR {
 *     XrStructureType type;
 *     void const * next;
 * }</code></pre>
 */
public class XrLoaderInitInfoBaseHeaderKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrLoaderInitInfoBaseHeaderKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLoaderInitInfoBaseHeaderKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLoaderInitInfoBaseHeaderKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrLoaderInitInfoBaseHeaderKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLoaderInitInfoBaseHeaderKHR set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLoaderInitInfoBaseHeaderKHR set(XrLoaderInitInfoBaseHeaderKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoBaseHeaderKHR malloc() {
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoBaseHeaderKHR calloc() {
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated with {@link BufferUtils}. */
    public static XrLoaderInitInfoBaseHeaderKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance for the specified memory address. */
    public static XrLoaderInitInfoBaseHeaderKHR create(long address) {
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLoaderInitInfoBaseHeaderKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrLoaderInitInfoBaseHeaderKHR.class, address);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrLoaderInitInfoBaseHeaderKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrLoaderInitInfoBaseHeaderKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoBaseHeaderKHR mallocStack(MemoryStack stack) {
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrLoaderInitInfoBaseHeaderKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoBaseHeaderKHR callocStack(MemoryStack stack) {
        return wrap(XrLoaderInitInfoBaseHeaderKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoBaseHeaderKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrLoaderInitInfoBaseHeaderKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLoaderInitInfoBaseHeaderKHR.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrLoaderInitInfoBaseHeaderKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLoaderInitInfoBaseHeaderKHR.NEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLoaderInitInfoBaseHeaderKHR.NEXT));
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

    /** An array of {@link XrLoaderInitInfoBaseHeaderKHR} structs. */
    public static class Buffer extends StructBuffer<XrLoaderInitInfoBaseHeaderKHR, Buffer> implements NativeResource {

        private static final XrLoaderInitInfoBaseHeaderKHR ELEMENT_FACTORY = XrLoaderInitInfoBaseHeaderKHR.create(-1L);

        /**
         * Creates a new {@code XrLoaderInitInfoBaseHeaderKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLoaderInitInfoBaseHeaderKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrLoaderInitInfoBaseHeaderKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLoaderInitInfoBaseHeaderKHR.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrLoaderInitInfoBaseHeaderKHR.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLoaderInitInfoBaseHeaderKHR.Buffer type(@NativeType("XrStructureType") int value) { XrLoaderInitInfoBaseHeaderKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrLoaderInitInfoBaseHeaderKHR.Buffer next(@NativeType("void const *") long value) { XrLoaderInitInfoBaseHeaderKHR.nnext(address(), value); return this; }

    }

}