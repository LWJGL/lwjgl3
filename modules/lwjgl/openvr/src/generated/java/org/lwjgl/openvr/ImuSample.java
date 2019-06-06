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
 * struct ImuSample_t {
 *     double fSampleTime;
 *     {@link HmdVector3d HmdVector3d_t} vAccel;
 *     {@link HmdVector3d HmdVector3d_t} vGyro;
 *     uint32_t unOffScaleFlags;
 * }</code></pre>
 */
@NativeType("struct ImuSample_t")
public class ImuSample extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FSAMPLETIME,
        VACCEL,
        VGYRO,
        UNOFFSCALEFLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(HmdVector3d.SIZEOF, HmdVector3d.ALIGNOF),
            __member(HmdVector3d.SIZEOF, HmdVector3d.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FSAMPLETIME = layout.offsetof(0);
        VACCEL = layout.offsetof(1);
        VGYRO = layout.offsetof(2);
        UNOFFSCALEFLAGS = layout.offsetof(3);
    }

    /**
     * Creates a {@code ImuSample} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ImuSample(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code fSampleTime} field. */
    public double fSampleTime() { return nfSampleTime(address()); }
    /** Returns a {@link HmdVector3d} view of the {@code vAccel} field. */
    @NativeType("HmdVector3d_t")
    public HmdVector3d vAccel() { return nvAccel(address()); }
    /** Returns a {@link HmdVector3d} view of the {@code vGyro} field. */
    @NativeType("HmdVector3d_t")
    public HmdVector3d vGyro() { return nvGyro(address()); }
    /** Returns the value of the {@code unOffScaleFlags} field. */
    @NativeType("uint32_t")
    public int unOffScaleFlags() { return nunOffScaleFlags(address()); }

    // -----------------------------------

    /** Returns a new {@code ImuSample} instance for the specified memory address. */
    public static ImuSample create(long address) {
        return wrap(ImuSample.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ImuSample createSafe(long address) {
        return address == NULL ? null : wrap(ImuSample.class, address);
    }

    /**
     * Create a {@link ImuSample.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ImuSample.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ImuSample.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fSampleTime}. */
    public static double nfSampleTime(long struct) { return UNSAFE.getDouble(null, struct + ImuSample.FSAMPLETIME); }
    /** Unsafe version of {@link #vAccel}. */
    public static HmdVector3d nvAccel(long struct) { return HmdVector3d.create(struct + ImuSample.VACCEL); }
    /** Unsafe version of {@link #vGyro}. */
    public static HmdVector3d nvGyro(long struct) { return HmdVector3d.create(struct + ImuSample.VGYRO); }
    /** Unsafe version of {@link #unOffScaleFlags}. */
    public static int nunOffScaleFlags(long struct) { return UNSAFE.getInt(null, struct + ImuSample.UNOFFSCALEFLAGS); }

    // -----------------------------------

    /** An array of {@link ImuSample} structs. */
    public static class Buffer extends StructBuffer<ImuSample, Buffer> {

        private static final ImuSample ELEMENT_FACTORY = ImuSample.create(-1L);

        /**
         * Creates a new {@code ImuSample.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ImuSample#SIZEOF}, and its mark will be undefined.
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
        protected ImuSample getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code fSampleTime} field. */
        public double fSampleTime() { return ImuSample.nfSampleTime(address()); }
        /** Returns a {@link HmdVector3d} view of the {@code vAccel} field. */
        @NativeType("HmdVector3d_t")
        public HmdVector3d vAccel() { return ImuSample.nvAccel(address()); }
        /** Returns a {@link HmdVector3d} view of the {@code vGyro} field. */
        @NativeType("HmdVector3d_t")
        public HmdVector3d vGyro() { return ImuSample.nvGyro(address()); }
        /** Returns the value of the {@code unOffScaleFlags} field. */
        @NativeType("uint32_t")
        public int unOffScaleFlags() { return ImuSample.nunOffScaleFlags(address()); }

    }

}