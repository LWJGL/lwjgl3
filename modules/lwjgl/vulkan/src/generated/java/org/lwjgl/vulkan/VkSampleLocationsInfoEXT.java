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
 * Structure specifying a set of sample locations.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be used either to specify the sample locations to be used for rendering or to specify the set of sample locations an image subresource has been last rendered with for the purposes of layout transitions of depth/stencil images created with {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT}.</p>
 * 
 * <p>The sample locations in {@code pSampleLocations} specify {@code sampleLocationsPerPixel} number of sample locations for each pixel in the grid of the size specified in {@code sampleLocationGridSize}. The sample location for sample <code>i</code> at the pixel grid location <code>(x,y)</code> is taken from <code>pSampleLocations[(x + y <b> sampleLocationGridSize.width) </b> sampleLocationsPerPixel + i]</code>.</p>
 * 
 * <p>If the render pass has a fragment density map, the implementation will choose the sample locations for the fragment and the contents of {@code pSampleLocations} <b>may</b> be ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sampleLocationsPerPixel} <b>must</b> be a bit value that is set in {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}{@code ::sampleLocationSampleCounts}</li>
 * <li>{@code sampleLocationsCount} <b>must</b> equal <code>sampleLocationsPerPixel × sampleLocationGridSize.width × sampleLocationGridSize.height</code></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT}</li>
 * <li>If {@code sampleLocationsPerPixel} is not 0, {@code sampleLocationsPerPixel} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If {@code sampleLocationsCount} is not 0, {@code pSampleLocations} <b>must</b> be a valid pointer to an array of {@code sampleLocationsCount} {@link VkSampleLocationEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentSampleLocationsEXT}, {@link VkExtent2D}, {@link VkPipelineSampleLocationsStateCreateInfoEXT}, {@link VkSampleLocationEXT}, {@link VkSubpassSampleLocationsEXT}, {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code sampleLocationsPerPixel} &ndash; a {@code VkSampleCountFlagBits} specifying the number of sample locations per pixel.</li>
 * <li>{@code sampleLocationGridSize} &ndash; the size of the sample location grid to select custom sample locations for.</li>
 * <li>{@code sampleLocationsCount} &ndash; the number of sample locations in {@code pSampleLocations}.</li>
 * <li>{@code pSampleLocations} &ndash; an array of {@code sampleLocationsCount} {@link VkSampleLocationEXT} structures.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSampleLocationsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSampleCountFlagBits sampleLocationsPerPixel;
 *     {@link VkExtent2D VkExtent2D} sampleLocationGridSize;
 *     uint32_t sampleLocationsCount;
 *     {@link VkSampleLocationEXT VkSampleLocationEXT} const * pSampleLocations;
 * }</code></pre>
 */
public class VkSampleLocationsInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLELOCATIONSPERPIXEL,
        SAMPLELOCATIONGRIDSIZE,
        SAMPLELOCATIONSCOUNT,
        PSAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSPERPIXEL = layout.offsetof(2);
        SAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONSCOUNT = layout.offsetof(4);
        PSAMPLELOCATIONS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkSampleLocationsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSampleLocationsInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code sampleLocationsPerPixel} field. */
    @NativeType("VkSampleCountFlagBits")
    public int sampleLocationsPerPixel() { return nsampleLocationsPerPixel(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code sampleLocationGridSize} field. */
    public VkExtent2D sampleLocationGridSize() { return nsampleLocationGridSize(address()); }
    /** Returns the value of the {@code sampleLocationsCount} field. */
    @NativeType("uint32_t")
    public int sampleLocationsCount() { return nsampleLocationsCount(address()); }
    /** Returns a {@link VkSampleLocationEXT.Buffer} view of the struct array pointed to by the {@code pSampleLocations} field. */
    @Nullable
    @NativeType("VkSampleLocationEXT const *")
    public VkSampleLocationEXT.Buffer pSampleLocations() { return npSampleLocations(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSampleLocationsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSampleLocationsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code sampleLocationsPerPixel} field. */
    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(@NativeType("VkSampleCountFlagBits") int value) { nsampleLocationsPerPixel(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code sampleLocationGridSize} field. */
    public VkSampleLocationsInfoEXT sampleLocationGridSize(VkExtent2D value) { nsampleLocationGridSize(address(), value); return this; }
    /** Passes the {@code sampleLocationGridSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSampleLocationsInfoEXT sampleLocationGridSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(sampleLocationGridSize()); return this; }
    /** Sets the address of the specified {@link VkSampleLocationEXT.Buffer} to the {@code pSampleLocations} field. */
    public VkSampleLocationsInfoEXT pSampleLocations(@Nullable @NativeType("VkSampleLocationEXT const *") VkSampleLocationEXT.Buffer value) { npSampleLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSampleLocationsInfoEXT set(
        int sType,
        long pNext,
        int sampleLocationsPerPixel,
        VkExtent2D sampleLocationGridSize,
        @Nullable VkSampleLocationEXT.Buffer pSampleLocations
    ) {
        sType(sType);
        pNext(pNext);
        sampleLocationsPerPixel(sampleLocationsPerPixel);
        sampleLocationGridSize(sampleLocationGridSize);
        pSampleLocations(pSampleLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSampleLocationsInfoEXT set(VkSampleLocationsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSampleLocationsInfoEXT malloc() {
        return wrap(VkSampleLocationsInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSampleLocationsInfoEXT calloc() {
        return wrap(VkSampleLocationsInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSampleLocationsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSampleLocationsInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance for the specified memory address. */
    public static VkSampleLocationsInfoEXT create(long address) {
        return wrap(VkSampleLocationsInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSampleLocationsInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSampleLocationsInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSampleLocationsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSampleLocationsInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSampleLocationsInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSampleLocationsInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSampleLocationsInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSampleLocationsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSampleLocationsInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkSampleLocationsInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSampleLocationsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSampleLocationsInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkSampleLocationsInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSampleLocationsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSampleLocationsInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSampleLocationsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSampleLocationsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #sampleLocationsPerPixel}. */
    public static int nsampleLocationsPerPixel(long struct) { return UNSAFE.getInt(null, struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONSPERPIXEL); }
    /** Unsafe version of {@link #sampleLocationGridSize}. */
    public static VkExtent2D nsampleLocationGridSize(long struct) { return VkExtent2D.create(struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONGRIDSIZE); }
    /** Unsafe version of {@link #sampleLocationsCount}. */
    public static int nsampleLocationsCount(long struct) { return UNSAFE.getInt(null, struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONSCOUNT); }
    /** Unsafe version of {@link #pSampleLocations}. */
    @Nullable public static VkSampleLocationEXT.Buffer npSampleLocations(long struct) { return VkSampleLocationEXT.createSafe(memGetAddress(struct + VkSampleLocationsInfoEXT.PSAMPLELOCATIONS), nsampleLocationsCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSampleLocationsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSampleLocationsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #sampleLocationsPerPixel(int) sampleLocationsPerPixel}. */
    public static void nsampleLocationsPerPixel(long struct, int value) { UNSAFE.putInt(null, struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONSPERPIXEL, value); }
    /** Unsafe version of {@link #sampleLocationGridSize(VkExtent2D) sampleLocationGridSize}. */
    public static void nsampleLocationGridSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONGRIDSIZE, VkExtent2D.SIZEOF); }
    /** Sets the specified value to the {@code sampleLocationsCount} field of the specified {@code struct}. */
    public static void nsampleLocationsCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSampleLocationsInfoEXT.SAMPLELOCATIONSCOUNT, value); }
    /** Unsafe version of {@link #pSampleLocations(VkSampleLocationEXT.Buffer) pSampleLocations}. */
    public static void npSampleLocations(long struct, @Nullable VkSampleLocationEXT.Buffer value) { memPutAddress(struct + VkSampleLocationsInfoEXT.PSAMPLELOCATIONS, memAddressSafe(value)); nsampleLocationsCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsampleLocationsCount(struct) != 0) {
            check(memGetAddress(struct + VkSampleLocationsInfoEXT.PSAMPLELOCATIONS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkSampleLocationsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSampleLocationsInfoEXT, Buffer> implements NativeResource {

        private static final VkSampleLocationsInfoEXT ELEMENT_FACTORY = VkSampleLocationsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSampleLocationsInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSampleLocationsInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSampleLocationsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSampleLocationsInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSampleLocationsInfoEXT.npNext(address()); }
        /** Returns the value of the {@code sampleLocationsPerPixel} field. */
        @NativeType("VkSampleCountFlagBits")
        public int sampleLocationsPerPixel() { return VkSampleLocationsInfoEXT.nsampleLocationsPerPixel(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code sampleLocationGridSize} field. */
        public VkExtent2D sampleLocationGridSize() { return VkSampleLocationsInfoEXT.nsampleLocationGridSize(address()); }
        /** Returns the value of the {@code sampleLocationsCount} field. */
        @NativeType("uint32_t")
        public int sampleLocationsCount() { return VkSampleLocationsInfoEXT.nsampleLocationsCount(address()); }
        /** Returns a {@link VkSampleLocationEXT.Buffer} view of the struct array pointed to by the {@code pSampleLocations} field. */
        @Nullable
        @NativeType("VkSampleLocationEXT const *")
        public VkSampleLocationEXT.Buffer pSampleLocations() { return VkSampleLocationsInfoEXT.npSampleLocations(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSampleLocationsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSampleLocationsInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSampleLocationsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSampleLocationsInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code sampleLocationsPerPixel} field. */
        public VkSampleLocationsInfoEXT.Buffer sampleLocationsPerPixel(@NativeType("VkSampleCountFlagBits") int value) { VkSampleLocationsInfoEXT.nsampleLocationsPerPixel(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code sampleLocationGridSize} field. */
        public VkSampleLocationsInfoEXT.Buffer sampleLocationGridSize(VkExtent2D value) { VkSampleLocationsInfoEXT.nsampleLocationGridSize(address(), value); return this; }
        /** Passes the {@code sampleLocationGridSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSampleLocationsInfoEXT.Buffer sampleLocationGridSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(sampleLocationGridSize()); return this; }
        /** Sets the address of the specified {@link VkSampleLocationEXT.Buffer} to the {@code pSampleLocations} field. */
        public VkSampleLocationsInfoEXT.Buffer pSampleLocations(@Nullable @NativeType("VkSampleLocationEXT const *") VkSampleLocationEXT.Buffer value) { VkSampleLocationsInfoEXT.npSampleLocations(address(), value); return this; }

    }

}