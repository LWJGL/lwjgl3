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
 * Backspace key event.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataVirtualKeyboardBackspaceMETA} event <b>must</b> be sent by the runtime when the [Backspace] key is pressed. The application <b>should</b> update the text field that the keyboard is editing.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrEventDataVirtualKeyboardBackspaceMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code keyboard} <b>must</b> be a valid {@code XrVirtualKeyboardMETA} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataVirtualKeyboardBackspaceMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrVirtualKeyboardMETA {@link #keyboard};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrVirtualKeyboardMETA} this event belongs to. */
    @NativeType("XrVirtualKeyboardMETA")
    public long keyboard() { return nkeyboard(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META} value to the {@link #type} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #keyboard} field. */
    public XrEventDataVirtualKeyboardBackspaceMETA keyboard(XrVirtualKeyboardMETA value) { nkeyboard(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVirtualKeyboardBackspaceMETA set(
        int type,
        long next,
        XrVirtualKeyboardMETA keyboard
    ) {
        type(type);
        next(next);
        keyboard(keyboard);

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
    @Nullable
    public static XrEventDataVirtualKeyboardBackspaceMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataVirtualKeyboardBackspaceMETA(address, null);
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
    @Nullable
    public static XrEventDataVirtualKeyboardBackspaceMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataVirtualKeyboardBackspaceMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.NEXT); }
    /** Unsafe version of {@link #keyboard}. */
    public static long nkeyboard(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.KEYBOARD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataVirtualKeyboardBackspaceMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.NEXT, value); }
    /** Unsafe version of {@link #keyboard(XrVirtualKeyboardMETA) keyboard}. */
    public static void nkeyboard(long struct, XrVirtualKeyboardMETA value) { memPutAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.KEYBOARD, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataVirtualKeyboardBackspaceMETA.KEYBOARD));
    }

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
        protected XrEventDataVirtualKeyboardBackspaceMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataVirtualKeyboardBackspaceMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVirtualKeyboardBackspaceMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataVirtualKeyboardBackspaceMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVirtualKeyboardBackspaceMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataVirtualKeyboardBackspaceMETA#keyboard} field. */
        @NativeType("XrVirtualKeyboardMETA")
        public long keyboard() { return XrEventDataVirtualKeyboardBackspaceMETA.nkeyboard(address()); }

        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardBackspaceMETA#type} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVirtualKeyboardBackspaceMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META} value to the {@link XrEventDataVirtualKeyboardBackspaceMETA#type} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META); }
        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardBackspaceMETA#next} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataVirtualKeyboardBackspaceMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataVirtualKeyboardBackspaceMETA#keyboard} field. */
        public XrEventDataVirtualKeyboardBackspaceMETA.Buffer keyboard(XrVirtualKeyboardMETA value) { XrEventDataVirtualKeyboardBackspaceMETA.nkeyboard(address(), value); return this; }

    }

}