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
 * Creation info for creating a spatial anchor handle from a persisted anchor.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code name} is a character array of maximum size {@link MSFTSpatialAnchorPersistence#XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT}, which <b>must</b> include a null terminator and <b>must</b> not be empty (i.e. the first element is the null terminator). If an empty {@code name} value is passed to any function as a parameter, that function <b>must</b> return {@link MSFTSpatialAnchorPersistence#XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialAnchorPersistence#XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
 * <li>{@code spatialAnchorPersistenceName} <b>must</b> be a valid {@link XrSpatialAnchorPersistenceNameMSFT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpatialAnchorPersistenceNameMSFT}, {@link MSFTSpatialAnchorPersistence#xrCreateSpatialAnchorFromPersistedNameMSFT CreateSpatialAnchorFromPersistedNameMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpatialAnchorStoreConnectionMSFT {@link #spatialAnchorStore};
 *     {@link XrSpatialAnchorPersistenceNameMSFT XrSpatialAnchorPersistenceNameMSFT} {@link #spatialAnchorPersistenceName};
 * }</code></pre>
 */
public class XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPATIALANCHORSTORE,
        SPATIALANCHORPERSISTENCENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrSpatialAnchorPersistenceNameMSFT.SIZEOF, XrSpatialAnchorPersistenceNameMSFT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPATIALANCHORSTORE = layout.offsetof(2);
        SPATIALANCHORPERSISTENCENAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrSpatialAnchorStoreConnectionMSFT} from which the spatial anchor will be loaded from. */
    @NativeType("XrSpatialAnchorStoreConnectionMSFT")
    public long spatialAnchorStore() { return nspatialAnchorStore(address()); }
    /** the {@link XrSpatialAnchorPersistenceNameMSFT} associated with the {@code XrSpatialAnchorMSFT} in the spatial anchor store. This name is used to create an {@code XrSpatialAnchorMSFT} handle from a spatial anchor persisted in the spatial anchor store. */
    public XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName() { return nspatialAnchorPersistenceName(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialAnchorPersistence#XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT type$Default() { return type(MSFTSpatialAnchorPersistence.XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #spatialAnchorStore} field. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorStore(XrSpatialAnchorStoreConnectionMSFT value) { nspatialAnchorStore(address(), value); return this; }
    /** Copies the specified {@link XrSpatialAnchorPersistenceNameMSFT} to the {@link #spatialAnchorPersistenceName} field. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT value) { nspatialAnchorPersistenceName(address(), value); return this; }
    /** Passes the {@link #spatialAnchorPersistenceName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorPersistenceName(java.util.function.Consumer<XrSpatialAnchorPersistenceNameMSFT> consumer) { consumer.accept(spatialAnchorPersistenceName()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT set(
        int type,
        long next,
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore,
        XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName
    ) {
        type(type);
        next(next);
        spatialAnchorStore(spatialAnchorStore);
        spatialAnchorPersistenceName(spatialAnchorPersistenceName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT set(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT malloc() {
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT calloc() {
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT create(long address) {
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #spatialAnchorStore}. */
    public static long nspatialAnchorStore(long struct) { return memGetAddress(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.SPATIALANCHORSTORE); }
    /** Unsafe version of {@link #spatialAnchorPersistenceName}. */
    public static XrSpatialAnchorPersistenceNameMSFT nspatialAnchorPersistenceName(long struct) { return XrSpatialAnchorPersistenceNameMSFT.create(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.SPATIALANCHORPERSISTENCENAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #spatialAnchorStore(XrSpatialAnchorStoreConnectionMSFT) spatialAnchorStore}. */
    public static void nspatialAnchorStore(long struct, XrSpatialAnchorStoreConnectionMSFT value) { memPutAddress(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.SPATIALANCHORSTORE, value.address()); }
    /** Unsafe version of {@link #spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT) spatialAnchorPersistenceName}. */
    public static void nspatialAnchorPersistenceName(long struct, XrSpatialAnchorPersistenceNameMSFT value) { memCopy(value.address(), struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.SPATIALANCHORPERSISTENCENAME, XrSpatialAnchorPersistenceNameMSFT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.SPATIALANCHORSTORE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT ELEMENT_FACTORY = XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#spatialAnchorStore} field. */
        @NativeType("XrSpatialAnchorStoreConnectionMSFT")
        public long spatialAnchorStore() { return XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nspatialAnchorStore(address()); }
        /** @return a {@link XrSpatialAnchorPersistenceNameMSFT} view of the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#spatialAnchorPersistenceName} field. */
        public XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName() { return XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nspatialAnchorPersistenceName(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#type} field. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialAnchorPersistence#XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT} value to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#type} field. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer type$Default() { return type(MSFTSpatialAnchorPersistence.XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#next} field. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#spatialAnchorStore} field. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer spatialAnchorStore(XrSpatialAnchorStoreConnectionMSFT value) { XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nspatialAnchorStore(address(), value); return this; }
        /** Copies the specified {@link XrSpatialAnchorPersistenceNameMSFT} to the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#spatialAnchorPersistenceName} field. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT value) { XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.nspatialAnchorPersistenceName(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT#spatialAnchorPersistenceName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.Buffer spatialAnchorPersistenceName(java.util.function.Consumer<XrSpatialAnchorPersistenceNameMSFT> consumer) { consumer.accept(spatialAnchorPersistenceName()); return this; }

    }

}