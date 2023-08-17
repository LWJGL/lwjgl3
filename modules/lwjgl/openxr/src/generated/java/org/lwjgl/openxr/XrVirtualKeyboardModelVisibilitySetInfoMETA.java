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
 * Virtual keyboard model visibility.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVirtualKeyboard XR_META_virtual_keyboard} extension <b>must</b> be enabled prior to using {@link XrVirtualKeyboardModelVisibilitySetInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAVirtualKeyboard#xrSetVirtualKeyboardModelVisibilityMETA SetVirtualKeyboardModelVisibilityMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVirtualKeyboardModelVisibilitySetInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #visible};
 * }</code></pre>
 */
public class XrVirtualKeyboardModelVisibilitySetInfoMETA extends Struct<XrVirtualKeyboardModelVisibilitySetInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VISIBLE;

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
        VISIBLE = layout.offsetof(2);
    }

    protected XrVirtualKeyboardModelVisibilitySetInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardModelVisibilitySetInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA(ByteBuffer container) {
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
    /** an {@code XrBool32} that controls whether to show or hide the keyboard. */
    @NativeType("XrBool32")
    public boolean visible() { return nvisible(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META} value to the {@link #type} field. */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #visible} field. */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA visible(@NativeType("XrBool32") boolean value) { nvisible(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA set(
        int type,
        long next,
        boolean visible
    ) {
        type(type);
        next(next);
        visible(visible);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardModelVisibilitySetInfoMETA set(XrVirtualKeyboardModelVisibilitySetInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA malloc() {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA calloc() {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA create(long address) {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardModelVisibilitySetInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardModelVisibilitySetInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.NEXT); }
    /** Unsafe version of {@link #visible}. */
    public static int nvisible(long struct) { return UNSAFE.getInt(null, struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.VISIBLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #visible(boolean) visible}. */
    public static void nvisible(long struct, int value) { UNSAFE.putInt(null, struct + XrVirtualKeyboardModelVisibilitySetInfoMETA.VISIBLE, value); }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardModelVisibilitySetInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardModelVisibilitySetInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardModelVisibilitySetInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardModelVisibilitySetInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardModelVisibilitySetInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardModelVisibilitySetInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardModelVisibilitySetInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#visible} field. */
        @NativeType("XrBool32")
        public boolean visible() { return XrVirtualKeyboardModelVisibilitySetInfoMETA.nvisible(address()) != 0; }

        /** Sets the specified value to the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#type} field. */
        public XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardModelVisibilitySetInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META} value to the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#type} field. */
        public XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META); }
        /** Sets the specified value to the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#next} field. */
        public XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardModelVisibilitySetInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVirtualKeyboardModelVisibilitySetInfoMETA#visible} field. */
        public XrVirtualKeyboardModelVisibilitySetInfoMETA.Buffer visible(@NativeType("XrBool32") boolean value) { XrVirtualKeyboardModelVisibilitySetInfoMETA.nvisible(address(), value ? 1 : 0); return this; }

    }

}