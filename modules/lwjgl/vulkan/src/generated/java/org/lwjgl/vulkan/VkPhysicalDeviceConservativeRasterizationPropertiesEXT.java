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
 * Structure describing conservative raster properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits and properties.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code primitiveOverestimationSize} &ndash; the size in pixels the generating primitive is increased at each of its edges during conservative rasterization overestimation mode. Even with a size of 0.0, conservative rasterization overestimation rules still apply and if any part of the pixel rectangle is covered by the generating primitive, fragments are generated for the entire pixel. However implementations <b>may</b> make the pixel coverage area even more conservative by increasing the size of the generating primitive.</li>
 * <li>{@code maxExtraPrimitiveOverestimationSize} &ndash; the maximum size in pixels of extra overestimation the implementation supports in the pipeline state. A value of 0.0 means the implementation does not support any additional overestimation of the generating primitive during conservative rasterization. A value above 0.0 allows the application to further increase the size of the generating primitive during conservative rasterization overestimation.</li>
 * <li>{@code extraPrimitiveOverestimationSizeGranularity} &ndash; the granularity of extra overestimation that can be specified in the pipeline state between 0.0 and {@code maxExtraPrimitiveOverestimationSize} inclusive. A value of 0.0 means the implementation can use the smallest representable non-zero value in the screen space pixel fixed-point grid.</li>
 * <li>{@code primitiveUnderestimation} &ndash; true if the implementation supports the {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT} conservative rasterization mode in addition to {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}. Otherwise the implementation only supports {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}.</li>
 * <li>{@code conservativePointAndLineRasterization} &ndash; true if the implementation supports conservative rasterization of point and line primitives as well as triangle primitives. Otherwise the implementation only supports triangle primitives.</li>
 * <li>{@code degenerateTrianglesRasterized} &ndash; false if the implementation culls primitives generated from triangles that become zero area after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateTrianglesRasterized} is true if these primitives are not culled and the provoking vertex attributes and depth value are used for the fragments. The primitive area calculation is done on the primitive generated from the clipped triangle if applicable. Zero area primitives are backfacing and the application <b>can</b> enable backface culling if desired.</li>
 * <li>{@code degenerateLinesRasterized} &ndash; false if the implementation culls lines that become zero length after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateLinesRasterized} is true if zero length lines are not culled and the provoking vertex attributes and depth value are used for the fragments.</li>
 * <li>{@code fullyCoveredFragmentShaderInputVariable} &ndash; true if the implementation supports the SPIR-V builtin fragment shader input variable FullyCoveredEXT which specifies that conservative rasterization is enabled and the fragment area is fully covered by the generating primitive.</li>
 * <li>{@code conservativeRasterizationPostDepthCoverage} &ndash; true if the implementation supports conservative rasterization with the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#shaders-fragment-earlytest-postdepthcoverage">{@code PostDepthCoverage}</a> execution mode enabled. When supported the {@code SampleMask} built-in input variable will reflect the coverage after the early per-fragment depth and stencil tests are applied even when conservative rasterization is enabled. Otherwise <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#shaders-fragment-earlytest-postdepthcoverage">{@code PostDepthCoverage}</a> execution mode <b>must</b> not be used when conservative rasterization is enabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code primitiveOverestimationSize} field. */
    public float primitiveOverestimationSize() { return nprimitiveOverestimationSize(address()); }
    /** Returns the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
    public float maxExtraPrimitiveOverestimationSize() { return nmaxExtraPrimitiveOverestimationSize(address()); }
    /** Returns the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
    public float extraPrimitiveOverestimationSizeGranularity() { return nextraPrimitiveOverestimationSizeGranularity(address()); }
    /** Returns the value of the {@code primitiveUnderestimation} field. */
    @NativeType("VkBool32")
    public boolean primitiveUnderestimation() { return nprimitiveUnderestimation(address()) != 0; }
    /** Returns the value of the {@code conservativePointAndLineRasterization} field. */
    @NativeType("VkBool32")
    public boolean conservativePointAndLineRasterization() { return nconservativePointAndLineRasterization(address()) != 0; }
    /** Returns the value of the {@code degenerateTrianglesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateTrianglesRasterized() { return ndegenerateTrianglesRasterized(address()) != 0; }
    /** Returns the value of the {@code degenerateLinesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateLinesRasterized() { return ndegenerateLinesRasterized(address()) != 0; }
    /** Returns the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
    @NativeType("VkBool32")
    public boolean fullyCoveredFragmentShaderInputVariable() { return nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
    /** Returns the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
    @NativeType("VkBool32")
    public boolean conservativeRasterizationPostDepthCoverage() { return nconservativeRasterizationPostDepthCoverage(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
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
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #primitiveOverestimationSize}. */
    public static float nprimitiveOverestimationSize(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #maxExtraPrimitiveOverestimationSize}. */
    public static float nmaxExtraPrimitiveOverestimationSize(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSizeGranularity}. */
    public static float nextraPrimitiveOverestimationSizeGranularity(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY); }
    /** Unsafe version of {@link #primitiveUnderestimation}. */
    public static int nprimitiveUnderestimation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEUNDERESTIMATION); }
    /** Unsafe version of {@link #conservativePointAndLineRasterization}. */
    public static int nconservativePointAndLineRasterization(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVEPOINTANDLINERASTERIZATION); }
    /** Unsafe version of {@link #degenerateTrianglesRasterized}. */
    public static int ndegenerateTrianglesRasterized(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATETRIANGLESRASTERIZED); }
    /** Unsafe version of {@link #degenerateLinesRasterized}. */
    public static int ndegenerateLinesRasterized(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATELINESRASTERIZED); }
    /** Unsafe version of {@link #fullyCoveredFragmentShaderInputVariable}. */
    public static int nfullyCoveredFragmentShaderInputVariable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE); }
    /** Unsafe version of {@link #conservativeRasterizationPostDepthCoverage}. */
    public static int nconservativeRasterizationPostDepthCoverage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceConservativeRasterizationPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceConservativeRasterizationPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code primitiveOverestimationSize} field. */
        public float primitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveOverestimationSize(address()); }
        /** Returns the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
        public float maxExtraPrimitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nmaxExtraPrimitiveOverestimationSize(address()); }
        /** Returns the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
        public float extraPrimitiveOverestimationSizeGranularity() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nextraPrimitiveOverestimationSizeGranularity(address()); }
        /** Returns the value of the {@code primitiveUnderestimation} field. */
        @NativeType("VkBool32")
        public boolean primitiveUnderestimation() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveUnderestimation(address()) != 0; }
        /** Returns the value of the {@code conservativePointAndLineRasterization} field. */
        @NativeType("VkBool32")
        public boolean conservativePointAndLineRasterization() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativePointAndLineRasterization(address()) != 0; }
        /** Returns the value of the {@code degenerateTrianglesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateTrianglesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateTrianglesRasterized(address()) != 0; }
        /** Returns the value of the {@code degenerateLinesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateLinesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateLinesRasterized(address()) != 0; }
        /** Returns the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
        @NativeType("VkBool32")
        public boolean fullyCoveredFragmentShaderInputVariable() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
        /** Returns the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
        @NativeType("VkBool32")
        public boolean conservativeRasterizationPostDepthCoverage() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativeRasterizationPostDepthCoverage(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address(), value); return this; }

    }

}