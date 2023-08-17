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

import static org.lwjgl.openxr.METAVirtualKeyboard.*;

/**
 * Commit text event.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataVirtualKeyboardCommitTextMETA} event <b>must</b> be sent by the runtime when a character or string is input by the keyboard. The application <b>should</b> append to the text field that the keyboard is editing.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrEventDataVirtualKeyboardCommitTextMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
 * <li>{@code text} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link METAVirtualKeyboard#XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataVirtualKeyboardCommitTextMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrVirtualKeyboardMETA {@link #keyboard};
 *     char {@link #text}[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META];
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrVirtualKeyboardMETA} this event belongs to. */
    @NativeType("XrVirtualKeyboardMETA")
    public long keyboard() { return nkeyboard(address()); }
    /** the text string input by the keyboard. */
    @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
    public ByteBuffer text() { return ntext(address()); }
    /** the text string input by the keyboard. */
    @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
    public String textString() { return ntextString(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META} value to the {@link #type} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #keyboard} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA keyboard(XrVirtualKeyboardMETA value) { nkeyboard(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #text} field. */
    public XrEventDataVirtualKeyboardCommitTextMETA text(@NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]") ByteBuffer value) { ntext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVirtualKeyboardCommitTextMETA set(
        int type,
        long next,
        XrVirtualKeyboardMETA keyboard,
        ByteBuffer text
    ) {
        type(type);
        next(next);
        keyboard(keyboard);
        text(text);

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
    @Nullable
    public static XrEventDataVirtualKeyboardCommitTextMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataVirtualKeyboardCommitTextMETA(address, null);
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
    @Nullable
    public static XrEventDataVirtualKeyboardCommitTextMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataVirtualKeyboardCommitTextMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.NEXT); }
    /** Unsafe version of {@link #keyboard}. */
    public static long nkeyboard(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.KEYBOARD); }
    /** Unsafe version of {@link #text}. */
    public static ByteBuffer ntext(long struct) { return memByteBuffer(struct + XrEventDataVirtualKeyboardCommitTextMETA.TEXT, XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META); }
    /** Unsafe version of {@link #textString}. */
    public static String ntextString(long struct) { return memUTF8(struct + XrEventDataVirtualKeyboardCommitTextMETA.TEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataVirtualKeyboardCommitTextMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.NEXT, value); }
    /** Unsafe version of {@link #keyboard(XrVirtualKeyboardMETA) keyboard}. */
    public static void nkeyboard(long struct, XrVirtualKeyboardMETA value) { memPutAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.KEYBOARD, value.address()); }
    /** Unsafe version of {@link #text(ByteBuffer) text}. */
    public static void ntext(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META);
        }
        memCopy(memAddress(value), struct + XrEventDataVirtualKeyboardCommitTextMETA.TEXT, value.remaining());
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataVirtualKeyboardCommitTextMETA.KEYBOARD));
    }

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
        protected XrEventDataVirtualKeyboardCommitTextMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataVirtualKeyboardCommitTextMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVirtualKeyboardCommitTextMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataVirtualKeyboardCommitTextMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVirtualKeyboardCommitTextMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataVirtualKeyboardCommitTextMETA#keyboard} field. */
        @NativeType("XrVirtualKeyboardMETA")
        public long keyboard() { return XrEventDataVirtualKeyboardCommitTextMETA.nkeyboard(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrEventDataVirtualKeyboardCommitTextMETA#text} field. */
        @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
        public ByteBuffer text() { return XrEventDataVirtualKeyboardCommitTextMETA.ntext(address()); }
        /** @return the null-terminated string stored in the {@link XrEventDataVirtualKeyboardCommitTextMETA#text} field. */
        @NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]")
        public String textString() { return XrEventDataVirtualKeyboardCommitTextMETA.ntextString(address()); }

        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardCommitTextMETA#type} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVirtualKeyboardCommitTextMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META} value to the {@link XrEventDataVirtualKeyboardCommitTextMETA#type} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META); }
        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardCommitTextMETA#next} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataVirtualKeyboardCommitTextMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardCommitTextMETA#keyboard} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer keyboard(XrVirtualKeyboardMETA value) { XrEventDataVirtualKeyboardCommitTextMETA.nkeyboard(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrEventDataVirtualKeyboardCommitTextMETA#text} field. */
        public XrEventDataVirtualKeyboardCommitTextMETA.Buffer text(@NativeType("char[XR_MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META]") ByteBuffer value) { XrEventDataVirtualKeyboardCommitTextMETA.ntext(address(), value); return this; }

    }

}