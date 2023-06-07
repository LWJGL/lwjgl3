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

/**
 * The information to create a spatial graph static node binding handle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to using {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link MSFTSpatialGraphBridge#xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialGraphStaticNodeBindingCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     {@link XrPosef XrPosef} {@link #poseInSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrSpatialGraphStaticNodeBindingCreateInfoMSFT extends Struct<XrSpatialGraphStaticNodeBindingCreateInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        POSEINSPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        POSEINSPACE = layout.offsetof(3);
        TIME = layout.offsetof(4);
    }

    protected XrSpatialGraphStaticNodeBindingCreateInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialGraphStaticNodeBindingCreateInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT(ByteBuffer container) {
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
    /** a handle to the {@code XrSpace} in which {@code poseInSpace} is specified. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@link XrPosef} within {@code space} at {@code time}. */
    public XrPosef poseInSpace() { return nposeInSpace(address()); }
    /** the {@code XrTime} at which {@code poseInSpace} will be evaluated within {@code space}. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInSpace} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT poseInSpace(XrPosef value) { nposeInSpace(address(), value); return this; }
    /** Passes the {@link #poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT set(
        int type,
        long next,
        XrSpace space,
        XrPosef poseInSpace,
        long time
    ) {
        type(type);
        next(next);
        space(space);
        poseInSpace(poseInSpace);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialGraphStaticNodeBindingCreateInfoMSFT set(XrSpatialGraphStaticNodeBindingCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT malloc() {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT calloc() {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance for the specified memory address. */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT create(long address) {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT malloc(MemoryStack stack) {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT calloc(MemoryStack stack) {
        return new XrSpatialGraphStaticNodeBindingCreateInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.SPACE); }
    /** Unsafe version of {@link #poseInSpace}. */
    public static XrPosef nposeInSpace(long struct) { return XrPosef.create(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.POSEINSPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.SPACE, value.address()); }
    /** Unsafe version of {@link #poseInSpace(XrPosef) poseInSpace}. */
    public static void nposeInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.POSEINSPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialGraphStaticNodeBindingCreateInfoMSFT.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialGraphStaticNodeBindingCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialGraphStaticNodeBindingCreateInfoMSFT ELEMENT_FACTORY = XrSpatialGraphStaticNodeBindingCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialGraphStaticNodeBindingCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialGraphStaticNodeBindingCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#poseInSpace} field. */
        public XrPosef poseInSpace() { return XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nposeInSpace(address()); }
        /** @return the value of the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialGraphStaticNodeBindingCreateInfoMSFT.ntime(address()); }

        /** Sets the specified value to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#type} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialGraphStaticNodeBindingCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialGraphBridge#XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT} value to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#type} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer type$Default() { return type(MSFTSpatialGraphBridge.XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#next} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#space} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer space(XrSpace value) { XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#poseInSpace} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer poseInSpace(XrPosef value) { XrSpatialGraphStaticNodeBindingCreateInfoMSFT.nposeInSpace(address(), value); return this; }
        /** Passes the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
        /** Sets the specified value to the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT#time} field. */
        public XrSpatialGraphStaticNodeBindingCreateInfoMSFT.Buffer time(@NativeType("XrTime") long value) { XrSpatialGraphStaticNodeBindingCreateInfoMSFT.ntime(address(), value); return this; }

    }

}