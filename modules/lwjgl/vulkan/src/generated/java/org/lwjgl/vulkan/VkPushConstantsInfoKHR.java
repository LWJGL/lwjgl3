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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a push constant update operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For each byte in the range specified by {@code offset} and {@code size} and for each shader stage in {@code stageFlags}, there <b>must</b> be a push constant range in {@code layout} that includes that byte and that stage</li>
 * <li>For each byte in the range specified by {@code offset} and {@code size} and for each push constant range that overlaps that byte, {@code stageFlags} <b>must</b> include all stages in that push constant range’s {@link VkPushConstantRange}{@code ::stageFlags}</li>
 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
 * <li>{@code size} <b>must</b> be a multiple of 4</li>
 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is not enabled, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>If {@code layout} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code pNext} chain <b>must</b> include a valid {@link VkPipelineLayoutCreateInfo} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineLayoutCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code layout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * <li>{@code pValues} <b>must</b> be a valid pointer to an array of {@code size} bytes</li>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRMaintenance6#vkCmdPushConstants2KHR CmdPushConstants2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPushConstantsInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineLayout {@link #layout};
 *     VkShaderStageFlags {@link #stageFlags};
 *     uint32_t {@link #offset};
 *     uint32_t {@link #size};
 *     void const * {@link #pValues};
 * }</code></pre>
 */
public class VkPushConstantsInfoKHR extends Struct<VkPushConstantsInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LAYOUT,
        STAGEFLAGS,
        OFFSET,
        SIZE,
        PVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LAYOUT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        PVALUES = layout.offsetof(6);
    }

    protected VkPushConstantsInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushConstantsInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPushConstantsInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPushConstantsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantsInfoKHR(ByteBuffer container) {
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
    /** the pipeline layout used to program the push constant updates. If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is enabled, {@code layout} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the layout <b>must</b> be specified by chaining {@link VkPipelineLayoutCreateInfo} structure off the {@code pNext} */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** the start offset of the push constant range to update, in units of bytes. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** the size of the push constant range to update, in units of bytes. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** a pointer to an array of {@code size} bytes containing the new push constant values. */
    @NativeType("void const *")
    public ByteBuffer pValues() { return npValues(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPushConstantsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR} value to the {@link #sType} field. */
    public VkPushConstantsInfoKHR sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPushConstantsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkPushConstantsInfoKHR pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #layout} field. */
    public VkPushConstantsInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #stageFlags} field. */
    public VkPushConstantsInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkPushConstantsInfoKHR offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pValues} field. */
    public VkPushConstantsInfoKHR pValues(@NativeType("void const *") ByteBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushConstantsInfoKHR set(
        int sType,
        long pNext,
        long layout,
        int stageFlags,
        int offset,
        ByteBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        layout(layout);
        stageFlags(stageFlags);
        offset(offset);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushConstantsInfoKHR set(VkPushConstantsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfoKHR malloc() {
        return new VkPushConstantsInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfoKHR calloc() {
        return new VkPushConstantsInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantsInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance for the specified memory address. */
    public static VkPushConstantsInfoKHR create(long address) {
        return new VkPushConstantsInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushConstantsInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPushConstantsInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushConstantsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushConstantsInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushConstantsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfoKHR malloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushConstantsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfoKHR calloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushConstantsInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushConstantsInfoKHR.PNEXT); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkPushConstantsInfoKHR.LAYOUT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkPushConstantsInfoKHR.STAGEFLAGS); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkPushConstantsInfoKHR.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + VkPushConstantsInfoKHR.SIZE); }
    /** Unsafe version of {@link #pValues() pValues}. */
    public static ByteBuffer npValues(long struct) { return memByteBuffer(memGetAddress(struct + VkPushConstantsInfoKHR.PVALUES), nsize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushConstantsInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushConstantsInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkPushConstantsInfoKHR.LAYOUT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkPushConstantsInfoKHR.STAGEFLAGS, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkPushConstantsInfoKHR.OFFSET, value); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + VkPushConstantsInfoKHR.SIZE, value); }
    /** Unsafe version of {@link #pValues(ByteBuffer) pValues}. */
    public static void npValues(long struct, ByteBuffer value) { memPutAddress(struct + VkPushConstantsInfoKHR.PVALUES, memAddress(value)); nsize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPushConstantsInfoKHR.PVALUES));
    }

    // -----------------------------------

    /** An array of {@link VkPushConstantsInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPushConstantsInfoKHR, Buffer> implements NativeResource {

        private static final VkPushConstantsInfoKHR ELEMENT_FACTORY = VkPushConstantsInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPushConstantsInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantsInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushConstantsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPushConstantsInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushConstantsInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPushConstantsInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushConstantsInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPushConstantsInfoKHR#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkPushConstantsInfoKHR.nlayout(address()); }
        /** @return the value of the {@link VkPushConstantsInfoKHR#stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushConstantsInfoKHR.nstageFlags(address()); }
        /** @return the value of the {@link VkPushConstantsInfoKHR#offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkPushConstantsInfoKHR.noffset(address()); }
        /** @return the value of the {@link VkPushConstantsInfoKHR#size} field. */
        @NativeType("uint32_t")
        public int size() { return VkPushConstantsInfoKHR.nsize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkPushConstantsInfoKHR#pValues} field. */
        @NativeType("void const *")
        public ByteBuffer pValues() { return VkPushConstantsInfoKHR.npValues(address()); }

        /** Sets the specified value to the {@link VkPushConstantsInfoKHR#sType} field. */
        public VkPushConstantsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPushConstantsInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR} value to the {@link VkPushConstantsInfoKHR#sType} field. */
        public VkPushConstantsInfoKHR.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR); }
        /** Sets the specified value to the {@link VkPushConstantsInfoKHR#pNext} field. */
        public VkPushConstantsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPushConstantsInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkPushConstantsInfoKHR.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPushConstantsInfoKHR#layout} field. */
        public VkPushConstantsInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushConstantsInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushConstantsInfoKHR#stageFlags} field. */
        public VkPushConstantsInfoKHR.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushConstantsInfoKHR.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushConstantsInfoKHR#offset} field. */
        public VkPushConstantsInfoKHR.Buffer offset(@NativeType("uint32_t") int value) { VkPushConstantsInfoKHR.noffset(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkPushConstantsInfoKHR#pValues} field. */
        public VkPushConstantsInfoKHR.Buffer pValues(@NativeType("void const *") ByteBuffer value) { VkPushConstantsInfoKHR.npValues(address(), value); return this; }

    }

}