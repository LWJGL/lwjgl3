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
 * struct XrEnvironmentDepthSwapchainCreateInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrEnvironmentDepthSwapchainCreateFlagsMETA createFlags;
 * }}</pre>
 */
public class XrEnvironmentDepthSwapchainCreateInfoMETA extends Struct<XrEnvironmentDepthSwapchainCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
    }

    protected XrEnvironmentDepthSwapchainCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthSwapchainCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthSwapchainCreateInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrEnvironmentDepthSwapchainCreateFlagsMETA")
    public long createFlags() { return ncreateFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentDepthSwapchainCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META} value to the {@code type} field. */
    public XrEnvironmentDepthSwapchainCreateInfoMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentDepthSwapchainCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrEnvironmentDepthSwapchainCreateInfoMETA createFlags(@NativeType("XrEnvironmentDepthSwapchainCreateFlagsMETA") long value) { ncreateFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthSwapchainCreateInfoMETA set(
        int type,
        long next,
        long createFlags
    ) {
        type(type);
        next(next);
        createFlags(createFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthSwapchainCreateInfoMETA set(XrEnvironmentDepthSwapchainCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA malloc() {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA calloc() {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA create(long address) {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentDepthSwapchainCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthSwapchainCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthSwapchainCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return memGetLong(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.CREATEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { memPutLong(struct + XrEnvironmentDepthSwapchainCreateInfoMETA.CREATEFLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthSwapchainCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthSwapchainCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthSwapchainCreateInfoMETA ELEMENT_FACTORY = XrEnvironmentDepthSwapchainCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthSwapchainCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthSwapchainCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthSwapchainCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentDepthSwapchainCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrEnvironmentDepthSwapchainCreateFlagsMETA")
        public long createFlags() { return XrEnvironmentDepthSwapchainCreateInfoMETA.ncreateFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthSwapchainCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META} value to the {@code type} field. */
        public XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentDepthSwapchainCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrEnvironmentDepthSwapchainCreateInfoMETA.Buffer createFlags(@NativeType("XrEnvironmentDepthSwapchainCreateFlagsMETA") long value) { XrEnvironmentDepthSwapchainCreateInfoMETA.ncreateFlags(address(), value); return this; }

    }

}