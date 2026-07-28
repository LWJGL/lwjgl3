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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEventDataVirtualKeyboardBackspaceMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrVirtualKeyboardMETA keyboard;
 * }}</pre>
 */
public class XrEventDataVirtualKeyboardBackspaceMETA extends Struct<XrEventDataVirtualKeyboardBackspaceMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        KEYBOARD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        KEYBOARD = layout.offsetof(2);
    }

    protected XrEventDataVirtualKeyboardBackspaceMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataVirtualKeyboardBackspaceMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataVirtualKeyboardBackspaceMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataVirtualKeyboardBackspaceMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataVirtualKeyboardBackspaceMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code keyboard} field. */
    @NativeType("XrVirtualKeyboardMETA")
    public long keyboard() { return nkeyboard(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META} value to the {@code type} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVirtualKeyboardBackspaceMETA set(
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
    public XrEventDataVirtualKeyboardBackspaceMETA set(XrEventDataVirtualKeyboardBackspaceMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardBackspaceMETA malloc() {
        return new XrEventDataVirtualKeyboardBackspaceMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardBackspaceMETA calloc() {
        return new XrEventDataVirtualKeyboardBackspaceMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataVirtualKeyboardBackspaceMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataVirtualKeyboardBackspaceMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance for the specified memory address. */
    public static XrEventDataVirtualKeyboardBackspaceMETA create(long address) {
        return new XrEventDataVirtualKeyboardBackspaceMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataVirtualKeyboardBackspaceMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataVirtualKeyboardBackspaceMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataVirtualKeyboardBackspaceMETA}. */
    public static XrEventDataVirtualKeyboardBackspaceMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataVirtualKeyboardBackspaceMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataVirtualKeyboardBackspaceMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataVirtualKeyboardBackspaceMETA.Buffer}. */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataVirtualKeyboardBackspaceMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA malloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardBackspaceMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardBackspaceMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA calloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardBackspaceMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataVirtualKeyboardBackspaceMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.NEXT); }
    /** Unsafe version of {@link #keyboard}. */
    public static long nkeyboard(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.KEYBOARD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataVirtualKeyboardBackspaceMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataVirtualKeyboardBackspaceMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataVirtualKeyboardBackspaceMETA, Buffer> implements NativeResource {

        private static final XrEventDataVirtualKeyboardBackspaceMETA ELEMENT_FACTORY = XrEventDataVirtualKeyboardBackspaceMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataVirtualKeyboardBackspaceMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataVirtualKeyboardBackspaceMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVirtualKeyboardBackspaceMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVirtualKeyboardBackspaceMETA.nnext(address()); }
        /** @return the value of the {@code keyboard} field. */
        @NativeType("XrVirtualKeyboardMETA")
        public long keyboard() { return XrEventDataVirtualKeyboardBackspaceMETA.nkeyboard(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVirtualKeyboardBackspaceMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META} value to the {@code type} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataVirtualKeyboardBackspaceMETA.nnext(address(), value); return this; }

    }

}