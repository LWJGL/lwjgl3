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
 * Describes the velocity of a hand joint.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrHandJointVelocityEXT}</li>
 * <li>{@code velocityFlags} <b>must</b> be a valid combination of {@code XrSpaceVelocityFlagBits} values</li>
 * <li>{@code velocityFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointVelocitiesEXT}, {@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointVelocityEXT {
 *     XrSpaceVelocityFlags {@link #velocityFlags};
 *     {@link XrVector3f XrVector3f} {@link #linearVelocity};
 *     {@link XrVector3f XrVector3f} {@link #angularVelocity};
 * }</code></pre>
 */
public class XrHandJointVelocityEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code XrHandJointVelocityEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointVelocityEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitfield, with bit masks defined in {@code XrSpaceVelocityFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful. */
    @NativeType("XrSpaceVelocityFlags")
    public long velocityFlags() { return nvelocityFlags(address()); }
    /** the relative linear velocity of the hand joint with respect to and expressed in the reference frame of the corresponding {@link XrHandJointsLocateInfoEXT}{@code ::baseSpace}, in units of meters per second. */
    public XrVector3f linearVelocity() { return nlinearVelocity(address()); }
    /** the relative angular velocity of the hand joint with respect to the corresponding {@link XrHandJointsLocateInfoEXT}{@code ::baseSpace}. The vector’s direction is expressed in the reference frame of the corresponding {@link XrHandJointsLocateInfoEXT}{@code ::baseSpace} and is parallel to the rotational axis of the hand joint. The vector’s magnitude is the relative angular speed of the hand joint in radians per second. The vector follows the right-hand rule for torque/rotation. */
    public XrVector3f angularVelocity() { return nangularVelocity(address()); }

    /** Sets the specified value to the {@link #velocityFlags} field. */
    public XrHandJointVelocityEXT velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { nvelocityFlags(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #linearVelocity} field. */
    public XrHandJointVelocityEXT linearVelocity(XrVector3f value) { nlinearVelocity(address(), value); return this; }
    /** Passes the {@link #linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandJointVelocityEXT linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #angularVelocity} field. */
    public XrHandJointVelocityEXT angularVelocity(XrVector3f value) { nangularVelocity(address(), value); return this; }
    /** Passes the {@link #angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandJointVelocityEXT angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointVelocityEXT set(
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
    public XrHandJointVelocityEXT set(XrHandJointVelocityEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointVelocityEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocityEXT malloc() {
        return wrap(XrHandJointVelocityEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocityEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocityEXT calloc() {
        return wrap(XrHandJointVelocityEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocityEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointVelocityEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointVelocityEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointVelocityEXT} instance for the specified memory address. */
    public static XrHandJointVelocityEXT create(long address) {
        return wrap(XrHandJointVelocityEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocityEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointVelocityEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointVelocityEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocityEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocityEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointVelocityEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocityEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointVelocityEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocityEXT malloc(MemoryStack stack) {
        return wrap(XrHandJointVelocityEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointVelocityEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocityEXT calloc(MemoryStack stack) {
        return wrap(XrHandJointVelocityEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointVelocityEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocityEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocityEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #velocityFlags}. */
    public static long nvelocityFlags(long struct) { return UNSAFE.getLong(null, struct + XrHandJointVelocityEXT.VELOCITYFLAGS); }
    /** Unsafe version of {@link #linearVelocity}. */
    public static XrVector3f nlinearVelocity(long struct) { return XrVector3f.create(struct + XrHandJointVelocityEXT.LINEARVELOCITY); }
    /** Unsafe version of {@link #angularVelocity}. */
    public static XrVector3f nangularVelocity(long struct) { return XrVector3f.create(struct + XrHandJointVelocityEXT.ANGULARVELOCITY); }

    /** Unsafe version of {@link #velocityFlags(long) velocityFlags}. */
    public static void nvelocityFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrHandJointVelocityEXT.VELOCITYFLAGS, value); }
    /** Unsafe version of {@link #linearVelocity(XrVector3f) linearVelocity}. */
    public static void nlinearVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrHandJointVelocityEXT.LINEARVELOCITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #angularVelocity(XrVector3f) angularVelocity}. */
    public static void nangularVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrHandJointVelocityEXT.ANGULARVELOCITY, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrHandJointVelocityEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointVelocityEXT, Buffer> implements NativeResource {

        private static final XrHandJointVelocityEXT ELEMENT_FACTORY = XrHandJointVelocityEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointVelocityEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointVelocityEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointVelocityEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointVelocityEXT#velocityFlags} field. */
        @NativeType("XrSpaceVelocityFlags")
        public long velocityFlags() { return XrHandJointVelocityEXT.nvelocityFlags(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrHandJointVelocityEXT#linearVelocity} field. */
        public XrVector3f linearVelocity() { return XrHandJointVelocityEXT.nlinearVelocity(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrHandJointVelocityEXT#angularVelocity} field. */
        public XrVector3f angularVelocity() { return XrHandJointVelocityEXT.nangularVelocity(address()); }

        /** Sets the specified value to the {@link XrHandJointVelocityEXT#velocityFlags} field. */
        public XrHandJointVelocityEXT.Buffer velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { XrHandJointVelocityEXT.nvelocityFlags(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrHandJointVelocityEXT#linearVelocity} field. */
        public XrHandJointVelocityEXT.Buffer linearVelocity(XrVector3f value) { XrHandJointVelocityEXT.nlinearVelocity(address(), value); return this; }
        /** Passes the {@link XrHandJointVelocityEXT#linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandJointVelocityEXT.Buffer linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrHandJointVelocityEXT#angularVelocity} field. */
        public XrHandJointVelocityEXT.Buffer angularVelocity(XrVector3f value) { XrHandJointVelocityEXT.nangularVelocity(address(), value); return this; }
        /** Passes the {@link XrHandJointVelocityEXT#angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandJointVelocityEXT.Buffer angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    }

}