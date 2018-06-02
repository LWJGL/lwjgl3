/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct CameraVideoStreamFrameHeader_t {
 *     EVRTrackedCameraFrameType eFrameType;
 *     uint32_t nWidth;
 *     uint32_t nHeight;
 *     uint32_t nBytesPerPixel;
 *     uint32_t nFrameSequence;
 *     {@link TrackedDevicePose TrackedDevicePose_t} standingTrackedDevicePose;
 * }</code></pre>
 */
@NativeType("struct CameraVideoStreamFrameHeader_t")
public class CameraVideoStreamFrameHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EFRAMETYPE,
        NWIDTH,
        NHEIGHT,
        NBYTESPERPIXEL,
        NFRAMESEQUENCE,
        STANDINGTRACKEDDEVICEPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(TrackedDevicePose.SIZEOF, TrackedDevicePose.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EFRAMETYPE = layout.offsetof(0);
        NWIDTH = layout.offsetof(1);
        NHEIGHT = layout.offsetof(2);
        NBYTESPERPIXEL = layout.offsetof(3);
        NFRAMESEQUENCE = layout.offsetof(4);
        STANDINGTRACKEDDEVICEPOSE = layout.offsetof(5);
    }

    CameraVideoStreamFrameHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link CameraVideoStreamFrameHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CameraVideoStreamFrameHeader(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code eFrameType} field. */
    @NativeType("EVRTrackedCameraFrameType")
    public int eFrameType() { return neFrameType(address()); }
    /** Returns the value of the {@code nWidth} field. */
    @NativeType("uint32_t")
    public int nWidth() { return nnWidth(address()); }
    /** Returns the value of the {@code nHeight} field. */
    @NativeType("uint32_t")
    public int nHeight() { return nnHeight(address()); }
    /** Returns the value of the {@code nBytesPerPixel} field. */
    @NativeType("uint32_t")
    public int nBytesPerPixel() { return nnBytesPerPixel(address()); }
    /** Returns the value of the {@code nFrameSequence} field. */
    @NativeType("uint32_t")
    public int nFrameSequence() { return nnFrameSequence(address()); }
    /** Returns a {@link TrackedDevicePose} view of the {@code standingTrackedDevicePose} field. */
    @NativeType("TrackedDevicePose_t")
    public TrackedDevicePose standingTrackedDevicePose() { return nstandingTrackedDevicePose(address()); }
    /** Passes the {@code standingTrackedDevicePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CameraVideoStreamFrameHeader standingTrackedDevicePose(java.util.function.Consumer<TrackedDevicePose> consumer) { consumer.accept(standingTrackedDevicePose()); return this; }

    // -----------------------------------

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CameraVideoStreamFrameHeader malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CameraVideoStreamFrameHeader calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated with {@link BufferUtils}. */
    public static CameraVideoStreamFrameHeader create() {
        return new CameraVideoStreamFrameHeader(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance for the specified memory address. */
    public static CameraVideoStreamFrameHeader create(long address) {
        return new CameraVideoStreamFrameHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CameraVideoStreamFrameHeader createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link CameraVideoStreamFrameHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CameraVideoStreamFrameHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the thread-local {@link MemoryStack}. */
    public static CameraVideoStreamFrameHeader mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CameraVideoStreamFrameHeader callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CameraVideoStreamFrameHeader mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CameraVideoStreamFrameHeader callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CameraVideoStreamFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CameraVideoStreamFrameHeader.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eFrameType}. */
    public static int neFrameType(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.EFRAMETYPE); }
    /** Unsafe version of {@link #nWidth}. */
    public static int nnWidth(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NWIDTH); }
    /** Unsafe version of {@link #nHeight}. */
    public static int nnHeight(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NHEIGHT); }
    /** Unsafe version of {@link #nBytesPerPixel}. */
    public static int nnBytesPerPixel(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NBYTESPERPIXEL); }
    /** Unsafe version of {@link #nFrameSequence}. */
    public static int nnFrameSequence(long struct) { return memGetInt(struct + CameraVideoStreamFrameHeader.NFRAMESEQUENCE); }
    /** Unsafe version of {@link #standingTrackedDevicePose}. */
    public static TrackedDevicePose nstandingTrackedDevicePose(long struct) { return TrackedDevicePose.create(struct + CameraVideoStreamFrameHeader.STANDINGTRACKEDDEVICEPOSE); }

    // -----------------------------------

    /** An array of {@link CameraVideoStreamFrameHeader} structs. */
    public static class Buffer extends StructBuffer<CameraVideoStreamFrameHeader, Buffer> implements NativeResource {

        /**
         * Creates a new {@link CameraVideoStreamFrameHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CameraVideoStreamFrameHeader#SIZEOF}, and its mark will be undefined.
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
        protected CameraVideoStreamFrameHeader newInstance(long address) {
            return new CameraVideoStreamFrameHeader(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code eFrameType} field. */
        @NativeType("EVRTrackedCameraFrameType")
        public int eFrameType() { return CameraVideoStreamFrameHeader.neFrameType(address()); }
        /** Returns the value of the {@code nWidth} field. */
        @NativeType("uint32_t")
        public int nWidth() { return CameraVideoStreamFrameHeader.nnWidth(address()); }
        /** Returns the value of the {@code nHeight} field. */
        @NativeType("uint32_t")
        public int nHeight() { return CameraVideoStreamFrameHeader.nnHeight(address()); }
        /** Returns the value of the {@code nBytesPerPixel} field. */
        @NativeType("uint32_t")
        public int nBytesPerPixel() { return CameraVideoStreamFrameHeader.nnBytesPerPixel(address()); }
        /** Returns the value of the {@code nFrameSequence} field. */
        @NativeType("uint32_t")
        public int nFrameSequence() { return CameraVideoStreamFrameHeader.nnFrameSequence(address()); }
        /** Returns a {@link TrackedDevicePose} view of the {@code standingTrackedDevicePose} field. */
        @NativeType("TrackedDevicePose_t")
        public TrackedDevicePose standingTrackedDevicePose() { return CameraVideoStreamFrameHeader.nstandingTrackedDevicePose(address()); }
        /** Passes the {@code standingTrackedDevicePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CameraVideoStreamFrameHeader.Buffer standingTrackedDevicePose(java.util.function.Consumer<TrackedDevicePose> consumer) { consumer.accept(standingTrackedDevicePose()); return this; }

    }

}