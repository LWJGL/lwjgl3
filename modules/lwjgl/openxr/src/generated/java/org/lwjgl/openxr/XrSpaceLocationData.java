/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Returns the data of a space.
 * 
 * <h5>Description</h5>
 * 
 * <p>This is a single element of the array in {@link XrSpaceLocations}{@code ::locations}, and is used to return the pose and location flags for a single space with respect to the specified base space from a call to {@link XR11#xrLocateSpaces LocateSpaces}. It does not accept chained structures to allow for easier use in dynamically allocated container datatypes. Chained structures are possible with the {@link XrSpaceLocations} that describes an array of these elements.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrSpaceLocations}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceLocationData {
 *     XrSpaceLocationFlags {@link #locationFlags};
 *     {@link XrPosef XrPosef} {@link #pose};
 * }</code></pre>
 */
public class XrSpaceLocationData extends Struct<XrSpaceLocationData> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATIONFLAGS,
        POSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATIONFLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
    }

    protected XrSpaceLocationData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceLocationData create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceLocationData(address, container);
    }

    /**
     * Creates a {@code XrSpaceLocationData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceLocationData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}. It behaves the same as {@link XrSpaceLocation}{@code ::locationFlags}. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** an {@link XrPosef} that behaves the same as {@link XrSpaceLocation}{@code ::pose}. */
    public XrPosef pose() { return npose(address()); }

    // -----------------------------------

    /** Returns a new {@code XrSpaceLocationData} instance for the specified memory address. */
    public static XrSpaceLocationData create(long address) {
        return new XrSpaceLocationData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceLocationData createSafe(long address) {
        return address == NULL ? null : new XrSpaceLocationData(address, null);
    }

    /**
     * Create a {@link XrSpaceLocationData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceLocationData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return UNSAFE.getLong(null, struct + XrSpaceLocationData.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpaceLocationData.POSE); }

    // -----------------------------------

    /** An array of {@link XrSpaceLocationData} structs. */
    public static class Buffer extends StructBuffer<XrSpaceLocationData, Buffer> {

        private static final XrSpaceLocationData ELEMENT_FACTORY = XrSpaceLocationData.create(-1L);

        /**
         * Creates a new {@code XrSpaceLocationData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceLocationData#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceLocationData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceLocationData#locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrSpaceLocationData.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpaceLocationData#pose} field. */
        public XrPosef pose() { return XrSpaceLocationData.npose(address()); }

    }

}