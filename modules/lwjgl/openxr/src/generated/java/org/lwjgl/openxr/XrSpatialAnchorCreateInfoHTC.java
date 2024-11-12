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

/**
 * Information to create a spatial anchor.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code poseInSpace} is transformed into world space to specify the point in the real world. The anchor tracks changes of the reality and <b>may</b> not be affected by the changes of {@code space}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorCreateInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code name} <b>must</b> be a valid {@link XrSpatialAnchorNameHTC} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrSpatialAnchorNameHTC}, {@link HTCAnchor#xrCreateSpatialAnchorHTC CreateSpatialAnchorHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorCreateInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     {@link XrPosef XrPosef} {@link #poseInSpace};
 *     {@link XrSpatialAnchorNameHTC XrSpatialAnchorNameHTC} {@link #name};
 * }</code></pre>
 */
public class XrSpatialAnchorCreateInfoHTC extends Struct<XrSpatialAnchorCreateInfoHTC> implements NativeResource {

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
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrSpatialAnchorNameHTC.SIZEOF, XrSpatialAnchorNameHTC.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        POSEINSPACE = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    protected XrSpatialAnchorCreateInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorCreateInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorCreateInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorCreateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCreateInfoHTC(ByteBuffer container) {
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
    /** the {@code XrSpace} in which {@code poseInSpace} is specified. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@link XrPosef} specifying the point in the real world within {@code space}. */
    public XrPosef poseInSpace() { return nposeInSpace(address()); }
    /** the {@link XrSpatialAnchorNameHTC} containing the name of the anchor. */
    public XrSpatialAnchorNameHTC name() { return nname(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC} value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoHTC type$Default() { return type(HTCAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorCreateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrSpatialAnchorCreateInfoHTC space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInSpace} field. */
    public XrSpatialAnchorCreateInfoHTC poseInSpace(XrPosef value) { nposeInSpace(address(), value); return this; }
    /** Passes the {@link #poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateInfoHTC poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
    /** Copies the specified {@link XrSpatialAnchorNameHTC} to the {@link #name} field. */
    public XrSpatialAnchorCreateInfoHTC name(XrSpatialAnchorNameHTC value) { nname(address(), value); return this; }
    /** Passes the {@link #name} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateInfoHTC name(java.util.function.Consumer<XrSpatialAnchorNameHTC> consumer) { consumer.accept(name()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCreateInfoHTC set(
        int type,
        long next,
        XrSpace space,
        XrPosef poseInSpace,
        XrSpatialAnchorNameHTC name
    ) {
        type(type);
        next(next);
        space(space);
        poseInSpace(poseInSpace);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorCreateInfoHTC set(XrSpatialAnchorCreateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoHTC malloc() {
        return new XrSpatialAnchorCreateInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoHTC calloc() {
        return new XrSpatialAnchorCreateInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCreateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorCreateInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance for the specified memory address. */
    public static XrSpatialAnchorCreateInfoHTC create(long address) {
        return new XrSpatialAnchorCreateInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorCreateInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorCreateInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorCreateInfoHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoHTC malloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoHTC calloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorCreateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoHTC.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoHTC.SPACE); }
    /** Unsafe version of {@link #poseInSpace}. */
    public static XrPosef nposeInSpace(long struct) { return XrPosef.create(struct + XrSpatialAnchorCreateInfoHTC.POSEINSPACE); }
    /** Unsafe version of {@link #name}. */
    public static XrSpatialAnchorNameHTC nname(long struct) { return XrSpatialAnchorNameHTC.create(struct + XrSpatialAnchorCreateInfoHTC.NAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorCreateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorCreateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorCreateInfoHTC.SPACE, value.address()); }
    /** Unsafe version of {@link #poseInSpace(XrPosef) poseInSpace}. */
    public static void nposeInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorCreateInfoHTC.POSEINSPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #name(XrSpatialAnchorNameHTC) name}. */
    public static void nname(long struct, XrSpatialAnchorNameHTC value) { memCopy(value.address(), struct + XrSpatialAnchorCreateInfoHTC.NAME, XrSpatialAnchorNameHTC.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorCreateInfoHTC.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCreateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCreateInfoHTC, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCreateInfoHTC ELEMENT_FACTORY = XrSpatialAnchorCreateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCreateInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCreateInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorCreateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorCreateInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorCreateInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorCreateInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoHTC#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialAnchorCreateInfoHTC.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialAnchorCreateInfoHTC#poseInSpace} field. */
        public XrPosef poseInSpace() { return XrSpatialAnchorCreateInfoHTC.nposeInSpace(address()); }
        /** @return a {@link XrSpatialAnchorNameHTC} view of the {@link XrSpatialAnchorCreateInfoHTC#name} field. */
        public XrSpatialAnchorNameHTC name() { return XrSpatialAnchorCreateInfoHTC.nname(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoHTC#type} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorCreateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC} value to the {@link XrSpatialAnchorCreateInfoHTC#type} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer type$Default() { return type(HTCAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC); }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoHTC#next} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorCreateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoHTC#space} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer space(XrSpace value) { XrSpatialAnchorCreateInfoHTC.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialAnchorCreateInfoHTC#poseInSpace} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer poseInSpace(XrPosef value) { XrSpatialAnchorCreateInfoHTC.nposeInSpace(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorCreateInfoHTC#poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateInfoHTC.Buffer poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
        /** Copies the specified {@link XrSpatialAnchorNameHTC} to the {@link XrSpatialAnchorCreateInfoHTC#name} field. */
        public XrSpatialAnchorCreateInfoHTC.Buffer name(XrSpatialAnchorNameHTC value) { XrSpatialAnchorCreateInfoHTC.nname(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorCreateInfoHTC#name} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateInfoHTC.Buffer name(java.util.function.Consumer<XrSpatialAnchorNameHTC> consumer) { consumer.accept(name()); return this; }

    }

}