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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.MSFTSpatialGraphBridge.*;

/**
 * The information to create space from a spatial graph node.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using {@link XrSpatialGraphNodeSpaceCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code nodeType} <b>must</b> be a valid {@code XrSpatialGraphNodeTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link MSFTSpatialGraphBridge#xrCreateSpatialGraphNodeSpaceMSFT CreateSpatialGraphNodeSpaceMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialGraphNodeSpaceCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpatialGraphNodeTypeMSFT {@link #nodeType};
 *     uint8_t {@link #nodeId}[XR_GUID_SIZE_MSFT];
 *     {@link XrPosef XrPosef} {@link #pose};
 * }</code></pre>
 */
public class XrSpatialGraphNodeSpaceCreateInfoMSFT extends Struct<XrSpatialGraphNodeSpaceCreateInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODETYPE,
        NODEID,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, XR_GUID_SIZE_MSFT),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODETYPE = layout.offsetof(2);
        NODEID = layout.offsetof(3);
        POSE = layout.offsetof(4);
    }

    protected XrSpatialGraphNodeSpaceCreateInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialGraphNodeSpaceCreateInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT(ByteBuffer container) {
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
    /** an {@code XrSpatialGraphNodeTypeMSFT} specifying the spatial node type. */
    @NativeType("XrSpatialGraphNodeTypeMSFT")
    public int nodeType() { return nnodeType(address()); }
    /** a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial node that is being tracked. */
    @NativeType("uint8_t[XR_GUID_SIZE_MSFT]")
    public ByteBuffer nodeId() { return nnodeId(address()); }
    /** a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial node that is being tracked. */
    @NativeType("uint8_t")
    public byte nodeId(int index) { return nnodeId(address(), index); }
    /** an {@link XrPosef} defining the position and orientation of the new space’s origin within the natural reference frame of the spatial graph node. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #nodeType} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT nodeType(@NativeType("XrSpatialGraphNodeTypeMSFT") int value) { nnodeType(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #nodeId} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT nodeId(@NativeType("uint8_t[XR_GUID_SIZE_MSFT]") ByteBuffer value) { nnodeId(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #nodeId} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT nodeId(int index, @NativeType("uint8_t") byte value) { nnodeId(address(), index, value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT set(
        int type,
        long next,
        int nodeType,
        ByteBuffer nodeId,
        XrPosef pose
    ) {
        type(type);
        next(next);
        nodeType(nodeType);
        nodeId(nodeId);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialGraphNodeSpaceCreateInfoMSFT set(XrSpatialGraphNodeSpaceCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT malloc() {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT calloc() {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance for the specified memory address. */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT create(long address) {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialGraphNodeSpaceCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSpatialGraphNodeSpaceCreateInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT malloc(MemoryStack stack) {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT calloc(MemoryStack stack) {
        return new XrSpatialGraphNodeSpaceCreateInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #nodeType}. */
    public static int nnodeType(long struct) { return memGetInt(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODETYPE); }
    /** Unsafe version of {@link #nodeId}. */
    public static ByteBuffer nnodeId(long struct) { return memByteBuffer(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODEID, XR_GUID_SIZE_MSFT); }
    /** Unsafe version of {@link #nodeId(int) nodeId}. */
    public static byte nnodeId(long struct, int index) {
        return memGetByte(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODEID + check(index, XR_GUID_SIZE_MSFT) * 1);
    }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #nodeType(int) nodeType}. */
    public static void nnodeType(long struct, int value) { memPutInt(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODETYPE, value); }
    /** Unsafe version of {@link #nodeId(ByteBuffer) nodeId}. */
    public static void nnodeId(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_GUID_SIZE_MSFT); }
        memCopy(memAddress(value), struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODEID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #nodeId(int, byte) nodeId}. */
    public static void nnodeId(long struct, int index, byte value) {
        memPutByte(struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.NODEID + check(index, XR_GUID_SIZE_MSFT) * 1, value);
    }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialGraphNodeSpaceCreateInfoMSFT.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialGraphNodeSpaceCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialGraphNodeSpaceCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialGraphNodeSpaceCreateInfoMSFT ELEMENT_FACTORY = XrSpatialGraphNodeSpaceCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialGraphNodeSpaceCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialGraphNodeSpaceCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialGraphNodeSpaceCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeType} field. */
        @NativeType("XrSpatialGraphNodeTypeMSFT")
        public int nodeType() { return XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeType(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeId} field. */
        @NativeType("uint8_t[XR_GUID_SIZE_MSFT]")
        public ByteBuffer nodeId() { return XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeId(address()); }
        /** @return the value at the specified index of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeId} field. */
        @NativeType("uint8_t")
        public byte nodeId(int index) { return XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeId(address(), index); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#pose} field. */
        public XrPosef pose() { return XrSpatialGraphNodeSpaceCreateInfoMSFT.npose(address()); }

        /** Sets the specified value to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#type} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT} value to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#type} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#next} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeType} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer nodeType(@NativeType("XrSpatialGraphNodeTypeMSFT") int value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeType(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeId} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer nodeId(@NativeType("uint8_t[XR_GUID_SIZE_MSFT]") ByteBuffer value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeId(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#nodeId} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer nodeId(int index, @NativeType("uint8_t") byte value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.nnodeId(address(), index, value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#pose} field. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer pose(XrPosef value) { XrSpatialGraphNodeSpaceCreateInfoMSFT.npose(address(), value); return this; }
        /** Passes the {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialGraphNodeSpaceCreateInfoMSFT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}