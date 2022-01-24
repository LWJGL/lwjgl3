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
 * Describes what hand pose type for the hand joint tracking.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandPoseTypeInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTHandTrackingMesh#XR_TYPE_HAND_POSE_TYPE_INFO_MSFT TYPE_HAND_POSE_TYPE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code handPoseType} <b>must</b> be a valid {@code XrHandPoseTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandTrackerCreateInfoEXT}, {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandPoseTypeInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrHandPoseTypeMSFT {@link #handPoseType};
 * }</code></pre>
 */
public class XrHandPoseTypeInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HANDPOSETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HANDPOSETYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrHandPoseTypeInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandPoseTypeInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrHandPoseTypeMSFT} that describes the type of hand pose of the hand tracking. */
    @NativeType("XrHandPoseTypeMSFT")
    public int handPoseType() { return nhandPoseType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandPoseTypeInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_POSE_TYPE_INFO_MSFT TYPE_HAND_POSE_TYPE_INFO_MSFT} value to the {@link #type} field. */
    public XrHandPoseTypeInfoMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_POSE_TYPE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandPoseTypeInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #handPoseType} field. */
    public XrHandPoseTypeInfoMSFT handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { nhandPoseType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandPoseTypeInfoMSFT set(
        int type,
        long next,
        int handPoseType
    ) {
        type(type);
        next(next);
        handPoseType(handPoseType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandPoseTypeInfoMSFT set(XrHandPoseTypeInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandPoseTypeInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandPoseTypeInfoMSFT malloc() {
        return wrap(XrHandPoseTypeInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandPoseTypeInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandPoseTypeInfoMSFT calloc() {
        return wrap(XrHandPoseTypeInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandPoseTypeInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandPoseTypeInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandPoseTypeInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandPoseTypeInfoMSFT} instance for the specified memory address. */
    public static XrHandPoseTypeInfoMSFT create(long address) {
        return wrap(XrHandPoseTypeInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandPoseTypeInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandPoseTypeInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandPoseTypeInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandPoseTypeInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandPoseTypeInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandPoseTypeInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandPoseTypeInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandPoseTypeInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandPoseTypeInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrHandPoseTypeInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandPoseTypeInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandPoseTypeInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrHandPoseTypeInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandPoseTypeInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandPoseTypeInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandPoseTypeInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandPoseTypeInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandPoseTypeInfoMSFT.NEXT); }
    /** Unsafe version of {@link #handPoseType}. */
    public static int nhandPoseType(long struct) { return UNSAFE.getInt(null, struct + XrHandPoseTypeInfoMSFT.HANDPOSETYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandPoseTypeInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandPoseTypeInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #handPoseType(int) handPoseType}. */
    public static void nhandPoseType(long struct, int value) { UNSAFE.putInt(null, struct + XrHandPoseTypeInfoMSFT.HANDPOSETYPE, value); }

    // -----------------------------------

    /** An array of {@link XrHandPoseTypeInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandPoseTypeInfoMSFT, Buffer> implements NativeResource {

        private static final XrHandPoseTypeInfoMSFT ELEMENT_FACTORY = XrHandPoseTypeInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandPoseTypeInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandPoseTypeInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandPoseTypeInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandPoseTypeInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandPoseTypeInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrHandPoseTypeInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHandPoseTypeInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrHandPoseTypeInfoMSFT#handPoseType} field. */
        @NativeType("XrHandPoseTypeMSFT")
        public int handPoseType() { return XrHandPoseTypeInfoMSFT.nhandPoseType(address()); }

        /** Sets the specified value to the {@link XrHandPoseTypeInfoMSFT#type} field. */
        public XrHandPoseTypeInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandPoseTypeInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_POSE_TYPE_INFO_MSFT TYPE_HAND_POSE_TYPE_INFO_MSFT} value to the {@link XrHandPoseTypeInfoMSFT#type} field. */
        public XrHandPoseTypeInfoMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_POSE_TYPE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrHandPoseTypeInfoMSFT#next} field. */
        public XrHandPoseTypeInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrHandPoseTypeInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandPoseTypeInfoMSFT#handPoseType} field. */
        public XrHandPoseTypeInfoMSFT.Buffer handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { XrHandPoseTypeInfoMSFT.nhandPoseType(address(), value); return this; }

    }

}