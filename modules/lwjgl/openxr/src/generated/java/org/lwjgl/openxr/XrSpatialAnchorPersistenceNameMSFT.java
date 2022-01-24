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

import static org.lwjgl.openxr.MSFTSpatialAnchorPersistence.*;

/**
 * The name to identify a Spatial anchor persistence operations.
 * 
 * <h5>Description</h5>
 * 
 * <p>If an {@link XrSpatialAnchorPersistenceNameMSFT} with an empty {@code name} value is passed to any function as a parameter, that function <b>must</b> return {@link MSFTSpatialAnchorPersistence#XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorPersistenceNameMSFT}</li>
 * <li>{@code name} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link MSFTSpatialAnchorPersistence#XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT}, {@link XrSpatialAnchorPersistenceInfoMSFT}, {@link MSFTSpatialAnchorPersistence#xrClearSpatialAnchorStoreMSFT ClearSpatialAnchorStoreMSFT}, {@link MSFTSpatialAnchorPersistence#xrEnumeratePersistedSpatialAnchorNamesMSFT EnumeratePersistedSpatialAnchorNamesMSFT}, {@link MSFTSpatialAnchorPersistence#xrUnpersistSpatialAnchorMSFT UnpersistSpatialAnchorMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorPersistenceNameMSFT {
 *     char {@link #name}[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT];
 * }</code></pre>
 */
public class XrSpatialAnchorPersistenceNameMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME;

    static {
        Layout layout = __struct(
            __array(1, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
    }

    /**
     * Creates a {@code XrSpatialAnchorPersistenceNameMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorPersistenceNameMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a null terminated character array of size {@link MSFTSpatialAnchorPersistence#XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT}. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
    public ByteBuffer name() { return nname(address()); }
    /** a null terminated character array of size {@link MSFTSpatialAnchorPersistence#XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT}. */
    @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
    public String nameString() { return nnameString(address()); }

    /** Copies the specified encoded string to the {@link #name} field. */
    public XrSpatialAnchorPersistenceNameMSFT name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]") ByteBuffer value) { nname(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorPersistenceNameMSFT set(XrSpatialAnchorPersistenceNameMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceNameMSFT malloc() {
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceNameMSFT calloc() {
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorPersistenceNameMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorPersistenceNameMSFT create(long address) {
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorPersistenceNameMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSpatialAnchorPersistenceNameMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceNameMSFT malloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistenceNameMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceNameMSFT calloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorPersistenceNameMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistenceNameMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistenceNameMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrSpatialAnchorPersistenceNameMSFT.NAME, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrSpatialAnchorPersistenceNameMSFT.NAME); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT);
        }
        memCopy(memAddress(value), struct + XrSpatialAnchorPersistenceNameMSFT.NAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorPersistenceNameMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorPersistenceNameMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorPersistenceNameMSFT ELEMENT_FACTORY = XrSpatialAnchorPersistenceNameMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorPersistenceNameMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorPersistenceNameMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSpatialAnchorPersistenceNameMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link XrSpatialAnchorPersistenceNameMSFT#name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
        public ByteBuffer name() { return XrSpatialAnchorPersistenceNameMSFT.nname(address()); }
        /** @return the null-terminated string stored in the {@link XrSpatialAnchorPersistenceNameMSFT#name} field. */
        @NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]")
        public String nameString() { return XrSpatialAnchorPersistenceNameMSFT.nnameString(address()); }

        /** Copies the specified encoded string to the {@link XrSpatialAnchorPersistenceNameMSFT#name} field. */
        public XrSpatialAnchorPersistenceNameMSFT.Buffer name(@NativeType("char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT]") ByteBuffer value) { XrSpatialAnchorPersistenceNameMSFT.nname(address(), value); return this; }

    }

}