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
 * struct XrAmbientLightANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrLightEstimateStateANDROID state;
 *     {@link XrVector3f XrVector3f} intensity;
 *     {@link XrVector3f XrVector3f} colorCorrection;
 * }</code></pre>
 */
public class XrAmbientLightANDROID extends Struct<XrAmbientLightANDROID> implements NativeResource {

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
        COLORCORRECTION;

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
        COLORCORRECTION = layout.offsetof(4);
    }

    protected XrAmbientLightANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAmbientLightANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrAmbientLightANDROID(address, container);
    }

    /**
     * Creates a {@code XrAmbientLightANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAmbientLightANDROID(ByteBuffer container) {
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
    /** @return a {@link XrVector3f} view of the {@code colorCorrection} field. */
    public XrVector3f colorCorrection() { return ncolorCorrection(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAmbientLightANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_AMBIENT_LIGHT_ANDROID TYPE_AMBIENT_LIGHT_ANDROID} value to the {@code type} field. */
    public XrAmbientLightANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_AMBIENT_LIGHT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrAmbientLightANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XrAmbientLightANDROID state(@NativeType("XrLightEstimateStateANDROID") int value) { nstate(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code intensity} field. */
    public XrAmbientLightANDROID intensity(XrVector3f value) { nintensity(address(), value); return this; }
    /** Passes the {@code intensity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrAmbientLightANDROID intensity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(intensity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code colorCorrection} field. */
    public XrAmbientLightANDROID colorCorrection(XrVector3f value) { ncolorCorrection(address(), value); return this; }
    /** Passes the {@code colorCorrection} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrAmbientLightANDROID colorCorrection(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(colorCorrection()); return this; }

    /** Initializes this struct with the specified values. */
    public XrAmbientLightANDROID set(
        int type,
        long next,
        int state,
        XrVector3f intensity,
        XrVector3f colorCorrection
    ) {
        type(type);
        next(next);
        state(state);
        intensity(intensity);
        colorCorrection(colorCorrection);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAmbientLightANDROID set(XrAmbientLightANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAmbientLightANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAmbientLightANDROID malloc() {
        return new XrAmbientLightANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAmbientLightANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAmbientLightANDROID calloc() {
        return new XrAmbientLightANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAmbientLightANDROID} instance allocated with {@link BufferUtils}. */
    public static XrAmbientLightANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAmbientLightANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrAmbientLightANDROID} instance for the specified memory address. */
    public static XrAmbientLightANDROID create(long address) {
        return new XrAmbientLightANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAmbientLightANDROID createSafe(long address) {
        return address == NULL ? null : new XrAmbientLightANDROID(address, null);
    }

    /**
     * Returns a new {@link XrAmbientLightANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAmbientLightANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAmbientLightANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAmbientLightANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAmbientLightANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAmbientLightANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAmbientLightANDROID malloc(MemoryStack stack) {
        return new XrAmbientLightANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAmbientLightANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAmbientLightANDROID calloc(MemoryStack stack) {
        return new XrAmbientLightANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAmbientLightANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAmbientLightANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAmbientLightANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrAmbientLightANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAmbientLightANDROID.NEXT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrAmbientLightANDROID.STATE); }
    /** Unsafe version of {@link #intensity}. */
    public static XrVector3f nintensity(long struct) { return XrVector3f.create(struct + XrAmbientLightANDROID.INTENSITY); }
    /** Unsafe version of {@link #colorCorrection}. */
    public static XrVector3f ncolorCorrection(long struct) { return XrVector3f.create(struct + XrAmbientLightANDROID.COLORCORRECTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrAmbientLightANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAmbientLightANDROID.NEXT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + XrAmbientLightANDROID.STATE, value); }
    /** Unsafe version of {@link #intensity(XrVector3f) intensity}. */
    public static void nintensity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrAmbientLightANDROID.INTENSITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #colorCorrection(XrVector3f) colorCorrection}. */
    public static void ncolorCorrection(long struct, XrVector3f value) { memCopy(value.address(), struct + XrAmbientLightANDROID.COLORCORRECTION, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrAmbientLightANDROID} structs. */
    public static class Buffer extends StructBuffer<XrAmbientLightANDROID, Buffer> implements NativeResource {

        private static final XrAmbientLightANDROID ELEMENT_FACTORY = XrAmbientLightANDROID.create(-1L);

        /**
         * Creates a new {@code XrAmbientLightANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAmbientLightANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAmbientLightANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAmbientLightANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrAmbientLightANDROID.nnext(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrLightEstimateStateANDROID")
        public int state() { return XrAmbientLightANDROID.nstate(address()); }
        /** @return a {@link XrVector3f} view of the {@code intensity} field. */
        public XrVector3f intensity() { return XrAmbientLightANDROID.nintensity(address()); }
        /** @return a {@link XrVector3f} view of the {@code colorCorrection} field. */
        public XrVector3f colorCorrection() { return XrAmbientLightANDROID.ncolorCorrection(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAmbientLightANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrAmbientLightANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_AMBIENT_LIGHT_ANDROID TYPE_AMBIENT_LIGHT_ANDROID} value to the {@code type} field. */
        public XrAmbientLightANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_AMBIENT_LIGHT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrAmbientLightANDROID.Buffer next(@NativeType("void *") long value) { XrAmbientLightANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XrAmbientLightANDROID.Buffer state(@NativeType("XrLightEstimateStateANDROID") int value) { XrAmbientLightANDROID.nstate(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code intensity} field. */
        public XrAmbientLightANDROID.Buffer intensity(XrVector3f value) { XrAmbientLightANDROID.nintensity(address(), value); return this; }
        /** Passes the {@code intensity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrAmbientLightANDROID.Buffer intensity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(intensity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code colorCorrection} field. */
        public XrAmbientLightANDROID.Buffer colorCorrection(XrVector3f value) { XrAmbientLightANDROID.ncolorCorrection(address(), value); return this; }
        /** Passes the {@code colorCorrection} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrAmbientLightANDROID.Buffer colorCorrection(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(colorCorrection()); return this; }

    }

}