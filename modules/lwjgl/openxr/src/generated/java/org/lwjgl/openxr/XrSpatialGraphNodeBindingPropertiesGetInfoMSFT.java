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
 * The information to get node binding properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTSpatialGraphBridge#xrGetSpatialGraphNodeBindingPropertiesMSFT GetSpatialGraphNodeBindingPropertiesMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialGraphNodeBindingPropertiesGetInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrSpatialGraphNodeBindingPropertiesGetInfoMSFT extends Struct<XrSpatialGraphNodeBindingPropertiesGetInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialGraphNodeBindingPropertiesGetInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT} value to the {@link #type} field. */
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT set(
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
    public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT set(XrSpatialGraphNodeBindingPropertiesGetInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT malloc() {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT calloc() {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance for the specified memory address. */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT create(long address) {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialGraphNodeBindingPropertiesGetInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT malloc(MemoryStack stack) {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT calloc(MemoryStack stack) {
        return new XrSpatialGraphNodeBindingPropertiesGetInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialGraphNodeBindingPropertiesGetInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialGraphNodeBindingPropertiesGetInfoMSFT ELEMENT_FACTORY = XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialGraphNodeBindingPropertiesGetInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.nnext(address()); }

        /** Sets the specified value to the {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#type} field. */
        public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT} value to the {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#type} field. */
        public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT#next} field. */
        public XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.nnext(address(), value); return this; }

    }

}