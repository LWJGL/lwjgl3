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
 * Virtual keyboard creation info.
 * 
 * <h5>Description</h5>
 * 
 * <p>The struct is used for keyboard creation. Empty with the intention of future extension.</p>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if {@code supportsVirtualKeyboard} is {@link XR10#XR_FALSE FALSE} when checking the device compatibility.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardCreateInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAVirtualKeyboard#xrCreateVirtualKeyboardMETA CreateVirtualKeyboardMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardCreateInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrVirtualKeyboardCreateInfoMETA extends Struct<XrVirtualKeyboardCreateInfoMETA> implements NativeResource {

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

    protected XrVirtualKeyboardCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardCreateInfoMETA(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META} value to the {@link #type} field. */
    public XrVirtualKeyboardCreateInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardCreateInfoMETA set(
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
    public XrVirtualKeyboardCreateInfoMETA set(XrVirtualKeyboardCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardCreateInfoMETA malloc() {
        return new XrVirtualKeyboardCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardCreateInfoMETA calloc() {
        return new XrVirtualKeyboardCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardCreateInfoMETA create(long address) {
        return new XrVirtualKeyboardCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardCreateInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardCreateInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardCreateInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardCreateInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardCreateInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardCreateInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardCreateInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardCreateInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardCreateInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@link XrVirtualKeyboardCreateInfoMETA#type} field. */
        public XrVirtualKeyboardCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META} value to the {@link XrVirtualKeyboardCreateInfoMETA#type} field. */
        public XrVirtualKeyboardCreateInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardCreateInfoMETA#next} field. */
        public XrVirtualKeyboardCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardCreateInfoMETA.nnext(address(), value); return this; }

    }

}