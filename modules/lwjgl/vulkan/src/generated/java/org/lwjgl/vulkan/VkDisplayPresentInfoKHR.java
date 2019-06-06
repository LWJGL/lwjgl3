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
 * Structure describing parameters of a queue presentation to a swapchain.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the extent of the {@code srcRect} and {@code dstRect} are not equal, the presented pixels will be scaled accordingly.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code srcRect} <b>must</b> specify a rectangular region that is a subset of the image being presented</li>
 * <li>{@code dstRect} <b>must</b> specify a rectangular region that is a subset of the {@code visibleRegion} parameter of the display mode the swapchain being presented uses</li>
 * <li>If the {@code persistentContent} member of the {@link VkDisplayPropertiesKHR} structure returned by {@code vkGetPhysicalDeviceDisplayPropertiesKHR} for the display the present operation targets then {@code persistent} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDisplaySwapchain#VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcRect} &ndash; a rectangular region of pixels to present. It <b>must</b> be a subset of the image being presented. If {@link VkDisplayPresentInfoKHR} is not specified, this region will be assumed to be the entire presentable image.</li>
 * <li>{@code dstRect} &ndash; a rectangular region within the visible region of the swapchain&#8217;s display mode. If {@link VkDisplayPresentInfoKHR} is not specified, this region will be assumed to be the entire visible region of the visible region of the swapchain&#8217;s mode. If the specified rectangle is a subset of the display mode&#8217;s visible region, content from display planes below the swapchain&#8217;s plane will be visible outside the rectangle. If there are no planes below the swapchain&#8217;s, the area outside the specified rectangle will be black. If portions of the specified rectangle are outside of the display&#8217;s visible region, pixels mapping only to those portions of the rectangle will be discarded.</li>
 * <li>{@code persistent} &ndash; If this is {@link VK10#VK_TRUE TRUE}, the display engine will enable buffered mode on displays that support it. This allows the display engine to stop sending content to the display until a new image is presented. The display will instead maintain a copy of the last presented image. This allows less power to be used, but <b>may</b> increase presentation latency. If {@link VkDisplayPresentInfoKHR} is not specified, persistent mode will not be used.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPresentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkRect2D VkRect2D} srcRect;
 *     {@link VkRect2D VkRect2D} dstRect;
 *     VkBool32 persistent;
 * }</code></pre>
 */
public class VkDisplayPresentInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCRECT,
        DSTRECT,
        PERSISTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCRECT = layout.offsetof(2);
        DSTRECT = layout.offsetof(3);
        PERSISTENT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDisplayPresentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPresentInfoKHR(ByteBuffer container) {
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
    /** Returns a {@link VkRect2D} view of the {@code srcRect} field. */
    public VkRect2D srcRect() { return nsrcRect(address()); }
    /** Returns a {@link VkRect2D} view of the {@code dstRect} field. */
    public VkRect2D dstRect() { return ndstRect(address()); }
    /** Returns the value of the {@code persistent} field. */
    @NativeType("VkBool32")
    public boolean persistent() { return npersistent(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code srcRect} field. */
    public VkDisplayPresentInfoKHR srcRect(VkRect2D value) { nsrcRect(address(), value); return this; }
    /** Passes the {@code srcRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayPresentInfoKHR srcRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(srcRect()); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code dstRect} field. */
    public VkDisplayPresentInfoKHR dstRect(VkRect2D value) { ndstRect(address(), value); return this; }
    /** Passes the {@code dstRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayPresentInfoKHR dstRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(dstRect()); return this; }
    /** Sets the specified value to the {@code persistent} field. */
    public VkDisplayPresentInfoKHR persistent(@NativeType("VkBool32") boolean value) { npersistent(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPresentInfoKHR set(
        int sType,
        long pNext,
        VkRect2D srcRect,
        VkRect2D dstRect,
        boolean persistent
    ) {
        sType(sType);
        pNext(pNext);
        srcRect(srcRect);
        dstRect(dstRect);
        persistent(persistent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPresentInfoKHR set(VkDisplayPresentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPresentInfoKHR malloc() {
        return wrap(VkDisplayPresentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPresentInfoKHR calloc() {
        return wrap(VkDisplayPresentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayPresentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance for the specified memory address. */
    public static VkDisplayPresentInfoKHR create(long address) {
        return wrap(VkDisplayPresentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayPresentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPresentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayPresentInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayPresentInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPresentInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplayPresentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPresentInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplayPresentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPresentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #srcRect}. */
    public static VkRect2D nsrcRect(long struct) { return VkRect2D.create(struct + VkDisplayPresentInfoKHR.SRCRECT); }
    /** Unsafe version of {@link #dstRect}. */
    public static VkRect2D ndstRect(long struct) { return VkRect2D.create(struct + VkDisplayPresentInfoKHR.DSTRECT); }
    /** Unsafe version of {@link #persistent}. */
    public static int npersistent(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPresentInfoKHR.PERSISTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPresentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcRect(VkRect2D) srcRect}. */
    public static void nsrcRect(long struct, VkRect2D value) { memCopy(value.address(), struct + VkDisplayPresentInfoKHR.SRCRECT, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #dstRect(VkRect2D) dstRect}. */
    public static void ndstRect(long struct, VkRect2D value) { memCopy(value.address(), struct + VkDisplayPresentInfoKHR.DSTRECT, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #persistent(boolean) persistent}. */
    public static void npersistent(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPresentInfoKHR.PERSISTENT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPresentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPresentInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplayPresentInfoKHR ELEMENT_FACTORY = VkDisplayPresentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPresentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPresentInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPresentInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayPresentInfoKHR.npNext(address()); }
        /** Returns a {@link VkRect2D} view of the {@code srcRect} field. */
        public VkRect2D srcRect() { return VkDisplayPresentInfoKHR.nsrcRect(address()); }
        /** Returns a {@link VkRect2D} view of the {@code dstRect} field. */
        public VkRect2D dstRect() { return VkDisplayPresentInfoKHR.ndstRect(address()); }
        /** Returns the value of the {@code persistent} field. */
        @NativeType("VkBool32")
        public boolean persistent() { return VkDisplayPresentInfoKHR.npersistent(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplayPresentInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code srcRect} field. */
        public VkDisplayPresentInfoKHR.Buffer srcRect(VkRect2D value) { VkDisplayPresentInfoKHR.nsrcRect(address(), value); return this; }
        /** Passes the {@code srcRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayPresentInfoKHR.Buffer srcRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(srcRect()); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code dstRect} field. */
        public VkDisplayPresentInfoKHR.Buffer dstRect(VkRect2D value) { VkDisplayPresentInfoKHR.ndstRect(address(), value); return this; }
        /** Passes the {@code dstRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayPresentInfoKHR.Buffer dstRect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(dstRect()); return this; }
        /** Sets the specified value to the {@code persistent} field. */
        public VkDisplayPresentInfoKHR.Buffer persistent(@NativeType("VkBool32") boolean value) { VkDisplayPresentInfoKHR.npersistent(address(), value ? 1 : 0); return this; }

    }

}