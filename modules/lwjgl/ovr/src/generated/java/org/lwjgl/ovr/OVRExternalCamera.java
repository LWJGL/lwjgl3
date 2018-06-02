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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Name} &ndash; camera identifier: vid + pid + serial number etc.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrExternalCamera {
 *     char Name[32];
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

    OVRExternalCamera(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRExternalCamera} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRExternalCamera(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code Name} field. */
    @NativeType("char[32]")
    public ByteBuffer Name() { return nName(address()); }
    /** Decodes the null-terminated string stored in the {@code Name} field. */
    @NativeType("char[32]")
    public String NameString() { return nNameString(address()); }
    /** Returns a {@link OVRCameraIntrinsics} view of the {@code Intrinsics} field. */
    @NativeType("ovrCameraIntrinsics")
    public OVRCameraIntrinsics Intrinsics() { return nIntrinsics(address()); }
    /** Passes the {@code Intrinsics} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRExternalCamera Intrinsics(java.util.function.Consumer<OVRCameraIntrinsics> consumer) { consumer.accept(Intrinsics()); return this; }
    /** Returns a {@link OVRCameraExtrinsics} view of the {@code Extrinsics} field. */
    @NativeType("ovrCameraExtrinsics")
    public OVRCameraExtrinsics Extrinsics() { return nExtrinsics(address()); }
    /** Passes the {@code Extrinsics} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRExternalCamera Extrinsics(java.util.function.Consumer<OVRCameraExtrinsics> consumer) { consumer.accept(Extrinsics()); return this; }

    // -----------------------------------

    /** Returns a new {@link OVRExternalCamera} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRExternalCamera malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRExternalCamera} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRExternalCamera calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRExternalCamera} instance allocated with {@link BufferUtils}. */
    public static OVRExternalCamera create() {
        return new OVRExternalCamera(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRExternalCamera} instance for the specified memory address. */
    public static OVRExternalCamera create(long address) {
        return new OVRExternalCamera(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExternalCamera createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRExternalCamera.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRExternalCamera.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRExternalCamera} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRExternalCamera mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRExternalCamera} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRExternalCamera callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRExternalCamera} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRExternalCamera mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRExternalCamera} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRExternalCamera callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRExternalCamera.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRExternalCamera.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        /**
         * Creates a new {@link OVRExternalCamera.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRExternalCamera newInstance(long address) {
            return new OVRExternalCamera(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code Name} field. */
        @NativeType("char[32]")
        public ByteBuffer Name() { return OVRExternalCamera.nName(address()); }
        /** Decodes the null-terminated string stored in the {@code Name} field. */
        @NativeType("char[32]")
        public String NameString() { return OVRExternalCamera.nNameString(address()); }
        /** Returns a {@link OVRCameraIntrinsics} view of the {@code Intrinsics} field. */
        @NativeType("ovrCameraIntrinsics")
        public OVRCameraIntrinsics Intrinsics() { return OVRExternalCamera.nIntrinsics(address()); }
        /** Passes the {@code Intrinsics} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRExternalCamera.Buffer Intrinsics(java.util.function.Consumer<OVRCameraIntrinsics> consumer) { consumer.accept(Intrinsics()); return this; }
        /** Returns a {@link OVRCameraExtrinsics} view of the {@code Extrinsics} field. */
        @NativeType("ovrCameraExtrinsics")
        public OVRCameraExtrinsics Extrinsics() { return OVRExternalCamera.nExtrinsics(address()); }
        /** Passes the {@code Extrinsics} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRExternalCamera.Buffer Extrinsics(java.util.function.Consumer<OVRCameraExtrinsics> consumer) { consumer.accept(Extrinsics()); return this; }

    }

}