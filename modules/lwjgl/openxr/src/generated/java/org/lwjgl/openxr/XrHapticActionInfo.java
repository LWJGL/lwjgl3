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
 * struct XrHapticActionInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrAction action;
 *     XrPath subactionPath;
 * }}</pre>
 */
public class XrHapticActionInfo extends Struct<XrHapticActionInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        SUBACTIONPATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        SUBACTIONPATH = layout.offsetof(3);
    }

    protected XrHapticActionInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticActionInfo create(long address, @Nullable ByteBuffer container) {
        return new XrHapticActionInfo(address, container);
    }

    /**
     * Creates a {@code XrHapticActionInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticActionInfo(ByteBuffer container) {
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
    /** @return the value of the {@code action} field. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** @return the value of the {@code subactionPath} field. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticActionInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO} value to the {@code type} field. */
    public XrHapticActionInfo type$Default() { return type(XR10.XR_TYPE_HAPTIC_ACTION_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticActionInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code action} field. */
    public XrHapticActionInfo action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@code subactionPath} field. */
    public XrHapticActionInfo subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticActionInfo set(
        int type,
        long next,
        XrAction action,
        long subactionPath
    ) {
        type(type);
        next(next);
        action(action);
        subactionPath(subactionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticActionInfo set(XrHapticActionInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo malloc() {
        return new XrHapticActionInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo calloc() {
        return new XrHapticActionInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link BufferUtils}. */
    public static XrHapticActionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticActionInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticActionInfo} instance for the specified memory address. */
    public static XrHapticActionInfo create(long address) {
        return new XrHapticActionInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticActionInfo createSafe(long address) {
        return address == NULL ? null : new XrHapticActionInfo(address, null);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticActionInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticActionInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo malloc(MemoryStack stack) {
        return new XrHapticActionInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo calloc(MemoryStack stack) {
        return new XrHapticActionInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHapticActionInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticActionInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrHapticActionInfo.ACTION); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return memGetLong(struct + XrHapticActionInfo.SUBACTIONPATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHapticActionInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticActionInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrHapticActionInfo.ACTION, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { memPutLong(struct + XrHapticActionInfo.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticActionInfo.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrHapticActionInfo} structs. */
    public static class Buffer extends StructBuffer<XrHapticActionInfo, Buffer> implements NativeResource {

        private static final XrHapticActionInfo ELEMENT_FACTORY = XrHapticActionInfo.create(-1L);

        /**
         * Creates a new {@code XrHapticActionInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticActionInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticActionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticActionInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticActionInfo.nnext(address()); }
        /** @return the value of the {@code action} field. */
        @NativeType("XrAction")
        public long action() { return XrHapticActionInfo.naction(address()); }
        /** @return the value of the {@code subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrHapticActionInfo.nsubactionPath(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticActionInfo.Buffer type(@NativeType("XrStructureType") int value) { XrHapticActionInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_HAPTIC_ACTION_INFO TYPE_HAPTIC_ACTION_INFO} value to the {@code type} field. */
        public XrHapticActionInfo.Buffer type$Default() { return type(XR10.XR_TYPE_HAPTIC_ACTION_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticActionInfo.Buffer next(@NativeType("void const *") long value) { XrHapticActionInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code action} field. */
        public XrHapticActionInfo.Buffer action(XrAction value) { XrHapticActionInfo.naction(address(), value); return this; }
        /** Sets the specified value to the {@code subactionPath} field. */
        public XrHapticActionInfo.Buffer subactionPath(@NativeType("XrPath") long value) { XrHapticActionInfo.nsubactionPath(address(), value); return this; }

    }

}