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
 * Structure describing the presentation scaling capabilities of the surface.
 * 
 * <h5>Description</h5>
 * 
 * <p>Before creating a swapchain whose scaling mode <b>can</b> be specified through the use of {@link VkSwapchainPresentScalingCreateInfoEXT}, obtain the set of supported scaling modes by including a {@link VkSurfacePresentModeEXT} structure in the {@code pNext} chain of {@link VkPhysicalDeviceSurfaceInfo2KHR} when calling {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR}. The implementation <b>must</b> return the same values in {@link VkSurfacePresentScalingCapabilitiesEXT} for any of the compatible present modes as obtained through {@link VkSurfacePresentModeCompatibilityEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT}</li>
 * <li>{@code supportedPresentScaling} <b>must</b> be a valid combination of {@code VkPresentScalingFlagBitsEXT} values</li>
 * <li>{@code supportedPresentGravityX} <b>must</b> be a valid combination of {@code VkPresentGravityFlagBitsEXT} values</li>
 * <li>{@code supportedPresentGravityY} <b>must</b> be a valid combination of {@code VkPresentGravityFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfacePresentScalingCapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkPresentScalingFlagsEXT {@link #supportedPresentScaling};
 *     VkPresentGravityFlagsEXT {@link #supportedPresentGravityX};
 *     VkPresentGravityFlagsEXT {@link #supportedPresentGravityY};
 *     {@link VkExtent2D VkExtent2D} {@link #minScaledImageExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxScaledImageExtent};
 * }</code></pre>
 */
public class VkSurfacePresentScalingCapabilitiesEXT extends Struct<VkSurfacePresentScalingCapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDPRESENTSCALING,
        SUPPORTEDPRESENTGRAVITYX,
        SUPPORTEDPRESENTGRAVITYY,
        MINSCALEDIMAGEEXTENT,
        MAXSCALEDIMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDPRESENTSCALING = layout.offsetof(2);
        SUPPORTEDPRESENTGRAVITYX = layout.offsetof(3);
        SUPPORTEDPRESENTGRAVITYY = layout.offsetof(4);
        MINSCALEDIMAGEEXTENT = layout.offsetof(5);
        MAXSCALEDIMAGEEXTENT = layout.offsetof(6);
    }

    protected VkSurfacePresentScalingCapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentScalingCapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentScalingCapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentScalingCapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkPresentScalingFlagBitsEXT} representing the scaling methods supported by the surface, or 0 if application-defined scaling is not supported. */
    @NativeType("VkPresentScalingFlagsEXT")
    public int supportedPresentScaling() { return nsupportedPresentScaling(address()); }
    /** a bitmask of {@code VkPresentGravityFlagBitsEXT} representing the X-axis pixel gravity supported by the surface, or 0 if Vulkan-defined pixel gravity is not supported for the X axis. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int supportedPresentGravityX() { return nsupportedPresentGravityX(address()); }
    /** a bitmask of {@code VkPresentGravityFlagBitsEXT} representing the Y-axis pixel gravity supported by the surface, or 0 if Vulkan-defined pixel gravity is not supported for the Y axis. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int supportedPresentGravityY() { return nsupportedPresentGravityY(address()); }
    /** contains the smallest valid swapchain extent for the surface on the specified device when one of the scaling methods specified in {@code supportedPresentScaling} is used, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface. The {@code width} and {@code height} of the extent will each be smaller than or equal to the corresponding {@code width} and {@code height} of {@link VkSurfaceCapabilitiesKHR}{@code ::minImageExtent}. */
    public VkExtent2D minScaledImageExtent() { return nminScaledImageExtent(address()); }
    /** contains the largest valid swapchain extent for the surface on the specified device when one of the scaling methods specified in {@code supportedPresentScaling} is used, or the special value described above for {@code minScaledImageExtent}. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@link VkSurfaceCapabilitiesKHR}{@code ::maxImageExtent}. */
    public VkExtent2D maxScaledImageExtent() { return nmaxScaledImageExtent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfacePresentScalingCapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkSurfacePresentScalingCapabilitiesEXT sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfacePresentScalingCapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #supportedPresentScaling} field. */
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScaling(@NativeType("VkPresentScalingFlagsEXT") int value) { nsupportedPresentScaling(address(), value); return this; }
    /** Sets the specified value to the {@link #supportedPresentGravityX} field. */
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityX(@NativeType("VkPresentGravityFlagsEXT") int value) { nsupportedPresentGravityX(address(), value); return this; }
    /** Sets the specified value to the {@link #supportedPresentGravityY} field. */
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityY(@NativeType("VkPresentGravityFlagsEXT") int value) { nsupportedPresentGravityY(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #minScaledImageExtent} field. */
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(VkExtent2D value) { nminScaledImageExtent(address(), value); return this; }
    /** Passes the {@link #minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #maxScaledImageExtent} field. */
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(VkExtent2D value) { nmaxScaledImageExtent(address(), value); return this; }
    /** Passes the {@link #maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentScalingCapabilitiesEXT set(
        int sType,
        long pNext,
        int supportedPresentScaling,
        int supportedPresentGravityX,
        int supportedPresentGravityY,
        VkExtent2D minScaledImageExtent,
        VkExtent2D maxScaledImageExtent
    ) {
        sType(sType);
        pNext(pNext);
        supportedPresentScaling(supportedPresentScaling);
        supportedPresentGravityX(supportedPresentGravityX);
        supportedPresentGravityY(supportedPresentGravityY);
        minScaledImageExtent(minScaledImageExtent);
        maxScaledImageExtent(maxScaledImageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentScalingCapabilitiesEXT set(VkSurfacePresentScalingCapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesEXT malloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentScalingCapabilitiesEXT calloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentScalingCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentScalingCapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance for the specified memory address. */
    public static VkSurfacePresentScalingCapabilitiesEXT create(long address) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfacePresentScalingCapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentScalingCapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentScalingCapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentScalingCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentScalingCapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentScalingCapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #supportedPresentScaling}. */
    public static int nsupportedPresentScaling(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTSCALING); }
    /** Unsafe version of {@link #supportedPresentGravityX}. */
    public static int nsupportedPresentGravityX(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYX); }
    /** Unsafe version of {@link #supportedPresentGravityY}. */
    public static int nsupportedPresentGravityY(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYY); }
    /** Unsafe version of {@link #minScaledImageExtent}. */
    public static VkExtent2D nminScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesEXT.MINSCALEDIMAGEEXTENT); }
    /** Unsafe version of {@link #maxScaledImageExtent}. */
    public static VkExtent2D nmaxScaledImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfacePresentScalingCapabilitiesEXT.MAXSCALEDIMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentScalingCapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #supportedPresentScaling(int) supportedPresentScaling}. */
    public static void nsupportedPresentScaling(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTSCALING, value); }
    /** Unsafe version of {@link #supportedPresentGravityX(int) supportedPresentGravityX}. */
    public static void nsupportedPresentGravityX(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYX, value); }
    /** Unsafe version of {@link #supportedPresentGravityY(int) supportedPresentGravityY}. */
    public static void nsupportedPresentGravityY(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentScalingCapabilitiesEXT.SUPPORTEDPRESENTGRAVITYY, value); }
    /** Unsafe version of {@link #minScaledImageExtent(VkExtent2D) minScaledImageExtent}. */
    public static void nminScaledImageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSurfacePresentScalingCapabilitiesEXT.MINSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #maxScaledImageExtent(VkExtent2D) maxScaledImageExtent}. */
    public static void nmaxScaledImageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSurfacePresentScalingCapabilitiesEXT.MAXSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentScalingCapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentScalingCapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkSurfacePresentScalingCapabilitiesEXT ELEMENT_FACTORY = VkSurfacePresentScalingCapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentScalingCapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentScalingCapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentScalingCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfacePresentScalingCapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentScalingCapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkSurfacePresentScalingCapabilitiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentScalingCapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentScaling} field. */
        @NativeType("VkPresentScalingFlagsEXT")
        public int supportedPresentScaling() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentScaling(address()); }
        /** @return the value of the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentGravityX} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int supportedPresentGravityX() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityX(address()); }
        /** @return the value of the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentGravityY} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int supportedPresentGravityY() { return VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityY(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSurfacePresentScalingCapabilitiesEXT#minScaledImageExtent} field. */
        public VkExtent2D minScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.nminScaledImageExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSurfacePresentScalingCapabilitiesEXT#maxScaledImageExtent} field. */
        public VkExtent2D maxScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.nmaxScaledImageExtent(address()); }

        /** Sets the specified value to the {@link VkSurfacePresentScalingCapabilitiesEXT#sType} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT} value to the {@link VkSurfacePresentScalingCapabilitiesEXT#sType} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkSurfacePresentScalingCapabilitiesEXT#pNext} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentScalingCapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentScaling} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentScaling(@NativeType("VkPresentScalingFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentScaling(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentGravityX} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentGravityX(@NativeType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityX(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfacePresentScalingCapabilitiesEXT#supportedPresentGravityY} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer supportedPresentGravityY(@NativeType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityY(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkSurfacePresentScalingCapabilitiesEXT#minScaledImageExtent} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer minScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesEXT.nminScaledImageExtent(address(), value); return this; }
        /** Passes the {@link VkSurfacePresentScalingCapabilitiesEXT#minScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer minScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minScaledImageExtent()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkSurfacePresentScalingCapabilitiesEXT#maxScaledImageExtent} field. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer maxScaledImageExtent(VkExtent2D value) { VkSurfacePresentScalingCapabilitiesEXT.nmaxScaledImageExtent(address(), value); return this; }
        /** Passes the {@link VkSurfacePresentScalingCapabilitiesEXT#maxScaledImageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSurfacePresentScalingCapabilitiesEXT.Buffer maxScaledImageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxScaledImageExtent()); return this; }

    }

}