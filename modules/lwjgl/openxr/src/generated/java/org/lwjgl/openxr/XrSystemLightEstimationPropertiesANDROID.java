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
 * struct XrSystemLightEstimationPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsLightEstimation;
 * }}</pre>
 */
public class XrSystemLightEstimationPropertiesANDROID extends Struct<XrSystemLightEstimationPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSLIGHTESTIMATION;

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
        SUPPORTSLIGHTESTIMATION = layout.offsetof(2);
    }

    protected XrSystemLightEstimationPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemLightEstimationPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemLightEstimationPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemLightEstimationPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemLightEstimationPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsLightEstimation} field. */
    @NativeType("XrBool32")
    public boolean supportsLightEstimation() { return nsupportsLightEstimation(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemLightEstimationPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemLightEstimationPropertiesANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemLightEstimationPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemLightEstimationPropertiesANDROID set(
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
    public XrSystemLightEstimationPropertiesANDROID set(XrSystemLightEstimationPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemLightEstimationPropertiesANDROID malloc() {
        return new XrSystemLightEstimationPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemLightEstimationPropertiesANDROID calloc() {
        return new XrSystemLightEstimationPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemLightEstimationPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemLightEstimationPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemLightEstimationPropertiesANDROID create(long address) {
        return new XrSystemLightEstimationPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemLightEstimationPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemLightEstimationPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemLightEstimationPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemLightEstimationPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemLightEstimationPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemLightEstimationPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemLightEstimationPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemLightEstimationPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemLightEstimationPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemLightEstimationPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemLightEstimationPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemLightEstimationPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsLightEstimation}. */
    public static int nsupportsLightEstimation(long struct) { return memGetInt(struct + XrSystemLightEstimationPropertiesANDROID.SUPPORTSLIGHTESTIMATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemLightEstimationPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemLightEstimationPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemLightEstimationPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemLightEstimationPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemLightEstimationPropertiesANDROID ELEMENT_FACTORY = XrSystemLightEstimationPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemLightEstimationPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemLightEstimationPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemLightEstimationPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemLightEstimationPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemLightEstimationPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsLightEstimation} field. */
        @NativeType("XrBool32")
        public boolean supportsLightEstimation() { return XrSystemLightEstimationPropertiesANDROID.nsupportsLightEstimation(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemLightEstimationPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemLightEstimationPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemLightEstimationPropertiesANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemLightEstimationPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemLightEstimationPropertiesANDROID.nnext(address(), value); return this; }

    }

}