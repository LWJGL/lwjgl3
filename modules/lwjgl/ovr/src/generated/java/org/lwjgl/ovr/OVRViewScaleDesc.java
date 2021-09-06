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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * Contains the data necessary to properly calculate position info for various layer types.
 * 
 * <ul>
 * <li>{@code HmdToEyePose} is the same value-pair provided in {@link OVREyeRenderDesc}. Modifying this value is suggested only if the app is forcing monoscopic
 * rendering and requires that all layers including quad layers show up in a monoscopic fashion.</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units.</li>
 * </ul>
 * 
 * <p>In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
 * {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
 * units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrViewScaleDesc {
 *     {@link OVRPosef ovrPosef} {@link #HmdToEyePose}[ovrEye_Count];
 *     float {@link #HmdSpaceToWorldScaleInMeters};
 * }</code></pre>
 */
@NativeType("struct ovrViewScaleDesc")
public class OVRViewScaleDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HMDTOEYEPOSE,
        HMDSPACETOWORLDSCALEINMETERS;

    static {
        Layout layout = __struct(
            __array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, ovrEye_Count),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HMDTOEYEPOSE = layout.offsetof(0);
        HMDSPACETOWORLDSCALEINMETERS = layout.offsetof(1);
    }

    /**
     * Creates a {@code OVRViewScaleDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRViewScaleDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** transform of each eye from the HMD center, in meters */
    @NativeType("ovrPosef[ovrEye_Count]")
    public OVRPosef.Buffer HmdToEyePose() { return nHmdToEyePose(address()); }
    /** transform of each eye from the HMD center, in meters */
    @NativeType("ovrPosef")
    public OVRPosef HmdToEyePose(int index) { return nHmdToEyePose(address(), index); }
    /** ratio of viewer units to meter units */
    public float HmdSpaceToWorldScaleInMeters() { return nHmdSpaceToWorldScaleInMeters(address()); }

    /** Copies the specified {@link OVRPosef.Buffer} to the {@link #HmdToEyePose} field. */
    public OVRViewScaleDesc HmdToEyePose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { nHmdToEyePose(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} at the specified index of the {@link #HmdToEyePose} field. */
    public OVRViewScaleDesc HmdToEyePose(int index, @NativeType("ovrPosef") OVRPosef value) { nHmdToEyePose(address(), index, value); return this; }
    /** Passes the {@link #HmdToEyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRViewScaleDesc HmdToEyePose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(HmdToEyePose()); return this; }
    /** Passes the element at {@code index} of the {@link #HmdToEyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRViewScaleDesc HmdToEyePose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(HmdToEyePose(index)); return this; }
    /** Sets the specified value to the {@link #HmdSpaceToWorldScaleInMeters} field. */
    public OVRViewScaleDesc HmdSpaceToWorldScaleInMeters(float value) { nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRViewScaleDesc set(
        OVRPosef.Buffer HmdToEyePose,
        float HmdSpaceToWorldScaleInMeters
    ) {
        HmdToEyePose(HmdToEyePose);
        HmdSpaceToWorldScaleInMeters(HmdSpaceToWorldScaleInMeters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRViewScaleDesc set(OVRViewScaleDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRViewScaleDesc malloc() {
        return wrap(OVRViewScaleDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRViewScaleDesc calloc() {
        return wrap(OVRViewScaleDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRViewScaleDesc} instance allocated with {@link BufferUtils}. */
    public static OVRViewScaleDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRViewScaleDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRViewScaleDesc} instance for the specified memory address. */
    public static OVRViewScaleDesc create(long address) {
        return wrap(OVRViewScaleDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewScaleDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVRViewScaleDesc.class, address);
    }

    /**
     * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRViewScaleDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewScaleDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRViewScaleDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRViewScaleDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewScaleDesc malloc(MemoryStack stack) {
        return wrap(OVRViewScaleDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRViewScaleDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewScaleDesc calloc(MemoryStack stack) {
        return wrap(OVRViewScaleDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewScaleDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #HmdToEyePose}. */
    public static OVRPosef.Buffer nHmdToEyePose(long struct) { return OVRPosef.create(struct + OVRViewScaleDesc.HMDTOEYEPOSE, ovrEye_Count); }
    /** Unsafe version of {@link #HmdToEyePose(int) HmdToEyePose}. */
    public static OVRPosef nHmdToEyePose(long struct, int index) {
        return OVRPosef.create(struct + OVRViewScaleDesc.HMDTOEYEPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #HmdSpaceToWorldScaleInMeters}. */
    public static float nHmdSpaceToWorldScaleInMeters(long struct) { return UNSAFE.getFloat(null, struct + OVRViewScaleDesc.HMDSPACETOWORLDSCALEINMETERS); }

    /** Unsafe version of {@link #HmdToEyePose(OVRPosef.Buffer) HmdToEyePose}. */
    public static void nHmdToEyePose(long struct, OVRPosef.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEPOSE, value.remaining() * OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #HmdToEyePose(int, OVRPosef) HmdToEyePose}. */
    public static void nHmdToEyePose(long struct, int index, OVRPosef value) {
        memCopy(value.address(), struct + OVRViewScaleDesc.HMDTOEYEPOSE + check(index, ovrEye_Count) * OVRPosef.SIZEOF, OVRPosef.SIZEOF);
    }
    /** Unsafe version of {@link #HmdSpaceToWorldScaleInMeters(float) HmdSpaceToWorldScaleInMeters}. */
    public static void nHmdSpaceToWorldScaleInMeters(long struct, float value) { UNSAFE.putFloat(null, struct + OVRViewScaleDesc.HMDSPACETOWORLDSCALEINMETERS, value); }

    // -----------------------------------

    /** An array of {@link OVRViewScaleDesc} structs. */
    public static class Buffer extends StructBuffer<OVRViewScaleDesc, Buffer> implements NativeResource {

        private static final OVRViewScaleDesc ELEMENT_FACTORY = OVRViewScaleDesc.create(-1L);

        /**
         * Creates a new {@code OVRViewScaleDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRViewScaleDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVRViewScaleDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRPosef}.Buffer view of the {@link OVRViewScaleDesc#HmdToEyePose} field. */
        @NativeType("ovrPosef[ovrEye_Count]")
        public OVRPosef.Buffer HmdToEyePose() { return OVRViewScaleDesc.nHmdToEyePose(address()); }
        /** @return a {@link OVRPosef} view of the struct at the specified index of the {@link OVRViewScaleDesc#HmdToEyePose} field. */
        @NativeType("ovrPosef")
        public OVRPosef HmdToEyePose(int index) { return OVRViewScaleDesc.nHmdToEyePose(address(), index); }
        /** @return the value of the {@link OVRViewScaleDesc#HmdSpaceToWorldScaleInMeters} field. */
        public float HmdSpaceToWorldScaleInMeters() { return OVRViewScaleDesc.nHmdSpaceToWorldScaleInMeters(address()); }

        /** Copies the specified {@link OVRPosef.Buffer} to the {@link OVRViewScaleDesc#HmdToEyePose} field. */
        public OVRViewScaleDesc.Buffer HmdToEyePose(@NativeType("ovrPosef[ovrEye_Count]") OVRPosef.Buffer value) { OVRViewScaleDesc.nHmdToEyePose(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} at the specified index of the {@link OVRViewScaleDesc#HmdToEyePose} field. */
        public OVRViewScaleDesc.Buffer HmdToEyePose(int index, @NativeType("ovrPosef") OVRPosef value) { OVRViewScaleDesc.nHmdToEyePose(address(), index, value); return this; }
        /** Passes the {@link OVRViewScaleDesc#HmdToEyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRViewScaleDesc.Buffer HmdToEyePose(java.util.function.Consumer<OVRPosef.Buffer> consumer) { consumer.accept(HmdToEyePose()); return this; }
        /** Passes the element at {@code index} of the {@link OVRViewScaleDesc#HmdToEyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRViewScaleDesc.Buffer HmdToEyePose(int index, java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(HmdToEyePose(index)); return this; }
        /** Sets the specified value to the {@link OVRViewScaleDesc#HmdSpaceToWorldScaleInMeters} field. */
        public OVRViewScaleDesc.Buffer HmdSpaceToWorldScaleInMeters(float value) { OVRViewScaleDesc.nHmdSpaceToWorldScaleInMeters(address(), value); return this; }

    }

}