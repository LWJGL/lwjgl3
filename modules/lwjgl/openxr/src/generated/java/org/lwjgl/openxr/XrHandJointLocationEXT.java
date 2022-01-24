/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the location and radius of a hand joint.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the returned {@code locationFlags} has {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} set, the returned radius <b>must</b> be a positive value.</p>
 * 
 * <p>If the returned {@code locationFlags} has {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} unset, the returned radius value is undefined and should be avoided.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrHandJointLocationEXT}</li>
 * <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointLocationsEXT}, {@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointLocationEXT {
 *     XrSpaceLocationFlags {@link #locationFlags};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     float {@link #radius};
 * }</code></pre>
 */
public class XrHandJointLocationEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATIONFLAGS,
        POSE,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATIONFLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrHandJointLocationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointLocationEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** an {@link XrPosef} defining the position and orientation of the origin of a hand joint within the reference frame of the corresponding {@link XrHandJointsLocateInfoEXT}{@code ::baseSpace}. */
    public XrPosef pose() { return npose(address()); }
    /** a {@code float} value radius of the corresponding joint in units of meters. */
    public float radius() { return nradius(address()); }

    /** Sets the specified value to the {@link #locationFlags} field. */
    public XrHandJointLocationEXT locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrHandJointLocationEXT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandJointLocationEXT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@link #radius} field. */
    public XrHandJointLocationEXT radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointLocationEXT set(
        long locationFlags,
        XrPosef pose,
        float radius
    ) {
        locationFlags(locationFlags);
        pose(pose);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointLocationEXT set(XrHandJointLocationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationEXT malloc() {
        return wrap(XrHandJointLocationEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationEXT calloc() {
        return wrap(XrHandJointLocationEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointLocationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointLocationEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance for the specified memory address. */
    public static XrHandJointLocationEXT create(long address) {
        return wrap(XrHandJointLocationEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointLocationEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointLocationEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointLocationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointLocationEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointLocationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationEXT malloc(MemoryStack stack) {
        return wrap(XrHandJointLocationEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointLocationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationEXT calloc(MemoryStack stack) {
        return wrap(XrHandJointLocationEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return UNSAFE.getLong(null, struct + XrHandJointLocationEXT.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrHandJointLocationEXT.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + XrHandJointLocationEXT.RADIUS); }

    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrHandJointLocationEXT.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrHandJointLocationEXT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { UNSAFE.putFloat(null, struct + XrHandJointLocationEXT.RADIUS, value); }

    // -----------------------------------

    /** An array of {@link XrHandJointLocationEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointLocationEXT, Buffer> implements NativeResource {

        private static final XrHandJointLocationEXT ELEMENT_FACTORY = XrHandJointLocationEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointLocationEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointLocationEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointLocationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointLocationEXT#locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrHandJointLocationEXT.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrHandJointLocationEXT#pose} field. */
        public XrPosef pose() { return XrHandJointLocationEXT.npose(address()); }
        /** @return the value of the {@link XrHandJointLocationEXT#radius} field. */
        public float radius() { return XrHandJointLocationEXT.nradius(address()); }

        /** Sets the specified value to the {@link XrHandJointLocationEXT#locationFlags} field. */
        public XrHandJointLocationEXT.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrHandJointLocationEXT.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrHandJointLocationEXT#pose} field. */
        public XrHandJointLocationEXT.Buffer pose(XrPosef value) { XrHandJointLocationEXT.npose(address(), value); return this; }
        /** Passes the {@link XrHandJointLocationEXT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandJointLocationEXT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@link XrHandJointLocationEXT#radius} field. */
        public XrHandJointLocationEXT.Buffer radius(float value) { XrHandJointLocationEXT.nradius(address(), value); return this; }

    }

}