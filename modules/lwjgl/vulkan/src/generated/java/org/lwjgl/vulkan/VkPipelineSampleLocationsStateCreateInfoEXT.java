/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying sample locations for a pipeline.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code sampleLocationsInfo} <b>must</b> be a valid {@link VkSampleLocationsInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSampleLocationsInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineSampleLocationsStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #sampleLocationsEnable};
 *     {@link VkSampleLocationsInfoEXT VkSampleLocationsInfoEXT} {@link #sampleLocationsInfo};
 * }</code></pre>
 */
public class VkPipelineSampleLocationsStateCreateInfoEXT extends Struct<VkPipelineSampleLocationsStateCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLELOCATIONSENABLE,
        SAMPLELOCATIONSINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSENABLE = layout.offsetof(2);
        SAMPLELOCATIONSINFO = layout.offsetof(3);
    }

    protected VkPipelineSampleLocationsStateCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineSampleLocationsStateCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineSampleLocationsStateCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** controls whether custom sample locations are used. If {@code sampleLocationsEnable} is {@link VK10#VK_FALSE FALSE}, the default sample locations are used and the values specified in {@code sampleLocationsInfo} are ignored. */
    @NativeType("VkBool32")
    public boolean sampleLocationsEnable() { return nsampleLocationsEnable(address()) != 0; }
    /** the sample locations to use during rasterization if {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE} and the graphics pipeline is not created with {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT}. */
    public VkSampleLocationsInfoEXT sampleLocationsInfo() { return nsampleLocationsInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineSampleLocationsStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineSampleLocationsStateCreateInfoEXT sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #sampleLocationsEnable} field. */
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(@NativeType("VkBool32") boolean value) { nsampleLocationsEnable(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@link #sampleLocationsInfo} field. */
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) { nsampleLocationsInfo(address(), value); return this; }
    /** Passes the {@link #sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineSampleLocationsStateCreateInfoEXT set(
        int sType,
        long pNext,
        boolean sampleLocationsEnable,
        VkSampleLocationsInfoEXT sampleLocationsInfo
    ) {
        sType(sType);
        pNext(pNext);
        sampleLocationsEnable(sampleLocationsEnable);
        sampleLocationsInfo(sampleLocationsInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineSampleLocationsStateCreateInfoEXT set(VkPipelineSampleLocationsStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineSampleLocationsStateCreateInfoEXT malloc() {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineSampleLocationsStateCreateInfoEXT calloc() {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineSampleLocationsStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineSampleLocationsStateCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineSampleLocationsStateCreateInfoEXT create(long address) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineSampleLocationsStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineSampleLocationsStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineSampleLocationsStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineSampleLocationsStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineSampleLocationsStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #sampleLocationsEnable}. */
    public static int nsampleLocationsEnable(long struct) { return memGetInt(struct + VkPipelineSampleLocationsStateCreateInfoEXT.SAMPLELOCATIONSENABLE); }
    /** Unsafe version of {@link #sampleLocationsInfo}. */
    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) { return VkSampleLocationsInfoEXT.create(struct + VkPipelineSampleLocationsStateCreateInfoEXT.SAMPLELOCATIONSINFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineSampleLocationsStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineSampleLocationsStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #sampleLocationsEnable(boolean) sampleLocationsEnable}. */
    public static void nsampleLocationsEnable(long struct, int value) { memPutInt(struct + VkPipelineSampleLocationsStateCreateInfoEXT.SAMPLELOCATIONSENABLE, value); }
    /** Unsafe version of {@link #sampleLocationsInfo(VkSampleLocationsInfoEXT) sampleLocationsInfo}. */
    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) { memCopy(value.address(), struct + VkPipelineSampleLocationsStateCreateInfoEXT.SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + VkPipelineSampleLocationsStateCreateInfoEXT.SAMPLELOCATIONSINFO);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineSampleLocationsStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineSampleLocationsStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineSampleLocationsStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineSampleLocationsStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineSampleLocationsStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineSampleLocationsStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPipelineSampleLocationsStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineSampleLocationsStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineSampleLocationsStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineSampleLocationsStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sampleLocationsEnable} field. */
        @NativeType("VkBool32")
        public boolean sampleLocationsEnable() { return VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsEnable(address()) != 0; }
        /** @return a {@link VkSampleLocationsInfoEXT} view of the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sampleLocationsInfo} field. */
        public VkSampleLocationsInfoEXT sampleLocationsInfo() { return VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsInfo(address()); }

        /** Sets the specified value to the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sType} field. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sType} field. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineSampleLocationsStateCreateInfoEXT#pNext} field. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineSampleLocationsStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sampleLocationsEnable} field. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer sampleLocationsEnable(@NativeType("VkBool32") boolean value) { VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsEnable(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sampleLocationsInfo} field. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) { VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsInfo(address(), value); return this; }
        /** Passes the {@link VkPipelineSampleLocationsStateCreateInfoEXT#sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPipelineSampleLocationsStateCreateInfoEXT.Buffer sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    }

}