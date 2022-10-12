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
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPresentTimesInfoGOOGLE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPresentTimeGOOGLE {
 *     uint32_t {@link #presentID};
 *     uint64_t {@link #desiredPresentTime};
 * }</code></pre>
 */
public class VkPresentTimeGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code VkPresentTimeGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimeGOOGLE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an application-provided identification value, that <b>can</b> be used with the results of {@link GOOGLEDisplayTiming#vkGetPastPresentationTimingGOOGLE GetPastPresentationTimingGOOGLE}, in order to uniquely identify this present. In order to be useful to the application, it <b>should</b> be unique within some period of time that is meaningful to the application. */
    @NativeType("uint32_t")
    public int presentID() { return npresentID(address()); }
    /** specifies that the image given <b>should</b> not be displayed to the user any earlier than this time. {@code desiredPresentTime} is a time in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux). A value of zero specifies that the presentation engine <b>may</b> display the image at any time. This is useful when the application desires to provide {@code presentID}, but does not need a specific {@code desiredPresentTime}. */
    @NativeType("uint64_t")
    public long desiredPresentTime() { return ndesiredPresentTime(address()); }

    /** Sets the specified value to the {@link #presentID} field. */
    public VkPresentTimeGOOGLE presentID(@NativeType("uint32_t") int value) { npresentID(address(), value); return this; }
    /** Sets the specified value to the {@link #desiredPresentTime} field. */
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

    /** Returns a new {@code VkPresentTimeGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimeGOOGLE malloc() {
        return wrap(VkPresentTimeGOOGLE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPresentTimeGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimeGOOGLE calloc() {
        return wrap(VkPresentTimeGOOGLE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPresentTimeGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimeGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPresentTimeGOOGLE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimeGOOGLE} instance for the specified memory address. */
    public static VkPresentTimeGOOGLE create(long address) {
        return wrap(VkPresentTimeGOOGLE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimeGOOGLE createSafe(long address) {
        return address == NULL ? null : wrap(VkPresentTimeGOOGLE.class, address);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPresentTimeGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimeGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimeGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentTimeGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimeGOOGLE malloc(MemoryStack stack) {
        return wrap(VkPresentTimeGOOGLE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPresentTimeGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimeGOOGLE calloc(MemoryStack stack) {
        return wrap(VkPresentTimeGOOGLE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimeGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimeGOOGLE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #presentID}. */
    public static int npresentID(long struct) { return UNSAFE.getInt(null, struct + VkPresentTimeGOOGLE.PRESENTID); }
    /** Unsafe version of {@link #desiredPresentTime}. */
    public static long ndesiredPresentTime(long struct) { return UNSAFE.getLong(null, struct + VkPresentTimeGOOGLE.DESIREDPRESENTTIME); }

    /** Unsafe version of {@link #presentID(int) presentID}. */
    public static void npresentID(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentTimeGOOGLE.PRESENTID, value); }
    /** Unsafe version of {@link #desiredPresentTime(long) desiredPresentTime}. */
    public static void ndesiredPresentTime(long struct, long value) { UNSAFE.putLong(null, struct + VkPresentTimeGOOGLE.DESIREDPRESENTTIME, value); }

    // -----------------------------------

    /** An array of {@link VkPresentTimeGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimeGOOGLE, Buffer> implements NativeResource {

        private static final VkPresentTimeGOOGLE ELEMENT_FACTORY = VkPresentTimeGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkPresentTimeGOOGLE.Buffer} instance backed by the specified container.
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
        protected VkPresentTimeGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPresentTimeGOOGLE#presentID} field. */
        @NativeType("uint32_t")
        public int presentID() { return VkPresentTimeGOOGLE.npresentID(address()); }
        /** @return the value of the {@link VkPresentTimeGOOGLE#desiredPresentTime} field. */
        @NativeType("uint64_t")
        public long desiredPresentTime() { return VkPresentTimeGOOGLE.ndesiredPresentTime(address()); }

        /** Sets the specified value to the {@link VkPresentTimeGOOGLE#presentID} field. */
        public VkPresentTimeGOOGLE.Buffer presentID(@NativeType("uint32_t") int value) { VkPresentTimeGOOGLE.npresentID(address(), value); return this; }
        /** Sets the specified value to the {@link VkPresentTimeGOOGLE#desiredPresentTime} field. */
        public VkPresentTimeGOOGLE.Buffer desiredPresentTime(@NativeType("uint64_t") long value) { VkPresentTimeGOOGLE.ndesiredPresentTime(address(), value); return this; }

    }

}