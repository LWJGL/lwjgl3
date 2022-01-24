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
 * The information to update a hand mesh.
 * 
 * <h5>Description</h5>
 * 
 * <p>A runtime <b>may</b> not maintain a full history of hand mesh data, therefore the returned {@link XrHandMeshMSFT} might return data that’s not exactly corresponding to the {@code time} input. If the runtime cannot return any tracking data for the given {@code time} at all, it <b>must</b> set {@code isActive} to {@link XR10#XR_FALSE FALSE} for the call to {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}. Otherwise, if the runtime returns {@code isActive} as {@link XR10#XR_TRUE TRUE}, the data in {@link XrHandMeshMSFT} must be valid to use.</p>
 * 
 * <p>An application can choose different {@code handPoseType} values to query the hand mesh data. The returned hand mesh <b>must</b> be consistent to the hand joint space location on the same {@code XrHandTrackerEXT} when using the same {@code XrHandPoseTypeMSFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandMeshUpdateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT TYPE_HAND_MESH_UPDATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code handPoseType} <b>must</b> be a valid {@code XrHandPoseTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshUpdateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrTime {@link #time};
 *     XrHandPoseTypeMSFT {@link #handPoseType};
 * }</code></pre>
 */
public class XrHandMeshUpdateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME,
        HANDPOSETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
        HANDPOSETYPE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandMeshUpdateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshUpdateInfoMSFT(ByteBuffer container) {
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
    /** the {@code XrTime} that describes the time for which the application wishes to query the hand mesh state. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** an {@code XrHandPoseTypeMSFT} which describes the type of hand pose of the hand mesh to update. */
    @NativeType("XrHandPoseTypeMSFT")
    public int handPoseType() { return nhandPoseType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandMeshUpdateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT TYPE_HAND_MESH_UPDATE_INFO_MSFT} value to the {@link #type} field. */
    public XrHandMeshUpdateInfoMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandMeshUpdateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrHandMeshUpdateInfoMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #handPoseType} field. */
    public XrHandMeshUpdateInfoMSFT handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { nhandPoseType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshUpdateInfoMSFT set(
        int type,
        long next,
        long time,
        int handPoseType
    ) {
        type(type);
        next(next);
        time(time);
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
    public XrHandMeshUpdateInfoMSFT set(XrHandMeshUpdateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshUpdateInfoMSFT malloc() {
        return wrap(XrHandMeshUpdateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshUpdateInfoMSFT calloc() {
        return wrap(XrHandMeshUpdateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshUpdateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshUpdateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance for the specified memory address. */
    public static XrHandMeshUpdateInfoMSFT create(long address) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshUpdateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshUpdateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshUpdateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshUpdateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshUpdateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshUpdateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshUpdateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandMeshUpdateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrHandMeshUpdateInfoMSFT.TIME); }
    /** Unsafe version of {@link #handPoseType}. */
    public static int nhandPoseType(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshUpdateInfoMSFT.HANDPOSETYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshUpdateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandMeshUpdateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrHandMeshUpdateInfoMSFT.TIME, value); }
    /** Unsafe version of {@link #handPoseType(int) handPoseType}. */
    public static void nhandPoseType(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshUpdateInfoMSFT.HANDPOSETYPE, value); }

    // -----------------------------------

    /** An array of {@link XrHandMeshUpdateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshUpdateInfoMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshUpdateInfoMSFT ELEMENT_FACTORY = XrHandMeshUpdateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshUpdateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshUpdateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshUpdateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandMeshUpdateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandMeshUpdateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrHandMeshUpdateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHandMeshUpdateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrHandMeshUpdateInfoMSFT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrHandMeshUpdateInfoMSFT.ntime(address()); }
        /** @return the value of the {@link XrHandMeshUpdateInfoMSFT#handPoseType} field. */
        @NativeType("XrHandPoseTypeMSFT")
        public int handPoseType() { return XrHandMeshUpdateInfoMSFT.nhandPoseType(address()); }

        /** Sets the specified value to the {@link XrHandMeshUpdateInfoMSFT#type} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandMeshUpdateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT TYPE_HAND_MESH_UPDATE_INFO_MSFT} value to the {@link XrHandMeshUpdateInfoMSFT#type} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_UPDATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrHandMeshUpdateInfoMSFT#next} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrHandMeshUpdateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandMeshUpdateInfoMSFT#time} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer time(@NativeType("XrTime") long value) { XrHandMeshUpdateInfoMSFT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandMeshUpdateInfoMSFT#handPoseType} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { XrHandMeshUpdateInfoMSFT.nhandPoseType(address(), value); return this; }

    }

}