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
 * struct XrSystemEnvironmentDepthPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsEnvironmentDepth;
 *     XrBool32 supportsHandRemoval;
 * }}</pre>
 */
public class XrSystemEnvironmentDepthPropertiesMETA extends Struct<XrSystemEnvironmentDepthPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSENVIRONMENTDEPTH,
        SUPPORTSHANDREMOVAL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSENVIRONMENTDEPTH = layout.offsetof(2);
        SUPPORTSHANDREMOVAL = layout.offsetof(3);
    }

    protected XrSystemEnvironmentDepthPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemEnvironmentDepthPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemEnvironmentDepthPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemEnvironmentDepthPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemEnvironmentDepthPropertiesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsEnvironmentDepth} field. */
    @NativeType("XrBool32")
    public boolean supportsEnvironmentDepth() { return nsupportsEnvironmentDepth(address()) != 0; }
    /** @return the value of the {@code supportsHandRemoval} field. */
    @NativeType("XrBool32")
    public boolean supportsHandRemoval() { return nsupportsHandRemoval(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemEnvironmentDepthPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemEnvironmentDepthPropertiesMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemEnvironmentDepthPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemEnvironmentDepthPropertiesMETA set(
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
    public XrSystemEnvironmentDepthPropertiesMETA set(XrSystemEnvironmentDepthPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemEnvironmentDepthPropertiesMETA malloc() {
        return new XrSystemEnvironmentDepthPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemEnvironmentDepthPropertiesMETA calloc() {
        return new XrSystemEnvironmentDepthPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemEnvironmentDepthPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemEnvironmentDepthPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance for the specified memory address. */
    public static XrSystemEnvironmentDepthPropertiesMETA create(long address) {
        return new XrSystemEnvironmentDepthPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemEnvironmentDepthPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemEnvironmentDepthPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemEnvironmentDepthPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEnvironmentDepthPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemEnvironmentDepthPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemEnvironmentDepthPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemEnvironmentDepthPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemEnvironmentDepthPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemEnvironmentDepthPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemEnvironmentDepthPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemEnvironmentDepthPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsEnvironmentDepth}. */
    public static int nsupportsEnvironmentDepth(long struct) { return memGetInt(struct + XrSystemEnvironmentDepthPropertiesMETA.SUPPORTSENVIRONMENTDEPTH); }
    /** Unsafe version of {@link #supportsHandRemoval}. */
    public static int nsupportsHandRemoval(long struct) { return memGetInt(struct + XrSystemEnvironmentDepthPropertiesMETA.SUPPORTSHANDREMOVAL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemEnvironmentDepthPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemEnvironmentDepthPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemEnvironmentDepthPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemEnvironmentDepthPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemEnvironmentDepthPropertiesMETA ELEMENT_FACTORY = XrSystemEnvironmentDepthPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemEnvironmentDepthPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemEnvironmentDepthPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemEnvironmentDepthPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemEnvironmentDepthPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemEnvironmentDepthPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsEnvironmentDepth} field. */
        @NativeType("XrBool32")
        public boolean supportsEnvironmentDepth() { return XrSystemEnvironmentDepthPropertiesMETA.nsupportsEnvironmentDepth(address()) != 0; }
        /** @return the value of the {@code supportsHandRemoval} field. */
        @NativeType("XrBool32")
        public boolean supportsHandRemoval() { return XrSystemEnvironmentDepthPropertiesMETA.nsupportsHandRemoval(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemEnvironmentDepthPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemEnvironmentDepthPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemEnvironmentDepthPropertiesMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemEnvironmentDepthPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemEnvironmentDepthPropertiesMETA.nnext(address(), value); return this; }

    }

}