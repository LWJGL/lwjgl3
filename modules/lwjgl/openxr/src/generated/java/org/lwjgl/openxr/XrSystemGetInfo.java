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
 * struct XrSystemGetInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrFormFactor formFactor;
 * }}</pre>
 */
public class XrSystemGetInfo extends Struct<XrSystemGetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FORMFACTOR;

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
        FORMFACTOR = layout.offsetof(2);
    }

    protected XrSystemGetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemGetInfo create(long address, @Nullable ByteBuffer container) {
        return new XrSystemGetInfo(address, container);
    }

    /**
     * Creates a {@code XrSystemGetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemGetInfo(ByteBuffer container) {
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
    /** @return the value of the {@code formFactor} field. */
    @NativeType("XrFormFactor")
    public int formFactor() { return nformFactor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemGetInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SYSTEM_GET_INFO TYPE_SYSTEM_GET_INFO} value to the {@code type} field. */
    public XrSystemGetInfo type$Default() { return type(XR10.XR_TYPE_SYSTEM_GET_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemGetInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code formFactor} field. */
    public XrSystemGetInfo formFactor(@NativeType("XrFormFactor") int value) { nformFactor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemGetInfo set(
        int type,
        long next,
        int formFactor
    ) {
        type(type);
        next(next);
        formFactor(formFactor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemGetInfo set(XrSystemGetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemGetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemGetInfo malloc() {
        return new XrSystemGetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemGetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemGetInfo calloc() {
        return new XrSystemGetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemGetInfo} instance allocated with {@link BufferUtils}. */
    public static XrSystemGetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemGetInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemGetInfo} instance for the specified memory address. */
    public static XrSystemGetInfo create(long address) {
        return new XrSystemGetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemGetInfo createSafe(long address) {
        return address == NULL ? null : new XrSystemGetInfo(address, null);
    }

    /**
     * Returns a new {@link XrSystemGetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemGetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemGetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemGetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemGetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemGetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemGetInfo malloc(MemoryStack stack) {
        return new XrSystemGetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemGetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemGetInfo calloc(MemoryStack stack) {
        return new XrSystemGetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemGetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemGetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemGetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemGetInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemGetInfo.NEXT); }
    /** Unsafe version of {@link #formFactor}. */
    public static int nformFactor(long struct) { return memGetInt(struct + XrSystemGetInfo.FORMFACTOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemGetInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemGetInfo.NEXT, value); }
    /** Unsafe version of {@link #formFactor(int) formFactor}. */
    public static void nformFactor(long struct, int value) { memPutInt(struct + XrSystemGetInfo.FORMFACTOR, value); }

    // -----------------------------------

    /** An array of {@link XrSystemGetInfo} structs. */
    public static class Buffer extends StructBuffer<XrSystemGetInfo, Buffer> implements NativeResource {

        private static final XrSystemGetInfo ELEMENT_FACTORY = XrSystemGetInfo.create(-1L);

        /**
         * Creates a new {@code XrSystemGetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemGetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemGetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemGetInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemGetInfo.nnext(address()); }
        /** @return the value of the {@code formFactor} field. */
        @NativeType("XrFormFactor")
        public int formFactor() { return XrSystemGetInfo.nformFactor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemGetInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSystemGetInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SYSTEM_GET_INFO TYPE_SYSTEM_GET_INFO} value to the {@code type} field. */
        public XrSystemGetInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SYSTEM_GET_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemGetInfo.Buffer next(@NativeType("void const *") long value) { XrSystemGetInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code formFactor} field. */
        public XrSystemGetInfo.Buffer formFactor(@NativeType("XrFormFactor") int value) { XrSystemGetInfo.nformFactor(address(), value); return this; }

    }

}