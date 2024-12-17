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
 * struct XrInputSourceLocalizedNameGetInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrPath sourcePath;
 *     XrInputSourceLocalizedNameFlags whichComponents;
 * }}</pre>
 */
public class XrInputSourceLocalizedNameGetInfo extends Struct<XrInputSourceLocalizedNameGetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SOURCEPATH,
        WHICHCOMPONENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SOURCEPATH = layout.offsetof(2);
        WHICHCOMPONENTS = layout.offsetof(3);
    }

    protected XrInputSourceLocalizedNameGetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInputSourceLocalizedNameGetInfo create(long address, @Nullable ByteBuffer container) {
        return new XrInputSourceLocalizedNameGetInfo(address, container);
    }

    /**
     * Creates a {@code XrInputSourceLocalizedNameGetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInputSourceLocalizedNameGetInfo(ByteBuffer container) {
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
    /** @return the value of the {@code sourcePath} field. */
    @NativeType("XrPath")
    public long sourcePath() { return nsourcePath(address()); }
    /** @return the value of the {@code whichComponents} field. */
    @NativeType("XrInputSourceLocalizedNameFlags")
    public long whichComponents() { return nwhichComponents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInputSourceLocalizedNameGetInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO} value to the {@code type} field. */
    public XrInputSourceLocalizedNameGetInfo type$Default() { return type(XR10.XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrInputSourceLocalizedNameGetInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code sourcePath} field. */
    public XrInputSourceLocalizedNameGetInfo sourcePath(@NativeType("XrPath") long value) { nsourcePath(address(), value); return this; }
    /** Sets the specified value to the {@code whichComponents} field. */
    public XrInputSourceLocalizedNameGetInfo whichComponents(@NativeType("XrInputSourceLocalizedNameFlags") long value) { nwhichComponents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInputSourceLocalizedNameGetInfo set(
        int type,
        long next,
        long sourcePath,
        long whichComponents
    ) {
        type(type);
        next(next);
        sourcePath(sourcePath);
        whichComponents(whichComponents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInputSourceLocalizedNameGetInfo set(XrInputSourceLocalizedNameGetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInputSourceLocalizedNameGetInfo malloc() {
        return new XrInputSourceLocalizedNameGetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInputSourceLocalizedNameGetInfo calloc() {
        return new XrInputSourceLocalizedNameGetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance allocated with {@link BufferUtils}. */
    public static XrInputSourceLocalizedNameGetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInputSourceLocalizedNameGetInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance for the specified memory address. */
    public static XrInputSourceLocalizedNameGetInfo create(long address) {
        return new XrInputSourceLocalizedNameGetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInputSourceLocalizedNameGetInfo createSafe(long address) {
        return address == NULL ? null : new XrInputSourceLocalizedNameGetInfo(address, null);
    }

    /**
     * Returns a new {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInputSourceLocalizedNameGetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInputSourceLocalizedNameGetInfo malloc(MemoryStack stack) {
        return new XrInputSourceLocalizedNameGetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInputSourceLocalizedNameGetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInputSourceLocalizedNameGetInfo calloc(MemoryStack stack) {
        return new XrInputSourceLocalizedNameGetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInputSourceLocalizedNameGetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInputSourceLocalizedNameGetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInputSourceLocalizedNameGetInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInputSourceLocalizedNameGetInfo.NEXT); }
    /** Unsafe version of {@link #sourcePath}. */
    public static long nsourcePath(long struct) { return memGetLong(struct + XrInputSourceLocalizedNameGetInfo.SOURCEPATH); }
    /** Unsafe version of {@link #whichComponents}. */
    public static long nwhichComponents(long struct) { return memGetLong(struct + XrInputSourceLocalizedNameGetInfo.WHICHCOMPONENTS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInputSourceLocalizedNameGetInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInputSourceLocalizedNameGetInfo.NEXT, value); }
    /** Unsafe version of {@link #sourcePath(long) sourcePath}. */
    public static void nsourcePath(long struct, long value) { memPutLong(struct + XrInputSourceLocalizedNameGetInfo.SOURCEPATH, value); }
    /** Unsafe version of {@link #whichComponents(long) whichComponents}. */
    public static void nwhichComponents(long struct, long value) { memPutLong(struct + XrInputSourceLocalizedNameGetInfo.WHICHCOMPONENTS, value); }

    // -----------------------------------

    /** An array of {@link XrInputSourceLocalizedNameGetInfo} structs. */
    public static class Buffer extends StructBuffer<XrInputSourceLocalizedNameGetInfo, Buffer> implements NativeResource {

        private static final XrInputSourceLocalizedNameGetInfo ELEMENT_FACTORY = XrInputSourceLocalizedNameGetInfo.create(-1L);

        /**
         * Creates a new {@code XrInputSourceLocalizedNameGetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInputSourceLocalizedNameGetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInputSourceLocalizedNameGetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInputSourceLocalizedNameGetInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInputSourceLocalizedNameGetInfo.nnext(address()); }
        /** @return the value of the {@code sourcePath} field. */
        @NativeType("XrPath")
        public long sourcePath() { return XrInputSourceLocalizedNameGetInfo.nsourcePath(address()); }
        /** @return the value of the {@code whichComponents} field. */
        @NativeType("XrInputSourceLocalizedNameFlags")
        public long whichComponents() { return XrInputSourceLocalizedNameGetInfo.nwhichComponents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInputSourceLocalizedNameGetInfo.Buffer type(@NativeType("XrStructureType") int value) { XrInputSourceLocalizedNameGetInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO} value to the {@code type} field. */
        public XrInputSourceLocalizedNameGetInfo.Buffer type$Default() { return type(XR10.XR_TYPE_INPUT_SOURCE_LOCALIZED_NAME_GET_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrInputSourceLocalizedNameGetInfo.Buffer next(@NativeType("void const *") long value) { XrInputSourceLocalizedNameGetInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code sourcePath} field. */
        public XrInputSourceLocalizedNameGetInfo.Buffer sourcePath(@NativeType("XrPath") long value) { XrInputSourceLocalizedNameGetInfo.nsourcePath(address(), value); return this; }
        /** Sets the specified value to the {@code whichComponents} field. */
        public XrInputSourceLocalizedNameGetInfo.Buffer whichComponents(@NativeType("XrInputSourceLocalizedNameFlags") long value) { XrInputSourceLocalizedNameGetInfo.nwhichComponents(address(), value); return this; }

    }

}