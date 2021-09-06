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
 * Specifies the pose for a single sensor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTrackerPose {
 *     unsigned int {@link #TrackerFlags};
 *     {@link OVRPosef ovrPosef} {@link #Pose};
 *     {@link OVRPosef ovrPosef} {@link #LeveledPose};
 * }</code></pre>
 */
@NativeType("struct ovrTrackerPose")
public class OVRTrackerPose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRACKERFLAGS,
        POSE,
        LEVELEDPOSE;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, 8,
            __member(4),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRACKERFLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
        LEVELEDPOSE = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRTrackerPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTrackerPose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code ovrTrackerFlags}. */
    @NativeType("unsigned int")
    public int TrackerFlags() { return nTrackerFlags(address()); }
    /** the sensor's pose. This pose includes sensor tilt (roll and pitch). For a leveled coordinate system use {@code LeveledPose}. */
    @NativeType("ovrPosef")
    public OVRPosef Pose() { return nPose(address()); }
    /**
     * t
     * the sensor's leveled pose, aligned with gravity. This value includes pos and yaw of the sensor, but not roll and pitch. It can be used as a
     * reference point to render real-world objects in the correct location.
     */
    @NativeType("ovrPosef")
    public OVRPosef LeveledPose() { return nLeveledPose(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRTrackerPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTrackerPose malloc() {
        return wrap(OVRTrackerPose.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRTrackerPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTrackerPose calloc() {
        return wrap(OVRTrackerPose.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRTrackerPose} instance allocated with {@link BufferUtils}. */
    public static OVRTrackerPose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRTrackerPose.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRTrackerPose} instance for the specified memory address. */
    public static OVRTrackerPose create(long address) {
        return wrap(OVRTrackerPose.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackerPose createSafe(long address) {
        return address == NULL ? null : wrap(OVRTrackerPose.class, address);
    }

    /**
     * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRTrackerPose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackerPose.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerPose.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRTrackerPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackerPose malloc(MemoryStack stack) {
        return wrap(OVRTrackerPose.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRTrackerPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackerPose calloc(MemoryStack stack) {
        return wrap(OVRTrackerPose.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackerPose.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #TrackerFlags}. */
    public static int nTrackerFlags(long struct) { return UNSAFE.getInt(null, struct + OVRTrackerPose.TRACKERFLAGS); }
    /** Unsafe version of {@link #Pose}. */
    public static OVRPosef nPose(long struct) { return OVRPosef.create(struct + OVRTrackerPose.POSE); }
    /** Unsafe version of {@link #LeveledPose}. */
    public static OVRPosef nLeveledPose(long struct) { return OVRPosef.create(struct + OVRTrackerPose.LEVELEDPOSE); }

    // -----------------------------------

    /** An array of {@link OVRTrackerPose} structs. */
    public static class Buffer extends StructBuffer<OVRTrackerPose, Buffer> implements NativeResource {

        private static final OVRTrackerPose ELEMENT_FACTORY = OVRTrackerPose.create(-1L);

        /**
         * Creates a new {@code OVRTrackerPose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTrackerPose#SIZEOF}, and its mark will be undefined.
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
        protected OVRTrackerPose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRTrackerPose#TrackerFlags} field. */
        @NativeType("unsigned int")
        public int TrackerFlags() { return OVRTrackerPose.nTrackerFlags(address()); }
        /** @return a {@link OVRPosef} view of the {@link OVRTrackerPose#Pose} field. */
        @NativeType("ovrPosef")
        public OVRPosef Pose() { return OVRTrackerPose.nPose(address()); }
        /** @return a {@link OVRPosef} view of the {@link OVRTrackerPose#LeveledPose} field. */
        @NativeType("ovrPosef")
        public OVRPosef LeveledPose() { return OVRTrackerPose.nLeveledPose(address()); }

    }

}