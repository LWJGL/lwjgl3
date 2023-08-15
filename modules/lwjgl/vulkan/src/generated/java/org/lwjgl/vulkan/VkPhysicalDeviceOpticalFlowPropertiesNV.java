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
 * Structure describing properties supported by VK_NV_optical_flow.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceOpticalFlowPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceOpticalFlowPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkOpticalFlowGridSizeFlagsNV {@link #supportedOutputGridSizes};
 *     VkOpticalFlowGridSizeFlagsNV {@link #supportedHintGridSizes};
 *     VkBool32 {@link #hintSupported};
 *     VkBool32 {@link #costSupported};
 *     VkBool32 {@link #bidirectionalFlowSupported};
 *     VkBool32 {@link #globalFlowSupported};
 *     uint32_t {@link #minWidth};
 *     uint32_t {@link #minHeight};
 *     uint32_t {@link #maxWidth};
 *     uint32_t {@link #maxHeight};
 *     uint32_t {@link #maxNumRegionsOfInterest};
 * }</code></pre>
 */
public class VkPhysicalDeviceOpticalFlowPropertiesNV extends Struct<VkPhysicalDeviceOpticalFlowPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDOUTPUTGRIDSIZES,
        SUPPORTEDHINTGRIDSIZES,
        HINTSUPPORTED,
        COSTSUPPORTED,
        BIDIRECTIONALFLOWSUPPORTED,
        GLOBALFLOWSUPPORTED,
        MINWIDTH,
        MINHEIGHT,
        MAXWIDTH,
        MAXHEIGHT,
        MAXNUMREGIONSOFINTEREST;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        SUPPORTEDOUTPUTGRIDSIZES = layout.offsetof(2);
        SUPPORTEDHINTGRIDSIZES = layout.offsetof(3);
        HINTSUPPORTED = layout.offsetof(4);
        COSTSUPPORTED = layout.offsetof(5);
        BIDIRECTIONALFLOWSUPPORTED = layout.offsetof(6);
        GLOBALFLOWSUPPORTED = layout.offsetof(7);
        MINWIDTH = layout.offsetof(8);
        MINHEIGHT = layout.offsetof(9);
        MAXWIDTH = layout.offsetof(10);
        MAXHEIGHT = layout.offsetof(11);
        MAXNUMREGIONSOFINTEREST = layout.offsetof(12);
    }

    protected VkPhysicalDeviceOpticalFlowPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceOpticalFlowPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceOpticalFlowPropertiesNV(ByteBuffer container) {
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
    /** are the supported {@code VkOpticalFlowGridSizeFlagsNV} which can be specified in {@link VkOpticalFlowSessionCreateInfoNV}{@code ::outputGridSize}. */
    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int supportedOutputGridSizes() { return nsupportedOutputGridSizes(address()); }
    /** are the supported {@code VkOpticalFlowGridSizeFlagsNV} which can be specified in {@link VkOpticalFlowSessionCreateInfoNV}{@code ::hintGridSize}. */
    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int supportedHintGridSizes() { return nsupportedHintGridSizes(address()); }
    /** a boolean describing whether using hint flow vector map is supported in an optical flow session. */
    @NativeType("VkBool32")
    public boolean hintSupported() { return nhintSupported(address()) != 0; }
    /** a boolean describing whether cost map generation is supported in an optical flow session. */
    @NativeType("VkBool32")
    public boolean costSupported() { return ncostSupported(address()) != 0; }
    /** a boolean describing whether bi-directional flow generation is supported in an optical flow session. */
    @NativeType("VkBool32")
    public boolean bidirectionalFlowSupported() { return nbidirectionalFlowSupported(address()) != 0; }
    /** a boolean describing whether global flow vector map generation is supported in an optical flow session. */
    @NativeType("VkBool32")
    public boolean globalFlowSupported() { return nglobalFlowSupported(address()) != 0; }
    /** the minimum width in pixels for images used in an optical flow session. */
    @NativeType("uint32_t")
    public int minWidth() { return nminWidth(address()); }
    /** the minimum height in pixels for images used in an optical flow session. */
    @NativeType("uint32_t")
    public int minHeight() { return nminHeight(address()); }
    /** the maximum width in pixels for images used in an optical flow session. */
    @NativeType("uint32_t")
    public int maxWidth() { return nmaxWidth(address()); }
    /** the maximum height in pixels for images used in an optical flow session. */
    @NativeType("uint32_t")
    public int maxHeight() { return nmaxHeight(address()); }
    /** the maximum number of regions of interest which can be used in an optical flow session. If this {@code maxNumRegionsOfInterest} is 0, regions of interest are not supported in an optical flow session. */
    @NativeType("uint32_t")
    public int maxNumRegionsOfInterest() { return nmaxNumRegionsOfInterest(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceOpticalFlowPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceOpticalFlowPropertiesNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceOpticalFlowPropertiesNV set(
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
    public VkPhysicalDeviceOpticalFlowPropertiesNV set(VkPhysicalDeviceOpticalFlowPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV malloc() {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV calloc() {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV create(long address) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpticalFlowPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceOpticalFlowPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #supportedOutputGridSizes}. */
    public static int nsupportedOutputGridSizes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.SUPPORTEDOUTPUTGRIDSIZES); }
    /** Unsafe version of {@link #supportedHintGridSizes}. */
    public static int nsupportedHintGridSizes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.SUPPORTEDHINTGRIDSIZES); }
    /** Unsafe version of {@link #hintSupported}. */
    public static int nhintSupported(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.HINTSUPPORTED); }
    /** Unsafe version of {@link #costSupported}. */
    public static int ncostSupported(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.COSTSUPPORTED); }
    /** Unsafe version of {@link #bidirectionalFlowSupported}. */
    public static int nbidirectionalFlowSupported(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.BIDIRECTIONALFLOWSUPPORTED); }
    /** Unsafe version of {@link #globalFlowSupported}. */
    public static int nglobalFlowSupported(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.GLOBALFLOWSUPPORTED); }
    /** Unsafe version of {@link #minWidth}. */
    public static int nminWidth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.MINWIDTH); }
    /** Unsafe version of {@link #minHeight}. */
    public static int nminHeight(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.MINHEIGHT); }
    /** Unsafe version of {@link #maxWidth}. */
    public static int nmaxWidth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.MAXWIDTH); }
    /** Unsafe version of {@link #maxHeight}. */
    public static int nmaxHeight(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.MAXHEIGHT); }
    /** Unsafe version of {@link #maxNumRegionsOfInterest}. */
    public static int nmaxNumRegionsOfInterest(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.MAXNUMREGIONSOFINTEREST); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpticalFlowPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceOpticalFlowPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceOpticalFlowPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpticalFlowPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceOpticalFlowPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceOpticalFlowPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceOpticalFlowPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceOpticalFlowPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceOpticalFlowPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#supportedOutputGridSizes} field. */
        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int supportedOutputGridSizes() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nsupportedOutputGridSizes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#supportedHintGridSizes} field. */
        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int supportedHintGridSizes() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nsupportedHintGridSizes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#hintSupported} field. */
        @NativeType("VkBool32")
        public boolean hintSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nhintSupported(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#costSupported} field. */
        @NativeType("VkBool32")
        public boolean costSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.ncostSupported(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#bidirectionalFlowSupported} field. */
        @NativeType("VkBool32")
        public boolean bidirectionalFlowSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nbidirectionalFlowSupported(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#globalFlowSupported} field. */
        @NativeType("VkBool32")
        public boolean globalFlowSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nglobalFlowSupported(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#minWidth} field. */
        @NativeType("uint32_t")
        public int minWidth() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nminWidth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#minHeight} field. */
        @NativeType("uint32_t")
        public int minHeight() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nminHeight(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#maxWidth} field. */
        @NativeType("uint32_t")
        public int maxWidth() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxWidth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#maxHeight} field. */
        @NativeType("uint32_t")
        public int maxHeight() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxHeight(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#maxNumRegionsOfInterest} field. */
        @NativeType("uint32_t")
        public int maxNumRegionsOfInterest() { return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxNumRegionsOfInterest(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#sType} field. */
        public VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV} value to the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#sType} field. */
        public VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpticalFlowPropertiesNV#pNext} field. */
        public VkPhysicalDeviceOpticalFlowPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceOpticalFlowPropertiesNV.npNext(address(), value); return this; }

    }

}