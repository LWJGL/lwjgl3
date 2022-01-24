/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Current aiming gesture state for the hand.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHandTrackingAim XR_FB_hand_tracking_aim} extension <b>must</b> be enabled prior to using {@link XrHandTrackingAimStateFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHandTrackingAim#XR_TYPE_HAND_TRACKING_AIM_STATE_FB TYPE_HAND_TRACKING_AIM_STATE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingAimStateFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrHandTrackingAimFlagsFB {@link #status};
 *     {@link XrPosef XrPosef} {@link #aimPose};
 *     float {@link #pinchStrengthIndex};
 *     float {@link #pinchStrengthMiddle};
 *     float {@link #pinchStrengthRing};
 *     float {@link #pinchStrengthLittle};
 * }</code></pre>
 */
public class XrHandTrackingAimStateFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATUS,
        AIMPOSE,
        PINCHSTRENGTHINDEX,
        PINCHSTRENGTHMIDDLE,
        PINCHSTRENGTHRING,
        PINCHSTRENGTHLITTLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATUS = layout.offsetof(2);
        AIMPOSE = layout.offsetof(3);
        PINCHSTRENGTHINDEX = layout.offsetof(4);
        PINCHSTRENGTHMIDDLE = layout.offsetof(5);
        PINCHSTRENGTHRING = layout.offsetof(6);
        PINCHSTRENGTHLITTLE = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrHandTrackingAimStateFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingAimStateFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrHandTrackingAimFlagBitsFB} describing the availability and state of other signals. */
    @NativeType("XrHandTrackingAimFlagsFB")
    public long status() { return nstatus(address()); }
    /** a system-determined "aim" pose, similar in intent and convention to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#aim-pose">aim poses</a> used with the action system, based on hand data. */
    public XrPosef aimPose() { return naimPose(address()); }
    /** the current pinching strength for the index finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning index and thumb are fully touching. */
    public float pinchStrengthIndex() { return npinchStrengthIndex(address()); }
    /** the current pinching strength for the middle finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning middle and thumb are fully touching. */
    public float pinchStrengthMiddle() { return npinchStrengthMiddle(address()); }
    /** the current pinching strength for the ring finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning ring and thumb are fully touching. */
    public float pinchStrengthRing() { return npinchStrengthRing(address()); }
    /** the current pinching strength for the little finger of this hand. Range is 0.0 to 1.0, with 1.0 meaning little and thumb are fully touching. */
    public float pinchStrengthLittle() { return npinchStrengthLittle(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandTrackingAimStateFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHandTrackingAim#XR_TYPE_HAND_TRACKING_AIM_STATE_FB TYPE_HAND_TRACKING_AIM_STATE_FB} value to the {@link #type} field. */
    public XrHandTrackingAimStateFB type$Default() { return type(FBHandTrackingAim.XR_TYPE_HAND_TRACKING_AIM_STATE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandTrackingAimStateFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingAimStateFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandTrackingAimStateFB set(XrHandTrackingAimStateFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingAimStateFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingAimStateFB malloc() {
        return wrap(XrHandTrackingAimStateFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandTrackingAimStateFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingAimStateFB calloc() {
        return wrap(XrHandTrackingAimStateFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandTrackingAimStateFB} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingAimStateFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandTrackingAimStateFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingAimStateFB} instance for the specified memory address. */
    public static XrHandTrackingAimStateFB create(long address) {
        return wrap(XrHandTrackingAimStateFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingAimStateFB createSafe(long address) {
        return address == NULL ? null : wrap(XrHandTrackingAimStateFB.class, address);
    }

    /**
     * Returns a new {@link XrHandTrackingAimStateFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingAimStateFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingAimStateFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandTrackingAimStateFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingAimStateFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingAimStateFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingAimStateFB malloc(MemoryStack stack) {
        return wrap(XrHandTrackingAimStateFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandTrackingAimStateFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingAimStateFB calloc(MemoryStack stack) {
        return wrap(XrHandTrackingAimStateFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandTrackingAimStateFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingAimStateFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingAimStateFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingAimStateFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingAimStateFB.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static long nstatus(long struct) { return UNSAFE.getLong(null, struct + XrHandTrackingAimStateFB.STATUS); }
    /** Unsafe version of {@link #aimPose}. */
    public static XrPosef naimPose(long struct) { return XrPosef.create(struct + XrHandTrackingAimStateFB.AIMPOSE); }
    /** Unsafe version of {@link #pinchStrengthIndex}. */
    public static float npinchStrengthIndex(long struct) { return UNSAFE.getFloat(null, struct + XrHandTrackingAimStateFB.PINCHSTRENGTHINDEX); }
    /** Unsafe version of {@link #pinchStrengthMiddle}. */
    public static float npinchStrengthMiddle(long struct) { return UNSAFE.getFloat(null, struct + XrHandTrackingAimStateFB.PINCHSTRENGTHMIDDLE); }
    /** Unsafe version of {@link #pinchStrengthRing}. */
    public static float npinchStrengthRing(long struct) { return UNSAFE.getFloat(null, struct + XrHandTrackingAimStateFB.PINCHSTRENGTHRING); }
    /** Unsafe version of {@link #pinchStrengthLittle}. */
    public static float npinchStrengthLittle(long struct) { return UNSAFE.getFloat(null, struct + XrHandTrackingAimStateFB.PINCHSTRENGTHLITTLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingAimStateFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingAimStateFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrHandTrackingAimStateFB} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingAimStateFB, Buffer> implements NativeResource {

        private static final XrHandTrackingAimStateFB ELEMENT_FACTORY = XrHandTrackingAimStateFB.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingAimStateFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingAimStateFB#SIZEOF}, and its mark will be undefined.
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
        protected XrHandTrackingAimStateFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingAimStateFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingAimStateFB.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingAimStateFB.nnext(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#status} field. */
        @NativeType("XrHandTrackingAimFlagsFB")
        public long status() { return XrHandTrackingAimStateFB.nstatus(address()); }
        /** @return a {@link XrPosef} view of the {@link XrHandTrackingAimStateFB#aimPose} field. */
        public XrPosef aimPose() { return XrHandTrackingAimStateFB.naimPose(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#pinchStrengthIndex} field. */
        public float pinchStrengthIndex() { return XrHandTrackingAimStateFB.npinchStrengthIndex(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#pinchStrengthMiddle} field. */
        public float pinchStrengthMiddle() { return XrHandTrackingAimStateFB.npinchStrengthMiddle(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#pinchStrengthRing} field. */
        public float pinchStrengthRing() { return XrHandTrackingAimStateFB.npinchStrengthRing(address()); }
        /** @return the value of the {@link XrHandTrackingAimStateFB#pinchStrengthLittle} field. */
        public float pinchStrengthLittle() { return XrHandTrackingAimStateFB.npinchStrengthLittle(address()); }

        /** Sets the specified value to the {@link XrHandTrackingAimStateFB#type} field. */
        public XrHandTrackingAimStateFB.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingAimStateFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHandTrackingAim#XR_TYPE_HAND_TRACKING_AIM_STATE_FB TYPE_HAND_TRACKING_AIM_STATE_FB} value to the {@link XrHandTrackingAimStateFB#type} field. */
        public XrHandTrackingAimStateFB.Buffer type$Default() { return type(FBHandTrackingAim.XR_TYPE_HAND_TRACKING_AIM_STATE_FB); }
        /** Sets the specified value to the {@link XrHandTrackingAimStateFB#next} field. */
        public XrHandTrackingAimStateFB.Buffer next(@NativeType("void *") long value) { XrHandTrackingAimStateFB.nnext(address(), value); return this; }

    }

}