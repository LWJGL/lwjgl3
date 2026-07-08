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
 * struct XrBodyJointVelocityBD {
 *     XrSpaceVelocityFlags velocityFlags;
 *     {@link XrVector3f XrVector3f} linearVelocity;
 *     {@link XrVector3f XrVector3f} angularVelocity;
 * }</code></pre>
 */
public class XrBodyJointVelocityBD extends Struct<XrBodyJointVelocityBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VELOCITYFLAGS,
        LINEARVELOCITY,
        ANGULARVELOCITY;

    static {
        XrVector3f.createSafe(NULL);

        Layout layout = __struct(
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VELOCITYFLAGS = layout.offsetof(0);
        LINEARVELOCITY = layout.offsetof(1);
        ANGULARVELOCITY = layout.offsetof(2);
    }

    protected XrBodyJointVelocityBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointVelocityBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointVelocityBD(address, container);
    }

    /**
     * Creates a {@code XrBodyJointVelocityBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointVelocityBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code velocityFlags} field. */
    @NativeType("XrSpaceVelocityFlags")
    public long velocityFlags() { return nvelocityFlags(address()); }
    /** @return a {@link XrVector3f} view of the {@code linearVelocity} field. */
    public XrVector3f linearVelocity() { return nlinearVelocity(address()); }
    /** @return a {@link XrVector3f} view of the {@code angularVelocity} field. */
    public XrVector3f angularVelocity() { return nangularVelocity(address()); }

    /** Sets the specified value to the {@code velocityFlags} field. */
    public XrBodyJointVelocityBD velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { nvelocityFlags(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code linearVelocity} field. */
    public XrBodyJointVelocityBD linearVelocity(XrVector3f value) { nlinearVelocity(address(), value); return this; }
    /** Passes the {@code linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodyJointVelocityBD linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code angularVelocity} field. */
    public XrBodyJointVelocityBD angularVelocity(XrVector3f value) { nangularVelocity(address(), value); return this; }
    /** Passes the {@code angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodyJointVelocityBD angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointVelocityBD set(
        long velocityFlags,
        XrVector3f linearVelocity,
        XrVector3f angularVelocity
    ) {
        velocityFlags(velocityFlags);
        linearVelocity(linearVelocity);
        angularVelocity(angularVelocity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointVelocityBD set(XrBodyJointVelocityBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointVelocityBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointVelocityBD malloc() {
        return new XrBodyJointVelocityBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointVelocityBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointVelocityBD calloc() {
        return new XrBodyJointVelocityBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointVelocityBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointVelocityBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointVelocityBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointVelocityBD} instance for the specified memory address. */
    public static XrBodyJointVelocityBD create(long address) {
        return new XrBodyJointVelocityBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointVelocityBD createSafe(long address) {
        return address == NULL ? null : new XrBodyJointVelocityBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointVelocityBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocityBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocityBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointVelocityBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointVelocityBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointVelocityBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointVelocityBD malloc(MemoryStack stack) {
        return new XrBodyJointVelocityBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointVelocityBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointVelocityBD calloc(MemoryStack stack) {
        return new XrBodyJointVelocityBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointVelocityBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocityBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocityBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #velocityFlags}. */
    public static long nvelocityFlags(long struct) { return memGetLong(struct + XrBodyJointVelocityBD.VELOCITYFLAGS); }
    /** Unsafe version of {@link #linearVelocity}. */
    public static XrVector3f nlinearVelocity(long struct) { return XrVector3f.create(struct + XrBodyJointVelocityBD.LINEARVELOCITY); }
    /** Unsafe version of {@link #angularVelocity}. */
    public static XrVector3f nangularVelocity(long struct) { return XrVector3f.create(struct + XrBodyJointVelocityBD.ANGULARVELOCITY); }

    /** Unsafe version of {@link #velocityFlags(long) velocityFlags}. */
    public static void nvelocityFlags(long struct, long value) { memPutLong(struct + XrBodyJointVelocityBD.VELOCITYFLAGS, value); }
    /** Unsafe version of {@link #linearVelocity(XrVector3f) linearVelocity}. */
    public static void nlinearVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrBodyJointVelocityBD.LINEARVELOCITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #angularVelocity(XrVector3f) angularVelocity}. */
    public static void nangularVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrBodyJointVelocityBD.ANGULARVELOCITY, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrBodyJointVelocityBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointVelocityBD, Buffer> implements NativeResource {

        private static final XrBodyJointVelocityBD ELEMENT_FACTORY = XrBodyJointVelocityBD.create(-1L);

        /**
         * Creates a new {@code XrBodyJointVelocityBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointVelocityBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointVelocityBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code velocityFlags} field. */
        @NativeType("XrSpaceVelocityFlags")
        public long velocityFlags() { return XrBodyJointVelocityBD.nvelocityFlags(address()); }
        /** @return a {@link XrVector3f} view of the {@code linearVelocity} field. */
        public XrVector3f linearVelocity() { return XrBodyJointVelocityBD.nlinearVelocity(address()); }
        /** @return a {@link XrVector3f} view of the {@code angularVelocity} field. */
        public XrVector3f angularVelocity() { return XrBodyJointVelocityBD.nangularVelocity(address()); }

        /** Sets the specified value to the {@code velocityFlags} field. */
        public XrBodyJointVelocityBD.Buffer velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { XrBodyJointVelocityBD.nvelocityFlags(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code linearVelocity} field. */
        public XrBodyJointVelocityBD.Buffer linearVelocity(XrVector3f value) { XrBodyJointVelocityBD.nlinearVelocity(address(), value); return this; }
        /** Passes the {@code linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodyJointVelocityBD.Buffer linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code angularVelocity} field. */
        public XrBodyJointVelocityBD.Buffer angularVelocity(XrVector3f value) { XrBodyJointVelocityBD.nangularVelocity(address(), value); return this; }
        /** Passes the {@code angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodyJointVelocityBD.Buffer angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    }

}