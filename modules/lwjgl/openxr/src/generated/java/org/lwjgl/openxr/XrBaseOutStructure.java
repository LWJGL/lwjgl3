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
 * struct XrBaseOutStructure {
 *     XrStructureType type;
 *     {@link XrBaseOutStructure XrBaseOutStructure} * next;
 * }</code></pre>
 */
public class XrBaseOutStructure extends Struct implements NativeResource {

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
     * Creates a {@code XrBaseOutStructure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBaseOutStructure(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns a {@link XrBaseOutStructure} view of the struct pointed to by the {@code next} field. */
    @NativeType("XrBaseOutStructure *")
    public XrBaseOutStructure next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBaseOutStructure type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link XrBaseOutStructure} to the {@code next} field. */
    public XrBaseOutStructure next(@NativeType("XrBaseOutStructure *") XrBaseOutStructure value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBaseOutStructure set(
        int type,
        XrBaseOutStructure next
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
    public XrBaseOutStructure set(XrBaseOutStructure src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBaseOutStructure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBaseOutStructure malloc() {
        return wrap(XrBaseOutStructure.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrBaseOutStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBaseOutStructure calloc() {
        return wrap(XrBaseOutStructure.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrBaseOutStructure} instance allocated with {@link BufferUtils}. */
    public static XrBaseOutStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrBaseOutStructure.class, memAddress(container), container);
    }

    /** Returns a new {@code XrBaseOutStructure} instance for the specified memory address. */
    public static XrBaseOutStructure create(long address) {
        return wrap(XrBaseOutStructure.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBaseOutStructure createSafe(long address) {
        return address == NULL ? null : wrap(XrBaseOutStructure.class, address);
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrBaseOutStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBaseOutStructure.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrBaseOutStructure} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrBaseOutStructure mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrBaseOutStructure} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrBaseOutStructure callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrBaseOutStructure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBaseOutStructure mallocStack(MemoryStack stack) {
        return wrap(XrBaseOutStructure.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrBaseOutStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBaseOutStructure callocStack(MemoryStack stack) {
        return wrap(XrBaseOutStructure.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBaseOutStructure.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBaseOutStructure.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static XrBaseOutStructure nnext(long struct) { return XrBaseOutStructure.create(memGetAddress(struct + XrBaseOutStructure.NEXT)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBaseOutStructure.TYPE, value); }
    /** Unsafe version of {@link #next(XrBaseOutStructure) next}. */
    public static void nnext(long struct, XrBaseOutStructure value) { memPutAddress(struct + XrBaseOutStructure.NEXT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBaseOutStructure.NEXT));
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

    /** An array of {@link XrBaseOutStructure} structs. */
    public static class Buffer extends StructBuffer<XrBaseOutStructure, Buffer> implements NativeResource {

        private static final XrBaseOutStructure ELEMENT_FACTORY = XrBaseOutStructure.create(-1L);

        /**
         * Creates a new {@code XrBaseOutStructure.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBaseOutStructure#SIZEOF}, and its mark will be undefined.
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
        protected XrBaseOutStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBaseOutStructure.ntype(address()); }
        /** Returns a {@link XrBaseOutStructure} view of the struct pointed to by the {@code next} field. */
        @NativeType("XrBaseOutStructure *")
        public XrBaseOutStructure next() { return XrBaseOutStructure.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBaseOutStructure.Buffer type(@NativeType("XrStructureType") int value) { XrBaseOutStructure.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link XrBaseOutStructure} to the {@code next} field. */
        public XrBaseOutStructure.Buffer next(@NativeType("XrBaseOutStructure *") XrBaseOutStructure value) { XrBaseOutStructure.nnext(address(), value); return this; }

    }

}