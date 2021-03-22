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
 * struct VREvent_ProgressUpdate_t {
 *     uint64_t ulApplicationPropertyContainer;
 *     uint64_t pathDevice;
 *     uint64_t pathInputSource;
 *     uint64_t pathProgressAction;
 *     uint64_t pathIcon;
 *     float fProgress;
 * }</code></pre>
 */
@NativeType("struct VREvent_ProgressUpdate_t")
public class VREventProgressUpdate extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULAPPLICATIONPROPERTYCONTAINER,
        PATHDEVICE,
        PATHINPUTSOURCE,
        PATHPROGRESSACTION,
        PATHICON,
        FPROGRESS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULAPPLICATIONPROPERTYCONTAINER = layout.offsetof(0);
        PATHDEVICE = layout.offsetof(1);
        PATHINPUTSOURCE = layout.offsetof(2);
        PATHPROGRESSACTION = layout.offsetof(3);
        PATHICON = layout.offsetof(4);
        FPROGRESS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VREventProgressUpdate} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventProgressUpdate(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ulApplicationPropertyContainer} field. */
    @NativeType("uint64_t")
    public long ulApplicationPropertyContainer() { return nulApplicationPropertyContainer(address()); }
    /** @return the value of the {@code pathDevice} field. */
    @NativeType("uint64_t")
    public long pathDevice() { return npathDevice(address()); }
    /** @return the value of the {@code pathInputSource} field. */
    @NativeType("uint64_t")
    public long pathInputSource() { return npathInputSource(address()); }
    /** @return the value of the {@code pathProgressAction} field. */
    @NativeType("uint64_t")
    public long pathProgressAction() { return npathProgressAction(address()); }
    /** @return the value of the {@code pathIcon} field. */
    @NativeType("uint64_t")
    public long pathIcon() { return npathIcon(address()); }
    /** @return the value of the {@code fProgress} field. */
    public float fProgress() { return nfProgress(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventProgressUpdate} instance for the specified memory address. */
    public static VREventProgressUpdate create(long address) {
        return wrap(VREventProgressUpdate.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProgressUpdate createSafe(long address) {
        return address == NULL ? null : wrap(VREventProgressUpdate.class, address);
    }

    /**
     * Create a {@link VREventProgressUpdate.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventProgressUpdate.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventProgressUpdate.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulApplicationPropertyContainer}. */
    public static long nulApplicationPropertyContainer(long struct) { return UNSAFE.getLong(null, struct + VREventProgressUpdate.ULAPPLICATIONPROPERTYCONTAINER); }
    /** Unsafe version of {@link #pathDevice}. */
    public static long npathDevice(long struct) { return UNSAFE.getLong(null, struct + VREventProgressUpdate.PATHDEVICE); }
    /** Unsafe version of {@link #pathInputSource}. */
    public static long npathInputSource(long struct) { return UNSAFE.getLong(null, struct + VREventProgressUpdate.PATHINPUTSOURCE); }
    /** Unsafe version of {@link #pathProgressAction}. */
    public static long npathProgressAction(long struct) { return UNSAFE.getLong(null, struct + VREventProgressUpdate.PATHPROGRESSACTION); }
    /** Unsafe version of {@link #pathIcon}. */
    public static long npathIcon(long struct) { return UNSAFE.getLong(null, struct + VREventProgressUpdate.PATHICON); }
    /** Unsafe version of {@link #fProgress}. */
    public static float nfProgress(long struct) { return UNSAFE.getFloat(null, struct + VREventProgressUpdate.FPROGRESS); }

    // -----------------------------------

    /** An array of {@link VREventProgressUpdate} structs. */
    public static class Buffer extends StructBuffer<VREventProgressUpdate, Buffer> {

        private static final VREventProgressUpdate ELEMENT_FACTORY = VREventProgressUpdate.create(-1L);

        /**
         * Creates a new {@code VREventProgressUpdate.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventProgressUpdate#SIZEOF}, and its mark will be undefined.
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
        protected VREventProgressUpdate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ulApplicationPropertyContainer} field. */
        @NativeType("uint64_t")
        public long ulApplicationPropertyContainer() { return VREventProgressUpdate.nulApplicationPropertyContainer(address()); }
        /** @return the value of the {@code pathDevice} field. */
        @NativeType("uint64_t")
        public long pathDevice() { return VREventProgressUpdate.npathDevice(address()); }
        /** @return the value of the {@code pathInputSource} field. */
        @NativeType("uint64_t")
        public long pathInputSource() { return VREventProgressUpdate.npathInputSource(address()); }
        /** @return the value of the {@code pathProgressAction} field. */
        @NativeType("uint64_t")
        public long pathProgressAction() { return VREventProgressUpdate.npathProgressAction(address()); }
        /** @return the value of the {@code pathIcon} field. */
        @NativeType("uint64_t")
        public long pathIcon() { return VREventProgressUpdate.npathIcon(address()); }
        /** @return the value of the {@code fProgress} field. */
        public float fProgress() { return VREventProgressUpdate.nfProgress(address()); }

    }

}