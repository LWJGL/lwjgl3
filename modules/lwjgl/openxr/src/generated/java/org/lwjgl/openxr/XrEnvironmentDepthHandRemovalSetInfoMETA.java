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
 * struct XrEnvironmentDepthHandRemovalSetInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 enabled;
 * }}</pre>
 */
public class XrEnvironmentDepthHandRemovalSetInfoMETA extends Struct<XrEnvironmentDepthHandRemovalSetInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED;

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
        ENABLED = layout.offsetof(2);
    }

    protected XrEnvironmentDepthHandRemovalSetInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthHandRemovalSetInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthHandRemovalSetInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code enabled} field. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentDepthHandRemovalSetInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META} value to the {@code type} field. */
    public XrEnvironmentDepthHandRemovalSetInfoMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentDepthHandRemovalSetInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code enabled} field. */
    public XrEnvironmentDepthHandRemovalSetInfoMETA enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthHandRemovalSetInfoMETA set(
        int type,
        long next,
        boolean enabled
    ) {
        type(type);
        next(next);
        enabled(enabled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthHandRemovalSetInfoMETA set(XrEnvironmentDepthHandRemovalSetInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA malloc() {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA calloc() {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA create(long address) {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentDepthHandRemovalSetInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthHandRemovalSetInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthHandRemovalSetInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.ENABLED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { memPutInt(struct + XrEnvironmentDepthHandRemovalSetInfoMETA.ENABLED, value); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthHandRemovalSetInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthHandRemovalSetInfoMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthHandRemovalSetInfoMETA ELEMENT_FACTORY = XrEnvironmentDepthHandRemovalSetInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthHandRemovalSetInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthHandRemovalSetInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthHandRemovalSetInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentDepthHandRemovalSetInfoMETA.nnext(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrEnvironmentDepthHandRemovalSetInfoMETA.nenabled(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthHandRemovalSetInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META} value to the {@code type} field. */
        public XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentDepthHandRemovalSetInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code enabled} field. */
        public XrEnvironmentDepthHandRemovalSetInfoMETA.Buffer enabled(@NativeType("XrBool32") boolean value) { XrEnvironmentDepthHandRemovalSetInfoMETA.nenabled(address(), value ? 1 : 0); return this; }

    }

}