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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.MSFTSpatialGraphBridge.*;

/**
 * The spatial graph node binding properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using {@link XrSpatialGraphNodeBindingPropertiesMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link MSFTSpatialGraphBridge#xrGetSpatialGraphNodeBindingPropertiesMSFT GetSpatialGraphNodeBindingPropertiesMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialGraphNodeBindingPropertiesMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint8_t {@link #nodeId}[XR_GUID_SIZE_MSFT];
 *     {@link XrPosef XrPosef} {@link #poseInNodeSpace};
 * }</code></pre>
 */
public class XrSpatialGraphNodeBindingPropertiesMSFT extends Struct<XrSpatialGraphNodeBindingPropertiesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODEID,
        POSEINNODESPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_GUID_SIZE_MSFT),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODEID = layout.offsetof(2);
        POSEINNODESPACE = layout.offsetof(3);
    }

    protected XrSpatialGraphNodeBindingPropertiesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialGraphNodeBindingPropertiesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(address, container);
    }

    /**
     * Creates a {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialGraphNodeBindingPropertiesMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial graph node. */
    @NativeType("uint8_t[XR_GUID_SIZE_MSFT]")
    public ByteBuffer nodeId() { return nnodeId(address()); }
    /** a global unique identifier (a.k.a. GUID or 16 byte array), representing the spatial graph node. */
    @NativeType("uint8_t")
    public byte nodeId(int index) { return nnodeId(address(), index); }
    /** an {@link XrPosef} defining the pose in the underlying node’s space. */
    public XrPosef poseInNodeSpace() { return nposeInNodeSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT} value to the {@link #type} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #nodeId} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT nodeId(@NativeType("uint8_t[XR_GUID_SIZE_MSFT]") ByteBuffer value) { nnodeId(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #nodeId} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT nodeId(int index, @NativeType("uint8_t") byte value) { nnodeId(address(), index, value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInNodeSpace} field. */
    public XrSpatialGraphNodeBindingPropertiesMSFT poseInNodeSpace(XrPosef value) { nposeInNodeSpace(address(), value); return this; }
    /** Passes the {@link #poseInNodeSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialGraphNodeBindingPropertiesMSFT poseInNodeSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInNodeSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialGraphNodeBindingPropertiesMSFT set(
        int type,
        long next,
        ByteBuffer nodeId,
        XrPosef poseInNodeSpace
    ) {
        type(type);
        next(next);
        nodeId(nodeId);
        poseInNodeSpace(poseInNodeSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialGraphNodeBindingPropertiesMSFT set(XrSpatialGraphNodeBindingPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeBindingPropertiesMSFT malloc() {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeBindingPropertiesMSFT calloc() {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialGraphNodeBindingPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialGraphNodeBindingPropertiesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance for the specified memory address. */
    public static XrSpatialGraphNodeBindingPropertiesMSFT create(long address) {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialGraphNodeBindingPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : new XrSpatialGraphNodeBindingPropertiesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT malloc(MemoryStack stack) {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeBindingPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT calloc(MemoryStack stack) {
        return new XrSpatialGraphNodeBindingPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialGraphNodeBindingPropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialGraphNodeBindingPropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #nodeId}. */
    public static ByteBuffer nnodeId(long struct) { return memByteBuffer(struct + XrSpatialGraphNodeBindingPropertiesMSFT.NODEID, XR_GUID_SIZE_MSFT); }
    /** Unsafe version of {@link #nodeId(int) nodeId}. */
    public static byte nnodeId(long struct, int index) {
        return UNSAFE.getByte(null, struct + XrSpatialGraphNodeBindingPropertiesMSFT.NODEID + check(index, XR_GUID_SIZE_MSFT) * 1);
    }
    /** Unsafe version of {@link #poseInNodeSpace}. */
    public static XrPosef nposeInNodeSpace(long struct) { return XrPosef.create(struct + XrSpatialGraphNodeBindingPropertiesMSFT.POSEINNODESPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialGraphNodeBindingPropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialGraphNodeBindingPropertiesMSFT.NEXT, value); }
    /** Unsafe version of {@link #nodeId(ByteBuffer) nodeId}. */
    public static void nnodeId(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_GUID_SIZE_MSFT); }
        memCopy(memAddress(value), struct + XrSpatialGraphNodeBindingPropertiesMSFT.NODEID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #nodeId(int, byte) nodeId}. */
    public static void nnodeId(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + XrSpatialGraphNodeBindingPropertiesMSFT.NODEID + check(index, XR_GUID_SIZE_MSFT) * 1, value);
    }
    /** Unsafe version of {@link #poseInNodeSpace(XrPosef) poseInNodeSpace}. */
    public static void nposeInNodeSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialGraphNodeBindingPropertiesMSFT.POSEINNODESPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialGraphNodeBindingPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialGraphNodeBindingPropertiesMSFT, Buffer> implements NativeResource {

        private static final XrSpatialGraphNodeBindingPropertiesMSFT ELEMENT_FACTORY = XrSpatialGraphNodeBindingPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialGraphNodeBindingPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialGraphNodeBindingPropertiesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialGraphNodeBindingPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialGraphNodeBindingPropertiesMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialGraphNodeBindingPropertiesMSFT.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#nodeId} field. */
        @NativeType("uint8_t[XR_GUID_SIZE_MSFT]")
        public ByteBuffer nodeId() { return XrSpatialGraphNodeBindingPropertiesMSFT.nnodeId(address()); }
        /** @return the value at the specified index of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#nodeId} field. */
        @NativeType("uint8_t")
        public byte nodeId(int index) { return XrSpatialGraphNodeBindingPropertiesMSFT.nnodeId(address(), index); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#poseInNodeSpace} field. */
        public XrPosef poseInNodeSpace() { return XrSpatialGraphNodeBindingPropertiesMSFT.nposeInNodeSpace(address()); }

        /** Sets the specified value to the {@link XrSpatialGraphNodeBindingPropertiesMSFT#type} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialGraphNodeBindingPropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT} value to the {@link XrSpatialGraphNodeBindingPropertiesMSFT#type} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@link XrSpatialGraphNodeBindingPropertiesMSFT#next} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrSpatialGraphNodeBindingPropertiesMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link XrSpatialGraphNodeBindingPropertiesMSFT#nodeId} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer nodeId(@NativeType("uint8_t[XR_GUID_SIZE_MSFT]") ByteBuffer value) { XrSpatialGraphNodeBindingPropertiesMSFT.nnodeId(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link XrSpatialGraphNodeBindingPropertiesMSFT#nodeId} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer nodeId(int index, @NativeType("uint8_t") byte value) { XrSpatialGraphNodeBindingPropertiesMSFT.nnodeId(address(), index, value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialGraphNodeBindingPropertiesMSFT#poseInNodeSpace} field. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer poseInNodeSpace(XrPosef value) { XrSpatialGraphNodeBindingPropertiesMSFT.nposeInNodeSpace(address(), value); return this; }
        /** Passes the {@link XrSpatialGraphNodeBindingPropertiesMSFT#poseInNodeSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialGraphNodeBindingPropertiesMSFT.Buffer poseInNodeSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInNodeSpace()); return this; }

    }

}