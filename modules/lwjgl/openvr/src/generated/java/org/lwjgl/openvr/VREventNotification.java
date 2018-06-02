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
 * Notification related events. Details will still change at this point.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Notification_t {
 *     uint64_t ulUserValue;
 *     uint32_t notificationId;
 * }</code></pre>
 */
@NativeType("struct VREvent_Notification_t")
public class VREventNotification extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULUSERVALUE,
        NOTIFICATIONID;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULUSERVALUE = layout.offsetof(0);
        NOTIFICATIONID = layout.offsetof(1);
    }

    VREventNotification(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventNotification} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventNotification(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ulUserValue} field. */
    @NativeType("uint64_t")
    public long ulUserValue() { return nulUserValue(address()); }
    /** Returns the value of the {@code notificationId} field. */
    @NativeType("uint32_t")
    public int notificationId() { return nnotificationId(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventNotification} instance for the specified memory address. */
    public static VREventNotification create(long address) {
        return new VREventNotification(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventNotification createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventNotification.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventNotification.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventNotification.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulUserValue}. */
    public static long nulUserValue(long struct) { return memGetLong(struct + VREventNotification.ULUSERVALUE); }
    /** Unsafe version of {@link #notificationId}. */
    public static int nnotificationId(long struct) { return memGetInt(struct + VREventNotification.NOTIFICATIONID); }

    // -----------------------------------

    /** An array of {@link VREventNotification} structs. */
    public static class Buffer extends StructBuffer<VREventNotification, Buffer> {

        /**
         * Creates a new {@link VREventNotification.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventNotification#SIZEOF}, and its mark will be undefined.
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
        protected VREventNotification newInstance(long address) {
            return new VREventNotification(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code ulUserValue} field. */
        @NativeType("uint64_t")
        public long ulUserValue() { return VREventNotification.nulUserValue(address()); }
        /** Returns the value of the {@code notificationId} field. */
        @NativeType("uint32_t")
        public int notificationId() { return VREventNotification.nnotificationId(address()); }

    }

}