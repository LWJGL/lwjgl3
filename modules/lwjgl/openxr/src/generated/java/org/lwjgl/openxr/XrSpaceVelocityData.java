/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct XrSpaceVelocityData {
 *     XrSpaceVelocityFlags velocityFlags;
 *     {@link XrVector3f XrVector3f} linearVelocity;
 *     {@link XrVector3f XrVector3f} angularVelocity;
 * }}</pre>
 */
public class XrSpaceVelocityData extends Struct<XrSpaceVelocityData> {

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

    protected XrSpaceVelocityData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceVelocityData create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceVelocityData(address, container);
    }

    /**
     * Creates a {@code XrSpaceVelocityData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceVelocityData(ByteBuffer container) {
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

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocityData} instance for the specified memory address. */
    public static XrSpaceVelocityData create(long address) {
        return new XrSpaceVelocityData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceVelocityData createSafe(long address) {
        return address == NULL ? null : new XrSpaceVelocityData(address, null);
    }

    /**
     * Create a {@link XrSpaceVelocityData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocityData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceVelocityData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #velocityFlags}. */
    public static long nvelocityFlags(long struct) { return memGetLong(struct + XrSpaceVelocityData.VELOCITYFLAGS); }
    /** Unsafe version of {@link #linearVelocity}. */
    public static XrVector3f nlinearVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocityData.LINEARVELOCITY); }
    /** Unsafe version of {@link #angularVelocity}. */
    public static XrVector3f nangularVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocityData.ANGULARVELOCITY); }

    // -----------------------------------

    /** An array of {@link XrSpaceVelocityData} structs. */
    public static class Buffer extends StructBuffer<XrSpaceVelocityData, Buffer> {

        private static final XrSpaceVelocityData ELEMENT_FACTORY = XrSpaceVelocityData.create(-1L);

        /**
         * Creates a new {@code XrSpaceVelocityData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceVelocityData#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceVelocityData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code velocityFlags} field. */
        @NativeType("XrSpaceVelocityFlags")
        public long velocityFlags() { return XrSpaceVelocityData.nvelocityFlags(address()); }
        /** @return a {@link XrVector3f} view of the {@code linearVelocity} field. */
        public XrVector3f linearVelocity() { return XrSpaceVelocityData.nlinearVelocity(address()); }
        /** @return a {@link XrVector3f} view of the {@code angularVelocity} field. */
        public XrVector3f angularVelocity() { return XrSpaceVelocityData.nangularVelocity(address()); }

    }

}