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
 * struct XrSystemVirtualKeyboardPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsVirtualKeyboard;
 * }}</pre>
 */
public class XrSystemVirtualKeyboardPropertiesMETA extends Struct<XrSystemVirtualKeyboardPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSVIRTUALKEYBOARD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSVIRTUALKEYBOARD = layout.offsetof(2);
    }

    protected XrSystemVirtualKeyboardPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemVirtualKeyboardPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemVirtualKeyboardPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemVirtualKeyboardPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemVirtualKeyboardPropertiesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsVirtualKeyboard} field. */
    @NativeType("XrBool32")
    public boolean supportsVirtualKeyboard() { return nsupportsVirtualKeyboard(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemVirtualKeyboardPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemVirtualKeyboardPropertiesMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemVirtualKeyboardPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemVirtualKeyboardPropertiesMETA set(
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
    public XrSystemVirtualKeyboardPropertiesMETA set(XrSystemVirtualKeyboardPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemVirtualKeyboardPropertiesMETA malloc() {
        return new XrSystemVirtualKeyboardPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemVirtualKeyboardPropertiesMETA calloc() {
        return new XrSystemVirtualKeyboardPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemVirtualKeyboardPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemVirtualKeyboardPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance for the specified memory address. */
    public static XrSystemVirtualKeyboardPropertiesMETA create(long address) {
        return new XrSystemVirtualKeyboardPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemVirtualKeyboardPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemVirtualKeyboardPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemVirtualKeyboardPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemVirtualKeyboardPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemVirtualKeyboardPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemVirtualKeyboardPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemVirtualKeyboardPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemVirtualKeyboardPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemVirtualKeyboardPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemVirtualKeyboardPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemVirtualKeyboardPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsVirtualKeyboard}. */
    public static int nsupportsVirtualKeyboard(long struct) { return memGetInt(struct + XrSystemVirtualKeyboardPropertiesMETA.SUPPORTSVIRTUALKEYBOARD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemVirtualKeyboardPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemVirtualKeyboardPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemVirtualKeyboardPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemVirtualKeyboardPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemVirtualKeyboardPropertiesMETA ELEMENT_FACTORY = XrSystemVirtualKeyboardPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemVirtualKeyboardPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemVirtualKeyboardPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemVirtualKeyboardPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemVirtualKeyboardPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemVirtualKeyboardPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsVirtualKeyboard} field. */
        @NativeType("XrBool32")
        public boolean supportsVirtualKeyboard() { return XrSystemVirtualKeyboardPropertiesMETA.nsupportsVirtualKeyboard(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemVirtualKeyboardPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemVirtualKeyboardPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemVirtualKeyboardPropertiesMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemVirtualKeyboardPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemVirtualKeyboardPropertiesMETA.nnext(address(), value); return this; }

    }

}