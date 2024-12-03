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
 * spatial entity sharing system properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>can</b> inspect whether the system is capable of Spatial Entity Sharing by extending the {@link XrSystemProperties} with {@link XrSystemSpatialEntitySharingPropertiesMETA} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsSpatialEntitySharing}, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link METASpatialEntitySharing#xrShareSpacesMETA ShareSpacesMETA}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension <b>must</b> be enabled prior to using {@link XrSystemSpatialEntitySharingPropertiesMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METASpatialEntitySharing#XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META}</li>
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
 * struct XrSystemSpatialEntitySharingPropertiesMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsSpatialEntitySharing};
 * }</code></pre>
 */
public class XrSystemSpatialEntitySharingPropertiesMETA extends Struct<XrSystemSpatialEntitySharingPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPATIALENTITYSHARING;

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
        SUPPORTSSPATIALENTITYSHARING = layout.offsetof(2);
    }

    protected XrSystemSpatialEntitySharingPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpatialEntitySharingPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpatialEntitySharingPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemSpatialEntitySharingPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpatialEntitySharingPropertiesMETA(ByteBuffer container) {
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
    /** an {@code XrBool32} specifying if the spatial entity sharing is supported. */
    @NativeType("XrBool32")
    public boolean supportsSpatialEntitySharing() { return nsupportsSpatialEntitySharing(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemSpatialEntitySharingPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntitySharing#XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META} value to the {@link #type} field. */
    public XrSystemSpatialEntitySharingPropertiesMETA type$Default() { return type(METASpatialEntitySharing.XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemSpatialEntitySharingPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpatialEntitySharingPropertiesMETA set(
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
    public XrSystemSpatialEntitySharingPropertiesMETA set(XrSystemSpatialEntitySharingPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntitySharingPropertiesMETA malloc() {
        return new XrSystemSpatialEntitySharingPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntitySharingPropertiesMETA calloc() {
        return new XrSystemSpatialEntitySharingPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpatialEntitySharingPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpatialEntitySharingPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance for the specified memory address. */
    public static XrSystemSpatialEntitySharingPropertiesMETA create(long address) {
        return new XrSystemSpatialEntitySharingPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSpatialEntitySharingPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemSpatialEntitySharingPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSpatialEntitySharingPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemSpatialEntitySharingPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntitySharingPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemSpatialEntitySharingPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntitySharingPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSpatialEntitySharingPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpatialEntitySharingPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsSpatialEntitySharing}. */
    public static int nsupportsSpatialEntitySharing(long struct) { return memGetInt(struct + XrSystemSpatialEntitySharingPropertiesMETA.SUPPORTSSPATIALENTITYSHARING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSpatialEntitySharingPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpatialEntitySharingPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpatialEntitySharingPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpatialEntitySharingPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemSpatialEntitySharingPropertiesMETA ELEMENT_FACTORY = XrSystemSpatialEntitySharingPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemSpatialEntitySharingPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpatialEntitySharingPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpatialEntitySharingPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemSpatialEntitySharingPropertiesMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpatialEntitySharingPropertiesMETA.ntype(address()); }
        /** @return the value of the {@link XrSystemSpatialEntitySharingPropertiesMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemSpatialEntitySharingPropertiesMETA.nnext(address()); }
        /** @return the value of the {@link XrSystemSpatialEntitySharingPropertiesMETA#supportsSpatialEntitySharing} field. */
        @NativeType("XrBool32")
        public boolean supportsSpatialEntitySharing() { return XrSystemSpatialEntitySharingPropertiesMETA.nsupportsSpatialEntitySharing(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemSpatialEntitySharingPropertiesMETA#type} field. */
        public XrSystemSpatialEntitySharingPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpatialEntitySharingPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntitySharing#XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META} value to the {@link XrSystemSpatialEntitySharingPropertiesMETA#type} field. */
        public XrSystemSpatialEntitySharingPropertiesMETA.Buffer type$Default() { return type(METASpatialEntitySharing.XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META); }
        /** Sets the specified value to the {@link XrSystemSpatialEntitySharingPropertiesMETA#next} field. */
        public XrSystemSpatialEntitySharingPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemSpatialEntitySharingPropertiesMETA.nnext(address(), value); return this; }

    }

}