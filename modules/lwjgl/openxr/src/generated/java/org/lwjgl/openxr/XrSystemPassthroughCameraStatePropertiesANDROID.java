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
 * struct XrSystemPassthroughCameraStatePropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsPassthroughCameraState;
 * }}</pre>
 */
public class XrSystemPassthroughCameraStatePropertiesANDROID extends Struct<XrSystemPassthroughCameraStatePropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSPASSTHROUGHCAMERASTATE;

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
        SUPPORTSPASSTHROUGHCAMERASTATE = layout.offsetof(2);
    }

    protected XrSystemPassthroughCameraStatePropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPassthroughCameraStatePropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughCameraStatePropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsPassthroughCameraState} field. */
    @NativeType("XrBool32")
    public boolean supportsPassthroughCameraState() { return nsupportsPassthroughCameraState(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPassthroughCameraStatePropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDPassthroughCameraState#XR_TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemPassthroughCameraStatePropertiesANDROID type$Default() { return type(ANDROIDPassthroughCameraState.XR_TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPassthroughCameraStatePropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughCameraStatePropertiesANDROID set(
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
    public XrSystemPassthroughCameraStatePropertiesANDROID set(XrSystemPassthroughCameraStatePropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughCameraStatePropertiesANDROID malloc() {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughCameraStatePropertiesANDROID calloc() {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughCameraStatePropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPassthroughCameraStatePropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance for the specified memory address. */
    public static XrSystemPassthroughCameraStatePropertiesANDROID create(long address) {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemPassthroughCameraStatePropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemPassthroughCameraStatePropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPassthroughCameraStatePropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemPassthroughCameraStatePropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughCameraStatePropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemPassthroughCameraStatePropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughCameraStatePropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsPassthroughCameraState}. */
    public static int nsupportsPassthroughCameraState(long struct) { return memGetInt(struct + XrSystemPassthroughCameraStatePropertiesANDROID.SUPPORTSPASSTHROUGHCAMERASTATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemPassthroughCameraStatePropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughCameraStatePropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughCameraStatePropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughCameraStatePropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemPassthroughCameraStatePropertiesANDROID ELEMENT_FACTORY = XrSystemPassthroughCameraStatePropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughCameraStatePropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughCameraStatePropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPassthroughCameraStatePropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughCameraStatePropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemPassthroughCameraStatePropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsPassthroughCameraState} field. */
        @NativeType("XrBool32")
        public boolean supportsPassthroughCameraState() { return XrSystemPassthroughCameraStatePropertiesANDROID.nsupportsPassthroughCameraState(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPassthroughCameraStatePropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughCameraStatePropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDPassthroughCameraState#XR_TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemPassthroughCameraStatePropertiesANDROID.Buffer type$Default() { return type(ANDROIDPassthroughCameraState.XR_TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPassthroughCameraStatePropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemPassthroughCameraStatePropertiesANDROID.nnext(address(), value); return this; }

    }

}