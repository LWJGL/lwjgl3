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
 * <pre>{@code
 * struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     float primitiveOverestimationSize;
 *     float maxExtraPrimitiveOverestimationSize;
 *     float extraPrimitiveOverestimationSizeGranularity;
 *     VkBool32 primitiveUnderestimation;
 *     VkBool32 conservativePointAndLineRasterization;
 *     VkBool32 degenerateTrianglesRasterized;
 *     VkBool32 degenerateLinesRasterized;
 *     VkBool32 fullyCoveredFragmentShaderInputVariable;
 *     VkBool32 conservativeRasterizationPostDepthCoverage;
 * }}</pre>
 */
public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends Struct<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIMITIVEOVERESTIMATIONSIZE,
        MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE,
        EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY,
        PRIMITIVEUNDERESTIMATION,
        CONSERVATIVEPOINTANDLINERASTERIZATION,
        DEGENERATETRIANGLESRASTERIZED,
        DEGENERATELINESRASTERIZED,
        FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE,
        CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(2);
        MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(3);
        EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY = layout.offsetof(4);
        PRIMITIVEUNDERESTIMATION = layout.offsetof(5);
        CONSERVATIVEPOINTANDLINERASTERIZATION = layout.offsetof(6);
        DEGENERATETRIANGLESRASTERIZED = layout.offsetof(7);
        DEGENERATELINESRASTERIZED = layout.offsetof(8);
        FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE = layout.offsetof(9);
        CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE = layout.offsetof(10);
    }

    protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code primitiveOverestimationSize} field. */
    public float primitiveOverestimationSize() { return nprimitiveOverestimationSize(address()); }
    /** @return the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
    public float maxExtraPrimitiveOverestimationSize() { return nmaxExtraPrimitiveOverestimationSize(address()); }
    /** @return the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
    public float extraPrimitiveOverestimationSizeGranularity() { return nextraPrimitiveOverestimationSizeGranularity(address()); }
    /** @return the value of the {@code primitiveUnderestimation} field. */
    @NativeType("VkBool32")
    public boolean primitiveUnderestimation() { return nprimitiveUnderestimation(address()) != 0; }
    /** @return the value of the {@code conservativePointAndLineRasterization} field. */
    @NativeType("VkBool32")
    public boolean conservativePointAndLineRasterization() { return nconservativePointAndLineRasterization(address()) != 0; }
    /** @return the value of the {@code degenerateTrianglesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateTrianglesRasterized() { return ndegenerateTrianglesRasterized(address()) != 0; }
    /** @return the value of the {@code degenerateLinesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateLinesRasterized() { return ndegenerateLinesRasterized(address()) != 0; }
    /** @return the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
    @NativeType("VkBool32")
    public boolean fullyCoveredFragmentShaderInputVariable() { return nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
    /** @return the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
    @NativeType("VkBool32")
    public boolean conservativeRasterizationPostDepthCoverage() { return nconservativeRasterizationPostDepthCoverage(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType$Default() { return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(
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
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT malloc() {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc() {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceConservativeRasterizationPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #primitiveOverestimationSize}. */
    public static float nprimitiveOverestimationSize(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #maxExtraPrimitiveOverestimationSize}. */
    public static float nmaxExtraPrimitiveOverestimationSize(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSizeGranularity}. */
    public static float nextraPrimitiveOverestimationSizeGranularity(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY); }
    /** Unsafe version of {@link #primitiveUnderestimation}. */
    public static int nprimitiveUnderestimation(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEUNDERESTIMATION); }
    /** Unsafe version of {@link #conservativePointAndLineRasterization}. */
    public static int nconservativePointAndLineRasterization(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVEPOINTANDLINERASTERIZATION); }
    /** Unsafe version of {@link #degenerateTrianglesRasterized}. */
    public static int ndegenerateTrianglesRasterized(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATETRIANGLESRASTERIZED); }
    /** Unsafe version of {@link #degenerateLinesRasterized}. */
    public static int ndegenerateLinesRasterized(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATELINESRASTERIZED); }
    /** Unsafe version of {@link #fullyCoveredFragmentShaderInputVariable}. */
    public static int nfullyCoveredFragmentShaderInputVariable(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE); }
    /** Unsafe version of {@link #conservativeRasterizationPostDepthCoverage}. */
    public static int nconservativeRasterizationPostDepthCoverage(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceConservativeRasterizationPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceConservativeRasterizationPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code primitiveOverestimationSize} field. */
        public float primitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveOverestimationSize(address()); }
        /** @return the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
        public float maxExtraPrimitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nmaxExtraPrimitiveOverestimationSize(address()); }
        /** @return the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
        public float extraPrimitiveOverestimationSizeGranularity() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nextraPrimitiveOverestimationSizeGranularity(address()); }
        /** @return the value of the {@code primitiveUnderestimation} field. */
        @NativeType("VkBool32")
        public boolean primitiveUnderestimation() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveUnderestimation(address()) != 0; }
        /** @return the value of the {@code conservativePointAndLineRasterization} field. */
        @NativeType("VkBool32")
        public boolean conservativePointAndLineRasterization() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativePointAndLineRasterization(address()) != 0; }
        /** @return the value of the {@code degenerateTrianglesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateTrianglesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateTrianglesRasterized(address()) != 0; }
        /** @return the value of the {@code degenerateLinesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateLinesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateLinesRasterized(address()) != 0; }
        /** @return the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
        @NativeType("VkBool32")
        public boolean fullyCoveredFragmentShaderInputVariable() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
        /** @return the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
        @NativeType("VkBool32")
        public boolean conservativeRasterizationPostDepthCoverage() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativeRasterizationPostDepthCoverage(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer sType$Default() { return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address(), value); return this; }

    }

}