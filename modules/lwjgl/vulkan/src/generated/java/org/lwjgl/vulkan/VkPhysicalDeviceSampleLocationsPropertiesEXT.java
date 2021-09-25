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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing sample location limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkSampleCountFlags {@link #sampleLocationSampleCounts};
 *     {@link VkExtent2D VkExtent2D} {@link #maxSampleLocationGridSize};
 *     float {@link #sampleLocationCoordinateRange}[2];
 *     uint32_t {@link #sampleLocationSubPixelBits};
 *     VkBool32 {@link #variableSampleLocations};
 * }</code></pre>
 */
public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLELOCATIONSAMPLECOUNTS,
        MAXSAMPLELOCATIONGRIDSIZE,
        SAMPLELOCATIONCOORDINATERANGE,
        SAMPLELOCATIONSUBPIXELBITS,
        VARIABLESAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __array(4, 2),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSAMPLECOUNTS = layout.offsetof(2);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONCOORDINATERANGE = layout.offsetof(4);
        SAMPLELOCATIONSUBPIXELBITS = layout.offsetof(5);
        VARIABLESAMPLELOCATIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkSampleCountFlagBits} indicating the sample counts supporting custom sample locations. */
    @NativeType("VkSampleCountFlags")
    public int sampleLocationSampleCounts() { return nsampleLocationSampleCounts(address()); }
    /** the maximum size of the pixel grid in which sample locations <b>can</b> vary that is supported for all sample counts in {@code sampleLocationSampleCounts}. */
    public VkExtent2D maxSampleLocationGridSize() { return nmaxSampleLocationGridSize(address()); }
    /** the range of supported sample location coordinates. */
    @NativeType("float[2]")
    public FloatBuffer sampleLocationCoordinateRange() { return nsampleLocationCoordinateRange(address()); }
    /** the range of supported sample location coordinates. */
    public float sampleLocationCoordinateRange(int index) { return nsampleLocationCoordinateRange(address(), index); }
    /** the number of bits of subpixel precision for sample locations. */
    @NativeType("uint32_t")
    public int sampleLocationSubPixelBits() { return nsampleLocationSubPixelBits(address()); }
    /** specifies whether the sample locations used by all pipelines that will be bound to a command buffer during a subpass <b>must</b> match. If set to {@link VK10#VK_TRUE TRUE}, the implementation supports variable sample locations in a subpass. If set to {@link VK10#VK_FALSE FALSE}, then the sample locations <b>must</b> stay constant in each subpass. */
    @NativeType("VkBool32")
    public boolean variableSampleLocations() { return nvariableSampleLocations(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(
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
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(VkPhysicalDeviceSampleLocationsPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSampleLocationsPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #sampleLocationSampleCounts}. */
    public static int nsampleLocationSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleLocationGridSize}. */
    public static VkExtent2D nmaxSampleLocationGridSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.MAXSAMPLELOCATIONGRIDSIZE); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange}. */
    public static FloatBuffer nsampleLocationCoordinateRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE, 2); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange(int) sampleLocationCoordinateRange}. */
    public static float nsampleLocationCoordinateRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #sampleLocationSubPixelBits}. */
    public static int nsampleLocationSubPixelBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSUBPIXELBITS); }
    /** Unsafe version of {@link #variableSampleLocations}. */
    public static int nvariableSampleLocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.VARIABLESAMPLELOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSampleLocationsPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSampleLocationsPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSampleLocationsPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSampleLocationsPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sampleLocationSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleLocationSampleCounts() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSampleCounts(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#maxSampleLocationGridSize} field. */
        public VkExtent2D maxSampleLocationGridSize() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nmaxSampleLocationGridSize(address()); }
        /** @return a {@link FloatBuffer} view of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sampleLocationCoordinateRange} field. */
        @NativeType("float[2]")
        public FloatBuffer sampleLocationCoordinateRange() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sampleLocationCoordinateRange} field. */
        public float sampleLocationCoordinateRange(int index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sampleLocationSubPixelBits} field. */
        @NativeType("uint32_t")
        public int sampleLocationSubPixelBits() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSubPixelBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#variableSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean variableSampleLocations() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nvariableSampleLocations(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sType} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#sType} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address(), value); return this; }

    }

}