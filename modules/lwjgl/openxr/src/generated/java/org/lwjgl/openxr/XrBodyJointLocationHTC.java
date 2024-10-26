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
 * Describes the location and location flag of a body joint.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrBodyJointLocationHTC} structure describes the position, orientation, and location flag of a body joint. It is populated by the runtime during a call to {@link HTCBodyTracking#xrLocateBodyJointsHTC LocateBodyJointsHTC}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyJointLocationHTC}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBodyJointLocationsHTC}, {@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyJointLocationHTC {
 *     XrSpaceLocationFlags {@link #locationFlags};
 *     {@link XrPosef XrPosef} {@link #pose};
 * }</code></pre>
 */
public class XrBodyJointLocationHTC extends Struct<XrBodyJointLocationHTC> {

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

    protected XrBodyJointLocationHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. For those bits that are not set, reading the relevant fields in this structure and its nested structures <b>must</b> be defined, but the values are unspecified and not meaningful. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** an {@link XrPosef} describing the position and orientation of the origin of a body joint within the reference frame of the corresponding {@link XrBodyJointsLocateInfoHTC}{@code ::baseSpace}. */
    public XrPosef pose() { return npose(address()); }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationHTC} instance for the specified memory address. */
    public static XrBodyJointLocationHTC create(long address) {
        return new XrBodyJointLocationHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationHTC(address, null);
    }

    /**
     * Create a {@link XrBodyJointLocationHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return UNSAFE.getLong(null, struct + XrBodyJointLocationHTC.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrBodyJointLocationHTC.POSE); }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationHTC, Buffer> {

        private static final XrBodyJointLocationHTC ELEMENT_FACTORY = XrBodyJointLocationHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyJointLocationHTC#locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrBodyJointLocationHTC.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrBodyJointLocationHTC#pose} field. */
        public XrPosef pose() { return XrBodyJointLocationHTC.npose(address()); }

    }

}