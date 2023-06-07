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
 * Parameters to create a new spatial anchor.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters to create a new spatial anchor.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntity#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link FBSpatialEntity#xrCreateSpatialAnchorFB CreateSpatialAnchorFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     {@link XrPosef XrPosef} {@link #poseInSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrSpatialAnchorCreateInfoFB extends Struct<XrSpatialAnchorCreateInfoFB> implements NativeResource {

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

    protected XrSpatialAnchorCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCreateInfoFB(ByteBuffer container) {
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
    /** the {@code XrSpace} handle to the reference space that defines the {@code poseInSpace} of the anchor to be defined. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@link XrPosef} location and orientation of the Spatial Anchor in the specified reference space. */
    public XrPosef poseInSpace() { return nposeInSpace(address()); }
    /** the {@code XrTime} timestamp associated with the specified pose. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoFB type$Default() { return type(FBSpatialEntity.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrSpatialAnchorCreateInfoFB space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInSpace} field. */
    public XrSpatialAnchorCreateInfoFB poseInSpace(XrPosef value) { nposeInSpace(address(), value); return this; }
    /** Passes the {@link #poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateInfoFB poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSpatialAnchorCreateInfoFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCreateInfoFB set(
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
    public XrSpatialAnchorCreateInfoFB set(XrSpatialAnchorCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoFB malloc() {
        return new XrSpatialAnchorCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoFB calloc() {
        return new XrSpatialAnchorCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoFB} instance for the specified memory address. */
    public static XrSpatialAnchorCreateInfoFB create(long address) {
        return new XrSpatialAnchorCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoFB malloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoFB calloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoFB.SPACE); }
    /** Unsafe version of {@link #poseInSpace}. */
    public static XrPosef nposeInSpace(long struct) { return XrPosef.create(struct + XrSpatialAnchorCreateInfoFB.POSEINSPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrSpatialAnchorCreateInfoFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorCreateInfoFB.SPACE, value.address()); }
    /** Unsafe version of {@link #poseInSpace(XrPosef) poseInSpace}. */
    public static void nposeInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorCreateInfoFB.POSEINSPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrSpatialAnchorCreateInfoFB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorCreateInfoFB.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCreateInfoFB, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCreateInfoFB ELEMENT_FACTORY = XrSpatialAnchorCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorCreateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoFB#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialAnchorCreateInfoFB.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialAnchorCreateInfoFB#poseInSpace} field. */
        public XrPosef poseInSpace() { return XrSpatialAnchorCreateInfoFB.nposeInSpace(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialAnchorCreateInfoFB.ntime(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoFB#type} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB} value to the {@link XrSpatialAnchorCreateInfoFB#type} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoFB#next} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoFB#space} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer space(XrSpace value) { XrSpatialAnchorCreateInfoFB.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialAnchorCreateInfoFB#poseInSpace} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer poseInSpace(XrPosef value) { XrSpatialAnchorCreateInfoFB.nposeInSpace(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorCreateInfoFB#poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateInfoFB.Buffer poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoFB#time} field. */
        public XrSpatialAnchorCreateInfoFB.Buffer time(@NativeType("XrTime") long value) { XrSpatialAnchorCreateInfoFB.ntime(address(), value); return this; }

    }

}