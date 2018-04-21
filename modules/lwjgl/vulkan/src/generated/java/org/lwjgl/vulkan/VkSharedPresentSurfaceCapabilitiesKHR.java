/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * structure describing capabilities of a surface for shared presentation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSharedPresentableImage#VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code sharedPresentSupportedUsageFlags} &ndash; a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the shared presentable image from a swapchain created with {@code VkPresentModeKHR} set to {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR} for the surface on the specified device. {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional usages.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSharedPresentSurfaceCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageUsageFlags sharedPresentSupportedUsageFlags;
 * }</pre></code>
 */
public class VkSharedPresentSurfaceCapabilitiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS = layout.offsetof(2);
    }

    VkSharedPresentSurfaceCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSharedPresentSurfaceCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSharedPresentSurfaceCapabilitiesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code sharedPresentSupportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags")
    public int sharedPresentSupportedUsageFlags() { return nsharedPresentSupportedUsageFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSharedPresentSurfaceCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSharedPresentSurfaceCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSharedPresentSurfaceCapabilitiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSharedPresentSurfaceCapabilitiesKHR set(VkSharedPresentSurfaceCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSharedPresentSurfaceCapabilitiesKHR} instance for the specified memory address. */
    public static VkSharedPresentSurfaceCapabilitiesKHR create(long address) {
        return new VkSharedPresentSurfaceCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSharedPresentSurfaceCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkSharedPresentSurfaceCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSharedPresentSurfaceCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSharedPresentSurfaceCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSharedPresentSurfaceCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSharedPresentSurfaceCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #sharedPresentSupportedUsageFlags}. */
    public static int nsharedPresentSupportedUsageFlags(long struct) { return memGetInt(struct + VkSharedPresentSurfaceCapabilitiesKHR.SHAREDPRESENTSUPPORTEDUSAGEFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSharedPresentSurfaceCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSharedPresentSurfaceCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSharedPresentSurfaceCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSharedPresentSurfaceCapabilitiesKHR, Buffer> {

        /**
         * Creates a new {@link VkSharedPresentSurfaceCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSharedPresentSurfaceCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSharedPresentSurfaceCapabilitiesKHR newInstance(long address) {
            return new VkSharedPresentSurfaceCapabilitiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSharedPresentSurfaceCapabilitiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSharedPresentSurfaceCapabilitiesKHR.npNext(address()); }
        /** Returns the value of the {@code sharedPresentSupportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int sharedPresentSupportedUsageFlags() { return VkSharedPresentSurfaceCapabilitiesKHR.nsharedPresentSupportedUsageFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSharedPresentSurfaceCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSharedPresentSurfaceCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSharedPresentSurfaceCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkSharedPresentSurfaceCapabilitiesKHR.npNext(address(), value); return this; }

    }

}