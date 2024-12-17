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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrVirtualKeyboardTextContextChangeInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     char const * textContext;
 * }}</pre>
 */
public class XrVirtualKeyboardTextContextChangeInfoMETA extends Struct<XrVirtualKeyboardTextContextChangeInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TEXTCONTEXT;

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
        TEXTCONTEXT = layout.offsetof(2);
    }

    protected XrVirtualKeyboardTextContextChangeInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardTextContextChangeInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardTextContextChangeInfoMETA(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code textContext} field. */
    @NativeType("char const *")
    public ByteBuffer textContext() { return ntextContext(address()); }
    /** @return the null-terminated string pointed to by the {@code textContext} field. */
    @NativeType("char const *")
    public String textContextString() { return ntextContextString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVirtualKeyboardTextContextChangeInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META} value to the {@code type} field. */
    public XrVirtualKeyboardTextContextChangeInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrVirtualKeyboardTextContextChangeInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code textContext} field. */
    public XrVirtualKeyboardTextContextChangeInfoMETA textContext(@NativeType("char const *") ByteBuffer value) { ntextContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardTextContextChangeInfoMETA set(
        int type,
        long next,
        ByteBuffer textContext
    ) {
        type(type);
        next(next);
        textContext(textContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardTextContextChangeInfoMETA set(XrVirtualKeyboardTextContextChangeInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardTextContextChangeInfoMETA malloc() {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardTextContextChangeInfoMETA calloc() {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardTextContextChangeInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardTextContextChangeInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardTextContextChangeInfoMETA create(long address) {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVirtualKeyboardTextContextChangeInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardTextContextChangeInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardTextContextChangeInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardTextContextChangeInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardTextContextChangeInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.NEXT); }
    /** Unsafe version of {@link #textContext}. */
    public static ByteBuffer ntextContext(long struct) { return memByteBufferNT1(memGetAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TEXTCONTEXT)); }
    /** Unsafe version of {@link #textContextString}. */
    public static String ntextContextString(long struct) { return memUTF8(memGetAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TEXTCONTEXT)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #textContext(ByteBuffer) textContext}. */
    public static void ntextContext(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TEXTCONTEXT, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVirtualKeyboardTextContextChangeInfoMETA.TEXTCONTEXT));
    }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardTextContextChangeInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardTextContextChangeInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardTextContextChangeInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardTextContextChangeInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardTextContextChangeInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardTextContextChangeInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardTextContextChangeInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardTextContextChangeInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardTextContextChangeInfoMETA.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code textContext} field. */
        @NativeType("char const *")
        public ByteBuffer textContext() { return XrVirtualKeyboardTextContextChangeInfoMETA.ntextContext(address()); }
        /** @return the null-terminated string pointed to by the {@code textContext} field. */
        @NativeType("char const *")
        public String textContextString() { return XrVirtualKeyboardTextContextChangeInfoMETA.ntextContextString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVirtualKeyboardTextContextChangeInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardTextContextChangeInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META} value to the {@code type} field. */
        public XrVirtualKeyboardTextContextChangeInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrVirtualKeyboardTextContextChangeInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardTextContextChangeInfoMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code textContext} field. */
        public XrVirtualKeyboardTextContextChangeInfoMETA.Buffer textContext(@NativeType("char const *") ByteBuffer value) { XrVirtualKeyboardTextContextChangeInfoMETA.ntextContext(address(), value); return this; }

    }

}