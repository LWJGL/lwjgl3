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
 * struct XrSystemSpaceDiscoveryPropertiesMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 supportsSpaceDiscovery;
 * }}</pre>
 */
public class XrSystemSpaceDiscoveryPropertiesMETA extends Struct<XrSystemSpaceDiscoveryPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPACEDISCOVERY;

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
        SUPPORTSSPACEDISCOVERY = layout.offsetof(2);
    }

    protected XrSystemSpaceDiscoveryPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpaceDiscoveryPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpaceDiscoveryPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemSpaceDiscoveryPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpaceDiscoveryPropertiesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code supportsSpaceDiscovery} field. */
    @NativeType("XrBool32")
    public boolean supportsSpaceDiscovery() { return nsupportsSpaceDiscovery(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemSpaceDiscoveryPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemSpaceDiscoveryPropertiesMETA type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemSpaceDiscoveryPropertiesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpaceDiscoveryPropertiesMETA set(
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
    public XrSystemSpaceDiscoveryPropertiesMETA set(XrSystemSpaceDiscoveryPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpaceDiscoveryPropertiesMETA malloc() {
        return new XrSystemSpaceDiscoveryPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpaceDiscoveryPropertiesMETA calloc() {
        return new XrSystemSpaceDiscoveryPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpaceDiscoveryPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpaceDiscoveryPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance for the specified memory address. */
    public static XrSystemSpaceDiscoveryPropertiesMETA create(long address) {
        return new XrSystemSpaceDiscoveryPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSpaceDiscoveryPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemSpaceDiscoveryPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSpaceDiscoveryPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemSpaceDiscoveryPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpaceDiscoveryPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemSpaceDiscoveryPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpaceDiscoveryPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSpaceDiscoveryPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpaceDiscoveryPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsSpaceDiscovery}. */
    public static int nsupportsSpaceDiscovery(long struct) { return memGetInt(struct + XrSystemSpaceDiscoveryPropertiesMETA.SUPPORTSSPACEDISCOVERY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSpaceDiscoveryPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpaceDiscoveryPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpaceDiscoveryPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpaceDiscoveryPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemSpaceDiscoveryPropertiesMETA ELEMENT_FACTORY = XrSystemSpaceDiscoveryPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemSpaceDiscoveryPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpaceDiscoveryPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpaceDiscoveryPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpaceDiscoveryPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemSpaceDiscoveryPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsSpaceDiscovery} field. */
        @NativeType("XrBool32")
        public boolean supportsSpaceDiscovery() { return XrSystemSpaceDiscoveryPropertiesMETA.nsupportsSpaceDiscovery(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemSpaceDiscoveryPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpaceDiscoveryPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemSpaceDiscoveryPropertiesMETA.Buffer type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemSpaceDiscoveryPropertiesMETA.Buffer next(@NativeType("void const *") long value) { XrSystemSpaceDiscoveryPropertiesMETA.nnext(address(), value); return this; }

    }

}