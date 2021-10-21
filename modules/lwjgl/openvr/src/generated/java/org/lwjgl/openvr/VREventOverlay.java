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
 * Used for a few events about overlays.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Overlay_t {
 *     uint64_t {@link #overlayHandle};
 *     uint64_t devicePath;
 *     uint64_t memoryBlockId;
 * }</code></pre>
 */
@NativeType("struct VREvent_Overlay_t")
public class VREventOverlay extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAYHANDLE,
        DEVICEPATH,
        MEMORYBLOCKID;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAYHANDLE = layout.offsetof(0);
        DEVICEPATH = layout.offsetof(1);
        MEMORYBLOCKID = layout.offsetof(2);
    }

    /**
     * Creates a {@code VREventOverlay} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventOverlay(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** one of:<br><table><tr><td>{@link VR#EVRState_VRState_Undefined}</td><td>{@link VR#EVRState_VRState_Off}</td><td>{@link VR#EVRState_VRState_Searching}</td></tr><tr><td>{@link VR#EVRState_VRState_Searching_Alert}</td><td>{@link VR#EVRState_VRState_Ready}</td><td>{@link VR#EVRState_VRState_Ready_Alert}</td></tr><tr><td>{@link VR#EVRState_VRState_NotReady}</td><td>{@link VR#EVRState_VRState_Standby}</td><td>{@link VR#EVRState_VRState_Ready_Alert_Low}</td></tr></table> */
    @NativeType("uint64_t")
    public long overlayHandle() { return noverlayHandle(address()); }
    /** @return the value of the {@code devicePath} field. */
    @NativeType("uint64_t")
    public long devicePath() { return ndevicePath(address()); }
    /** @return the value of the {@code memoryBlockId} field. */
    @NativeType("uint64_t")
    public long memoryBlockId() { return nmemoryBlockId(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventOverlay} instance for the specified memory address. */
    public static VREventOverlay create(long address) {
        return wrap(VREventOverlay.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventOverlay createSafe(long address) {
        return address == NULL ? null : wrap(VREventOverlay.class, address);
    }

    /**
     * Create a {@link VREventOverlay.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventOverlay.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventOverlay.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return UNSAFE.getLong(null, struct + VREventOverlay.OVERLAYHANDLE); }
    /** Unsafe version of {@link #devicePath}. */
    public static long ndevicePath(long struct) { return UNSAFE.getLong(null, struct + VREventOverlay.DEVICEPATH); }
    /** Unsafe version of {@link #memoryBlockId}. */
    public static long nmemoryBlockId(long struct) { return UNSAFE.getLong(null, struct + VREventOverlay.MEMORYBLOCKID); }

    // -----------------------------------

    /** An array of {@link VREventOverlay} structs. */
    public static class Buffer extends StructBuffer<VREventOverlay, Buffer> {

        private static final VREventOverlay ELEMENT_FACTORY = VREventOverlay.create(-1L);

        /**
         * Creates a new {@code VREventOverlay.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventOverlay#SIZEOF}, and its mark will be undefined.
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
        protected VREventOverlay getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREventOverlay#overlayHandle} field. */
        @NativeType("uint64_t")
        public long overlayHandle() { return VREventOverlay.noverlayHandle(address()); }
        /** @return the value of the {@code devicePath} field. */
        @NativeType("uint64_t")
        public long devicePath() { return VREventOverlay.ndevicePath(address()); }
        /** @return the value of the {@code memoryBlockId} field. */
        @NativeType("uint64_t")
        public long memoryBlockId() { return VREventOverlay.nmemoryBlockId(address()); }

    }

}