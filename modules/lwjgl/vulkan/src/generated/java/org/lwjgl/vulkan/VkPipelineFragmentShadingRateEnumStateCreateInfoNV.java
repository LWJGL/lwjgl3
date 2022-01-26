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
 * Structure specifying parameters controlling the fragment shading rate using rate enums.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo} includes a {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} structure, then that structure includes parameters controlling the pipeline fragment shading rate.</p>
 * 
 * <p>If this structure is not present, {@code shadingRateType} is considered to be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV}, {@code shadingRate} is considered to be equal to {@link NVFragmentShadingRateEnums#VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV}, and both elements of {@code combinerOps} are considered to be equal to {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV}</li>
 * <li>{@code shadingRateType} <b>must</b> be a valid {@code VkFragmentShadingRateTypeNV} value</li>
 * <li>{@code shadingRate} <b>must</b> be a valid {@code VkFragmentShadingRateNV} value</li>
 * <li>Any given element of {@code combinerOps} <b>must</b> be a valid {@code VkFragmentShadingRateCombinerOpKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFragmentShadingRateTypeNV {@link #shadingRateType};
 *     VkFragmentShadingRateNV {@link #shadingRate};
 *     VkFragmentShadingRateCombinerOpKHR {@link #combinerOps}[2];
 * }</code></pre>
 */
public class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATETYPE,
        SHADINGRATE,
        COMBINEROPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATETYPE = layout.offsetof(2);
        SHADINGRATE = layout.offsetof(3);
        COMBINEROPS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** specifies a {@code VkFragmentShadingRateTypeNV} value indicating whether fragment shading rates are specified using fragment sizes or {@code VkFragmentShadingRateNV} enums. */
    @NativeType("VkFragmentShadingRateTypeNV")
    public int shadingRateType() { return nshadingRateType(address()); }
    /** specifies a {@code VkFragmentShadingRateNV} value indicating the pipeline fragment shading rate. */
    @NativeType("VkFragmentShadingRateNV")
    public int shadingRate() { return nshadingRate(address()); }
    /** specifies {@code VkFragmentShadingRateCombinerOpKHR} values determining how the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-pipeline">pipeline</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">attachment shading rates</a> are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-combining">combined</a> for fragments generated by drawing commands using the created pipeline. */
    @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
    public IntBuffer combinerOps() { return ncombinerOps(address()); }
    /** specifies {@code VkFragmentShadingRateCombinerOpKHR} values determining how the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-pipeline">pipeline</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">attachment shading rates</a> are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-combining">combined</a> for fragments generated by drawing commands using the created pipeline. */
    @NativeType("VkFragmentShadingRateCombinerOpKHR")
    public int combinerOps(int index) { return ncombinerOps(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shadingRateType} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(@NativeType("VkFragmentShadingRateTypeNV") int value) { nshadingRateType(address(), value); return this; }
    /** Sets the specified value to the {@link #shadingRate} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(@NativeType("VkFragmentShadingRateNV") int value) { nshadingRate(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #combinerOps} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) { ncombinerOps(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #combinerOps} field. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) { ncombinerOps(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(
        int sType,
        long pNext,
        int shadingRateType,
        int shadingRate,
        IntBuffer combinerOps
    ) {
        sType(sType);
        pNext(pNext);
        shadingRateType(shadingRateType);
        shadingRate(shadingRate);
        combinerOps(combinerOps);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc() {
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc() {
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(long address) {
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateType}. */
    public static int nshadingRateType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATETYPE); }
    /** Unsafe version of {@link #shadingRate}. */
    public static int nshadingRate(long struct) { return UNSAFE.getInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATE); }
    /** Unsafe version of {@link #combinerOps}. */
    public static IntBuffer ncombinerOps(long struct) { return memIntBuffer(struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS, 2); }
    /** Unsafe version of {@link #combinerOps(int) combinerOps}. */
    public static int ncombinerOps(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #shadingRateType(int) shadingRateType}. */
    public static void nshadingRateType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATETYPE, value); }
    /** Unsafe version of {@link #shadingRate(int) shadingRate}. */
    public static void nshadingRate(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATE, value); }
    /** Unsafe version of {@link #combinerOps(IntBuffer) combinerOps}. */
    public static void ncombinerOps(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #combinerOps(int, int) combinerOps}. */
    public static void ncombinerOps(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineFragmentShadingRateEnumStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineFragmentShadingRateEnumStateCreateInfoNV ELEMENT_FACTORY = VkPipelineFragmentShadingRateEnumStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineFragmentShadingRateEnumStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#shadingRateType} field. */
        @NativeType("VkFragmentShadingRateTypeNV")
        public int shadingRateType() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(address()); }
        /** @return the value of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#shadingRate} field. */
        @NativeType("VkFragmentShadingRateNV")
        public int shadingRate() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#combinerOps} field. */
        @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
        public IntBuffer combinerOps() { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address()); }
        /** @return the value at the specified index of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#combinerOps} field. */
        @NativeType("VkFragmentShadingRateCombinerOpKHR")
        public int combinerOps(int index) { return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), index); }

        /** Sets the specified value to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#sType} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV} value to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#sType} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#pNext} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#shadingRateType} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer shadingRateType(@NativeType("VkFragmentShadingRateTypeNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#shadingRate} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer shadingRate(@NativeType("VkFragmentShadingRateNV") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#combinerOps} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#combinerOps} field. */
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), index, value); return this; }

    }

}