/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_SpatialAnchor_t {
 *     SpatialAnchorHandle_t unHandle;
 * }</code></pre>
 */
@NativeType("struct VREvent_SpatialAnchor_t")
public class VREventSpatialAnchor extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNHANDLE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNHANDLE = layout.offsetof(0);
    }

    VREventSpatialAnchor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventSpatialAnchor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventSpatialAnchor(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code unHandle} field. */
    @NativeType("SpatialAnchorHandle_t")
    public int unHandle() { return nunHandle(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventSpatialAnchor} instance for the specified memory address. */
    public static VREventSpatialAnchor create(long address) {
        return new VREventSpatialAnchor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventSpatialAnchor createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventSpatialAnchor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventSpatialAnchor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventSpatialAnchor.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unHandle}. */
    public static int nunHandle(long struct) { return memGetInt(struct + VREventSpatialAnchor.UNHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventSpatialAnchor} structs. */
    public static class Buffer extends StructBuffer<VREventSpatialAnchor, Buffer> {

        /**
         * Creates a new {@link VREventSpatialAnchor.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventSpatialAnchor#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventSpatialAnchor newInstance(long address) {
            return new VREventSpatialAnchor(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code unHandle} field. */
        @NativeType("SpatialAnchorHandle_t")
        public int unHandle() { return VREventSpatialAnchor.nunHandle(address()); }

    }

}