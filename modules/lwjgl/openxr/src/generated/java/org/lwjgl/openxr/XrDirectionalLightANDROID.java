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
 * <pre><code>
 * struct XrDirectionalLightANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrLightEstimateStateANDROID state;
 *     {@link XrVector3f XrVector3f} intensity;
 *     {@link XrVector3f XrVector3f} direction;
 * }</code></pre>
 */
public class XrDirectionalLightANDROID extends Struct<XrDirectionalLightANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATE,
        INTENSITY,
        DIRECTION;

    static {
        XrVector3f.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATE = layout.offsetof(2);
        INTENSITY = layout.offsetof(3);
        DIRECTION = layout.offsetof(4);
    }

    protected XrDirectionalLightANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDirectionalLightANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrDirectionalLightANDROID(address, container);
    }

    /**
     * Creates a {@code XrDirectionalLightANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDirectionalLightANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("XrLightEstimateStateANDROID")
    public int state() { return nstate(address()); }
    /** @return a {@link XrVector3f} view of the {@code intensity} field. */
    public XrVector3f intensity() { return nintensity(address()); }
    /** @return a {@link XrVector3f} view of the {@code direction} field. */
    public XrVector3f direction() { return ndirection(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDirectionalLightANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_DIRECTIONAL_LIGHT_ANDROID TYPE_DIRECTIONAL_LIGHT_ANDROID} value to the {@code type} field. */
    public XrDirectionalLightANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_DIRECTIONAL_LIGHT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrDirectionalLightANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XrDirectionalLightANDROID state(@NativeType("XrLightEstimateStateANDROID") int value) { nstate(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code intensity} field. */
    public XrDirectionalLightANDROID intensity(XrVector3f value) { nintensity(address(), value); return this; }
    /** Passes the {@code intensity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrDirectionalLightANDROID intensity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(intensity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
    public XrDirectionalLightANDROID direction(XrVector3f value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrDirectionalLightANDROID direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }

    /** Initializes this struct with the specified values. */
    public XrDirectionalLightANDROID set(
        int type,
        long next,
        int state,
        XrVector3f intensity,
        XrVector3f direction
    ) {
        type(type);
        next(next);
        state(state);
        intensity(intensity);
        direction(direction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDirectionalLightANDROID set(XrDirectionalLightANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDirectionalLightANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDirectionalLightANDROID malloc() {
        return new XrDirectionalLightANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDirectionalLightANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDirectionalLightANDROID calloc() {
        return new XrDirectionalLightANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDirectionalLightANDROID} instance allocated with {@link BufferUtils}. */
    public static XrDirectionalLightANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDirectionalLightANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrDirectionalLightANDROID} instance for the specified memory address. */
    public static XrDirectionalLightANDROID create(long address) {
        return new XrDirectionalLightANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrDirectionalLightANDROID createSafe(long address) {
        return address == NULL ? null : new XrDirectionalLightANDROID(address, null);
    }

    /**
     * Returns a new {@link XrDirectionalLightANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDirectionalLightANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDirectionalLightANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDirectionalLightANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrDirectionalLightANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDirectionalLightANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDirectionalLightANDROID malloc(MemoryStack stack) {
        return new XrDirectionalLightANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDirectionalLightANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDirectionalLightANDROID calloc(MemoryStack stack) {
        return new XrDirectionalLightANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDirectionalLightANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDirectionalLightANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDirectionalLightANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrDirectionalLightANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDirectionalLightANDROID.NEXT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrDirectionalLightANDROID.STATE); }
    /** Unsafe version of {@link #intensity}. */
    public static XrVector3f nintensity(long struct) { return XrVector3f.create(struct + XrDirectionalLightANDROID.INTENSITY); }
    /** Unsafe version of {@link #direction}. */
    public static XrVector3f ndirection(long struct) { return XrVector3f.create(struct + XrDirectionalLightANDROID.DIRECTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrDirectionalLightANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDirectionalLightANDROID.NEXT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + XrDirectionalLightANDROID.STATE, value); }
    /** Unsafe version of {@link #intensity(XrVector3f) intensity}. */
    public static void nintensity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrDirectionalLightANDROID.INTENSITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #direction(XrVector3f) direction}. */
    public static void ndirection(long struct, XrVector3f value) { memCopy(value.address(), struct + XrDirectionalLightANDROID.DIRECTION, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrDirectionalLightANDROID} structs. */
    public static class Buffer extends StructBuffer<XrDirectionalLightANDROID, Buffer> implements NativeResource {

        private static final XrDirectionalLightANDROID ELEMENT_FACTORY = XrDirectionalLightANDROID.create(-1L);

        /**
         * Creates a new {@code XrDirectionalLightANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDirectionalLightANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDirectionalLightANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDirectionalLightANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrDirectionalLightANDROID.nnext(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrLightEstimateStateANDROID")
        public int state() { return XrDirectionalLightANDROID.nstate(address()); }
        /** @return a {@link XrVector3f} view of the {@code intensity} field. */
        public XrVector3f intensity() { return XrDirectionalLightANDROID.nintensity(address()); }
        /** @return a {@link XrVector3f} view of the {@code direction} field. */
        public XrVector3f direction() { return XrDirectionalLightANDROID.ndirection(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDirectionalLightANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrDirectionalLightANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_DIRECTIONAL_LIGHT_ANDROID TYPE_DIRECTIONAL_LIGHT_ANDROID} value to the {@code type} field. */
        public XrDirectionalLightANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_DIRECTIONAL_LIGHT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrDirectionalLightANDROID.Buffer next(@NativeType("void *") long value) { XrDirectionalLightANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XrDirectionalLightANDROID.Buffer state(@NativeType("XrLightEstimateStateANDROID") int value) { XrDirectionalLightANDROID.nstate(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code intensity} field. */
        public XrDirectionalLightANDROID.Buffer intensity(XrVector3f value) { XrDirectionalLightANDROID.nintensity(address(), value); return this; }
        /** Passes the {@code intensity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrDirectionalLightANDROID.Buffer intensity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(intensity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
        public XrDirectionalLightANDROID.Buffer direction(XrVector3f value) { XrDirectionalLightANDROID.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrDirectionalLightANDROID.Buffer direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }

    }

}