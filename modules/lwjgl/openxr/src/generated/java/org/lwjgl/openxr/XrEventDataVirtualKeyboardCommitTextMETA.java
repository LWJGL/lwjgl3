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

import static org.lwjgl.openxr.METAVirtualKeyboard.*;

/**
 * <pre>{@code
 * struct XrEventDataVirtualKeyboardCommitTextMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrVirtualKeyboardMETA keyboard;
 *     char text[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META];
 * }}</pre>
 */
public class XrEventDataVirtualKeyboardCommitTextMETA extends Struct<XrEventDataVirtualKeyboardCommitTextMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        KEYBOARD,
        TEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        KEYBOARD = layout.offsetof(2);
        TEXT = layout.offsetof(3);
    }

    protected XrEventDataVirtualKeyboardCommitTextMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataVirtualKeyboardCommitTextMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataVirtualKeyboardCommitTextMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataVirtualKeyboardCommitTextMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataVirtualKeyboardCommitTextMETA(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code text} field. */
    @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
    public ByteBuffer text() { return ntext(address()); }
    /** @return the null-terminated string stored in the {@code text} field. */
    @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
    public String textString() { return ntextString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META} value to the {@code type} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVirtualKeyboardCommitTextMETA set(
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
    public XrEventDataVirtualKeyboardCommitTextMETA set(XrEventDataVirtualKeyboardCommitTextMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardCommitTextMETA malloc() {
        return new XrEventDataVirtualKeyboardCommitTextMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardCommitTextMETA calloc() {
        return new XrEventDataVirtualKeyboardCommitTextMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataVirtualKeyboardCommitTextMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataVirtualKeyboardCommitTextMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance for the specified memory address. */
    public static XrEventDataVirtualKeyboardCommitTextMETA create(long address) {
        return new XrEventDataVirtualKeyboardCommitTextMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataVirtualKeyboardCommitTextMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataVirtualKeyboardCommitTextMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataVirtualKeyboardCommitTextMETA}. */
    public static XrEventDataVirtualKeyboardCommitTextMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataVirtualKeyboardCommitTextMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataVirtualKeyboardCommitTextMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataVirtualKeyboardCommitTextMETA.Buffer}. */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataVirtualKeyboardCommitTextMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA malloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardCommitTextMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardCommitTextMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA calloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardCommitTextMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataVirtualKeyboardCommitTextMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.NEXT); }
    /** Unsafe version of {@link #keyboard}. */
    public static long nkeyboard(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.KEYBOARD); }
    /** Unsafe version of {@link #text}. */
    public static ByteBuffer ntext(long struct) { return memByteBuffer(struct + XrEventDataVirtualKeyboardCommitTextMETA.TEXT, XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META); }
    /** Unsafe version of {@link #textString}. */
    public static String ntextString(long struct) { return memUTF8(struct + XrEventDataVirtualKeyboardCommitTextMETA.TEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataVirtualKeyboardCommitTextMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataVirtualKeyboardCommitTextMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataVirtualKeyboardCommitTextMETA, Buffer> implements NativeResource {

        private static final XrEventDataVirtualKeyboardCommitTextMETA ELEMENT_FACTORY = XrEventDataVirtualKeyboardCommitTextMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataVirtualKeyboardCommitTextMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataVirtualKeyboardCommitTextMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVirtualKeyboardCommitTextMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVirtualKeyboardCommitTextMETA.nnext(address()); }
        /** @return the value of the {@code keyboard} field. */
        @NativeType("XrVirtualKeyboardMETA")
        public long keyboard() { return XrEventDataVirtualKeyboardCommitTextMETA.nkeyboard(address()); }
        /** @return a {@link ByteBuffer} view of the {@code text} field. */
        @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
        public ByteBuffer text() { return XrEventDataVirtualKeyboardCommitTextMETA.ntext(address()); }
        /** @return the null-terminated string stored in the {@code text} field. */
        @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
        public String textString() { return XrEventDataVirtualKeyboardCommitTextMETA.ntextString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVirtualKeyboardCommitTextMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META} value to the {@code type} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataVirtualKeyboardCommitTextMETA.nnext(address(), value); return this; }

    }

}