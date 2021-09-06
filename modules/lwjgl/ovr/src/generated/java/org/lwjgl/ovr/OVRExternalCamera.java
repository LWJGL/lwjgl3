/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrExternalCamera {
 *     char {@link #Name}[32];
 *     {@link OVRCameraIntrinsics ovrCameraIntrinsics} Intrinsics;
 *     {@link OVRCameraExtrinsics ovrCameraExtrinsics} Extrinsics;
 * }</code></pre>
 */
@NativeType("struct ovrExternalCamera")
public class OVRExternalCamera extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        INTRINSICS,
        EXTRINSICS;

    static {
        Layout layout = __struct(
            __array(1, 32),
            __member(OVRCameraIntrinsics.SIZEOF, OVRCameraIntrinsics.ALIGNOF),
            __member(OVRCameraExtrinsics.SIZEOF, OVRCameraExtrinsics.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        INTRINSICS = layout.offsetof(1);
        EXTRINSICS = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRExternalCamera} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRExternalCamera(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** camera identifier: vid + pid + serial number etc. */
    @NativeType("char[32]")
    public ByteBuffer Name() { return nName(address()); }
    /** camera identifier: vid + pid + serial number etc. */
    @NativeType("char[32]")
    public String NameString() { return nNameString(address()); }
    /** @return a {@link OVRCameraIntrinsics} view of the {@code Intrinsics} field. */
    @NativeType("ovrCameraIntrinsics")
    public OVRCameraIntrinsics Intrinsics() { return nIntrinsics(address()); }
    /** @return a {@link OVRCameraExtrinsics} view of the {@code Extrinsics} field. */
    @NativeType("ovrCameraExtrinsics")
    public OVRCameraExtrinsics Extrinsics() { return nExtrinsics(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRExternalCamera} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRExternalCamera malloc() {
        return wrap(OVRExternalCamera.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRExternalCamera} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRExternalCamera calloc() {
        return wrap(OVRExternalCamera.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRExternalCamera} instance allocated with {@link BufferUtils}. */
    public static OVRExternalCamera create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRExternalCamera.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRExternalCamera} instance for the specified memory address. */
    public static OVRExternalCamera create(long address) {
        return wrap(OVRExternalCamera.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExternalCamera createSafe(long address) {
        return address == NULL ? null : wrap(OVRExternalCamera.class, address);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRExternalCamera.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExternalCamera.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRExternalCamera.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRExternalCamera} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRExternalCamera malloc(MemoryStack stack) {
        return wrap(OVRExternalCamera.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRExternalCamera} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRExternalCamera calloc(MemoryStack stack) {
        return wrap(OVRExternalCamera.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static ByteBuffer nName(long struct) { return memByteBuffer(struct + OVRExternalCamera.NAME, 32); }
    /** Unsafe version of {@link #NameString}. */
    public static String nNameString(long struct) { return memASCII(struct + OVRExternalCamera.NAME); }
    /** Unsafe version of {@link #Intrinsics}. */
    public static OVRCameraIntrinsics nIntrinsics(long struct) { return OVRCameraIntrinsics.create(struct + OVRExternalCamera.INTRINSICS); }
    /** Unsafe version of {@link #Extrinsics}. */
    public static OVRCameraExtrinsics nExtrinsics(long struct) { return OVRCameraExtrinsics.create(struct + OVRExternalCamera.EXTRINSICS); }

    // -----------------------------------

    /** An array of {@link OVRExternalCamera} structs. */
    public static class Buffer extends StructBuffer<OVRExternalCamera, Buffer> implements NativeResource {

        private static final OVRExternalCamera ELEMENT_FACTORY = OVRExternalCamera.create(-1L);

        /**
         * Creates a new {@code OVRExternalCamera.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRExternalCamera#SIZEOF}, and its mark will be undefined.
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
        protected OVRExternalCamera getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link OVRExternalCamera#Name} field. */
        @NativeType("char[32]")
        public ByteBuffer Name() { return OVRExternalCamera.nName(address()); }
        /** @return the null-terminated string stored in the {@link OVRExternalCamera#Name} field. */
        @NativeType("char[32]")
        public String NameString() { return OVRExternalCamera.nNameString(address()); }
        /** @return a {@link OVRCameraIntrinsics} view of the {@code Intrinsics} field. */
        @NativeType("ovrCameraIntrinsics")
        public OVRCameraIntrinsics Intrinsics() { return OVRExternalCamera.nIntrinsics(address()); }
        /** @return a {@link OVRCameraExtrinsics} view of the {@code Extrinsics} field. */
        @NativeType("ovrCameraExtrinsics")
        public OVRCameraExtrinsics Extrinsics() { return OVRExternalCamera.nExtrinsics(address()); }

    }

}