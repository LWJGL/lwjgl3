/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A full pose (rigid body) configuration with first and second derivatives.
 * 
 * <p>Body refers to any object for which ovrPoseStatef is providing data.  It can be the HMD, Touch controller, sensor or something else. The context
 * depends on the usage of the struct.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrPoseStatef {
 *     {@link OVRPosef ovrPosef} {@link #ThePose};
 *     {@link OVRVector3f ovrVector3f} {@link #AngularVelocity};
 *     {@link OVRVector3f ovrVector3f} {@link #LinearVelocity};
 *     {@link OVRVector3f ovrVector3f} {@link #AngularAcceleration};
 *     {@link OVRVector3f ovrVector3f} {@link #LinearAcceleration};
 *     char[4];
 *     double {@link #TimeInSeconds};
 * }</code></pre>
 */
@NativeType("struct ovrPoseStatef")
public class OVRPoseStatef extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        THEPOSE,
        ANGULARVELOCITY,
        LINEARVELOCITY,
        ANGULARACCELERATION,
        LINEARACCELERATION,
        TIMEINSECONDS;

    static {
        Layout layout = __struct(
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __padding(4, true),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        THEPOSE = layout.offsetof(0);
        ANGULARVELOCITY = layout.offsetof(1);
        LINEARVELOCITY = layout.offsetof(2);
        ANGULARACCELERATION = layout.offsetof(3);
        LINEARACCELERATION = layout.offsetof(4);
        TIMEINSECONDS = layout.offsetof(6);
    }

    /**
     * Creates a {@code OVRPoseStatef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRPoseStatef(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** position and orientation */
    @NativeType("ovrPosef")
    public OVRPosef ThePose() { return nThePose(address()); }
    /** angular velocity in radians per second */
    @NativeType("ovrVector3f")
    public OVRVector3f AngularVelocity() { return nAngularVelocity(address()); }
    /** velocity in meters per second */
    @NativeType("ovrVector3f")
    public OVRVector3f LinearVelocity() { return nLinearVelocity(address()); }
    /** angular acceleration in radians per second per second */
    @NativeType("ovrVector3f")
    public OVRVector3f AngularAcceleration() { return nAngularAcceleration(address()); }
    /** acceleration in meters per second per second */
    @NativeType("ovrVector3f")
    public OVRVector3f LinearAcceleration() { return nLinearAcceleration(address()); }
    /** absolute time that this pose refers to. See {@link OVR#ovr_GetTimeInSeconds GetTimeInSeconds} */
    public double TimeInSeconds() { return nTimeInSeconds(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRPoseStatef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRPoseStatef malloc() {
        return wrap(OVRPoseStatef.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRPoseStatef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRPoseStatef calloc() {
        return wrap(OVRPoseStatef.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRPoseStatef} instance allocated with {@link BufferUtils}. */
    public static OVRPoseStatef create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRPoseStatef.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRPoseStatef} instance for the specified memory address. */
    public static OVRPoseStatef create(long address) {
        return wrap(OVRPoseStatef.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPoseStatef createSafe(long address) {
        return address == NULL ? null : wrap(OVRPoseStatef.class, address);
    }

    /**
     * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPoseStatef.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRPoseStatef.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPoseStatef.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPoseStatef.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRPoseStatef} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPoseStatef malloc(MemoryStack stack) {
        return wrap(OVRPoseStatef.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRPoseStatef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPoseStatef calloc(MemoryStack stack) {
        return wrap(OVRPoseStatef.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPoseStatef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPoseStatef.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ThePose}. */
    public static OVRPosef nThePose(long struct) { return OVRPosef.create(struct + OVRPoseStatef.THEPOSE); }
    /** Unsafe version of {@link #AngularVelocity}. */
    public static OVRVector3f nAngularVelocity(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.ANGULARVELOCITY); }
    /** Unsafe version of {@link #LinearVelocity}. */
    public static OVRVector3f nLinearVelocity(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.LINEARVELOCITY); }
    /** Unsafe version of {@link #AngularAcceleration}. */
    public static OVRVector3f nAngularAcceleration(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.ANGULARACCELERATION); }
    /** Unsafe version of {@link #LinearAcceleration}. */
    public static OVRVector3f nLinearAcceleration(long struct) { return OVRVector3f.create(struct + OVRPoseStatef.LINEARACCELERATION); }
    /** Unsafe version of {@link #TimeInSeconds}. */
    public static double nTimeInSeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRPoseStatef.TIMEINSECONDS); }

    // -----------------------------------

    /** An array of {@link OVRPoseStatef} structs. */
    public static class Buffer extends StructBuffer<OVRPoseStatef, Buffer> implements NativeResource {

        private static final OVRPoseStatef ELEMENT_FACTORY = OVRPoseStatef.create(-1L);

        /**
         * Creates a new {@code OVRPoseStatef.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPoseStatef#SIZEOF}, and its mark will be undefined.
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
        protected OVRPoseStatef getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRPosef} view of the {@link OVRPoseStatef#ThePose} field. */
        @NativeType("ovrPosef")
        public OVRPosef ThePose() { return OVRPoseStatef.nThePose(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRPoseStatef#AngularVelocity} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f AngularVelocity() { return OVRPoseStatef.nAngularVelocity(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRPoseStatef#LinearVelocity} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f LinearVelocity() { return OVRPoseStatef.nLinearVelocity(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRPoseStatef#AngularAcceleration} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f AngularAcceleration() { return OVRPoseStatef.nAngularAcceleration(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRPoseStatef#LinearAcceleration} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f LinearAcceleration() { return OVRPoseStatef.nLinearAcceleration(address()); }
        /** @return the value of the {@link OVRPoseStatef#TimeInSeconds} field. */
        public double TimeInSeconds() { return OVRPoseStatef.nTimeInSeconds(address()); }

    }

}