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
 * Return values for {@link OVRUtil#ovr_Detect _Detect}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrDetectResult {
 *     ovrBool {@link #IsOculusServiceRunning};
 *     ovrBool {@link #IsOculusHMDConnected};
 *     char[6];
 * }</code></pre>
 */
@NativeType("struct ovrDetectResult")
public class OVRDetectResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISOCULUSSERVICERUNNING,
        ISOCULUSHMDCONNECTED;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __padding(6, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISOCULUSSERVICERUNNING = layout.offsetof(0);
        ISOCULUSHMDCONNECTED = layout.offsetof(1);
    }

    /**
     * Creates a {@code OVRDetectResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRDetectResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * is {@link OVR#ovrFalse False} when the Oculus Service is not running. This means that the Oculus Service is either uninstalled or stopped.
     * {@code IsOculusHMDConnected} will be {@link OVR#ovrFalse False} in this case.
     * 
     * <p>is {@link OVR#ovrTrue True} when the Oculus Service is running. This means that the Oculus Service is installed and running. {@code IsOculusHMDConnected} will
     * reflect the state of the HMD.</p>
     */
    @NativeType("ovrBool")
    public boolean IsOculusServiceRunning() { return nIsOculusServiceRunning(address()); }
    /**
     * is {@link OVR#ovrFalse False} when an Oculus HMD is not detected. If the Oculus Service is not running, this will be {@link OVR#ovrFalse False}.
     * 
     * <p>is {@link OVR#ovrTrue True} when an Oculus HMD is detected. This implies that the Oculus Service is also installed and running.</p>
     */
    @NativeType("ovrBool")
    public boolean IsOculusHMDConnected() { return nIsOculusHMDConnected(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRDetectResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRDetectResult malloc() {
        return wrap(OVRDetectResult.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRDetectResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRDetectResult calloc() {
        return wrap(OVRDetectResult.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRDetectResult} instance allocated with {@link BufferUtils}. */
    public static OVRDetectResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRDetectResult.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRDetectResult} instance for the specified memory address. */
    public static OVRDetectResult create(long address) {
        return wrap(OVRDetectResult.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRDetectResult createSafe(long address) {
        return address == NULL ? null : wrap(OVRDetectResult.class, address);
    }

    /**
     * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRDetectResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRDetectResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRDetectResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRDetectResult.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRDetectResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRDetectResult malloc(MemoryStack stack) {
        return wrap(OVRDetectResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRDetectResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRDetectResult calloc(MemoryStack stack) {
        return wrap(OVRDetectResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRDetectResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRDetectResult.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #IsOculusServiceRunning}. */
    public static boolean nIsOculusServiceRunning(long struct) { return UNSAFE.getByte(null, struct + OVRDetectResult.ISOCULUSSERVICERUNNING) != 0; }
    /** Unsafe version of {@link #IsOculusHMDConnected}. */
    public static boolean nIsOculusHMDConnected(long struct) { return UNSAFE.getByte(null, struct + OVRDetectResult.ISOCULUSHMDCONNECTED) != 0; }

    // -----------------------------------

    /** An array of {@link OVRDetectResult} structs. */
    public static class Buffer extends StructBuffer<OVRDetectResult, Buffer> implements NativeResource {

        private static final OVRDetectResult ELEMENT_FACTORY = OVRDetectResult.create(-1L);

        /**
         * Creates a new {@code OVRDetectResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRDetectResult#SIZEOF}, and its mark will be undefined.
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
        protected OVRDetectResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRDetectResult#IsOculusServiceRunning} field. */
        @NativeType("ovrBool")
        public boolean IsOculusServiceRunning() { return OVRDetectResult.nIsOculusServiceRunning(address()); }
        /** @return the value of the {@link OVRDetectResult#IsOculusHMDConnected} field. */
        @NativeType("ovrBool")
        public boolean IsOculusHMDConnected() { return OVRDetectResult.nIsOculusHMDConnected(address()); }

    }

}