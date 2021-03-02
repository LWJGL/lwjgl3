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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBindingModificationBaseHeaderKHR {
 *     XrStructureType type;
 *     void const * next;
 * }</code></pre>
 */
public class XrBindingModificationBaseHeaderKHR extends Struct implements NativeResource {

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
     * Creates a {@code XrBindingModificationBaseHeaderKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBindingModificationBaseHeaderKHR(ByteBuffer container) {
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
    public XrBindingModificationBaseHeaderKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrBindingModificationBaseHeaderKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBindingModificationBaseHeaderKHR set(
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
    public XrBindingModificationBaseHeaderKHR set(XrBindingModificationBaseHeaderKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR malloc() {
        return wrap(XrBindingModificationBaseHeaderKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR calloc() {
        return wrap(XrBindingModificationBaseHeaderKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link BufferUtils}. */
    public static XrBindingModificationBaseHeaderKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrBindingModificationBaseHeaderKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance for the specified memory address. */
    public static XrBindingModificationBaseHeaderKHR create(long address) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationBaseHeaderKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrBindingModificationBaseHeaderKHR.class, address);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrBindingModificationBaseHeaderKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBindingModificationBaseHeaderKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrBindingModificationBaseHeaderKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrBindingModificationBaseHeaderKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR mallocStack(MemoryStack stack) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR callocStack(MemoryStack stack) {
        return wrap(XrBindingModificationBaseHeaderKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBindingModificationBaseHeaderKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBindingModificationBaseHeaderKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBindingModificationBaseHeaderKHR} structs. */
    public static class Buffer extends StructBuffer<XrBindingModificationBaseHeaderKHR, Buffer> implements NativeResource {

        private static final XrBindingModificationBaseHeaderKHR ELEMENT_FACTORY = XrBindingModificationBaseHeaderKHR.create(-1L);

        /**
         * Creates a new {@code XrBindingModificationBaseHeaderKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBindingModificationBaseHeaderKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrBindingModificationBaseHeaderKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBindingModificationBaseHeaderKHR.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBindingModificationBaseHeaderKHR.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer type(@NativeType("XrStructureType") int value) { XrBindingModificationBaseHeaderKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer next(@NativeType("void const *") long value) { XrBindingModificationBaseHeaderKHR.nnext(address(), value); return this; }

    }

}