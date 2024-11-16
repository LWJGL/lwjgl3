/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * System property for hand tracking mesh.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsHandTrackingMesh}, the system does not support hand tracking mesh input, and therefore <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link MSFTHandTrackingMesh#xrCreateHandMeshSpaceMSFT CreateHandMeshSpaceMSFT} and {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}. The application <b>should</b> avoid using hand mesh functionality when {@code supportsHandTrackingMesh} is {@link XR10#XR_FALSE FALSE}.</p>
 * 
 * <p>If a runtime returns {@link XR10#XR_TRUE TRUE} for {@code supportsHandTrackingMesh}, the system supports hand tracking mesh input. In this case, the runtime <b>must</b> return a positive number for {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount}. An application <b>should</b> use {@code maxHandMeshIndexCount} and {@code maxHandMeshVertexCount} to preallocate hand mesh buffers and reuse them in their render loop when calling {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} every frame.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrSystemHandTrackingMeshPropertiesMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTHandTrackingMesh#XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemHandTrackingMeshPropertiesMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsHandTrackingMesh};
 *     uint32_t {@link #maxHandMeshIndexCount};
 *     uint32_t {@link #maxHandMeshVertexCount};
 * }</code></pre>
 */
public class XrSystemHandTrackingMeshPropertiesMSFT extends Struct<XrSystemHandTrackingMeshPropertiesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSHANDTRACKINGMESH,
        MAXHANDMESHINDEXCOUNT,
        MAXHANDMESHVERTEXCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSHANDTRACKINGMESH = layout.offsetof(2);
        MAXHANDMESHINDEXCOUNT = layout.offsetof(3);
        MAXHANDMESHVERTEXCOUNT = layout.offsetof(4);
    }

    protected XrSystemHandTrackingMeshPropertiesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemHandTrackingMeshPropertiesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(address, container);
    }

    /**
     * Creates a {@code XrSystemHandTrackingMeshPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHandTrackingMeshPropertiesMSFT(ByteBuffer container) {
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
    /** an {@code XrBool32}, indicating if current system is capable of hand tracking mesh input. */
    @NativeType("XrBool32")
    public boolean supportsHandTrackingMesh() { return nsupportsHandTrackingMesh(address()) != 0; }
    /** a {@code uint32_t} returns the maximum count of indices that will be returned from the hand tracker. */
    @NativeType("uint32_t")
    public int maxHandMeshIndexCount() { return nmaxHandMeshIndexCount(address()); }
    /** a {@code uint32_t} returns the maximum count of vertices that will be returned from the hand tracker. */
    @NativeType("uint32_t")
    public int maxHandMeshVertexCount() { return nmaxHandMeshVertexCount(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT} value to the {@link #type} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHandTrackingMeshPropertiesMSFT set(
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
    public XrSystemHandTrackingMeshPropertiesMSFT set(XrSystemHandTrackingMeshPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT malloc() {
        return new XrSystemHandTrackingMeshPropertiesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT calloc() {
        return new XrSystemHandTrackingMeshPropertiesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemHandTrackingMeshPropertiesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance for the specified memory address. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create(long address) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemHandTrackingMeshPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : new XrSystemHandTrackingMeshPropertiesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT malloc(MemoryStack stack) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT calloc(MemoryStack stack) {
        return new XrSystemHandTrackingMeshPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #supportsHandTrackingMesh}. */
    public static int nsupportsHandTrackingMesh(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.SUPPORTSHANDTRACKINGMESH); }
    /** Unsafe version of {@link #maxHandMeshIndexCount}. */
    public static int nmaxHandMeshIndexCount(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHINDEXCOUNT); }
    /** Unsafe version of {@link #maxHandMeshVertexCount}. */
    public static int nmaxHandMeshVertexCount(long struct) { return memGetInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHVERTEXCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHandTrackingMeshPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSystemHandTrackingMeshPropertiesMSFT, Buffer> implements NativeResource {

        private static final XrSystemHandTrackingMeshPropertiesMSFT ELEMENT_FACTORY = XrSystemHandTrackingMeshPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHandTrackingMeshPropertiesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSystemHandTrackingMeshPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemHandTrackingMeshPropertiesMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHandTrackingMeshPropertiesMSFT.ntype(address()); }
        /** @return the value of the {@link XrSystemHandTrackingMeshPropertiesMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHandTrackingMeshPropertiesMSFT.nnext(address()); }
        /** @return the value of the {@link XrSystemHandTrackingMeshPropertiesMSFT#supportsHandTrackingMesh} field. */
        @NativeType("XrBool32")
        public boolean supportsHandTrackingMesh() { return XrSystemHandTrackingMeshPropertiesMSFT.nsupportsHandTrackingMesh(address()) != 0; }
        /** @return the value of the {@link XrSystemHandTrackingMeshPropertiesMSFT#maxHandMeshIndexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshIndexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshIndexCount(address()); }
        /** @return the value of the {@link XrSystemHandTrackingMeshPropertiesMSFT#maxHandMeshVertexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshVertexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshVertexCount(address()); }

        /** Sets the specified value to the {@link XrSystemHandTrackingMeshPropertiesMSFT#type} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHandTrackingMeshPropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT} value to the {@link XrSystemHandTrackingMeshPropertiesMSFT#type} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@link XrSystemHandTrackingMeshPropertiesMSFT#next} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrSystemHandTrackingMeshPropertiesMSFT.nnext(address(), value); return this; }

    }

}