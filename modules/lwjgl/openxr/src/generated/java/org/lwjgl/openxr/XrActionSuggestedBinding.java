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
 * struct XrActionSuggestedBinding {
 *     XrAction action;
 *     XrPath binding;
 * }</code></pre>
 */
public class XrActionSuggestedBinding extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTION,
        BINDING;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTION = layout.offsetof(0);
        BINDING = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrActionSuggestedBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionSuggestedBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code action} field. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** Returns the value of the {@code binding} field. */
    @NativeType("XrPath")
    public long binding() { return nbinding(address()); }

    /** Sets the specified value to the {@code action} field. */
    public XrActionSuggestedBinding action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public XrActionSuggestedBinding binding(@NativeType("XrPath") long value) { nbinding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionSuggestedBinding set(
        XrAction action,
        long binding
    ) {
        action(action);
        binding(binding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionSuggestedBinding set(XrActionSuggestedBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSuggestedBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionSuggestedBinding malloc() {
        return wrap(XrActionSuggestedBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionSuggestedBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionSuggestedBinding calloc() {
        return wrap(XrActionSuggestedBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionSuggestedBinding} instance allocated with {@link BufferUtils}. */
    public static XrActionSuggestedBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionSuggestedBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionSuggestedBinding} instance for the specified memory address. */
    public static XrActionSuggestedBinding create(long address) {
        return wrap(XrActionSuggestedBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSuggestedBinding createSafe(long address) {
        return address == NULL ? null : wrap(XrActionSuggestedBinding.class, address);
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionSuggestedBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSuggestedBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSuggestedBinding} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrActionSuggestedBinding mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrActionSuggestedBinding} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrActionSuggestedBinding callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrActionSuggestedBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSuggestedBinding mallocStack(MemoryStack stack) {
        return wrap(XrActionSuggestedBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionSuggestedBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSuggestedBinding callocStack(MemoryStack stack) {
        return wrap(XrActionSuggestedBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSuggestedBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSuggestedBinding.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrActionSuggestedBinding.ACTION); }
    /** Unsafe version of {@link #binding}. */
    public static long nbinding(long struct) { return UNSAFE.getLong(null, struct + XrActionSuggestedBinding.BINDING); }

    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrActionSuggestedBinding.ACTION, value.address()); }
    /** Unsafe version of {@link #binding(long) binding}. */
    public static void nbinding(long struct, long value) { UNSAFE.putLong(null, struct + XrActionSuggestedBinding.BINDING, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActionSuggestedBinding.ACTION));
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

    /** An array of {@link XrActionSuggestedBinding} structs. */
    public static class Buffer extends StructBuffer<XrActionSuggestedBinding, Buffer> implements NativeResource {

        private static final XrActionSuggestedBinding ELEMENT_FACTORY = XrActionSuggestedBinding.create(-1L);

        /**
         * Creates a new {@code XrActionSuggestedBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionSuggestedBinding#SIZEOF}, and its mark will be undefined.
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
        protected XrActionSuggestedBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code action} field. */
        @NativeType("XrAction")
        public long action() { return XrActionSuggestedBinding.naction(address()); }
        /** Returns the value of the {@code binding} field. */
        @NativeType("XrPath")
        public long binding() { return XrActionSuggestedBinding.nbinding(address()); }

        /** Sets the specified value to the {@code action} field. */
        public XrActionSuggestedBinding.Buffer action(XrAction value) { XrActionSuggestedBinding.naction(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public XrActionSuggestedBinding.Buffer binding(@NativeType("XrPath") long value) { XrActionSuggestedBinding.nbinding(address(), value); return this; }

    }

}