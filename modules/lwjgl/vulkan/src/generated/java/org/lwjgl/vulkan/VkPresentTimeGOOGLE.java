/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The earliest time image should be presented.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code presentID} &ndash; an application-provided identification value, that <b>can</b> be used with the results of {@link GOOGLEDisplayTiming#vkGetPastPresentationTimingGOOGLE GetPastPresentationTimingGOOGLE}, in order to uniquely identify this present. In order to be useful to the application, it <b>should</b> be unique within some period of time that is meaningful to the application.</li>
 * <li>{@code desiredPresentTime} &ndash; specifies that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero specifies that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but doesn&#8217;t need a specific {@code desiredPresentTime}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPresentTimeGOOGLE {
 *     uint32_t presentID;
 *     uint64_t desiredPresentTime;
 * }</pre></code>
 */
public class VkPresentTimeGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRESENTID,
        DESIREDPRESENTTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
    }

    VkPresentTimeGOOGLE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPresentTimeGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimeGOOGLE(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code presentID} field. */
    @NativeType("uint32_t")
    public int presentID() { return npresentID(address()); }
    /** Returns the value of the {@code desiredPresentTime} field. */
    @NativeType("uint64_t")
    public long desiredPresentTime() { return ndesiredPresentTime(address()); }

    /** Sets the specified value to the {@code presentID} field. */
    public VkPresentTimeGOOGLE presentID(@NativeType("uint32_t") int value) { npresentID(address(), value); return this; }
    /** Sets the specified value to the {@code desiredPresentTime} field. */
    public VkPresentTimeGOOGLE desiredPresentTime(@NativeType("uint64_t") long value) { ndesiredPresentTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimeGOOGLE set(
        int presentID,
        long desiredPresentTime
    ) {
        presentID(presentID);
        desiredPresentTime(desiredPresentTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimeGOOGLE set(VkPresentTimeGOOGLE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPresentTimeGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimeGOOGLE malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPresentTimeGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimeGOOGLE calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPresentTimeGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimeGOOGLE create() {
        return new VkPresentTimeGOOGLE(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPresentTimeGOOGLE} instance for the specified memory address. */
    public static VkPresentTimeGOOGLE create(long address) {
        return new VkPresentTimeGOOGLE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimeGOOGLE createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPresentTimeGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimeGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPresentTimeGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPresentTimeGOOGLE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPresentTimeGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPresentTimeGOOGLE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimeGOOGLE mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimeGOOGLE callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #presentID}. */
    public static int npresentID(long struct) { return memGetInt(struct + VkPresentTimeGOOGLE.PRESENTID); }
    /** Unsafe version of {@link #desiredPresentTime}. */
    public static long ndesiredPresentTime(long struct) { return memGetLong(struct + VkPresentTimeGOOGLE.DESIREDPRESENTTIME); }

    /** Unsafe version of {@link #presentID(int) presentID}. */
    public static void npresentID(long struct, int value) { memPutInt(struct + VkPresentTimeGOOGLE.PRESENTID, value); }
    /** Unsafe version of {@link #desiredPresentTime(long) desiredPresentTime}. */
    public static void ndesiredPresentTime(long struct, long value) { memPutLong(struct + VkPresentTimeGOOGLE.DESIREDPRESENTTIME, value); }

    // -----------------------------------

    /** An array of {@link VkPresentTimeGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimeGOOGLE, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPresentTimeGOOGLE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimeGOOGLE#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentTimeGOOGLE newInstance(long address) {
            return new VkPresentTimeGOOGLE(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code presentID} field. */
        @NativeType("uint32_t")
        public int presentID() { return VkPresentTimeGOOGLE.npresentID(address()); }
        /** Returns the value of the {@code desiredPresentTime} field. */
        @NativeType("uint64_t")
        public long desiredPresentTime() { return VkPresentTimeGOOGLE.ndesiredPresentTime(address()); }

        /** Sets the specified value to the {@code presentID} field. */
        public VkPresentTimeGOOGLE.Buffer presentID(@NativeType("uint32_t") int value) { VkPresentTimeGOOGLE.npresentID(address(), value); return this; }
        /** Sets the specified value to the {@code desiredPresentTime} field. */
        public VkPresentTimeGOOGLE.Buffer desiredPresentTime(@NativeType("uint64_t") long value) { VkPresentTimeGOOGLE.ndesiredPresentTime(address(), value); return this; }

    }

}