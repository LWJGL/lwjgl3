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
 * Properties object retrieved as part of next chain from xrGetSystemProperties.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>can</b> inspect whether the system is capable of spatial entity operations by extending the {@link XrSystemProperties} with {@link XrSystemSpatialEntityPropertiesFB} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsSpatialEntity}, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link FBSpatialEntity#xrGetSpaceUuidFB GetSpaceUuidFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using {@link XrSystemSpatialEntityPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntity#XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemSpatialEntityPropertiesFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #supportsSpatialEntity};
 * }</code></pre>
 */
public class XrSystemSpatialEntityPropertiesFB extends Struct<XrSystemSpatialEntityPropertiesFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPATIALENTITY;

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
        SUPPORTSSPATIALENTITY = layout.offsetof(2);
    }

    protected XrSystemSpatialEntityPropertiesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpatialEntityPropertiesFB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpatialEntityPropertiesFB(address, container);
    }

    /**
     * Creates a {@code XrSystemSpatialEntityPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpatialEntityPropertiesFB(ByteBuffer container) {
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
    /** a boolean value that determines if spatial entities are supported by the system. */
    @NativeType("XrBool32")
    public boolean supportsSpatialEntity() { return nsupportsSpatialEntity(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemSpatialEntityPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB} value to the {@link #type} field. */
    public XrSystemSpatialEntityPropertiesFB type$Default() { return type(FBSpatialEntity.XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemSpatialEntityPropertiesFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpatialEntityPropertiesFB set(
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
    public XrSystemSpatialEntityPropertiesFB set(XrSystemSpatialEntityPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntityPropertiesFB malloc() {
        return new XrSystemSpatialEntityPropertiesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntityPropertiesFB calloc() {
        return new XrSystemSpatialEntityPropertiesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpatialEntityPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpatialEntityPropertiesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance for the specified memory address. */
    public static XrSystemSpatialEntityPropertiesFB create(long address) {
        return new XrSystemSpatialEntityPropertiesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemSpatialEntityPropertiesFB createSafe(long address) {
        return address == NULL ? null : new XrSystemSpatialEntityPropertiesFB(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemSpatialEntityPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntityPropertiesFB malloc(MemoryStack stack) {
        return new XrSystemSpatialEntityPropertiesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntityPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntityPropertiesFB calloc(MemoryStack stack) {
        return new XrSystemSpatialEntityPropertiesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemSpatialEntityPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpatialEntityPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsSpatialEntity}. */
    public static int nsupportsSpatialEntity(long struct) { return UNSAFE.getInt(null, struct + XrSystemSpatialEntityPropertiesFB.SUPPORTSSPATIALENTITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemSpatialEntityPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpatialEntityPropertiesFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpatialEntityPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpatialEntityPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemSpatialEntityPropertiesFB ELEMENT_FACTORY = XrSystemSpatialEntityPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemSpatialEntityPropertiesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpatialEntityPropertiesFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpatialEntityPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemSpatialEntityPropertiesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpatialEntityPropertiesFB.ntype(address()); }
        /** @return the value of the {@link XrSystemSpatialEntityPropertiesFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemSpatialEntityPropertiesFB.nnext(address()); }
        /** @return the value of the {@link XrSystemSpatialEntityPropertiesFB#supportsSpatialEntity} field. */
        @NativeType("XrBool32")
        public boolean supportsSpatialEntity() { return XrSystemSpatialEntityPropertiesFB.nsupportsSpatialEntity(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemSpatialEntityPropertiesFB#type} field. */
        public XrSystemSpatialEntityPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpatialEntityPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB} value to the {@link XrSystemSpatialEntityPropertiesFB#type} field. */
        public XrSystemSpatialEntityPropertiesFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB); }
        /** Sets the specified value to the {@link XrSystemSpatialEntityPropertiesFB#next} field. */
        public XrSystemSpatialEntityPropertiesFB.Buffer next(@NativeType("void const *") long value) { XrSystemSpatialEntityPropertiesFB.nnext(address(), value); return this; }

    }

}