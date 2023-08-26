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
 * Structure describing various implementation-defined properties introduced with VK_KHR_maintenance5.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance5PropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance5#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance5PropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #earlyFragmentMultisampleCoverageAfterSampleCounting};
 *     VkBool32 {@link #earlyFragmentSampleMaskTestBeforeSampleCounting};
 *     VkBool32 {@link #depthStencilSwizzleOneSupport};
 *     VkBool32 {@link #polygonModePointSize};
 *     VkBool32 {@link #nonStrictSinglePixelWideLinesUseParallelogram};
 *     VkBool32 {@link #nonStrictWideLinesUseParallelogram};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance5PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance5PropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING,
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING,
        DEPTHSTENCILSWIZZLEONESUPPORT,
        POLYGONMODEPOINTSIZE,
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM,
        NONSTRICTWIDELINESUSEPARALLELOGRAM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = layout.offsetof(2);
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = layout.offsetof(3);
        DEPTHSTENCILSWIZZLEONESUPPORT = layout.offsetof(4);
        POLYGONMODEPOINTSIZE = layout.offsetof(5);
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = layout.offsetof(6);
        NONSTRICTWIDELINESUSEPARALLELOGRAM = layout.offsetof(7);
    }

    protected VkPhysicalDeviceMaintenance5PropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance5PropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance5PropertiesKHR(ByteBuffer container) {
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
    /** a boolean value indicating whether the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-shader">fragment shading</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-covg">multisample coverage</a> operations are performed after <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplecount">sample counting</a> for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-shader">fragment shaders</a> with {@code EarlyFragmentTests} execution mode. */
    @NativeType("VkBool32")
    public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
    /** a boolean value indicating whether the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplemask">sample mask test</a> operation is performed before <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplecount">sample counting</a> for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-shader">fragment shaders</a> using the {@code EarlyFragmentTests} execution mode. */
    @NativeType("VkBool32")
    public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
    /** a boolean indicating that depth/stencil texturing operations with {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE} have defined behavior. */
    @NativeType("VkBool32")
    public boolean depthStencilSwizzleOneSupport() { return ndepthStencilSwizzleOneSupport(address()) != 0; }
    /** a boolean value indicating whether the point size of the final rasterization of polygons with {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT} is controlled by {@code PointSize}. */
    @NativeType("VkBool32")
    public boolean polygonModePointSize() { return npolygonModePointSize(address()) != 0; }
    /** a boolean value indicating whether non-strict lines with a width of 1.0 are rasterized as parallelograms or using Bresenham’s algorithm. */
    @NativeType("VkBool32")
    public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
    /** a boolean value indicating whether non-strict lines with a width greater than 1.0 are rasterized as parallelograms or using Bresenham’s algorithm. */
    @NativeType("VkBool32")
    public boolean nonStrictWideLinesUseParallelogram() { return nnonStrictWideLinesUseParallelogram(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance5PropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance5PropertiesKHR sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance5PropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance5PropertiesKHR set(
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
    public VkPhysicalDeviceMaintenance5PropertiesKHR set(VkPhysicalDeviceMaintenance5PropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance5PropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance5PropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance5PropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #earlyFragmentMultisampleCoverageAfterSampleCounting}. */
    public static int nearlyFragmentMultisampleCoverageAfterSampleCounting(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING); }
    /** Unsafe version of {@link #earlyFragmentSampleMaskTestBeforeSampleCounting}. */
    public static int nearlyFragmentSampleMaskTestBeforeSampleCounting(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING); }
    /** Unsafe version of {@link #depthStencilSwizzleOneSupport}. */
    public static int ndepthStencilSwizzleOneSupport(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.DEPTHSTENCILSWIZZLEONESUPPORT); }
    /** Unsafe version of {@link #polygonModePointSize}. */
    public static int npolygonModePointSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.POLYGONMODEPOINTSIZE); }
    /** Unsafe version of {@link #nonStrictSinglePixelWideLinesUseParallelogram}. */
    public static int nnonStrictSinglePixelWideLinesUseParallelogram(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM); }
    /** Unsafe version of {@link #nonStrictWideLinesUseParallelogram}. */
    public static int nnonStrictWideLinesUseParallelogram(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.NONSTRICTWIDELINESUSEPARALLELOGRAM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance5PropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance5PropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance5PropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance5PropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance5PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance5PropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance5PropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance5PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance5PropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance5PropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#earlyFragmentMultisampleCoverageAfterSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return VkPhysicalDeviceMaintenance5PropertiesKHR.nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#earlyFragmentSampleMaskTestBeforeSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return VkPhysicalDeviceMaintenance5PropertiesKHR.nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#depthStencilSwizzleOneSupport} field. */
        @NativeType("VkBool32")
        public boolean depthStencilSwizzleOneSupport() { return VkPhysicalDeviceMaintenance5PropertiesKHR.ndepthStencilSwizzleOneSupport(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#polygonModePointSize} field. */
        @NativeType("VkBool32")
        public boolean polygonModePointSize() { return VkPhysicalDeviceMaintenance5PropertiesKHR.npolygonModePointSize(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#nonStrictSinglePixelWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5PropertiesKHR.nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#nonStrictWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5PropertiesKHR.nnonStrictWideLinesUseParallelogram(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5PropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance5PropertiesKHR#pNext} field. */
        public VkPhysicalDeviceMaintenance5PropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance5PropertiesKHR.npNext(address(), value); return this; }

    }

}