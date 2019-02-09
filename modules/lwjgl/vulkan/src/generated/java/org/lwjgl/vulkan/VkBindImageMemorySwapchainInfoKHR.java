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
 * Structure specifying swapchain image memory to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code swapchain} is not {@code NULL}, the {@code swapchain} and {@code imageIndex} are used to determine the memory that the image is bound to, instead of {@code memory} and {@code memoryOffset}.</p>
 * 
 * <p>Memory <b>can</b> be bound to a swapchain and use the {@code pDeviceIndices} or {@code pSplitInstanceBindRegions} members of {@link VkBindImageMemoryDeviceGroupInfo}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code imageIndex} <b>must</b> be less than the number of images in {@code swapchain}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR}</li>
 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchain} &ndash; {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a swapchain handle.</li>
 * <li>{@code imageIndex} &ndash; an image index within {@code swapchain}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImageMemorySwapchainInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainKHR swapchain;
 *     uint32_t imageIndex;
 * }</code></pre>
 */
public class VkBindImageMemorySwapchainInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        IMAGEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        IMAGEINDEX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkBindImageMemorySwapchainInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemorySwapchainInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code swapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** Returns the value of the {@code imageIndex} field. */
    @NativeType("uint32_t")
    public int imageIndex() { return nimageIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindImageMemorySwapchainInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindImageMemorySwapchainInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkBindImageMemorySwapchainInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@code imageIndex} field. */
    public VkBindImageMemorySwapchainInfoKHR imageIndex(@NativeType("uint32_t") int value) { nimageIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemorySwapchainInfoKHR set(
        int sType,
        long pNext,
        long swapchain,
        int imageIndex
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        imageIndex(imageIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemorySwapchainInfoKHR set(VkBindImageMemorySwapchainInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemorySwapchainInfoKHR malloc() {
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemorySwapchainInfoKHR calloc() {
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemorySwapchainInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance for the specified memory address. */
    public static VkBindImageMemorySwapchainInfoKHR create(long address) {
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemorySwapchainInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImageMemorySwapchainInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemorySwapchainInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindImageMemorySwapchainInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindImageMemorySwapchainInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemorySwapchainInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImageMemorySwapchainInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemorySwapchainInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkBindImageMemorySwapchainInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemorySwapchainInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemorySwapchainInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemorySwapchainInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemorySwapchainInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return UNSAFE.getLong(null, struct + VkBindImageMemorySwapchainInfoKHR.SWAPCHAIN); }
    /** Unsafe version of {@link #imageIndex}. */
    public static int nimageIndex(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemorySwapchainInfoKHR.IMAGEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemorySwapchainInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemorySwapchainInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { UNSAFE.putLong(null, struct + VkBindImageMemorySwapchainInfoKHR.SWAPCHAIN, value); }
    /** Unsafe version of {@link #imageIndex(int) imageIndex}. */
    public static void nimageIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemorySwapchainInfoKHR.IMAGEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkBindImageMemorySwapchainInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemorySwapchainInfoKHR, Buffer> implements NativeResource {

        private static final VkBindImageMemorySwapchainInfoKHR ELEMENT_FACTORY = VkBindImageMemorySwapchainInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemorySwapchainInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemorySwapchainInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemorySwapchainInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemorySwapchainInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImageMemorySwapchainInfoKHR.npNext(address()); }
        /** Returns the value of the {@code swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkBindImageMemorySwapchainInfoKHR.nswapchain(address()); }
        /** Returns the value of the {@code imageIndex} field. */
        @NativeType("uint32_t")
        public int imageIndex() { return VkBindImageMemorySwapchainInfoKHR.nimageIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindImageMemorySwapchainInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemorySwapchainInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindImageMemorySwapchainInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemorySwapchainInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkBindImageMemorySwapchainInfoKHR.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkBindImageMemorySwapchainInfoKHR.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@code imageIndex} field. */
        public VkBindImageMemorySwapchainInfoKHR.Buffer imageIndex(@NativeType("uint32_t") int value) { VkBindImageMemorySwapchainInfoKHR.nimageIndex(address(), value); return this; }

    }

}