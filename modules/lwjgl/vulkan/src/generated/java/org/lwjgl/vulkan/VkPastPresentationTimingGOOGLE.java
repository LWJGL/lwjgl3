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
 * Structure containing timing information about a previously-presented image.
 * 
 * <h5>Description</h5>
 * 
 * <p>The results for a given {@code swapchain} and {@code presentID} are only returned once from {@code vkGetPastPresentationTimingGOOGLE}.</p>
 * 
 * <p>The application <b>can</b> use the {@link VkPastPresentationTimingGOOGLE} values to occasionally adjust its timing. For example, if {@code actualPresentTime} is later than expected (e.g. one {@code refreshDuration} late), the application may increase its target IPD to a higher multiple of {@code refreshDuration} (e.g. decrease its frame rate from 60Hz to 30Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are consistently different, and if {@code presentMargin} is consistently large enough, the application may decrease its target IPD to a smaller multiple of {@code refreshDuration} (e.g. increase its frame rate from 30Hz to 60Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are same, and if {@code presentMargin} is consistently high, the application may delay the start of its input-render-present loop in order to decrease the latency between user input and the corresponding present (always leaving some margin in case a new image takes longer to render than the previous image). An application that desires its target IPD to always be the same as {@code refreshDuration}, can also adjust features until {@code actualPresentTime} is never late and {@code presentMargin} is satisfactory.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link GOOGLEDisplayTiming#vkGetPastPresentationTimingGOOGLE GetPastPresentationTimingGOOGLE}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code presentID} &ndash; an application-provided value that was given to a previous {@code vkQueuePresentKHR} command via {@link VkPresentTimeGOOGLE}{@code ::presentID} (see below). It <b>can</b> be used to uniquely identify a previous present with the {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command.</li>
 * <li>{@code desiredPresentTime} &ndash; an application-provided value that was given to a previous {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command via {@link VkPresentTimeGOOGLE}{@code ::desiredPresentTime}. If non-zero, it was used by the application to indicate that an image not be presented any sooner than {@code desiredPresentTime}.</li>
 * <li>{@code actualPresentTime} &ndash; the time when the image of the {@code swapchain} was actually displayed.</li>
 * <li>{@code earliestPresentTime} &ndash; the time when the image of the {@code swapchain} could have been displayed. This <b>may</b> differ from {@code actualPresentTime} if the application requested that the image be presented no sooner than {@link VkPresentTimeGOOGLE}{@code ::desiredPresentTime}.</li>
 * <li>{@code presentMargin} &ndash; an indication of how early the {@code vkQueuePresentKHR} command was processed compared to how soon it needed to be processed, and still be presented at {@code earliestPresentTime}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPastPresentationTimingGOOGLE {
 *     uint32_t presentID;
 *     uint64_t desiredPresentTime;
 *     uint64_t actualPresentTime;
 *     uint64_t earliestPresentTime;
 *     uint64_t presentMargin;
 * }</code></pre>
 */
public class VkPastPresentationTimingGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRESENTID,
        DESIREDPRESENTTIME,
        ACTUALPRESENTTIME,
        EARLIESTPRESENTTIME,
        PRESENTMARGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
        ACTUALPRESENTTIME = layout.offsetof(2);
        EARLIESTPRESENTTIME = layout.offsetof(3);
        PRESENTMARGIN = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPastPresentationTimingGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingGOOGLE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code presentID} field. */
    @NativeType("uint32_t")
    public int presentID() { return npresentID(address()); }
    /** Returns the value of the {@code desiredPresentTime} field. */
    @NativeType("uint64_t")
    public long desiredPresentTime() { return ndesiredPresentTime(address()); }
    /** Returns the value of the {@code actualPresentTime} field. */
    @NativeType("uint64_t")
    public long actualPresentTime() { return nactualPresentTime(address()); }
    /** Returns the value of the {@code earliestPresentTime} field. */
    @NativeType("uint64_t")
    public long earliestPresentTime() { return nearliestPresentTime(address()); }
    /** Returns the value of the {@code presentMargin} field. */
    @NativeType("uint64_t")
    public long presentMargin() { return npresentMargin(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE malloc() {
        return wrap(VkPastPresentationTimingGOOGLE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE calloc() {
        return wrap(VkPastPresentationTimingGOOGLE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPastPresentationTimingGOOGLE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance for the specified memory address. */
    public static VkPastPresentationTimingGOOGLE create(long address) {
        return wrap(VkPastPresentationTimingGOOGLE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPastPresentationTimingGOOGLE createSafe(long address) {
        return address == NULL ? null : wrap(VkPastPresentationTimingGOOGLE.class, address);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPastPresentationTimingGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPastPresentationTimingGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPastPresentationTimingGOOGLE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPastPresentationTimingGOOGLE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE mallocStack(MemoryStack stack) {
        return wrap(VkPastPresentationTimingGOOGLE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE callocStack(MemoryStack stack) {
        return wrap(VkPastPresentationTimingGOOGLE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #presentID}. */
    public static int npresentID(long struct) { return UNSAFE.getInt(null, struct + VkPastPresentationTimingGOOGLE.PRESENTID); }
    /** Unsafe version of {@link #desiredPresentTime}. */
    public static long ndesiredPresentTime(long struct) { return UNSAFE.getLong(null, struct + VkPastPresentationTimingGOOGLE.DESIREDPRESENTTIME); }
    /** Unsafe version of {@link #actualPresentTime}. */
    public static long nactualPresentTime(long struct) { return UNSAFE.getLong(null, struct + VkPastPresentationTimingGOOGLE.ACTUALPRESENTTIME); }
    /** Unsafe version of {@link #earliestPresentTime}. */
    public static long nearliestPresentTime(long struct) { return UNSAFE.getLong(null, struct + VkPastPresentationTimingGOOGLE.EARLIESTPRESENTTIME); }
    /** Unsafe version of {@link #presentMargin}. */
    public static long npresentMargin(long struct) { return UNSAFE.getLong(null, struct + VkPastPresentationTimingGOOGLE.PRESENTMARGIN); }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingGOOGLE, Buffer> implements NativeResource {

        private static final VkPastPresentationTimingGOOGLE ELEMENT_FACTORY = VkPastPresentationTimingGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkPastPresentationTimingGOOGLE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingGOOGLE#SIZEOF}, and its mark will be undefined.
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
        protected VkPastPresentationTimingGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code presentID} field. */
        @NativeType("uint32_t")
        public int presentID() { return VkPastPresentationTimingGOOGLE.npresentID(address()); }
        /** Returns the value of the {@code desiredPresentTime} field. */
        @NativeType("uint64_t")
        public long desiredPresentTime() { return VkPastPresentationTimingGOOGLE.ndesiredPresentTime(address()); }
        /** Returns the value of the {@code actualPresentTime} field. */
        @NativeType("uint64_t")
        public long actualPresentTime() { return VkPastPresentationTimingGOOGLE.nactualPresentTime(address()); }
        /** Returns the value of the {@code earliestPresentTime} field. */
        @NativeType("uint64_t")
        public long earliestPresentTime() { return VkPastPresentationTimingGOOGLE.nearliestPresentTime(address()); }
        /** Returns the value of the {@code presentMargin} field. */
        @NativeType("uint64_t")
        public long presentMargin() { return VkPastPresentationTimingGOOGLE.npresentMargin(address()); }

    }

}