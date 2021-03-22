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

    /**
     * Creates a {@code VREventNotification} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventNotification(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ulUserValue} field. */
    @NativeType("uint64_t")
    public long ulUserValue() { return nulUserValue(address()); }
    /** @return the value of the {@code notificationId} field. */
    @NativeType("uint32_t")
    public int notificationId() { return nnotificationId(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventNotification} instance for the specified memory address. */
    public static VREventNotification create(long address) {
        return wrap(VREventNotification.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventNotification createSafe(long address) {
        return address == NULL ? null : wrap(VREventNotification.class, address);
    }

    /**
     * Create a {@link VREventNotification.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventNotification.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventNotification.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulUserValue}. */
    public static long nulUserValue(long struct) { return UNSAFE.getLong(null, struct + VREventNotification.ULUSERVALUE); }
    /** Unsafe version of {@link #notificationId}. */
    public static int nnotificationId(long struct) { return UNSAFE.getInt(null, struct + VREventNotification.NOTIFICATIONID); }

    // -----------------------------------

    /** An array of {@link VREventNotification} structs. */
    public static class Buffer extends StructBuffer<VREventNotification, Buffer> {

        private static final VREventNotification ELEMENT_FACTORY = VREventNotification.create(-1L);

        /**
         * Creates a new {@code VREventNotification.Buffer} instance backed by the specified container.
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
        protected VREventNotification getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ulUserValue} field. */
        @NativeType("uint64_t")
        public long ulUserValue() { return VREventNotification.nulUserValue(address()); }
        /** @return the value of the {@code notificationId} field. */
        @NativeType("uint32_t")
        public int notificationId() { return VREventNotification.nnotificationId(address()); }

    }

}