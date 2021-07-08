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
 * struct VREvent_HapticVibration_t {
 *     uint64_t {@link #containerHandle};
 *     uint64_t {@link #componentHandle};
 *     float fDurationSeconds;
 *     float fFrequency;
 *     float fAmplitude;
 * }</code></pre>
 */
@NativeType("struct VREvent_HapticVibration_t")
public class VREventHapticVibration extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTAINERHANDLE,
        COMPONENTHANDLE,
        FDURATIONSECONDS,
        FFREQUENCY,
        FAMPLITUDE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTAINERHANDLE = layout.offsetof(0);
        COMPONENTHANDLE = layout.offsetof(1);
        FDURATIONSECONDS = layout.offsetof(2);
        FFREQUENCY = layout.offsetof(3);
        FAMPLITUDE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VREventHapticVibration} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventHapticVibration(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** property container handle of the device with the haptic component */
    @NativeType("uint64_t")
    public long containerHandle() { return ncontainerHandle(address()); }
    /** which haptic component needs to vibrate */
    @NativeType("uint64_t")
    public long componentHandle() { return ncomponentHandle(address()); }
    /** @return the value of the {@code fDurationSeconds} field. */
    public float fDurationSeconds() { return nfDurationSeconds(address()); }
    /** @return the value of the {@code fFrequency} field. */
    public float fFrequency() { return nfFrequency(address()); }
    /** @return the value of the {@code fAmplitude} field. */
    public float fAmplitude() { return nfAmplitude(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventHapticVibration} instance for the specified memory address. */
    public static VREventHapticVibration create(long address) {
        return wrap(VREventHapticVibration.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventHapticVibration createSafe(long address) {
        return address == NULL ? null : wrap(VREventHapticVibration.class, address);
    }

    /**
     * Create a {@link VREventHapticVibration.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventHapticVibration.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventHapticVibration.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #containerHandle}. */
    public static long ncontainerHandle(long struct) { return UNSAFE.getLong(null, struct + VREventHapticVibration.CONTAINERHANDLE); }
    /** Unsafe version of {@link #componentHandle}. */
    public static long ncomponentHandle(long struct) { return UNSAFE.getLong(null, struct + VREventHapticVibration.COMPONENTHANDLE); }
    /** Unsafe version of {@link #fDurationSeconds}. */
    public static float nfDurationSeconds(long struct) { return UNSAFE.getFloat(null, struct + VREventHapticVibration.FDURATIONSECONDS); }
    /** Unsafe version of {@link #fFrequency}. */
    public static float nfFrequency(long struct) { return UNSAFE.getFloat(null, struct + VREventHapticVibration.FFREQUENCY); }
    /** Unsafe version of {@link #fAmplitude}. */
    public static float nfAmplitude(long struct) { return UNSAFE.getFloat(null, struct + VREventHapticVibration.FAMPLITUDE); }

    // -----------------------------------

    /** An array of {@link VREventHapticVibration} structs. */
    public static class Buffer extends StructBuffer<VREventHapticVibration, Buffer> {

        private static final VREventHapticVibration ELEMENT_FACTORY = VREventHapticVibration.create(-1L);

        /**
         * Creates a new {@code VREventHapticVibration.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventHapticVibration#SIZEOF}, and its mark will be undefined.
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
        protected VREventHapticVibration getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREventHapticVibration#containerHandle} field. */
        @NativeType("uint64_t")
        public long containerHandle() { return VREventHapticVibration.ncontainerHandle(address()); }
        /** @return the value of the {@link VREventHapticVibration#componentHandle} field. */
        @NativeType("uint64_t")
        public long componentHandle() { return VREventHapticVibration.ncomponentHandle(address()); }
        /** @return the value of the {@code fDurationSeconds} field. */
        public float fDurationSeconds() { return VREventHapticVibration.nfDurationSeconds(address()); }
        /** @return the value of the {@code fFrequency} field. */
        public float fFrequency() { return VREventHapticVibration.nfFrequency(address()); }
        /** @return the value of the {@code fAmplitude} field. */
        public float fAmplitude() { return VREventHapticVibration.nfAmplitude(address()); }

    }

}