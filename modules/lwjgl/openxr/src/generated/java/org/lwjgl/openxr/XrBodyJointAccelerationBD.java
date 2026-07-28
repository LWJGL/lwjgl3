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
 * struct XrBodyJointAccelerationBD {
 *     XrSpaceAccelerationFlagsBD accelerationFlags;
 *     {@link XrVector3f XrVector3f} linearAcceleration;
 *     {@link XrVector3f XrVector3f} angularAcceleration;
 * }</code></pre>
 */
public class XrBodyJointAccelerationBD extends Struct<XrBodyJointAccelerationBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACCELERATIONFLAGS,
        LINEARACCELERATION,
        ANGULARACCELERATION;

    static {
        XrVector3f.createSafe(NULL);

        Layout layout = __struct(
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACCELERATIONFLAGS = layout.offsetof(0);
        LINEARACCELERATION = layout.offsetof(1);
        ANGULARACCELERATION = layout.offsetof(2);
    }

    protected XrBodyJointAccelerationBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointAccelerationBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointAccelerationBD(address, container);
    }

    /**
     * Creates a {@code XrBodyJointAccelerationBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointAccelerationBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code accelerationFlags} field. */
    @NativeType("XrSpaceAccelerationFlagsBD")
    public long accelerationFlags() { return naccelerationFlags(address()); }
    /** @return a {@link XrVector3f} view of the {@code linearAcceleration} field. */
    public XrVector3f linearAcceleration() { return nlinearAcceleration(address()); }
    /** @return a {@link XrVector3f} view of the {@code angularAcceleration} field. */
    public XrVector3f angularAcceleration() { return nangularAcceleration(address()); }

    /** Sets the specified value to the {@code accelerationFlags} field. */
    public XrBodyJointAccelerationBD accelerationFlags(@NativeType("XrSpaceAccelerationFlagsBD") long value) { naccelerationFlags(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code linearAcceleration} field. */
    public XrBodyJointAccelerationBD linearAcceleration(XrVector3f value) { nlinearAcceleration(address(), value); return this; }
    /** Passes the {@code linearAcceleration} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodyJointAccelerationBD linearAcceleration(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearAcceleration()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code angularAcceleration} field. */
    public XrBodyJointAccelerationBD angularAcceleration(XrVector3f value) { nangularAcceleration(address(), value); return this; }
    /** Passes the {@code angularAcceleration} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodyJointAccelerationBD angularAcceleration(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularAcceleration()); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointAccelerationBD set(
        long accelerationFlags,
        XrVector3f linearAcceleration,
        XrVector3f angularAcceleration
    ) {
        accelerationFlags(accelerationFlags);
        linearAcceleration(linearAcceleration);
        angularAcceleration(angularAcceleration);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointAccelerationBD set(XrBodyJointAccelerationBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointAccelerationBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointAccelerationBD malloc() {
        return new XrBodyJointAccelerationBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointAccelerationBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointAccelerationBD calloc() {
        return new XrBodyJointAccelerationBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointAccelerationBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointAccelerationBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointAccelerationBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointAccelerationBD} instance for the specified memory address. */
    public static XrBodyJointAccelerationBD create(long address) {
        return new XrBodyJointAccelerationBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointAccelerationBD createSafe(long address) {
        return address == NULL ? null : new XrBodyJointAccelerationBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointAccelerationBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointAccelerationBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointAccelerationBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointAccelerationBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointAccelerationBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointAccelerationBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointAccelerationBD malloc(MemoryStack stack) {
        return new XrBodyJointAccelerationBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointAccelerationBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointAccelerationBD calloc(MemoryStack stack) {
        return new XrBodyJointAccelerationBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointAccelerationBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointAccelerationBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointAccelerationBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #accelerationFlags}. */
    public static long naccelerationFlags(long struct) { return memGetLong(struct + XrBodyJointAccelerationBD.ACCELERATIONFLAGS); }
    /** Unsafe version of {@link #linearAcceleration}. */
    public static XrVector3f nlinearAcceleration(long struct) { return XrVector3f.create(struct + XrBodyJointAccelerationBD.LINEARACCELERATION); }
    /** Unsafe version of {@link #angularAcceleration}. */
    public static XrVector3f nangularAcceleration(long struct) { return XrVector3f.create(struct + XrBodyJointAccelerationBD.ANGULARACCELERATION); }

    /** Unsafe version of {@link #accelerationFlags(long) accelerationFlags}. */
    public static void naccelerationFlags(long struct, long value) { memPutLong(struct + XrBodyJointAccelerationBD.ACCELERATIONFLAGS, value); }
    /** Unsafe version of {@link #linearAcceleration(XrVector3f) linearAcceleration}. */
    public static void nlinearAcceleration(long struct, XrVector3f value) { memCopy(value.address(), struct + XrBodyJointAccelerationBD.LINEARACCELERATION, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #angularAcceleration(XrVector3f) angularAcceleration}. */
    public static void nangularAcceleration(long struct, XrVector3f value) { memCopy(value.address(), struct + XrBodyJointAccelerationBD.ANGULARACCELERATION, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrBodyJointAccelerationBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointAccelerationBD, Buffer> implements NativeResource {

        private static final XrBodyJointAccelerationBD ELEMENT_FACTORY = XrBodyJointAccelerationBD.create(-1L);

        /**
         * Creates a new {@code XrBodyJointAccelerationBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointAccelerationBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointAccelerationBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code accelerationFlags} field. */
        @NativeType("XrSpaceAccelerationFlagsBD")
        public long accelerationFlags() { return XrBodyJointAccelerationBD.naccelerationFlags(address()); }
        /** @return a {@link XrVector3f} view of the {@code linearAcceleration} field. */
        public XrVector3f linearAcceleration() { return XrBodyJointAccelerationBD.nlinearAcceleration(address()); }
        /** @return a {@link XrVector3f} view of the {@code angularAcceleration} field. */
        public XrVector3f angularAcceleration() { return XrBodyJointAccelerationBD.nangularAcceleration(address()); }

        /** Sets the specified value to the {@code accelerationFlags} field. */
        public XrBodyJointAccelerationBD.Buffer accelerationFlags(@NativeType("XrSpaceAccelerationFlagsBD") long value) { XrBodyJointAccelerationBD.naccelerationFlags(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code linearAcceleration} field. */
        public XrBodyJointAccelerationBD.Buffer linearAcceleration(XrVector3f value) { XrBodyJointAccelerationBD.nlinearAcceleration(address(), value); return this; }
        /** Passes the {@code linearAcceleration} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodyJointAccelerationBD.Buffer linearAcceleration(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearAcceleration()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code angularAcceleration} field. */
        public XrBodyJointAccelerationBD.Buffer angularAcceleration(XrVector3f value) { XrBodyJointAccelerationBD.nangularAcceleration(address(), value); return this; }
        /** Passes the {@code angularAcceleration} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodyJointAccelerationBD.Buffer angularAcceleration(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularAcceleration()); return this; }

    }

}