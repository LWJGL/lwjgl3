/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a single pose for a tracked object.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TrackedDevicePose_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mDeviceToAbsoluteTracking;
 *     {@link HmdVector3 HmdVector3_t} {@link #vVelocity};
 *     {@link HmdVector3 HmdVector3_t} {@link #vAngularVelocity};
 *     ETrackingResult {@link #eTrackingResult};
 *     bool bPoseIsValid;
 *     bool {@link #bDeviceIsConnected};
 * }</code></pre>
 */
@NativeType("struct TrackedDevicePose_t")
public class TrackedDevicePose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MDEVICETOABSOLUTETRACKING,
        VVELOCITY,
        VANGULARVELOCITY,
        ETRACKINGRESULT,
        BPOSEISVALID,
        BDEVICEISCONNECTED;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MDEVICETOABSOLUTETRACKING = layout.offsetof(0);
        VVELOCITY = layout.offsetof(1);
        VANGULARVELOCITY = layout.offsetof(2);
        ETRACKINGRESULT = layout.offsetof(3);
        BPOSEISVALID = layout.offsetof(4);
        BDEVICEISCONNECTED = layout.offsetof(5);
    }

    /**
     * Creates a {@code TrackedDevicePose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TrackedDevicePose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }
    /** velocity in tracker space in m/s */
    @NativeType("HmdVector3_t")
    public HmdVector3 vVelocity() { return nvVelocity(address()); }
    /** angular velocity in radians/s */
    @NativeType("HmdVector3_t")
    public HmdVector3 vAngularVelocity() { return nvAngularVelocity(address()); }
    /** one of:<br><table><tr><td>{@link VR#ETrackingResult_TrackingResult_Uninitialized}</td></tr><tr><td>{@link VR#ETrackingResult_TrackingResult_Calibrating_InProgress}</td></tr><tr><td>{@link VR#ETrackingResult_TrackingResult_Calibrating_OutOfRange}</td></tr><tr><td>{@link VR#ETrackingResult_TrackingResult_Running_OK}</td></tr><tr><td>{@link VR#ETrackingResult_TrackingResult_Running_OutOfRange}</td></tr><tr><td>{@link VR#ETrackingResult_TrackingResult_Fallback_RotationOnly}</td></tr></table> */
    @NativeType("ETrackingResult")
    public int eTrackingResult() { return neTrackingResult(address()); }
    /** @return the value of the {@code bPoseIsValid} field. */
    @NativeType("bool")
    public boolean bPoseIsValid() { return nbPoseIsValid(address()); }
    /** This indicates that there is a device connected for this spot in the pose array. It could go from true to false if the user unplugs the device. */
    @NativeType("bool")
    public boolean bDeviceIsConnected() { return nbDeviceIsConnected(address()); }

    /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
    public TrackedDevicePose mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }
    /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
    public TrackedDevicePose mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }
    /** Copies the specified {@link HmdVector3} to the {@link #vVelocity} field. */
    public TrackedDevicePose vVelocity(@NativeType("HmdVector3_t") HmdVector3 value) { nvVelocity(address(), value); return this; }
    /** Passes the {@link #vVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public TrackedDevicePose vVelocity(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vVelocity()); return this; }
    /** Copies the specified {@link HmdVector3} to the {@link #vAngularVelocity} field. */
    public TrackedDevicePose vAngularVelocity(@NativeType("HmdVector3_t") HmdVector3 value) { nvAngularVelocity(address(), value); return this; }
    /** Passes the {@link #vAngularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public TrackedDevicePose vAngularVelocity(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vAngularVelocity()); return this; }
    /** Sets the specified value to the {@link #eTrackingResult} field. */
    public TrackedDevicePose eTrackingResult(@NativeType("ETrackingResult") int value) { neTrackingResult(address(), value); return this; }
    /** Sets the specified value to the {@code bPoseIsValid} field. */
    public TrackedDevicePose bPoseIsValid(@NativeType("bool") boolean value) { nbPoseIsValid(address(), value); return this; }
    /** Sets the specified value to the {@link #bDeviceIsConnected} field. */
    public TrackedDevicePose bDeviceIsConnected(@NativeType("bool") boolean value) { nbDeviceIsConnected(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public TrackedDevicePose set(
        HmdMatrix34 mDeviceToAbsoluteTracking,
        HmdVector3 vVelocity,
        HmdVector3 vAngularVelocity,
        int eTrackingResult,
        boolean bPoseIsValid,
        boolean bDeviceIsConnected
    ) {
        mDeviceToAbsoluteTracking(mDeviceToAbsoluteTracking);
        vVelocity(vVelocity);
        vAngularVelocity(vAngularVelocity);
        eTrackingResult(eTrackingResult);
        bPoseIsValid(bPoseIsValid);
        bDeviceIsConnected(bDeviceIsConnected);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public TrackedDevicePose set(TrackedDevicePose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code TrackedDevicePose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static TrackedDevicePose malloc() {
        return wrap(TrackedDevicePose.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code TrackedDevicePose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static TrackedDevicePose calloc() {
        return wrap(TrackedDevicePose.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code TrackedDevicePose} instance allocated with {@link BufferUtils}. */
    public static TrackedDevicePose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(TrackedDevicePose.class, memAddress(container), container);
    }

    /** Returns a new {@code TrackedDevicePose} instance for the specified memory address. */
    public static TrackedDevicePose create(long address) {
        return wrap(TrackedDevicePose.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TrackedDevicePose createSafe(long address) {
        return address == NULL ? null : wrap(TrackedDevicePose.class, address);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link TrackedDevicePose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TrackedDevicePose.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code TrackedDevicePose} instance allocated on the thread-local {@link MemoryStack}. */
    public static TrackedDevicePose mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code TrackedDevicePose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static TrackedDevicePose callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code TrackedDevicePose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static TrackedDevicePose mallocStack(MemoryStack stack) {
        return wrap(TrackedDevicePose.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code TrackedDevicePose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static TrackedDevicePose callocStack(MemoryStack stack) {
        return wrap(TrackedDevicePose.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TrackedDevicePose.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + TrackedDevicePose.MDEVICETOABSOLUTETRACKING); }
    /** Unsafe version of {@link #vVelocity}. */
    public static HmdVector3 nvVelocity(long struct) { return HmdVector3.create(struct + TrackedDevicePose.VVELOCITY); }
    /** Unsafe version of {@link #vAngularVelocity}. */
    public static HmdVector3 nvAngularVelocity(long struct) { return HmdVector3.create(struct + TrackedDevicePose.VANGULARVELOCITY); }
    /** Unsafe version of {@link #eTrackingResult}. */
    public static int neTrackingResult(long struct) { return UNSAFE.getInt(null, struct + TrackedDevicePose.ETRACKINGRESULT); }
    /** Unsafe version of {@link #bPoseIsValid}. */
    public static boolean nbPoseIsValid(long struct) { return UNSAFE.getByte(null, struct + TrackedDevicePose.BPOSEISVALID) != 0; }
    /** Unsafe version of {@link #bDeviceIsConnected}. */
    public static boolean nbDeviceIsConnected(long struct) { return UNSAFE.getByte(null, struct + TrackedDevicePose.BDEVICEISCONNECTED) != 0; }

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + TrackedDevicePose.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }
    /** Unsafe version of {@link #vVelocity(HmdVector3) vVelocity}. */
    public static void nvVelocity(long struct, HmdVector3 value) { memCopy(value.address(), struct + TrackedDevicePose.VVELOCITY, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vAngularVelocity(HmdVector3) vAngularVelocity}. */
    public static void nvAngularVelocity(long struct, HmdVector3 value) { memCopy(value.address(), struct + TrackedDevicePose.VANGULARVELOCITY, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #eTrackingResult(int) eTrackingResult}. */
    public static void neTrackingResult(long struct, int value) { UNSAFE.putInt(null, struct + TrackedDevicePose.ETRACKINGRESULT, value); }
    /** Unsafe version of {@link #bPoseIsValid(boolean) bPoseIsValid}. */
    public static void nbPoseIsValid(long struct, boolean value) { UNSAFE.putByte(null, struct + TrackedDevicePose.BPOSEISVALID, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #bDeviceIsConnected(boolean) bDeviceIsConnected}. */
    public static void nbDeviceIsConnected(long struct, boolean value) { UNSAFE.putByte(null, struct + TrackedDevicePose.BDEVICEISCONNECTED, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link TrackedDevicePose} structs. */
    public static class Buffer extends StructBuffer<TrackedDevicePose, Buffer> implements NativeResource {

        private static final TrackedDevicePose ELEMENT_FACTORY = TrackedDevicePose.create(-1L);

        /**
         * Creates a new {@code TrackedDevicePose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TrackedDevicePose#SIZEOF}, and its mark will be undefined.
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
        protected TrackedDevicePose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return TrackedDevicePose.nmDeviceToAbsoluteTracking(address()); }
        /** @return a {@link HmdVector3} view of the {@link TrackedDevicePose#vVelocity} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vVelocity() { return TrackedDevicePose.nvVelocity(address()); }
        /** @return a {@link HmdVector3} view of the {@link TrackedDevicePose#vAngularVelocity} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vAngularVelocity() { return TrackedDevicePose.nvAngularVelocity(address()); }
        /** @return the value of the {@link TrackedDevicePose#eTrackingResult} field. */
        @NativeType("ETrackingResult")
        public int eTrackingResult() { return TrackedDevicePose.neTrackingResult(address()); }
        /** @return the value of the {@code bPoseIsValid} field. */
        @NativeType("bool")
        public boolean bPoseIsValid() { return TrackedDevicePose.nbPoseIsValid(address()); }
        /** @return the value of the {@link TrackedDevicePose#bDeviceIsConnected} field. */
        @NativeType("bool")
        public boolean bDeviceIsConnected() { return TrackedDevicePose.nbDeviceIsConnected(address()); }

        /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
        public TrackedDevicePose.Buffer mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { TrackedDevicePose.nmDeviceToAbsoluteTracking(address(), value); return this; }
        /** Passes the {@code mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
        public TrackedDevicePose.Buffer mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }
        /** Copies the specified {@link HmdVector3} to the {@link TrackedDevicePose#vVelocity} field. */
        public TrackedDevicePose.Buffer vVelocity(@NativeType("HmdVector3_t") HmdVector3 value) { TrackedDevicePose.nvVelocity(address(), value); return this; }
        /** Passes the {@link TrackedDevicePose#vVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public TrackedDevicePose.Buffer vVelocity(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vVelocity()); return this; }
        /** Copies the specified {@link HmdVector3} to the {@link TrackedDevicePose#vAngularVelocity} field. */
        public TrackedDevicePose.Buffer vAngularVelocity(@NativeType("HmdVector3_t") HmdVector3 value) { TrackedDevicePose.nvAngularVelocity(address(), value); return this; }
        /** Passes the {@link TrackedDevicePose#vAngularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public TrackedDevicePose.Buffer vAngularVelocity(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vAngularVelocity()); return this; }
        /** Sets the specified value to the {@link TrackedDevicePose#eTrackingResult} field. */
        public TrackedDevicePose.Buffer eTrackingResult(@NativeType("ETrackingResult") int value) { TrackedDevicePose.neTrackingResult(address(), value); return this; }
        /** Sets the specified value to the {@code bPoseIsValid} field. */
        public TrackedDevicePose.Buffer bPoseIsValid(@NativeType("bool") boolean value) { TrackedDevicePose.nbPoseIsValid(address(), value); return this; }
        /** Sets the specified value to the {@link TrackedDevicePose#bDeviceIsConnected} field. */
        public TrackedDevicePose.Buffer bDeviceIsConnected(@NativeType("bool") boolean value) { TrackedDevicePose.nbDeviceIsConnected(address(), value); return this; }

    }

}